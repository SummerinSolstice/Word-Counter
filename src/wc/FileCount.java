package wc;
import java.io.*;
import java.util.Scanner;

 
public class FileCount {	//���������ļ����ַ��������������������ļ�����Ϊ0
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("��������Ҫ�������ļ�·��:");
		String p = input.nextLine();
		try{WordCount(p);}
		catch(IOException ex){
			System.out.println("���Ǵ����·������������ȷ���ļ�·����");
		}
		input.close();
	}

	public static void WordCount(String p) throws IOException{
		FileReader f = new FileReader(p); 
		BufferedReader br = new BufferedReader(f); 
		String str = " ";
		int chars = 0, words = 0, lines = 0; 
		while((str = br.readLine()) != null) {
			 System.out.println(str);
			int countWord = 1, location = 0;
			for(location = 0; location < str.length(); location++) {
				if(str.charAt(location) == ' ')
					countWord++;
			}
			words += countWord;
			lines++; //��������
			chars += str.length() - countWord + 1;				
		}
		System.out.println("�ļ����ַ���Ϊ��" + chars);
    	System.out.println("�ļ��Ĵ���Ϊ��" + words);
    	System.out.println("�ļ�������Ϊ��" + lines);
    	br.close();
    }
}	
