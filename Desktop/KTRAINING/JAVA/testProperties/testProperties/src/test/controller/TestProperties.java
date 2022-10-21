package test.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import test.entity.Employee;

public class TestProperties {

	public static void main(String[] args) {
		TestProperties test = new TestProperties();
		Properties prop = new Properties();
		
		Employee[] er = test.readFile(prop);
		test.readFile(prop);
		test.addEmpData(prop);
		test.printConsole(prop);
		test.saveEmpXML(er);
		
	}
	
	public void addEmpData(Properties p){
		
		p.setProperty("20180417", "20180417, 홍길동, 기획부, 2600000, 0.2");
		p.setProperty("20190419", "20190419, 홍길동, 기획부, 3300000, 0.2");
		p.list(System.out);

	}
	
	public Employee[] readFile(Properties p){
		
		try {
			p.load(new FileReader("empData.txt"));
			p.list(System.out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		List empList = new ArrayList(p.values());
		Employee[] bar = new Employee[empList.size()];
		return bar;

	}
	
	public void printConsole(Properties p){
		
		List values = new ArrayList(p.values());
		Iterator iter = values.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public void saveEmpXML(Employee[] er){
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("empData.txt"));
			prop.list(System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Set<String> keys = prop.stringPropertyNames();
		Employee[] emp = new Employee[keys.size()];
		Iterator<String> iter = keys.iterator();
		
		for(int i =0; iter.hasNext(); i++) {
			String value = prop.getProperty(iter.next());
			String[] values = value.split(", ");
			
			int salary = Integer.parseInt(values[3]);
			double bonusPoint = Double.parseDouble(values[4]);
			int total = (int) (salary + (salary * bonusPoint));
			
			emp[i] = new Employee(Integer.parseInt
					(values[0]), values[1], values[2], salary, bonusPoint, total);
		}
		
		for(Employee e : emp) {
			prop.setProperty(String.valueOf(e.getEld()), e.toString());
		}
		
		try {
			prop.storeToXML(new FileOutputStream("empResult.xml"), "직원 연봉 정보", "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		

		
	}
	
	
	
	
}
