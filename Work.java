import java.util.Arrays;


public class Work{
	public static void main(String[] args){
		
		
		
		
		char[] chs = {'ͳ','��','һ','��','��','��','��','��','��','��','��'};
		for(int i=0;i<=10;i++){
			if(chs[i] == '��'){
				System.out.println("�ַ����֡����ֵ�λ���ǣ�"+i);
			}
		}
		
		
		
		
		
	
		String str = "ͳ��һ���ַ����ַ����е�����λ��";
		String content = "��";
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
		int c1=0;// ����λ�ĺ�
		int c2=0;// ż��λ�ĺ�
		for(int i=0;i<12;i++){
			int num = str.charAt(i);
			if(i%2 == 0){
				c1 += num-'0';// char���ͼ�������Ҫע����ֵ
			}
			else{
				c2 += num-'0';
			}
		}
		System.out.println(c1);
		System.out.println(c2);
		
		
		
		
		int num = 56123;
		String changedNum = String.valueOf(num);// intת��string
		StringBuffer stringBuffer = new StringBuffer(changedNum);//stringת��stringBuffer
		StringBuffer stringBuffer2 = stringBuffer.reverse();//stringBuffer��λ���
		String str = stringBuffer2.toString();//stringBufferת��string
		int finalNum = Integer.parseInt(str);//stringת��int
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