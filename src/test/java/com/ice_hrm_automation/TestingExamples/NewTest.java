package com.ice_hrm_automation.TestingExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Beforesuite method");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforeTest method");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest method");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite method");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass method");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method");
	}
	
  @Test
  public void addition()    
     {
	  int a=10; int b=20;
	  System.out.println("Adition ="+"  " + (a+b));
     }
	@Test
	
	public void multiplication()
	{
		int a=30;
		int b=40;
		 System.out.println("Multiplication =" +"  "+ a*b);
	}
	@Test
	public void substraction()
	{
		int a=50; int b=60;
		System.out.println("substraction ="+" "+ (b-a));
	}
	@Test
	public void division()
	{
		int a=100; int b=300;
		System.out.println("division = " + " " + b/a);
	}
  }

