package deu.cse.team.command;

//
// This is the invoker
//
public class RemoteControl {
        Command[] A_Commands;
	Command[] B_Commands;
        Command[] C_Commands;
 
	public RemoteControl() {
		A_Commands = new Command[2];
		B_Commands = new Command[2];
                C_Commands = new Command[2];
 
		Command noCommand = new NoCommand();
		for (int i = 0; i < 1; i++) {
			A_Commands[i] = noCommand;
			B_Commands[i] = noCommand;
                        C_Commands[i] = noCommand;
		}
	}
  
	public void setCommand(int slot, Command A_Command, Command B_Command) {
		A_Commands[slot] = A_Command;
		B_Commands[slot] = B_Command;
	}
 
        public void setCommand(int slot, Command A_Command, Command B_Command, Command C_Command ) {
		A_Commands[slot] = A_Command;
		B_Commands[slot] = B_Command;
                C_Commands[slot] = C_Command;
	}
        
        
	public String A_ButtonWasPushed(int slot) {
		return A_Commands[slot].execute();
	}
 
	public String B_ButtonWasPushed(int slot) {
		return B_Commands[slot].execute();
	}
        
        public String C_ButtonWasPushed(int slot) {
		return C_Commands[slot].execute();
	}
  
}
