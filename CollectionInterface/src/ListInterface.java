import java.util.*;

public class ListInterface {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		/*
		 * If the data is not only string then no need to specify the
		 * List<String>(Generics) just List is enough
		 */
		al.add("CoreJava");
		al.add("AdvancedJava");
		al.add("Spring");
		al.add("SpringBoot");
		al.add("Devops");
		al.add("DevSecops");
		al.add("Microservices");
		al.add("Sql");

		// System.out.println(al);
		// System.out.println(al.size());
		for (int i = 0; i < al.size(); i++) {
			String value = al.get(i);
			// System.out.println(i + " : " + value);
		}
		/*
		 * Iterator has only hasNext() but to print the values from backward direction
		 * there is one more interface called as ListIterator
		 */

		ListIterator<String> itr = al.listIterator();
		System.out.println("In Forward Direction:========");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("In Backward Direction:=========");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
