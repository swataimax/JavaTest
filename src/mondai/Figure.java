package mondai;

public class Figure {
	protected int id;
	protected int[][] arr;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int[][] getArr() {
		return arr;
	}

	public void setArr(int[][] arr) {
		this.arr = arr;
	}

	// コンストラクタ
	Figure(int id, int[][] arr) {
		this.id = id;
		this.arr = arr;
	}
	
	public void print() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(("" + arr[i][j]).replace("0", "□").replace("1", "■"));
			}
			System.out.println();
		}
	}
}
