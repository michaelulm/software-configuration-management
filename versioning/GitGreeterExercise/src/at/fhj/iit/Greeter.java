package at.fhj.iit;

public interface Greeter {
	
	/**
	 * Student 1
	 * Student 2
	 * Student 3 (OPTIONAL)
	 * 
	 * TODO Instruction for GIT Lab for Grading GIT Part of Configuration Management
	 *  - copy content of this git repository / zip file
	 *
	 *	- create your own remote repository, take care about Project Layout (!)
	 * 
	 *  (! Student 1 !)
	 *  - implement Main with 'public static void main(String[] args)'
	 *  - call sayHello()
	 *  - call sayGoodBye()
	 *
	 *  => publish current skeleton for your colleague(s) in remote repository
	 *
	 *
	 *  (! Student 1 !)
	 *  - implement GreeterImpl			
	 *  - implement Constructor with 'name' argument
	 *  - change name of current GreeterImpl Call
	 * 
	 *
	 *  (! Student 2 !)
	 *  - create branch (optional, not needed for beginning -> advanced)
	 *  - implement sayHello() Method 	
	 *	- simple "Hello, <your name>!" output
	 *  
	 * 
	 * (! Student 1, 2, or 3 !)
	 *  - create branch (optional, not needed for beginning -> advanced)
	 *  - implement sayGoodBye() Method 
	 *  - simple "Good Bye, <your name>!" output
	 *
	 *  
	 *  - merge branches into master
	 *	- publish changes to remote
	 *  - tag final implementation with "FinalVersion"
	 *  
	 *
	 * FINAL ASSIGNMENT
	 *  - don't forget to push everything (!) 
	 *	  AND final version includes 
	 *		- runnable source code
	 *		- with two demo outputs (1x hello, 1x goodbye) => call methods in main Class
	 *		- before commit take care that you previously tested your own source code 
	 * - finish your assignment at elearning website with publishing repository url
	 *
	 * 
	 * REMEMBER Git commands:
	 *
	 *   											<- Clone (FROM REMOTE)
	 *   				<- Checkout (From LOCAL)
	 *   -> (add) 		-> Commit (TO LOCAL) 		-> Push (TO REMOTE)
	 *   					  		(LOCAL)			<- Pull (FROM REMOTE)
	 *
	 *
	 */

	void sayHello();

	void sayGoodbye();

}