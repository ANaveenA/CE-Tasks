package com.payment.balance.compare;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.payment.balance.filestream.PayementFileStream;
import com.payment.balance.model.BalanceModel;

public class PaymentBalanceCompare {
	
	public void compareCreditBalance() {
		
		    PayementFileStream balancelists = new PayementFileStream();
		
		    List<BalanceModel> lists = balancelists.readFileBalance();
		    
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

}
