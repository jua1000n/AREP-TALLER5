import static spark.Spark.*;

public class SparkWebHello {
    public static void main(String[] args) {
        port(getPort());
        get("/hello", (req, res) -> "Hello World");
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}
