package com.java.server.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.java.server.main.modal.WashingMachineEntity;

public class WashingMachineImpl {
	
	private List<WashingMachineEntity> washingMachineRecords;
	private static WashingMachineImpl wmIntance;
	public WashingMachineImpl()
	{
		washingMachineRecords=new ArrayList<WashingMachineEntity>();
	}
	
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
		return Optional.ofNullable(washingMachineRecords);
	}
	
	// Adding new washing machine
	public Optional<WashingMachineEntity> addWM(WashingMachineEntity washingMachineEntity)
	{
		if(washingMachineEntity !=null)
		washingMachineRecords.add(washingMachineEntity);
		return Optional.ofNullable(washingMachineEntity);
	}
	
	// Repairing washing machine
	public Optional<String> updateWM(WashingMachineEntity washingMachineEntity)
	{
		for(int index=0;index<washingMachineRecords.size();index++)
		{
			if(washingMachineRecords.get(index).getWmId()==washingMachineEntity.getWmId())
			 {
				washingMachineRecords.set(index, washingMachineEntity);
				return Optional.ofNullable("update successful");
		     }
		}
		return Optional.ofNullable("update unsuccessful");
	}

}
