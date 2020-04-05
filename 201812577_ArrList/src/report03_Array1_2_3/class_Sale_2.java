package report03_Array1_2_3;

public class class_Sale_2 { //1팀,2팀 분기별 판매량 선형 리스트 프로그램 (2차원 배열)

	public static void main(String[] args) {
        int sale[][] = new int[][] {{63,84,140,130}, {157,209,251,312}};

		for(int i=0; i<2; i++) {
			System.out.printf("<< %d팀 >> \n", i+1);
			for(int j=0; j<4; j++)
				System.out.printf("%d/4분기: sale[%d][%d]= %d%n", j+1,i,j,sale[i][j]);
				System.out.println();
		} 
	}
}