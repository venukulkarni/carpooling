
public class MLQFScheduler {

	/**
	 * @author Ajay
	 * Section 6.7.3 provides sample code for implementing a round-robin scheduler for Java threads. Using this code as a starting point, 
	 * implement a MLFQ scheduler that has two queues. The priorities of threads in the two queues should be 2 and 3 respectively. 
	 * Have the scheduler select a thread from the highest-priority non-empty queue, set that thread's priority to 5 and allow the thread to run 
	 * for the time slice for that queue. Assume that times slice for each priority level is 2*DEFAULT_TIME_SLICE and DEFAULT_TIME_SLICE, respectively. 
	 * When this time slice expires, select the next highest priority thread and repeat the process. 
	 * Assume that round-robin scheduling is used at each priority level, and that a higher priority thread that wakes up does not preempt a currently executing thread. 
	 * Unlike multi-level feedback queue scheduling, assume that your simple scheduler does not move threads from one priority-level to another.
	 * Test your scheduler with three threads, one at priority level 3 and two at priority level 2. Have each thread run in a loop incrementing a counter. 
	 * After every 10,000 loops, have each thread print out its id and the current value of its counter and then sleep for 5 seconds, allowing the next thread to run. 
	 * It is important to understand that the JVM has its own thread scheduler that uses priorities. Your scheduler does not replace the JVM scheduler, 
	 * rather it emulates a (user-level) scheduling policy using the notion of priorities. By increasing the priority of the next thread to be scheduled, 
	 * your user-level sheduler helps the JVM scheduler "pick" the right thread for execution. In some sense, the JVM scheduler acts like a 
	 * kernel CPU scheduler that we learnt in class, while your scheduler acts like a user-level scheduler in a threads library.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
