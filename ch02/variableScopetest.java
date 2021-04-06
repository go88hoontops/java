/**
 * 
 */
package com.jh.ch02;

/**
 * @author admin
 *
 */
public class variableScopetest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			int v1 = 15;
			int v2 = 0;
			if (v1>v2) {
				
				System.out.println("v1 은 v2 보다 크다");
			}else {
				System.out.println("v1 은 v2 보다 작다");
			}
			
		//	int v3 = v1 + v2 + 5;
	
	}
      // 위에  v2 변수는 IF 문속에서만 선언되었고, 24번째줄에 나오는 에러는   v2 변수가 메인 메소드에 없다는것.
	//그러므로 v3변수에 우측값을 대입할수없음.
}