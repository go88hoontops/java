		package com.jh.test;


public class Computer {
			//21-01-07 이정훈
			//만드는중
			//목표는 power 함수값으로 컴퓨터를 키고 남은양을 출력
			//cpuz로 필드에 있는생성문을 출력
			//조건에 따라 생성문 ()<에 값을 넣어볼생각.
			
	String brand ="조립컴퓨터";
	String startbutton;
	String moniterModel;
	String moniterBrand  = "Dell";
	String mainBoard ;
	String mainBoardBrand ="MSI";
	String cpu;
	String cpuBrand = "intel";
	String gpu;

		
	String cpuz;
			
	public class print{
		
	}
			Computer(){
				
			}
			
			Computer(String mainBoardBrand){
				this.mainBoardBrand = mainBoardBrand;
			}
			
			Computer(String mainBoard, String cpu){
				this.mainBoard = mainBoard;
				this.cpu = cpu;
			}
			
			
			
		
			public int[] power () {
				//파워 만들기 500짜리 5칸	
					int[]result = new int[5];
					
					for(int i = 0 ; i < result.length;i++) {
						result[i] += 500;
						System.out.println(result[i]);
					}
						
					return result;
			}
							//해당 메소드는 파워량을 나타내서 사용하려고 햇는데 
			
			
			public void moniter (int[] powerW) {
				
				int[] use = {140};
				int result;
				
				for(int i=0; i < powerW.length; i++) {
					System.out.println("모니터로 넘어온 이전 " + powerW[i]+"파워량");
					if(use[0] < powerW[i]) {
						result = powerW[i] -= use[0];
						System.out.println("사용전력 "+use[0]+"모니터에 사용 후 남는량 :"+ result);
						
						break;


					}else {
						System.out.println("======----파워부족----======");
						result = powerW[i] -= use[0];
						System.out.println("부족한 전력: " + result);
						System.out.println("다음파워로 재시작");
						
					}
				}
					
			}
			
			
			public void mainboardpower (int[] powerW) {
				
				int[] use = {100};
				int result,result2;
			
				for(int i=0; i < powerW.length; i++) {
					System.out.println("메인보드로 넘어온 이전 " + powerW[i]+"파워량");
					if(use[0] < powerW[i]) {
						result = powerW[i] -= use[0];
						System.out.println("메인보드 전원켜짐");
						System.out.println("사용전력 "+use[0]+"메인보드에 사용 후 남는량 :"+ result);
					
						break;
					}else {
						System.out.println("======----파워부족----======");
						result = powerW[i];
						result2 = powerW[i] -= use[0];
						System.out.println("부족한 전력: " + result);
						System.out.println("다음파워로 재시작");
					
					}
				}
					
			}
		
			
			public int startbuttonworking (int[] powerW) {
					int[] use = {330};
					int result,result2 = 0;
					int i = 0;
			if(use[0] < powerW[i]) {
				System.out.println( powerW[i]+"파워량");
							System.out.println("======-스타트버튼=====");
							System.out.println(powerW[i]+"현재 파워량");
								result = powerW[i] -= use[0];
						
						System.out.println("전원켜짐");
						System.out.println("사용전력 "+use[0]+"\t"+" 남은전력: " + result);
			
				}else{
					result2 = powerW[i] -= use[0];
							System.out.println("======-----전력부족-----======");
							System.out.println("부족한 전력: " +"\t"+result2);	
						
							System.out.println(result2);
			
						}
				return  result2;
			}
		
		
public static void main(String[] args) {

		int[] powerW = {400,300,300,1000};
				
	
				Computer computer = new Computer();
				Computer computer2 = new Computer("z390","9900k");
				
					computer.startbuttonworking(powerW);
					
					
					for(int i = 0 ; i <powerW.length;i++) {
						System.out.println("파워의 i번쨰 잔량 = "+ powerW[i]);
					}
					
					
					computer.mainboardpower(powerW);
					
					for(int i = 0 ; i <powerW.length;i++) {
						System.out.println("파워의 i번쨰 잔량 = "+ powerW[i]);
					}
					
					computer.moniter(powerW);
					
					for(int i = 0 ; i <powerW.length;i++) {
						System.out.println("파워의 i번쨰 잔량 = "+ powerW[i]);
					}
					
					
					
					
					
					
					System.out.println("=============전원켜짐==============");
					System.out.println("=============cpuz로 컴퓨터 체크=====");
			
					System.out.println(computer2.mainBoardBrand);
					System.out.println(computer2.mainBoard);
					System.out.println(computer2.cpu);
				
					
				}
	
		}
		
