/*
Write a program that would input a file or a directory and prints its name. 
If it is a directory, all the contents in the directory should be printed.

e.g.
If it is a file, the output should be:
<FileName>
If it is a directory, the out put should be
<DirName>
--<FileName1>
--<FileName2>
--<DirName2 >
----<FileName3>
----<FileName4>
--<DirName3>
 */
package com.bizleap.intership.assignments;
import java.io.File;

public class FileReader {

	public void printDirectory(File directoryPath, String indent) {
		System.out.println(indent+" "+directoryPath.getName());
		indent+="--";
		String[] fileNames=directoryPath.list();
		try{
			for(String fileName:fileNames)
				printDirectory(new File(directoryPath, fileName), indent);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		String input="F://shine wanna privacy//8GB//Pictures";
		File file=new File(input);
		new FileReader().printDirectory(file," ");
	}
}