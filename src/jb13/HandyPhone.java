package jb13;

public class HandyPhone extends Phone {

	public String mailAddress;

	public String mail(String to) {

		return mailAddress + "から" + to + "へメールしました。";
	}

}
