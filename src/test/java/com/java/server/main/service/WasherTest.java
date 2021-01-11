package com.java.server.main.service;

import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.java.server.main.service.Washer;

@RunWith(MockitoJUnitRunner.class)
public class WasherTest {
	
	Washer WasherObj;
	 
    @Before
    public void init() {
    	WasherObj=new Washer();
    }
    @Test
    public void startMachineTest()
    {
    	int washTime=5;
    	int spinTime=10;
    	Optional<String> res=WasherObj.startMachine(washTime, spinTime);
    	assertNotNull(res);
    }

}
