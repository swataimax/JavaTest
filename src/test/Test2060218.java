package test;

import static java.util.Map.*;

import java.util.Map;

public class Test2060218 {

	public static void main(String[] args) {
		String[] testStrs = {"jJaa", "SaS", "aSTa"};
		for (String s : testStrs) {
//			System.out.println(s + "->" + toSkr(s));
			System.out.println(s + "\t->\t" + toSkr(s));
		}
		
	}
	
	static String toSkr(String str) {
		String skr = str;
		Map<String, String> map = Map.ofEntries(
				entry("aa", "&#x0101;"),
				entry("ii", "&#x012b;"),
				entry("uu", "&#x016b;"),
				entry("R",  "&#x1e5b;"),
				entry("RR", "&#x1e5d;"),
				entry("L",  "&#x1e37;"),
				entry("G",  "&#x1e45;"),
				entry("J",  "&#x00f1;"),
				entry("T",  "&#x1e6d;"),
				entry("D",  "&#x1e0d;"),
				entry("N",  "&#x1e47;"),
				entry("Z",  "&#x015b;"),
				entry("S",  "&#x1e63;"),
				entry("H",  "&#x1e25;"),
				entry("M",  "&#x1e43;")
				);
		for (String key : map.keySet()) {
//			System.out.println(key + "=" + map.get(key));
			skr = skr.replace(key, map.get(key));
		}
		return skr;
	}
}
