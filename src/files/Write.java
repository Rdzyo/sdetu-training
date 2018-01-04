package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// 1. Define the path that we want to write
		String filename = "D:\\Projekty Java\\Java training\\Files\\FileToWrite.txt";
		String message = "Writing data that will be placed to a file";
		
		// 2. Create the file in Java
		File file = new File(filename);
		// 3. Open the file
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			
			// 4. Write to the file
			fw.write(message);
			
			// 5. Close the resources
			fw.close();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the file: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the file writer");
		}
		
		
		

	}

}
