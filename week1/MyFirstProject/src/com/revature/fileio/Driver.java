package com.revature.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Driver {
	
	private final String FILE_NAME = "files/myfile.csv";
	
	private FileOutputStream fos = null;
	private FileInputStream fis = null;
	private FileWriter fw = null;
	private FileReader fr = null;
	private BufferedReader br = null;
	private BufferedWriter bw = null;

	public static void main(String[] args) {
		
		Driver d = new Driver();
		try {
//			d.fosExample();
//			d.fisExample();
//			d.fileReaderWriterExample();
			d.bufferedReaderWriterExample();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fosExample() throws IOException {
		
		/*
		 * FileInputStream and FileOutputStream read/write at ONE BYTE at a time
		 */
		
		fos = new FileOutputStream(FILE_NAME);
		
		char rand = 0;
		
		for(int i = 0; i < 16; i++) {
			for(int j = 0; j < 16; j++) {
				rand = (char) ((Math.random() * 26) + 'a');
				
				fos.write((byte) rand);
				if(j < 15) {
					fos.write((byte) ',');
				}
			}
			
			fos.write((byte) '\n');
		}
		
		fos.close();
	}
	
	public void fisExample() throws IOException {
		
		fis = new FileInputStream(FILE_NAME);
		
		byte buffer; // While reading bytes in, if the value is -1, then we have reached the end
		// of the file
		
		while((buffer = (byte) fis.read()) != -1) {
			char c = (char) buffer;
			if(c == ',') {
			} else if(c == '\n') {
				System.out.println();
			} else {
				System.out.print(c + " ");
			}
		}
		
		if(fis != null) {
			fis.close();
		}
	}
	
	public void fileReaderWriterExample() throws IOException {
		/*
		 * While FileInput/OutputStreams read/write one byte at a time, FileReader/Writers read/write
		 * two bytes at a time.
		 */
		
		fr = new FileReader(FILE_NAME);
		fw = new FileWriter("files/myfile.upper.csv");
		
		int c;
		
		while((c = fr.read()) != -1) {
			if(Character.isLowerCase(c)) {
				fw.write(c - 32); // Convert lowercase to uppercase
			} else {
				fw.write(c);
			}
		}
		
		if(fr != null) {
			fr.close();
		}
		if(fw != null) {
			fw.close();
		}
	}
	
	public void bufferedReaderWriterExample() throws IOException {
		
		/*
		 * BufferedReaders/Writers can work with entire Strings at a time of almost any length
		 */
		br = new BufferedReader(new FileReader(FILE_NAME));
		bw = new BufferedWriter(new FileWriter("files/myfile.reader.csv"));
		
		String input = "";
		
		while((input = br.readLine()) != null) {
			String[] letters = input.split(",");
			bw.write(input + "," + letters.length + "\n");
			
//			bw.write(input.replaceAll("a", "REDACTED") + "\n");
		}
		
		br.close();
		bw.close();
	}
}
