# WashingMachine

 #Step to build the Application
  from terminal point : run the following commands
   1. mvn clean install
   
   #OR
   
   2. mvn spring-boot:run

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

   You can call APIs via Postman

   Base URL : http://localhost:8080

   1. getWMMachineDetails (Fetch all Washing Machines)(Get Method)
  
     GET /washingMachine - To get all the available washing machines, Sucess HTTP code=200, Fail code=404
     
   2. addWMMachine(Adding new Washing Machine). it takes WashingMachineEntity as RequestBody
  
     POST /washingMachine/add - To add new Maching Machine, Success HTTP code=201, Fail code=400
     
     Request Payload
     {
       "wmId" : 6,
       "modelNo" : "6a",
       "serialNo" : 6,
       "wmName" : "abcd"
     }
     
   3. repairWMMachine (Repairing Washing Machine). it takes WashingMachineEntity as RequestBody
  
     POST /washingMachine/repair - To repaire existing washing machine, Success HTTP code=200, Fail code=400
     
      Request Payload
      {
        "wmId" : 6,
        "modelNo" : "6a",
        "serialNo" : 6,
        "wmName" : "abcd"
      }
     
   4. startWMMachine (Start washing clothes). it takes StartWM as RequestBody(Post Method)
  
     POST /washingMachine/start - Starting Washing Machine, Success HTTP code=200, Fail code=400
     
      Request Paylod
       {
         "washTime" : 5,
         "spinTime" : 6
       }
     
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
 
