public class Practice8{
	public static void main(String[] args){
		String nums = "692116851128";
		int oldNum = 0;
		int evenNum = 0;
		//nums.length()是nums字符串的位数
		for(int i=0;i < nums.length();i++){
			if(i%2 == 0)
			{                                   //i=0-->6;i=1-->9
				oldNum += nums.charAt(i) - '0';//nums.charAt(i)是取出i对应的字符 
			}else                              //数字取出来后是字符，所以运算是减去字符0
			{
				evenNum += nums.charAt(i) - '0';
			}
		}
		System.out.println("奇数和"+oldNum);
		System.out.println("偶数和"+evenNum);
		
		int cc = oldNum + evenNum*3;
		System.out.println(cc);
		
		int digit = cc % 10;
		System.out.println(digit);
		
		int a = 10 - digit;
		System.out.println(a);
		
		int data = a % 10;
		System.out.println(data);
		
	}
}