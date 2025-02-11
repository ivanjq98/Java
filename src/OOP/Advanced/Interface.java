package OOP.Advanced;

class DatabaseConnection {
    private static DatabaseConnection instance;

    // Private constructor prevents instantiation
    private DatabaseConnection() {
        System.out.println("Database Connection Created!");
    }

    // Public method to get the single instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to database.");
    }
}

public class Interface {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        db1.connect();
        db2.connect();

        System.out.println("Are both instances the same? " + (db1 == db2)); // Should be true
    }
}
