package com.crm.Listener1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryNetwork implements IRetryAnalyzer {
int start=0,end=4;
	@Override
	public boolean retry(ITestResult result) {
		while(start<end) {
		return false;
	}
		return false;
	}

}
