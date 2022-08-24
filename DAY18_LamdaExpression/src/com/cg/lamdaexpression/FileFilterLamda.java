package com.cg.lamdaexpression;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLamda {

	public static void main(String[] args) 
	{
		//lamda expression for serching the file in given path of particular extension
		FileFilter Filter=(File pathname)->pathname.getName().endsWith(".txt");
		//.mp4   .pptx   .txt
		File dir=new File("C:\\Users\\sayal\\Downloads");
		File contents[]=dir.listFiles(Filter);
		//enhanced for loop 
		for(File i:contents)
		{
			System.out.println(i);
			
		}
	}

}
