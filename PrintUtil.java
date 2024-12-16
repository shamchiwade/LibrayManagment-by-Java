package com.seed.library.utility;

import java.util.Iterator;
import java.util.List;



public class PrintUtil {
	
	public static <Books> void printRecord(List<Books> records) {
		
		
		Iterator<Books> book=records.iterator();
		while(book.hasNext()) {
			System.out.println(book.next());
		}
	  
	}

}
