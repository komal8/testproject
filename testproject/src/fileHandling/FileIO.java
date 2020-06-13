package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fs=new File("xz.txt");
		FileOutputStream fos=new FileOutputStream(fs);
		fos.write(70);
		fos.write('a');
		byte[] b= {97,98,99,100,101};
		fos.write(b);
		byte[] b1={'a','b','c','d'};
		try {
			fos.write(b1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
