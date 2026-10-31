package test;

import java.io.File;

public class Test20251029_2 {
	public static void main(String[] args) {
		String path = "C:\\Users\\watan\\Desktop\\aimax";
		File f = new File(path);
		print(f);
	}
	
	//再帰的に取得する処理
	public static void print(File file) {
		System.out.println(file.getPath());
		File[] fileList = file.listFiles();
		if (fileList != null) {
			for (File f : fileList) {
				print(f);
			}
		}
	}

}
