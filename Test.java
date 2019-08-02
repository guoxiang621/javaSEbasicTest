import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入您要储存的年份：");
		double years = scanner.nextDouble();
		double base = 7.7/100;
		double rate = 0;
		
		if(years > 0 && years <= 1){
			rate = base * 0.5;
		}
		else if(years > 1 && years <= 3){
			rate = base * 0.7;
		}
		else if(years > 3 && years <= 5){
			rate = base;
		}
		else{
			rate = base * 1.1;
		}
		System.out.println("实际利率："+rate);
		
	}
}