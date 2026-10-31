package test;

import java.io.File;

public class Test20251029_1 {

	public static void main(String[] args) {
		String path = "C:\\Users\\watan\\Desktop\\aimax";
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		if (list != null) {
			for (int i = 0; i < list.length; i++) {
				if (list[i].isFile()) {
					System.out.println("file: " + list[i].toString());
				} else {
					System.out.println("dir:  " + list[i].toString());
				}
			}
		} else {
			System.out.println("null");
		}
		
		System.out.println("--- --- ---");
		
		if (list != null) {
			for (File f : list) {
				if (f.isFile()) {
					System.out.println("file: " + f.getName());
				} else {
					System.out.println("dir:  " + f.getName());
				}
			}
		} else {
			System.out.println("null");
		}
		
	}

}


// https://www.sejuku.net/blog/21229


