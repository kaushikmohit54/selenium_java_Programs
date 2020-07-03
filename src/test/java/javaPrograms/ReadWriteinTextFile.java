package javaPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteinTextFile {

	public static void main(String[] args) throws IOException {
		String s=null;
		File f=new File("D:\\mohitRepo\\pratice\\src\\test\\java\\mohit.txt");
		FileReader fr=new FileReader(f);
		BufferedReader bf=new BufferedReader(fr);
		while((s=bf.readLine())!=null){
			System.out.println(s);
		}

	}
	static void filewrite() throws IOException {
		
		String fileContent = "This is Java interview questions";
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\mohitRepo\\pratice\\src\\test\\java\\mohit.txt"));
        writer.write(fileContent);
        writer.close();
	}

}
