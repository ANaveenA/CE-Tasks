package com.load.amount.display;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.load.amount.streamfile.LoadAmountFileStream;

public class LoadAmountDisplay {
	
	LoadAmountFileStream newlists = new LoadAmountFileStream();
	
	List<String> lists = newlists.loadAmount();
	

	public void loadPaymentAmount() {
		Date date = new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        
		lists.stream().forEach(e -> {
			    try {
			    	System.out.println();
					System.out.println("New Payement is passed" 
			    	                    +'\n' 
			    	                    + "Date:" 
							            + ts 
							            + ","
			    	                    + "" 
			    	                    + "Payement Amount:" 
			    	                    + e);
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
		});
	}

}
