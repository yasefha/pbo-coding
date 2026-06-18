package sesi11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerge {

	public static void main(String[] args) {
		String[] files = {"D:\\Code\\pbo\\coding\\src\\sesi11\\file1.txt","D:\\\\Code\\\\pbo\\\\coding\\\\src\\\\sesi11\\\\file2.txt"};
		String mergedFile = "D:\\Code\\pbo\\coding\\src\\sesi11\\merge.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))){
			for (String file : files) {
				try (BufferedReader br = new BufferedReader(new FileReader(file))){
					String line;
					while ((line = br.readLine()) != null) {
						bw.write(line);
						bw.newLine();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
