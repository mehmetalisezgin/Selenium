package freeStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FreeStudy01{

@Test
    public void testA(){
    System.out.println("A");
}
@Test
    public void testB(){
    System.out.println("B");
}
@Before
    public void generate(){
    System.out.println("generate");
}
@After
    public void lastClass(){
    System.out.println("last one ");
}




}
