package deu.cse.team.command;

//
// This is the invoker
//
public class RemoteControl {
        Command[] A_Commands;
	Command[] B_Commands;
        Command[] C_Commands;
 
	public RemoteControl() {
		A_Commands = new Command[1];
		B_Commands = new Command[1];
                C_Commands = new Command[1];
 
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
        
        
	public void A_ButtonWasPushed(int slot) {
		A_Commands[slot].execute();
	}
 
	public void B_ButtonWasPushed(int slot) {
		B_Commands[slot].execute();
	}
        
        public void C_ButtonWasPushed(int slot) {
		C_Commands[slot].execute();
	}
  
}
