import package_name;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Test {

    public static void main(String[] args) throws InterruptedException {
        To launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe"); //chrome driver path
        WebDriver driver = new ChromeDriver();
        //To open url
        driver.get("http://www.htmlcanvasstudio.com/");
        //To set timeout to render the browser
        Thread.sleep(5000);
        driver.get("http://www.htmlcanvasstudio.com/");
        //Find the Drawline locator
        WebElement element = driver.findElement(By.xpath("//*[@title="Draw a line"]")).click();
        //Used points class to get x and y coordinates of line.
        Point point = element.getLocation();
        int xcord = point.getX(); // getting value dynamically from user
        System.out.println("Position of the line from left side is " + xcord + " pixels");
        int ycord = point.getY();
        System.out.println("Position of the line from top side is " + ycord + " pixels");
        // Using Actions class
        Actions action = new Actions(driver);
        //clicking on the draw line based on x coordinate and y coordinate
        action.moveToElement(element, xcord, ycord).click().build().perform();
    }
}