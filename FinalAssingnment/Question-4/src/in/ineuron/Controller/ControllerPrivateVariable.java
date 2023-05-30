package in.ineuron.Controller;

public class ControllerPrivateVariable {
       private static int var;
          private ControllerPrivateVariable() {}
	public static int getVar() {
		return var;
	}

	public static void setVar(int var) {
		ControllerPrivateVariable.var = var;
	}
       
}
