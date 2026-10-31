package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test20251029_3 {
	public static void main(String[] args) {
		String path = "C:\\Users\\watan\\Desktop\\aimax";
		try (Stream<Path> stream = Files.walk(Paths.get(path))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

// https://www.zunouissiki.com/java-retrieving-files-in-a-directory-recursively/

