import java.util.Arrays;
import java.util.Scanner;

public class HomeWork{
	public static void main(String[] args){
		
		// 打印正方形
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		

		
		
        // 打印九九乘法表
		for(int i=1;i <= 9;i++){
			for(int j=1;j <= i;j++){
				System.out.print(i + "*" + j + "=" + i*j + "   ");
			}
			System.out.println();
		}
		
		
		
		//打印正方形******
		for(int i=1;i<=11;i++){
			for(int j=1;j<=11;j++){
				if(i==1 || i==11){
					System.out.print("* ");
				}
				else{
					if(j==1 || j==11){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		
		
		
		// 打印房子
		for(int i=5;i>=1;i--){
			for(int j=1;j<=14;j++){
				if(j == i){
					System.out.print("*****");
				}else if(j == 11-i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int a=1;a<=5;a++){
			if(a == 1 || a == 5){
				for(int b=1;b<=14;b++){
					System.out.print("*");
				}
			}
			else{
				for(int c=1;c<=14;c++){
				    if(c==1 || c==14){
					    System.out.print("*");
				    }
					else{
					    System.out.print(" ");
				    }
			    }
			}
			System.out.println();
		}
		
		
		
		//数组合并
		int[] a = {1,7,9,11,13,15,17,19};
		int[] b = {2,4,6,8,10};
		int[] result = Arrays.copyOf(a,a.length + b.length);
		System.arraycopy(b,0,result,a.length,b.length);
		System.out.println(Arrays.toString(result));
		
		
		
		//水仙花数
		for(int i=100;i<=9999;i++){
			int bit = i % 10;
			int ten = i % 100 / 10;
			int hundred = i % 1000 / 100;
			if(Math.pow(bit,3)+Math.pow(ten,3)+Math.pow(hundred,3)==i){
				System.out.println(i);
			}
		}
		
		
		
		//累加
		int result = 0;
		for(int i=1;i<=100;i++){
			if(i%10 != 3){
				result += i;
			}
		}
		System.out.println(result);
	
		
		
		
		
		//数据加密
		Scanner scanner = new Scanner(System.in);
		System.out.print("您要传递的数据是：");
		int num = scanner.nextInt();
		int bit = num % 10;
		int ten = num % 100 / 10;
		int hundred = num % 1000 / 100;
		int thousand = num % 10000 / 1000;
		int newBit = (thousand+5)%10;
		int newTen = (hundred+5)%10;
		int newHundred = (ten+5)%10;
		int newThousand = (bit+5)%10;
		int result = newThousand*1000 + newHundred*100 + newTen*10 + newBit;
		System.out.println("加密后的数据为："+result);
	
		
	}
}