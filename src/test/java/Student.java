import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Student {
    @Test
    public void createUser () {
        WebDriver driver = new ChromeDriver();
        driver.get ("http://37.59.228.229:3000/");
        driver.findElement(By.xpath("//i[@class='mdi-content-add']")).click();
        driver.findElement(By.xpath("//input[@id=\"icon_prefix\"]")).clear();
        driver.findElement(By.xpath("//input[@id=\"icon_prefix\"]")).sendKeys("Mother of Dragons");
        driver.findElement(By.xpath("//input[@id=\"icon_telephone\"]")).clear();
        driver.findElement(By.xpath("//input[@id=\"icon_telephone\"]")).sendKeys("0930000001");
        driver.findElement(By.cssSelector("input.select-dropdown")).click();
        driver.findElement(By.xpath("//div[@class=\"select-wrapper\"]/ul/li[2]/span")).click();
        driver.findElement(By.cssSelector("a.save-btn")).click();




    }
}