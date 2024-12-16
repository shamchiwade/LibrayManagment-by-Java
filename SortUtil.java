package com.seed.library.utility;

import java.util.Collections;
import java.util.List;

import com.seed.library.Books;


	public class SortUtil {
	    public static void sortByName(List<Books> books) {
	        Collections.sort(books, new CompareBookByName());
	    }

	    public static void sortByPrice(List<Books> books) {
	        Collections.sort(books, new CompareBookByPrice());
	    }
}
