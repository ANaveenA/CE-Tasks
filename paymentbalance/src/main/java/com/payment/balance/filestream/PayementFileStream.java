package com.payment.balance.filestream;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.payment.balance.model.BalanceModel;

public class PayementFileStream {
	
	public List<BalanceModel> readFileBalance() {
      
	  List<BalanceModel> lists = Collections.synchronizedList(new ArrayList<>());
		
	  List<String> list = Collections.synchronizedList(new ArrayList<>());;
		
	  
	  // read all lines 
	  // trim them and filter out all empty lines 
	 
	try {list = Files.lines(new File("config/balanceload.csv").toPath())
		    .map(s -> s.trim()) 
		    .filter(s -> !s.isEmpty())
		    .collect(Collectors.toList());
		
		if(list.size() > 0) {
			list.stream().forEach(e -> {
		        String[] data = e.split(",");
	            BalanceModel balanceObj = new BalanceModel();
	            balanceObj.setCreditAmount(Integer.parseInt(data[0]));
	            balanceObj.setDebitAmount(Integer.parseInt( data[1]));
	            balanceObj.setAmountNet(Integer.parseInt(data[2])); 
	            lists.add(balanceObj);
		        
		    });
		}
	} catch (IOException e1) {
		e1.printStackTrace();
	}
		return lists;
	}

}
