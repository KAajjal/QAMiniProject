package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class HomePage {

    By homeMovieHeading=By.className("home-movie-heading");
    By homeMovieDesc=By.className("home-movie-description");
    By homeMovieHeadingTrendings=By.xpath("//h1[text() ='Trending Now']");
    By homeMovieHeadingOriginals=By.xpath("//h1[text() ='Originals']");
    By playButton=By.className("home-movie-play-button");
    By listOfTrendingNowMoviesDisplayed=By.xpath("//div[@class='home-bottom-container']/div[1]/div/div/div/div//a");
    By listOfOriginalsMoviesDisplayed=By.xpath("//div[@class='home-bottom-container']/div[2]/div/div/div/div//a");
    By contactUsSeciton=By.className("contact-us-paragraph");


    WebDriver driver;
    WebDriverWait wait;

    public HomePage (WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));

    }

    public WebElement getHomeMovieHeading(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeMovieHeading));
        return   driver.findElement(homeMovieHeading);
    }

    public WebElement getHomeMovieDesc(){
        return driver.findElement(homeMovieDesc);
    }


    public WebElement getHomeMovieHeadingTrending(){
        return driver.findElement(homeMovieHeadingTrendings);
    }

    public WebElement getHomeMovieHeadingOriginals(){
        return driver.findElement(homeMovieHeadingOriginals);
    }

    public WebElement  getOnPlayButton(){
       return driver.findElement(playButton);
    }

    public String getContactSection(){
        return driver.findElement(contactUsSeciton).getText();
    }

    public int getTrendingNowMoviesList(){
        List<WebElement> list=driver.findElements(listOfTrendingNowMoviesDisplayed);
        return list.size();
    }

    public int getOriginalsMoviesList(){
        List<WebElement> list=driver.findElements(listOfOriginalsMoviesDisplayed);
        return list.size();
    }

}
