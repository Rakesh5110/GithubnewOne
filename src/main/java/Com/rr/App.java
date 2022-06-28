package Com.rr;

import java.util.ResourceBundle;

public class App {

	
	public int  userLogin(String in_User , String in_pwd) {
		
		ResourceBundle rb = ResourceBundle.getBundle(Messages.getString("App.0")); //$NON-NLS-1$
		
		String UserName = rb.getString(Messages.getString("App.1")); //$NON-NLS-1$
		String password = rb.getString(Messages.getString("App.2")); //$NON-NLS-1$
		
		
		if(in_User.equals(UserName) && in_pwd.equals(password))
			
		return 1;
		else 
			return 0;
	}
	
	
	
	
	
	
	
	
}
