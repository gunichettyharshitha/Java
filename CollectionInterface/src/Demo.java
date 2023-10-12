
class Calculator {
	public int add(int n1, int n2) {
		return n1 + n2;
	}

}

class Computer {
	public void playMusic() {
		System.out.println("Music Playing...");
	}

	public String getPen(int cost) {
		if (cost >= 10)
			return "Pen";

		return "Nothing";
	}
}

public class Demo {

	public static void main(String[] args) {

		/*
		 * int num1 =4; int num2 =5; int result = num1 + num2;
		 * System.out.println(result);
		 */
		int num1 = 4;
		int num2 = 6;
		Calculator calculator = new Calculator();
		int result = calculator.add(num1, num2);
		System.out.println("Adding 2 numbers : " + result);

		int price = 04;
		Computer computer = new Computer();
		computer.playMusic();

		System.out.println("GetPen : " + computer.getPen(price));

	}

	}


//when the start and end route of a congested route is within configurable distance,

	// by non-congested NTIS network links, the links are joined together

	Set<String> nonCongestedJoiningLinks = new TreeSet<>();

	for(
	String linkId:congestedLinks)
	{

		NwkLinkStaticData linkData = nwkLinkStaticDAO.getData(linkId);

		if (linkData != null) {

			LOG.info("CongestedLink({}): {}", linkId, linkData.getLinkName());

			// to achieve the above functionality, fetch downstreamLinks

			Set<NwkLinkStaticData> downstreamLinks = nwkLinkStaticDAO

					.getLinksByFromNode(linkData.getToNode());

			if (downstreamLinks == null || downstreamLinks.isEmpty()) {

				continue;

			}

			Set<String> downstreamLinkIds = downstreamLinks.stream()

					.map(NwkLinkStaticData::getKey)

					.collect(Collectors.toSet());

			// find downstream links that contains other congested links

			Set<String> tempCongestedLinks = new TreeSet<>();

			for (String congestedLink : congestedLinks) {

				boolean foundCongestedLink = downstreamLinkIds.contains(congestedLink);

				if (foundCongestedLink) {

					tempCongestedLinks.add(congestedLink);

				}

			}

			// process the downstream links that associated with congested links

			for (String tempCongestedLink : tempCongestedLinks) {

				NwkLinkStaticData tempCongestedLinkData = nwkLinkStaticDAO.getData(tempCongestedLink);

				// find upstream links, by doing so, we will get common links

				// that connecting two congested links

				Set<NwkLinkStaticData> upstreamLinks = nwkLinkStaticDAO

						.getLinksByFromNode(tempCongestedLinkData.getFromNode());

				Set<String> upstreamLinkIds = upstreamLinks.stream().map(NwkLinkStaticData::getKey)

						.collect(Collectors.toSet());

				Set<String> tempJoiningLinks = new TreeSet<>(downstreamLinkIds);

				tempJoiningLinks.retainAll(upstreamLinkIds);

				// do threshold distance check, direction check and circular path check

				downstreamLinks = downstreamLinks.stream()

						.filter(downstreamLink -> tempJoiningLinks.contains(downstreamLink.getKey()))

						.collect(Collectors.toSet());

				float totalLength = (float) downstreamLinks.stream()

						.mapToDouble(NwkLinkStaticData::getLength)

						.sum();

				boolean rightDirection = downstreamLinks.stream()

						.allMatch(downstreamLink -> downstreamLink.getDirection()

								.equals(linkData.getDirection()));

				boolean isNotCircularPath = downstreamLinks.stream()

						.noneMatch(downstreamLink -> downstreamLink.getToNode()

								.equals(linkData.getFromNode()));

				// if all checks fine, add to the set

				if (totalLength <= congestedRouteDistanceThreshold

						&& rightDirection && isNotCircularPath) {

					nonCongestedJoiningLinks.addAll(tempJoiningLinks);

				}

			}

		} else {

			LOG.error("Could not find link: {}", linkId);

		}

	}

	congestedLinks.addAll(nonCongestedJoiningLinks);

	Route route = routeGeneratorService.getNextRoutes(congestedLinks);

	LOG.info("Routes: {}",route.getContiguousRoutes().size());

	return routeGeneratorService.generateRouteSets(route);

}
