package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			File fs=new File("xz.txt");
			int totalchar=(int)fs.length();
			
			FileInputStream	fis = new FileInputStream(fs);
			for(int i=0;i<totalchar;i++) {
				System.out.println((char)fis.read());
				System.out.println("total character into the file:" +fis);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	

	}


