package IgnoreFeilds;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JSONIgnore {
	
	@Test
	public void TestMethod() throws JsonProcessingException {
		
		
		//create Payload
		
		EmployeePojoClass emp = new EmployeePojoClass();
				emp.setFirstname("ARIF");
				emp.setLastname("HUSSAIN");
				emp.setGender("MALE");
				emp.setAge(24);
				emp.setSalary(40000);
				emp.setMarried(false);
				emp.setFullname("MD ARIF HUSSAIN");

	
	
			// Serialization : Convert eployee class object to json payload as String	
			
			ObjectMapper mapper = new ObjectMapper();
			String employeeJSON = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
				System.out.println("Employee JSON "+employeeJSON);
				
				
			// Deserialization JSON payload String to Employee class Object	
				
				String payload = "{\r\n"
						+ "  \"firstname\" : \"ARIF\",\r\n"
						+ "  \"lastname\" : \"HUSSAIN\",\r\n"
						+ "  \"gender\" : \"MALE\",\r\n"
						+ "  \"age\" : 24,\r\n"
						+ "  \"salary\" : 40000.0,\r\n"
						+ "  \"fullname\" : \"MD ARIF HUSSAIN\",\r\n"
						+ "  \"married\" : false\r\n"
						+ "}";
				
				
				EmployeePojoClass emp1 = new ObjectMapper().readValue(payload,EmployeePojoClass.class);
				System.out.println("--------------Print after JSON Object to Employee Class Object-----------");
				System.out.println("FirstName: "+ emp1.getFirstname());
				System.out.println("LastName: "+ emp1.getLastname());
				System.out.println("Gender: "+ emp1.getGender());
				System.out.println("Age: "+ emp1.getAge());
				System.out.println("Salary: "+ emp1.getSalary());
				System.out.println("FullName: "+ emp1.getFullname());
		}
}
