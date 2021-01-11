package com.java.server.main.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;

import com.java.server.main.controller.WashingMachineController;
import com.java.server.main.modal.StartWM;
import com.java.server.main.modal.WashingMachineEntity;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.StandardServletAsyncWebRequest;


@RunWith(MockitoJUnitRunner.class)
public class CustomExceptionHandlerTest {
	
	CustomExceptionHandler customExceptionHandler;
	RecordNotFoundException mockRecordNotFoundException;
	MissingHeaderInfoException mockMissingHeaderInfoException;
	StandardServletAsyncWebRequest request;
    @Before
    public void init() {
    	customExceptionHandler=new CustomExceptionHandler();
    	mockRecordNotFoundException=mock(RecordNotFoundException.class);
    	mockMissingHeaderInfoException=mock(MissingHeaderInfoException.class);
        request = mock(StandardServletAsyncWebRequest.class);
    }
    @Test
    public void testHandleUserNotFoundException()
    {
    	when(mockRecordNotFoundException.getLocalizedMessage()).thenReturn("custom");
    	ResponseEntity<ErrorResponse> responseEntity = customExceptionHandler.handleUserNotFoundException(mockRecordNotFoundException,request);
        assertNotNull(responseEntity);
    }
    @Test
    public void testhandleInvalidTraceIdException()
    {
    	when(mockMissingHeaderInfoException.getLocalizedMessage()).thenReturn("custom");
    	ResponseEntity<ErrorResponse> responseEntity = customExceptionHandler.handleInvalidTraceIdException(mockMissingHeaderInfoException,request);
        assertNotNull(responseEntity);
    }

}
