package Ex3;

public class Exercise3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사과를 담는데 필요한 바구니 갯수 구하는 코드
		// 1바구니에 10개 담을수있음 123개는 13개 바구니 필요
		int numOfApples = 123;
		int sizeOfBucket = 10;
		// 1. 나머지가 있으면 +1 없으면 0
		int numOfBucket = numOfApples / sizeOfBucket + ((numOfApples % sizeOfBucket > 0) ? 1 : 0);
		System.out.println("필요한 바구니 수 : " + numOfBucket);
	}

}
