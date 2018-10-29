package jafpl.euler;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 
 * @author Erik Itter
 *
 */
public class CheckGenerator {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		// System.out.println(hexString("42"));
	}

	public static String hexString(String s) throws NoSuchAlgorithmException {
		StringBuffer hexString = new StringBuffer();
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] hash = md.digest(s.getBytes());

		for (int i = 0; i < hash.length; i++) {
			if ((0xff & hash[i]) < 0x10) {
				hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
			} else {
				hexString.append(Integer.toHexString(0xFF & hash[i]));
			}
		}

		return hexString.toString();
	}

}
