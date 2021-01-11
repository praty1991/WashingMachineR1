package com.java.server.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.server.main.exception.MissingHeaderInfoException;
import com.java.server.main.exception.RecordNotFoundException;
import com.java.server.main.modal.StartWM;
import com.java.server.main.modal.WashingMachineEntity;
import com.java.server.main.service.Washer;
import com.java.server.main.service.WashingMachineImpl;

//Controller  
@RestController

public class WashingMachineController {

	// Fetch all Washing Machines
	@RequestMapping(method = RequestMethod.GET, path = "/washingMachine/allWachingMachine")
	public List<WashingMachineEntity> getWMMachineDetails() {
		return WashingMachineImpl.getIntance().getWMDetails().orElseThrow(() -> new MissingHeaderInfoException("There is no washing machine found"));

	}

	//Repairing Washing Machine
	@RequestMapping(method = RequestMethod.POST, path = "/washingMachine/repair")
	@ResponseBody
	public String repairWMMachine(@RequestBody WashingMachineEntity washingMachineEntity) {
		return WashingMachineImpl.getIntance().updateWM(washingMachineEntity).orElseThrow(() -> new RecordNotFoundException("Washing Machine is not found"));

	}

	// Adding new Washing Machine
	@RequestMapping(method = RequestMethod.POST, path = "/washingMachine/add")
	@ResponseBody
	public WashingMachineEntity addWMMachine(@RequestBody WashingMachineEntity washingMachineEntity) {
		return WashingMachineImpl.getIntance().addWM(washingMachineEntity).orElseThrow(() -> new RecordNotFoundException("Washing Machine is not added"));

	}

	// Start washing clothes
	@RequestMapping(method = RequestMethod.POST, path = "/washingMachine/start")
	@ResponseBody
	public String startWMMachine(@RequestBody StartWM startWM) {
		return Washer.getIntance().startMachine(startWM.getWashTime(), startWM.getSpinTime()).orElseThrow(() -> new RecordNotFoundException("Washing Machine is not started")); 

	}
}
