package com.testng.annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasicTestService
{
	
	@Test //最基本的注解
	public void testCase1()
	{
		System.out.println("Case1");
	}
	
	@Test //最基本的注解
	public void testCase2()
	{
		System.out.println("Case2");
	}
	@BeforeGroups
	public void testBeforeGroups()
	{
		System.out.println("BeforeGroups");
	}
	
	@AfterGroups
	public void testAfterGroups()
	{
		System.out.println("AfterGroups");
	}
	
	@BeforeSuite
	public void testBeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite//套件之前执行，必须配合
	public void testAfterSuite()
	{
		System.out.println("AfterSuite");
	}
	
	@BeforeClass//每个类执行之前执行
	public void testBeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass//每个类执行完之后执行
	public void testAfterClass()
	{
		System.out.println("AfterClass");
	}
	
	@BeforeMethod//每个方法之前执行
	public void testBeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod//每个方法之后执行
	public void testAfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@Test(groups="server")//测试组
	public void testGroupsServer1()
	{
		System.out.println("GroupsServer1");
	}
	@Test(groups="server")//测试组
	public void testGroupsServer2()
	{
		System.out.println("GroupsServer2");
	}
	
	@Test(groups="client")//测试组
	public void testGroupsClient1()
	{
		System.out.println("GroupsClient1");
	}
	
	@Test(groups="client")//测试组
	public void testGroupsClient2()
	{
		System.out.println("GroupsClient2");
	}
}
