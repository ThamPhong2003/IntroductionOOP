package Test;

import sever.ServerView;
import Model.User;
import controller.ServerControl;
import view.LoginView;
public class ServerRun{
	public static void main(String[ ] args){
		ServerView view = new ServerView( );
		ServerControl controller = new ServerControl(view, 8080, new User());
	}
}