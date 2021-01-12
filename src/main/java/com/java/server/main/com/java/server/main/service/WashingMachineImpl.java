package com.java.server.main.service;

/*
 * Washing Machine Implementation class
 * 
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.java.server.main.dao.WashingMachineDao;
import com.java.server.main.modal.WashingMachineEntity;

public class WashingMachineImpl {
	
	private List<WashingMachineEntity> washingMachineRecords;
	private static WashingMachineImpl wmIntance;
	private String REQUEST_SUCCESSFUL = "REQUEST_SUCCESSFUL";
	public WashingMachineImpl()
	{}
	
	// Factory method, returning instance
	public static WashingMachineImpl getIntance()
	{
		if(wmIntance==null)
		{
			wmIntance=new WashingMachineImpl();
			return wmIntance;
		}
		else
		{
			return wmIntance;
		}
	}
	
	// Fetching all the washing machines
	public Optional<List<WashingMachineEntity>> getWMDetails()
	{
		return Optional.ofNullable(WashingMachineDao.getIntance().getWashingMachineRecords());
	}
	
	// Adding new washing machine
	public Optional<WashingMachineEntity> addWM(WashingMachineEntity washingMachineEntity)
	{
		if(washingMachineEntity !=null)
		{
		washingMachineRecords=WashingMachineDao.getIntance().getWashingMachineRecords();
		washingMachineRecords.add(washingMachineEntity);
		WashingMachineDao.getIntance().setWashingMachineRecords(washingMachineRecords);
		}
		return Optional.ofNullable(washingMachineEntity);
	}
	
	// Repairing washing machine
	public Optional<ResponseEntity<ResponseClass>> updateWM(WashingMachineEntity washingMachineEntity)
	{
		List<String> details = new ArrayList<>();
		washingMachineRecords=WashingMachineDao.getIntance().getWashingMachineRecords();
		for(int index=0;index<washingMachineRecords.size();index++)
		{
			if(washingMachineRecords.get(index).getWmId()==washingMachineEntity.getWmId())
			 {
				washingMachineRecords.set(index, washingMachineEntity);
				WashingMachineDao.getIntance().setWashingMachineRecords(washingMachineRecords);
		        details.add("update successful");
		        ResponseClass error = new ResponseClass(REQUEST_SUCCESSFUL, details);
		        return Optional.ofNullable(new ResponseEntity<>(error, HttpStatus.OK));
		     }
		}
        details.add("update unsuccessful");
        ResponseClass success = new ResponseClass(REQUEST_SUCCESSFUL, details);
        return Optional.ofNullable(new ResponseEntity<>(success, HttpStatus.OK));
	}

}
