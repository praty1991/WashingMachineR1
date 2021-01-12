package com.java.server.main.dao;

/*
 * DAO class storing machine details
 **/
import java.util.ArrayList;
import java.util.List;

import com.java.server.main.modal.WashingMachineEntity;

public class WashingMachineDao {
	
	private List<WashingMachineEntity> washingMachineRecords;
	private static WashingMachineDao wmDaoIntance;
	public WashingMachineDao()
	{
		washingMachineRecords=new ArrayList<WashingMachineEntity>();
	}
	
	public List<WashingMachineEntity> getWashingMachineRecords() {
		return washingMachineRecords;
	}

	public void setWashingMachineRecords(List<WashingMachineEntity> washingMachineRecords) {
		this.washingMachineRecords = washingMachineRecords;
	}

	// Factory method, returning instance
		public static WashingMachineDao getIntance()
		{
			if(wmDaoIntance==null)
			{
				wmDaoIntance=new WashingMachineDao();
				return wmDaoIntance;
			}
			else
			{
				return wmDaoIntance;
			}
		}

}
