package com.seed.library.utility;
import com.seed.library.*;
import java.util.*;

public class StoreUtil<T> {
private List<Books> records;
public StoreUtil()
{
	this.records=new ArrayList<Books>();
}
public void addRecord(Books record) {
	records.add(record);
	
}
public List<Books> getRecords() {
	return records;
	
}
public int getNoOfRecords(){
	return records.size();
	
}
}
