package wc;
import java.io.*;
import java.util.Scanner;

 
public class FileCount {	//计算整个文件中字符数，次数和行数，空文件三者为0
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("请输入你要计数的文件路径:");
		String p = input.nextLine();
		try{WordCount(p);}
		catch(IOException ex){
			System.out.println("这是错误的路径，请输入正确的文件路径。");
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
			lines++; //计算行数
			chars += str.length() - countWord + 1;				
		}
		System.out.println("文件的字符数为：" + chars);
    	System.out.println("文件的词数为：" + words);
    	System.out.println("文件的行数为：" + lines);
    	br.close();
    }
}	
