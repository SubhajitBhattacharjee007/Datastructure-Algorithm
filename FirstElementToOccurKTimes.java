package Arrays;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FirstElementToOccurKTimes {

	public static void main(String[] args) throws Exception {
		
		File[] files = new File("src/Test/").listFiles();
		int count = 0;
		for(File file: files) {
			System.out.println("File Name: " + file.getName());
			
			ObjectMapper objectMapper = new ObjectMapper();
			Demo demo = objectMapper.readValue(file, Demo.class);
			demo.setName("Rittika");
			objectMapper.writeValue(new File("src/Test/Created" +count+ ".json"), demo);
			System.out.println("Name:" + demo.getName() + " | Subject: " + demo.getSubject());
			count++;
		}	
	}
}
