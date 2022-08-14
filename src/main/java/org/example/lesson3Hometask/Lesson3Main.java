package org.example.lesson3Hometask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Element;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Lesson3Main {

        public static void main(String[] args) {


                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                options.addArguments("start-maximized");

                WebDriver driver = new ChromeDriver(options);
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                driver.get("https://www.livejournal.com/");

                WebElement webElement1 = driver.findElement(By.xpath(".//nav[@role='presentation']/ul/li[2]/a"));
                WebElement webElement2 = driver.findElement(By.id("user"));
                WebElement webElement3 = driver.findElement(By.name("password"));
                WebElement webElement4 = driver.findElement(By.name("action:login"));


                try {
                        WebElement webElementError = driver.findElement(By.name("error"));
                } catch (NoSuchElementException e) {
                        System.out.println(e.getSupportUrl());
                }

                List<WebElement> webElements = driver.findElements(By.name("error"));
                if (webElements.size() > 1) {
                        //todo
                }

                //Тест-кейс с авторизацией пользователя

                webElement1.click();
                webElement2.click();
                webElement2.sendKeys("Testforhometask");
                webElement3.click();
                webElement3.sendKeys("Tester#22");
                webElement4.click();

                //Тест-кейс на выбор поста и лайк

                driver.navigate().to("https://livejournal.com/media/");

                try{
                        driver.findElement(By.xpath(".//a[@class='post-card__link']")).click();
                } catch (ElementNotInteractableException e) {
                        System.out.println(e.getSupportUrl());
                }

                try {
                     driver.findElement(By.xpath(".//div[@class='aentry-post__socials aentry-post__socials--top']/div/div/span/div/button")).click();
                } catch (ElementNotInteractableException e) {
                        System.out.println(e.getSupportUrl());
                }

                try {
                        driver.findElement(By.xpath(".//a[@class='s-logo-link']")).click();
                } catch (ElementNotInteractableException e) {
                        System.out.println(e.getSupportUrl());
                }


                //Тест-кейс на удаление своего поста

                try {
                        driver.findElement(By.xpath(".//ul[@class='s-do']/li[2]/a/div")).click();
                } catch (ElementNotInteractableException e) {
                        System.out.println(e.getSupportUrl());
                }

                try {
                        driver.findElement(By.xpath(".//header[@class='entryunit__head']/h3/a")).click();
                } catch (ElementNotInteractableException e) {
                        System.out.println(e.getSupportUrl());
                }

                try {
                        driver.findElement(By.xpath(".//span[@class='_38']/..")).click();
                }catch (ElementNotInteractableException e) {
                        System.out.println(e.getSupportUrl());
               }

                try {
                        driver.findElement(By.xpath("//div/div/div/div/a/span")).click();
                } catch (ElementNotInteractableException e) {
                        System.out.println(e.getSupportUrl());
                }

               try {
                       driver.findElement(By.xpath(".//nav[@class='_46 _48']/a")).click();
               } catch (ElementNotInteractableException e) {
                       System.out.println(e.getSupportUrl());
               }

               try {
                       driver.findElement(By.xpath(".//div[@class='_zk']/div/button[2]")).click();
               } catch (ElementNotInteractableException e) {
                       System.out.println(e.getSupportUrl());
               }

                //Тест-кейс с переключением языка на английский


                try {
                        driver.findElement(By.xpath(".//ul[@class='s-do']/li[2]/a/div")).click();
                } catch (ElementNotInteractableException e) {
                        System.out.println(e.getSupportUrl());
                }

                try {
                        driver.findElement(By.xpath(".//header[@class='entryunit__head']/h3/a")).click();
                } catch (ElementNotInteractableException e) {
                        System.out.println(e.getSupportUrl());
                }

                JavascriptExecutor js = ((JavascriptExecutor) driver);
                js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


                try {
                        driver.findElement(By.xpath(".//b[@class='button']")).click();
                } catch (ElementNotInteractableException e) {
                        System.out.println(e.getSupportUrl());
                }

                try {
                        driver.findElement(By.xpath(".//div[@class='b-selectus-scroll']/ul/li")).click();
                } catch (ElementNotInteractableException e) {
                        System.out.println(e.getSupportUrl());
                }

                try {
                        driver.findElement(By.xpath(".//div[@class='s-logo']/a/span")).click();
                } catch (ElementNotInteractableException e) {
                        System.out.println(e.getSupportUrl());
                }

        }
}

