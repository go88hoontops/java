			package com.jh.test;
		
		public class ComputerExam {
			
			String brand ="조립컴퓨터";
			String startbutton;
			String moniter;
			String mobiterBrand;
			String mainBoard;
			String mainBoardBrand;
			String cpu;
			String gpu;
			String others;
			
			
		
			public int[] power () {
			//파워 만들기 500짜리 5칸	
				int[]result = new int[5];
				
				for(int i = 0 ; i < result.length;i++) {
					result[i] += 500;
					System.out.println(result[i]);
				}
					
				return result;
			}
			
			
			
//			
//			final static int[] process (int[] getpowers) {
//				
//				int[] result = new int[2];
//				
//				
//						
//				
//				
//				
//			}
			
		
			
			public void mainboardpower (int[] powergetboard) {
				
				int[] use = {100};
				int result;
				
				for(int i=0; i < powergetboard.length; i++) {
					if(use[0] < powergetboard[i]) {
						result = powergetboard[i] -= use[0];
						System.out.println("메인보드 전력공급중..."+ result);
						break;
					}else {
						
					}
				}
					
			}
			
			public int startbuttonworking (int[] powerget) {
					int[] buttonpress = {330};
					int result;
					
					for(int i= 0; i < powerget.length; i++) {
						
						if(buttonpress[0] < powerget[i]) {
								
							System.out.println("======-----스타트버튼 누름-----======");
							System.out.println("======-----...........-----======");
							
							 result = powerget[i] -= buttonpress[0];
							System.out.println("남은전력: " + result);
						
							break;
						}else {
							System.out.println("======-----.....-----======");
							System.out.println("======-----전력부족-----======");
							System.out.println("======-----.....-----======");
							
							result = powerget[i] -= buttonpress[0];
							
							System.out.println("부족한 전력: " + result);	
						}	
							System.out.println(result);
					}
		// 전력량을 리턴값으로 주고싶은데 .. 
					
				return  0; 
			
			}
		} 
		
		
			
		
			
		