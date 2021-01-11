package com.java.server.main.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.java.server.main.modal.StartWM;
import com.java.server.main.modal.WashingMachineEntity;


@RunWith(MockitoJUnitRunner.class)
public class WashingMachineControllerTest {
	
	StartWM mockStartWM;
	WashingMachineController washingMachineController;
    WashingMachineEntity mockWashingMachineEntity;
	 
    @Before
    public void init() {
    	washingMachineController=new WashingMachineController();
        mockStartWM=mock(StartWM.class);
    	mockWashingMachineEntity=mock(WashingMachineEntity.class);
    }
    @Test
    public void testAddWashingMachine()
    {
        WashingMachineEntity responseEntity = washingMachineController.addWMMachine(mockWashingMachineEntity);
        assertEquals(mockWashingMachineEntity, responseEntity);
    }
    @Test
    public void testRepairWMMachine()
    {
        String responseEntity = washingMachineController.repairWMMachine(mockWashingMachineEntity);
        assertNotNull(responseEntity);
    }
    @Test
    public void testGetWMMachineDetails()
    {
    	List<WashingMachineEntity> responseEntity = washingMachineController.getWMMachineDetails();
        assertTrue(responseEntity.size()>=0);
        
    }
    @Test
    public void teststartWMMachine()
    {
    	mockStartWM=mock(StartWM.class);
        String responseEntity = washingMachineController.startWMMachine(mockStartWM);
        assertNotNull(responseEntity);
    }

}

