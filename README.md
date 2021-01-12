# WashingMachine

 #Step to build the Application
  from terminal point : run the following commands
   1. mvn clean install
   #OR
   2. mvnw spring-boot:run

#There are 2 modal classes :-
  1. WashingMachineEntity (Washing Machine Entities)
  2. StartWM (Washing Machine input Entities)
  
# There is one DAO class

  1.WashingMachineDao (Stroring WMachine details)
  
#There are 3 service classes :-
  1. Washer :- Washing machine functions are written in this class
  2. WashingMachineImpl :- Washing Machines inbuild databse Api written inside this class
  3. ResponseClass:- Response Class to hold the success response
  
#Controller Class :-

  1. WashingMachineController
  
#Controller class has below Api :-

   1. getWMMachineDetails (Fetch all Washing Machines)(Get Method)
  
     URL : http://localhost:8080/washingMachine/allWachingMachine
     
   2. addWMMachine(Adding new Washing Machine). it takes WashingMachineEntity as RequestBody(Post Method)
  
     URL : http://localhost:8080/washingMachine/add
     
   3. repairWMMachine (Repairing Washing Machine). it takes WashingMachineEntity as RequestBody(Post Mehtod)
  
     URL : http://localhost:8080/washingMachine/repair
     
   4. startWMMachine (Start washing clothes). it takes StartWM as RequestBody(Post Method)
  
     URL : http://localhost:8080/washingMachine/start
     
#RestfulWebServicesApplication :- Application start from this point.

 There are 4 error and exception halding classes.
 
     1. CustomExceptionHandler
   
     2. MissingHeaderInfoException
   
     3. RecordNotFoundException
   
     4. ErrorResponse
   
#There are 4 Test classes have been written as below.

     1. WasherTest (Testing fuctionality of washing Machine)
   
     2. WashingMachineImplTest (Testing functionality of Storage Api)
   
     3. WashingMachineControllerTest
   
     4. CustomExceptionHandlerTest
 
