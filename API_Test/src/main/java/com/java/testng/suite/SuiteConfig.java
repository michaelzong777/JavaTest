package com.java.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite running");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite running");
    }
}
