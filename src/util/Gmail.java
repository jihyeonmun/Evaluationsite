package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Gmail extends Authenticator {
	PasswordAuthentication pa;
	
	public Gmail() {
		String id = "jhmoon1994";
		String pw = "asdf5322!";
		pa = new PasswordAuthentication(id, pw);
	}
	
	public PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("jhmoon1994", "rxlkihflncpljxjl");
	}
}
