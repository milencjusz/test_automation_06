import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HandlingHTTP {
    public static void main(String[] args) {
        // Enable it to accept insecure certificates.
        EdgeOptions options = new EdgeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://expired.badssl.com/");
        // Retrieve and print the title of the current webpage
        System.out.println(driver.getTitle());

    }
}
