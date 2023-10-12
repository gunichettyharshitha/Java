package singleton;
public class Database {
    private static Database instance;

    private Database() {
        // Private constructor to prevent direct instantiation
    }

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database");
    }

    public void disconnect() {
        System.out.println("Disconnected from the database");
    }
    
    public static void main(String[] args) {
		// Get the instance of the Database singleton
		Database database = Database.getInstance();

		// Connect to the database
		database.connect();

		// Disconnect from the database
		database.disconnect();
	}
}
