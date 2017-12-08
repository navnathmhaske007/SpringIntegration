package demo.integration.transform;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import demo.integration.beans.UserRegistrations;

public class Transform {
	
	public static String path ;
	
	
	public static Object transform( String path)
	{
		
		if(path.contains("registrations"))
		{
			BufferedReader bufferedReader = null;
			
			String line = "";
			
			String splitBy = ",";
			
			UserRegistrations registrations = new UserRegistrations();
			
			try {
				bufferedReader = new BufferedReader(new FileReader(Transform.path));
					while((line = bufferedReader.readLine())!= null)
					{
						String[] parameters = line.split(splitBy);
						registrations.setFirstName(parameters[0]);
						registrations.setLastName(parameters[1]);
						registrations.setCompany(parameters[2]);
						registrations.setAddress(parameters[3]);
						registrations.setCity(parameters[4]);
						registrations.setState(parameters[5]);
						registrations.setZip(parameters[6]);
						registrations.setCounty(parameters[7]);
						registrations.setUrl(parameters[8]);
						registrations.setPhoneNumber(parameters[9]);
						registrations.setFax(parameters[10]);
						System.out.println(registrations);
						
					}
				} 
				catch (IOException e) {
					e.printStackTrace();
			} 
			
			return registrations;
		}
		
		return null;
		
	}

}
