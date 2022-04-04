package chap18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class App06 {
	public static void main(String[] args) throws Exception {
		// BufferedReader, BufferedWriter 사용해서
		// output/FilterExample51.txt
		// output/FilterExample6.txt 로 복사
//		String origin = "output/Filter/Example51.txt";
//		String des = "output/FilterExample6.txt";		
		
		bufferedReader();
	}
	
	private static void bufferedReader() throws Exception {
		String path = "output/FilterExample51.txt";
		Reader reader = new FileReader(path);
		Reader br = new BufferedReader(reader);
		
		String paths = "output/FilterExample6.txt";
		Writer writer = new FileWriter(paths);
		Writer bw = new BufferedWriter(writer);
		
		long start = System.currentTimeMillis();
		int data = 0;
		while((data = br.read()) != -1) {
			bw.write(data);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		bw.close();
		writer.close();
		br.close();
		reader.close();
		
	}
}

