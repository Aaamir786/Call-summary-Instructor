package com.girnarsoft.callsummary.Runner;

import com.girnarsoft.callsummary.service.CallSummaryService;

public class Runner {

	private CallSummaryService m_callSummaryService;

	public Runner(){
		m_callSummaryService=new CallSummaryService();
		m_callSummaryService.readFile();
		m_callSummaryService.writeInFile();
	}

	public static void main(String[] args) {
		new Runner();
	}

}
