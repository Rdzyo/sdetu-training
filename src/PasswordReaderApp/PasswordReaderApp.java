package PasswordReaderApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordReaderApp {

	public static void main(String[] args) {
		String filename = "D:\\Projekty Java\\Java training\\Files\\Passwords.txt";
		String[] pws = new String[13];
		File file = new File(filename);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i=0;i<pws.length;i++) {
				pws[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e)
		{
			System.out.println("ERROR: File not found" + filename);
		} catch (IOException e)
		{
			System.out.println("ERROR: Could not read the data from file: " + filename);
		}
		
		for(String pw : pws)
		{
			System.out.println("******\n" + pw);
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			boolean hasInvalidChar = false;
			
			for(int i=0;i<pw.length();i++) {
				if("0123456789".contains(pw.substring(i, i+1))) {
					hasNumber = true;
				}
				else if("abcdefghijklmnoprstuvwxyz".contains(pw.substring(i,i+1).toLowerCase())) {
					hasLetter = true;
				}
				else if("!@#$%^&**()_-+=.".contains(pw.substring(i,i+1))) {
					hasSpecialChar = true;
				}
				else {
					hasInvalidChar = true;
				}				
			}
			try {
			if(hasInvalidChar) {
				System.out.println("Invalid character used");
			}
			if(!hasNumber) {
				throw new NoNumberException(pw);
			}
			if(!hasLetter) {
				throw new NoLetterException(pw);
			}
			if(!hasSpecialChar) {
				throw new NoSpecialCharException(pw);
			}
		} catch (NoNumberException e) {
			System.out.println(e.toString());
		} catch (NoLetterException e) {
			System.out.println(e.toString());
		} catch (NoSpecialCharException e) {
			System.out.println(e.toString());
		}
	}

}
}

class NoNumberException extends Exception {
	String pswd;
	NoNumberException(String pswd) {
		this.pswd = pswd;
	}
	public String toString()
	{
		return ("NoNumberException: " + pswd);
	}
}

class NoLetterException extends Exception {
	String pswd;
	NoLetterException(String pswd) {
		this.pswd = pswd;
	}
	public String toString()
	{
		return ("NoLetterException: " + pswd);
	}
}

class NoSpecialCharException extends Exception {
	String pswd;
	NoSpecialCharException(String pswd) {
		this.pswd = pswd;
	}
	public String toString()
	{
		return ("NoSpecialCharException: " + pswd);
	}
}
