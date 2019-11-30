package com.payment.balance.test;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.payment.balance.model.BalanceModel;


public class PayementBalanceTest {
		
      @Test
      public void loadCSVTest() {
		
      List<BalanceModel> lists = Collections.synchronizedList(new ArrayList<>());
		
  	  List<String> list = Collections.synchronizedList(new ArrayList<>());
		
  	  try {list = Files.lines(new File("config/balanceload.csv").toPath())
  			  
		    .map(s -> s.trim()) 
		    .filter(s -> !s.isEmpty())
		    .collect(Collectors.toList());
	    
 			if(list.size() > 0) {
 				list.stream().forEach( e ->{
 			        String[] data = e.split(",");
 					Date date = new Date();
 		            long time = date.getTime();
 		            Timestamp ts = new Timestamp(time);
 		            BalanceModel balanceObj = new BalanceModel();
 		            balanceObj.setTimeStamp(ts);
 		            balanceObj.setCreditAmount(Integer.parseInt(data[0]));
 		            balanceObj.setDebitAmount(Integer.parseInt( data[1]));
 		            balanceObj.setAmountNet(Integer.parseInt(data[2])); 
 		            lists.add(balanceObj);       
 			    });
 			}
 			

			List<Integer> arr= lists.stream()
			    	   .map(e -> e.getCreditAmount())
			           .distinct()
			    	   .collect(Collectors.toList());
		        
		            int sum=0; 
	                for(int creaditAmount:arr) { 
	                   sum += creaditAmount;
	                   try {
	            	   Date date = new Date();
	   	               long time = date.getTime();
	   	               Timestamp ts = new Timestamp(time);
	                   System.out.println("\n" 
	   	                                   +"New amount:" 
	   	                                   + creaditAmount 
	   	                                   + " ,It is in progress of crediting"
	   	                		           + " to your existing balance" );
			            System.out.println("BalanceModel [" + "timeStamp=" + ts + ",creditAmount=" + sum +"]");
	                    System.out.println("Successfully Balance is credited, New Balance is:" + sum);
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
				 	}
	    	      }
		}
		catch(IOException e){
			
			e.printStackTrace();
			
		}
			
    }
}
