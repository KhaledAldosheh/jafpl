/**
 * 
 */
package jafpl;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author Erik Itter
 *
 */
public class ASCII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("ascii.html"), "UTF-8"));
			out.write(
					"<html><head><meta charset=\"UTF-8\"></head><body><table border=\"1\">");
			for (int i = 0; i < 2048; i++) {
				out.write("<tr>");
				out.write("<td><b>" + i + "</b></td>");
				for (int j = 0; j < 16; j++) {
					out.write("<td>&#" + (i * 16 + j) + ";</td>");
				}
				out.write("</tr>");
			}
			out.write("</table></body></html>");
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
