package com.load.amount.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class LoadAmountTest {

	@Test
    public void loadPaymentsTest() throws IOException, InterruptedException {

		String loadPayment ="config/paymentload.csv";
		
		List<String> lists = Collections.synchronizedList(new ArrayList<>());
       
		try(Stream<String> stream = Files.lines(Paths.get(loadPayment))){
			
			lists = stream.collect(Collectors.toList());
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
		catch(IOException e){
			e.printStackTrace();
		}

			
			
	
       
    }
}
