package report03_Array1_2_3;

public class class_Sale_1 { // 분기별 판매량 리스트 프로그램 (1차원 배열)

	public static void main(String[] args) {
		int sale[] = new int[] {157,259,251,312};

		for(int i=0; i<4; i++)
			System.out.printf("%d/4분기: sale[%d]= %d%n", i+1,i,sale[i]);
	}
}