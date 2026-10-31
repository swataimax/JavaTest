package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test20251108_1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println("hello");
		
		String str = "2025-11-08 11:08:57";
		System.out.println(str);
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date);
		
		
		System.out.println("-----");
		String value = "2025-11-08 11:08:57";
		String format = "yyyy-MM-dd hh:mm:ss";
		System.out.println(value);
		System.out.println(format);
		System.out.println(toDate(value, format));
		
		System.out.println("-----");
		value = "2025-11-08 00:00:00";
		format = "yyyy-MM-dd hh:mm:ss";
		System.out.println(value);
		System.out.println(format);
		System.out.println(toDate(value, format));
		
		System.out.println("-----");
		value = "2025-11-08 11:08:57";
		format = "yyyy-MM-dd hh:mm:ss";
		System.out.println(value);
		System.out.println(format);
		System.out.println(toDate(value, format));
		
		System.out.println("-----");
		value = "2025-11-08 11:08:57";
		format = "";
		System.out.println(value);
		System.out.println(format);
		System.out.println(toDate(value, format));
		
		System.out.println("-----");
		value = "2025-11-08";
		format = "yyyy-MM-dd";
		System.out.println(value);
		System.out.println(format);
		System.out.println(toDate(value, format));
		
		
	}
	
	//	11/08 日付の文字列を日付に変換するメソッド
	//	https://www.saka-en.com/java/java-string-date/
	public static Date toDate(String value, String format) {
		if (value == null || value == "") {
			return null;
		}
		if (format == null || format == "") {
			return null;
		}
		DateFormat sdf = new SimpleDateFormat(format);
		sdf.setLenient(false);
		try {
			return sdf.parse(value);
		} catch (ParseException e) {
//			e.printStackTrace();
			return null;
		}
	}
	public static Date toDate(String value) {
		return toDate(value, "yyyy-MM-dd hh:mm:ss");
	}
	
}
