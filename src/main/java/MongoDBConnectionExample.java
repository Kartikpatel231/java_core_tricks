import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnectionExample {
    public static void main(String[] args) {
        // Connect to MongoDB
        try {
            MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
            System.out.println("Connected to MongoDB successfully");

            // Access a database
           MongoDatabase database = mongoClient.getDatabase("test");
            System.out.println("Accessed database: " + database.getName());

            // Perform database operations

            mongoClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
