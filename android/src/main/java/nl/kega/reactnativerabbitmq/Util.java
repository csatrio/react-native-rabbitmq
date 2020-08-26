package nl.kega.reactnativerabbitmq;

import java.io.StringWriter;
import java.io.PrintWriter;
import java.lang.Exception;

public class Util {
	public static final String DELIMITER = " : ";

	public static String StackTraceString(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString(); // stack trace as a string
	}

	public static String StackTraceStringP(String prefix, Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		pw.print(prefix);
		pw.print(DELIMITER);
		e.printStackTrace(pw);
		return sw.toString(); // stack trace as a string
	}
}