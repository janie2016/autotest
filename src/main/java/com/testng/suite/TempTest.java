package com.testng.suite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TempTest
{
	public String testType;

    @Parameters({ "testType" })
    @BeforeMethod
    public void beforeMethod(String testType) {
        System.out.println("++++++------------------"+testType);
        this.testType = testType;
    }

    @BeforeClass
    public void beforeClass() {
        
    }
    @Test(groups = { "usabilitytest" })
    public void tt() {
        System.out.println(testType);
    }
}
