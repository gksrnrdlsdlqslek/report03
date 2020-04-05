package report03_Array1_2_3;

public class class_Sale_3 { // 1팀,2팀의 2007년,2008년 분기별 판매량 리스트 프로그램 (3차열 배열)

	public static void main(String[] args) {
        int sale[][][] = new int[][][] {{{63,84,140,130}, {157,209,251,312}},
        		                       {{59,80,130,135}, {149,187,239,310}}};

		for(int i=0; i<2; i++) {
			System.out.printf("<< %d팀 >> \n", i+1);
			for(int j=0; j<2; j++) {
				for(int k=0; k<4; k++) {
				System.out.printf("%d/4분기 : sale[%d][%d][%d] = %d\n", k+1, i,j,k,sale[i][j][k]);
				} System.out.println("---------------------------");
			}
				System.out.println();
		}
	}
}