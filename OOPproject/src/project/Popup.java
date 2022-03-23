package project;

import javax.swing.JOptionPane;

public class Popup {
	
	public static void popup(String message) {
		String msg=null;
		
		switch(message) {
		case "success":
			msg="Opretion succesful !";
			break;
		case "fail":
			msg="Please fill the mepty lines.";
			break;
		case "fail1":
			msg="Number of plans can be 1,2 or 3.";
			break;
		case "fail2":
			msg="Subscription plan name does not exists";
			break;
		}
		JOptionPane.showConfirmDialog(null, msg, "Mesaj", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
