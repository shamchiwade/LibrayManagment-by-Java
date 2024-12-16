package com.seed.LibrayMain;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.seed.library.*;
import com.seed.library.utility.*;
public class LibraryMain {
	public static void main(String[] args) {
		Set<String> authors1 = new HashSet<>(Arrays.asList("Author William Shakespeare ","Deepak Chopra"));
        Set<String> authors2 = new HashSet<>(Arrays.asList("Agatha Christi"));
        Set<String> authors3 = new HashSet<>(Arrays.asList("Chetan Bhagat  ")); 
		  Books book1 = new Books(1, "Barnes & Noble Don't", authors1, 500);
	        Books book2 = new Books(2, "Naked Triangle", authors2, 300);
	        Books book3 = new Books(3, "Making India Awesome", authors3, 450);
	        
        StoreUtil<Books> storeUtil = new StoreUtil<>();
        storeUtil.addRecord(book1);
        storeUtil.addRecord(book2);
        storeUtil.addRecord(book3);
        List<Books> booksList = storeUtil.getRecords();
        System.out.println("---------------------------------------------------------------");
        System.out.println("all books");
        PrintUtil.printRecord(booksList);
        System.out.println("---------------------------------------------------------------");

        System.out.println("\n Sorted by Name:");

        SortUtil.sortByName(booksList);
        PrintUtil.printRecord(booksList);
        System.out.println("---------------------------------------------------------------");

        System.out.println("\n Sorted by Price:");

        SortUtil.sortByPrice(booksList);
        PrintUtil.printRecord(booksList);
        System.out.println("\nTotal number of records: " + storeUtil.getNoOfRecords());
    }
}
