package com.seed.library.utility;

import java.util.Comparator;

import com.seed.library.Books;

public class CompareBookByName implements Comparator<Books>{

	@Override
	public int compare(Books b1, Books b2) {
		
		return b1.getName().compareTo( b2.getName());
	}

	

}
