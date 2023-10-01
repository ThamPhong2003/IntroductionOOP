package Test;

import controller.ClientControl;
import view.ClientView;

public class ClientRun{
	public static void main(String[ ] args){
		ClientView view = new ClientView ( );
		ClientControl controller = new ClientControl();
		view.setVisible(true);
	}
}
