package com.seed.library;

import java.util.*;


public class Books {
     private int id;
     private String name;
       private   Set<String> authors;
         private int price ;
		public Books() {
		
		     id = 101;	    
	        name = "sham";
		 authors=new HashSet<>();
			price = 300;
		}
		
		public Books(int id, String name, Set<String> authors, int price) {
			this.id = id;
			this.name = name;
			 this.authors=authors;
			this.price = price;
		}

public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set<String> getAuthors() {
			return authors;
		}

		public void setAuthors(Set<String> authors) {
			this.authors = authors;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

@Override
public String toString() {
	return "Books id=" + id + ", name=" + name + ", authors=" + authors + ", price=" + price ;
}
}