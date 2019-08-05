import java.util.Arrays;


public class Work{
	public static void main(String[] args){
		
		
		
		
		char[] chs = {'统','计','一','个','字','符','在','字','符','串','中'};
		for(int i=0;i<=10;i++){
			if(chs[i] == '字'){
				System.out.println("字符‘字’出现的位置是："+i);
			}
		}
		
		
		
		
		
	
		String str = "统计一个字符在字符串中的所有位置";
		String content = "字";
		char first = content.charAt(0);
		int[] pos = {};
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c == first){
				pos = Arrays.copyOf(pos,pos.length+1);
				pos[pos.length-1] = i;
			}
		}
		System.out.println(Arrays.toString(pos));
		
		
		
		
		
		
		
		String str = "123456789012";
		int c1=0;// 奇数位的和
		int c2=0;// 偶数位的和
		for(int i=0;i<12;i++){
			int num = str.charAt(i);
			if(i%2 == 0){
				c1 += num-'0';// char类型计算是需要注意数值
			}
			else{
				c2 += num-'0';
			}
		}
		System.out.println(c1);
		System.out.println(c2);
		
		
		
		
		int num = 56123;
		String changedNum = String.valueOf(num);// int转成string
		StringBuffer stringBuffer = new StringBuffer(changedNum);//string转成stringBuffer
		StringBuffer stringBuffer2 = stringBuffer.reverse();//stringBuffer换位语句
		String str = stringBuffer2.toString();//stringBuffer转成string
		int finalNum = Integer.parseInt(str);//string转成int
		System.out.println(finalNum);
		
		
		
		String str = "692116851128";
		int c1=0;
		int c2=0;
		for(int i=0;i<12;i++){
			int num = str.charAt(i);
			if(i%2 == 0){
				c1 += num-'0';
			}
			else{
				c2 += num-'0';
			}
		}
		int cc = c1+c2*3;
		int first = cc%10;
		int sec = first-10;
		int finalNum = sec%10;
		System.out.println(finalNum);
		
	}
}