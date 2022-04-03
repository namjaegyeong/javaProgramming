package week4;

public class ShortCircuit {
	
	public static void main(String[] args) {
		
		 int a = -5;
		 
		 if((a > 0) && ((5 / 0) > 0)){ // &&는 Short circuit 효과가 적용되서 (a > 0)이 false이기 때문에 (5 / 0) > 0) 를 실행하지 않습니다.
			 a++;
		 }
		 	System.out.println("a = " + a);
		
		 int b = -5;
		 	
		 if((b > 0) & ((5 / 0) > 0)){ // &는 Short circuit 효과가 적용되지 않습니다. (5 / 0) > 0) 도 실행하는데 5를 0으로 나눌 수 없기 때문에 오류가 발생합니다.
			 b++;
		 }
		 	System.out.println("b = " + b);
	}
}
