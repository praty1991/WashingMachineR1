package com.java.server.main.service;

import java.util.Optional;

// washing functions
public class  Washer
{
	 static Washer washerInstance;
	 static String res;
	 public Optional<String> startMachine(int washTime, int spinTime) {
	        new On()
	            .wash(washTime)
	            .spin(spinTime)
	            .turnOff();
			return Optional.ofNullable(res);
	    }
	 // States of the washing machine
	    public abstract static class State {}
	    public static class On extends State {
	        public Wash wash(int minutes) {
	        	res=res+"Washing Machine Started....\n";
	            return new Wash(minutes);
	        }
	    }
	   // Washing is in progress
	    public static class Wash extends State {
	        private int minutes;
	        public Wash(int minutes) {
	            super();
	            this.minutes = minutes;
	        }
       // Spinning is in progress
	        public Spin spin(int revs) {
	        	res=res+"Spinning started....\n";
	            return new Spin(revs);
	        }

	    }
	    public static class Spin extends State {
	        private int revs;
	        public Spin(int revs) {
	            super();
	            this.revs = revs;
	        }
	        public Off turnOff() {
	        	res=res+"washing completed...\n";
	            return new Off();
	        }
	    }
	    public static class Off extends State{}
	    
	    // Get the washer instance
	    public static Washer getIntance() {
	    	if(washerInstance==null)
			{
	    		washerInstance=new Washer();
				return washerInstance;
			}
			else
			{
				return washerInstance;
			}
	    }

}