package com.stopwatch;

public class StopWatch {

	public static void main(String[] args) {
		            Time s=new Time();
		            s.start();
		            s.stop();
		            System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());
	
			}
		}
		 class Time {
			 long startTime = 0;
			 long stopTime = 0; 
			 boolean running = false;
			public void start() {
				this.startTime = System.currentTimeMillis();
				this.running = true;
				System.out.println("Start time is:: "+startTime);
			}
		     public void stop() {
		    	 this.stopTime = System.currentTimeMillis();
				    this.running = false;
					System.out.println("Stop time is:: "+stopTime);
		     }
		     public long getElapsedTime() {
		    	    long elapsed;
		    	    elapsed=stopTime-startTime;
		    	        System.out.println(elapsed);
		    	    return elapsed;
		    	}
		 }


