package mondai;

import java.util.List;

public class Test20260607 {

	public static void main(String[] args) {
//		int[][] aimax = {
//				{0,0,1,0,0,1,0,1,0,0,0,1,0,0,1,0,0,1,0,1,0},
//				{0,1,1,1,0,1,0,1,1,0,1,1,0,1,1,1,0,0,1,0,0},
//				{0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0}
//		};
//		System.out.println(aimax);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(("" + arr[i][j]).replace("0", "　").replace("1", "■"));
//			}
//			System.out.println();
//		}
		
		List<List<Integer>> aimax = List.of(
				List.of(0,0,1,0,0,1,0,1,0,0,0,1,0,0,1,0,0,1,0,1,0),
				List.of(0,1,1,1,0,1,0,1,1,0,1,1,0,1,1,1,0,0,1,0,0),
				List.of(0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0));
		
		// 外部イテレータ
		for (List<Integer> row : aimax) {
			for (Integer i : row) {
				System.out.print(("" + i).replace("0", "□").replace("1", "■"));
			}
			System.out.println();
		}
		
		// 内部イテレータ
//		aimax.forEach(row -> for (Integer i : row) {
//				System.out.print(("" + i).replace("0", "□").replace("1", "■"));
//			});
		
		aimax.stream().forEach(row -> System.out.println(row));
		
		System.out.println("-----");
		
		aimax.stream().forEach(
				row -> row.stream().forEach(i -> System.out.print(i + " "))
				);
		System.out.println();
		
		System.out.println("-----");
		
		aimax.stream().forEach(
				row -> {
					row.stream().forEach(i -> System.out.print(i + " "));
					System.out.println();
					}
				);
		
		System.out.println("-----");
		
		aimax.stream().forEach(
				row -> {
					row.stream().forEach(i -> System.out.print(("" + i).replace("0", "□").replace("1", "■")));
					System.out.println();
					}
				);
		
		System.out.println("-----");
		
		aimax.stream().forEach(
				row -> {
					row.stream().forEach(i -> System.out.print(("" + i).replace("0", "□").replace("1", "■")));
					System.out.println();
					}
				);
		
		System.out.println("-----");
		
		aimax.stream().forEach(
				row -> row.stream().forEach(System.out::print)
				);
		System.out.println();
		
		System.out.println("-----");
		
		aimax.stream().forEach(
				row -> row.stream()
						.map(i -> " " + i)
						.forEach(System.out::print)
				);
		System.out.println();
		System.out.println("-----");
		
		aimax.stream().forEach(
				row -> row.stream()
						.map(i -> "" + i)
						.map(s -> s.replace("0", "□"))
						.map(s -> s.replace("1", "■"))
						.forEach(System.out::print)
				);
		System.out.println();
		
		System.out.println();
		System.out.println("-----");
		
//		aimax.stream().forEach(
//				row -> row.stream()
//						.map(i -> "" + i)
//						.map(s -> s.replace("0", "□"))
//						.map(s -> s.replace("1", "■"))
//				)
//			.forEach(System.out::println)
//		System.out.println();
		
//		flatMap


	}

}
