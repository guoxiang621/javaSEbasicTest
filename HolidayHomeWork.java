import java.util.Scanner;

public class HolidayHomeWork{
	public static void main(String[] args){
		
		
		//����
		int result;
		for(int i=1;i<=1000;i++){
			result = 0;
			for(int j=1;j<i;j++){
				if(i%j == 0){
					result += j;
				}	
			}
			if(result == i){
				System.out.println(i);
			}
		}
		
		
		
		// ����
		int height = 100;
		int totalDistance = 0;
		int hitsTime;
		for(hitsTime=1;hitsTime<10;hitsTime++){
			totalDistance += hitsTime==1 ? height : height/(2*(hitsTime-1))*2;
		}
		System.out.println(totalDistance);
		hitsTime = 10;
		System.out.println("��10�ε���߶ȣ�" + height/(2*(hitsTime-1)));
		
		
		
		
		// ��
		int totalPrice = 100;
		int totalNum = 100;
		int cockPrice = 5;
		int henPrice = 3;
		int threeChickPrice = 1;
		for(int cockNum=0;cockNum <= totalPrice/cockPrice;cockNum++){
			for(int henNum=0;henNum <= totalPrice/henPrice;henNum++){
				for(int chickNum=0;chickNum <= totalPrice/threeChickPrice;chickNum++){
					if(cockNum*cockPrice+henNum*henPrice+chickNum*threeChickPrice==100 && 
					cockNum+henNum+chickNum*3==100){
						System.out.println("����"+cockNum+"ĸ��"+henNum+"С��"+chickNum*3);
					}
				}
			}
		}
		
		
		// ����
		int last = 2;
		int finalRabbit = 2;
		int temp;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int months = scanner.nextInt();
		for(int i=3;i<=months;i++){
			if(months==1){
				continue;
			}
			else if(months==2){
				continue;
			}
			else{
				temp = finalRabbit;
				finalRabbit = last+finalRabbit;
				last = temp;
			}
		}
		System.out.println("��"+months+"���µ���������Ϊ��"+finalRabbit);
		

		
	}
}