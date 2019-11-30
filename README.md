# CE-Tasks

Tasks are Implemented and commited as below:

Task1-Balance Update:

     i)Balance Update records read from the file,one line per update and processed row every second.
   
     ii).Balance updates are printing by comparing with previous line credit amount and then genetrate 
       the new balance with new credit amount every second in new line.
       
     iii)Application is thread safe.- Implemented by using Collections.synchronizedList to arraylist.
   
     iv).Implemented Junit tests for BalanceLoadTest class.
   
Task2-Payment Update:

     i) Payement Amount record read from the file,it displays one line per update and processed row every second.
   
     iii)Application is thread safe.- Implemented by using Collections.synchronizedList to arraylist and Timertask.
   
     iv).Implemented Junit tests for LoadPayementsTest class.
   
  
     Run Project:Tested in Eclipse
  
  Task 1:
  
      1.open it in eclipse
      2.open payementsbalance folder
      3.To see the result please run PayementsBalance main class.
      4.To see the test result please run the BalanceLoadTest class.
      
Input:

        From CSV file:
                  
          10001;10001;20002
          10002;10001;20003
          10003;10001;20004 
          10003;10001;20005 - duplicate credit amount 
          10004;10001;20006
          10005;10001;20007
          10005;10001;20008 - duplicate credit amount 
          10006;10001;20009

OutPut:

       New amount:10001 ,It is in progress of crediting to your existing balance
       BalanceModel [timeStamp=2019-11-30 14:48:26.077,creditAmount=10001]
       Successfully Balance is credited, New Balance is:10001

       New amount:10002 ,It is in progress of crediting to your existing balance
       BalanceModel [timeStamp=2019-11-30 14:48:27.112,creditAmount=20003]
       Successfully Balance is credited, New Balance is:20003

       New amount:10003 ,It is in progress of crediting to your existing balance
       BalanceModel [timeStamp=2019-11-30 14:48:28.114,creditAmount=30006]
       Successfully Balance is credited, New Balance is:30006

       New amount:10004 ,It is in progress of crediting to your existing balance
       BalanceModel [timeStamp=2019-11-30 14:48:29.115,creditAmount=40010]
       Successfully Balance is credited, New Balance is:40010

       New amount:10005 ,It is in progress of crediting to your existing balance
       BalanceModel [timeStamp=2019-11-30 14:48:30.188,creditAmount=50015]
       Successfully Balance is credited, New Balance is:50015

       New amount:10006 ,It is in progress of crediting to your existing balance
       BalanceModel [timeStamp=2019-11-30 14:48:31.189,creditAmount=60021]
       Successfully Balance is credited, New Balance is:60021



Task 2:
  
      1.open it in eclipse
      2.open loadamount folder
      3.please run LoadAmount main class.
      4.please run the LoadAmountTest class.
   
Input :

From CSV file:

       60000
       56752
       7665567
       898998
       233423
       78888
       767767
       768768
       7887878

 
OutPut:

       New Payment is loaded
       PaymentsModel [timeStamp=2019-11-28 22:43:58.781, Amount=60000]
       New Payment is loaded
       PaymentsModel [timeStamp=2019-11-28 22:43:58.782, Amount=56752]
       New Payment is loaded
       PaymentsModel [timeStamp=2019-11-28 22:43:58.782, Amount=7665567]
       New Payment is loaded
       PaymentsModel [timeStamp=2019-11-28 22:43:58.782, Amount=898998]
       New Payment is loaded
       PaymentsModel [timeStamp=2019-11-28 22:43:58.782, Amount=233423]
       New Payment is loaded
       PaymentsModel [timeStamp=2019-11-28 22:43:58.782, Amount=78888]
       New Payment is loaded
       PaymentsModel [timeStamp=2019-11-28 22:43:58.782, Amount=767767]
       New Payment is loaded
       PaymentsModel [timeStamp=2019-11-28 22:43:58.782, Amount=768768]
       New Payment is loaded
       PaymentsModel [timeStamp=2019-11-28 22:43:58.782, Amount=7887878]
      
Thanks.....
