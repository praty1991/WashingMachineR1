package src.test.java.com.java.server.main.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.java.server.main.service.ResponseClass;
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
    	Optional<ResponseEntity<ResponseClass>> res = null;
    	if(washTime>0 && spinTime>0)
    	{
    	res=WasherObj.startMachine(washTime, spinTime);
    	}
    	else
    	{
    		washTime=0;
    		spinTime=0;
    		res=WasherObj.startMachine(washTime, spinTime);
    	}
    	if(res.isPresent())
    	{
        	assertNotNull(res);	
    	}
    	else
    	{
    		assertNull(res);
    	}
    }

}
