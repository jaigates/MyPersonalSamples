package com.jai.postgres.spexceptionhadling;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Postgres_EmployeeSpsTest {
	
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		Postgres_EmployeeSps dao1 = (Postgres_EmployeeSps) context.getBean("postgres_EmployeeSpsImpl");

		int employeeid=5;
		int custid=6;
		
		Map<String, Object> inparams = new HashMap<String, Object>();
		inparams.put("eid",employeeid);
		inparams.put("eoldid", employeeid);
		inparams.put("ename", "emp"+employeeid);
		inparams.put("edob", new Date());
		inparams.put("version", 1);
		inparams.put("ccust_id", custid);
		inparams.put("cname", "cname"+custid);
		inparams.put("cage", custid);
		
		Map<String, Object> result = dao1.getResult(inparams);
		System.out.println(result);

		/* Sample data
		 {SQLCODE_PARM=100       , RESP_MSG=GUID NOT FOUND                                                                                      , RESP_CODE=SSEAB001                 }

		 */
	}
}