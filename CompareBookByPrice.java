package com.seed.library.utility;

import java.util.Comparator;

import com.seed.library.Books;

public class CompareBookByPrice implements Comparator <Books>{

	

	@Override
	public int compare(Books b3, Books b4) {
	
		return Integer.compare(b3.getPrice(),b4.getPrice());
	}

}
