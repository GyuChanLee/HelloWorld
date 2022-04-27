package co.micol.fileCopy;

import co.micol.fileCopy.copy.CopyFile;
import co.micol.fileCopy.read.ReadFile;

public class App 
{
    public static void main( String[] args ) // copy 클래스 하나로 캡슐화 이용해서 파일 읽고 카피하는 기능을 한 클래스에서 쓸수 있도록 다시 해보기.
    {
    	ReadFile re = new ReadFile();
    	char[] data = re.readf();
    	
    	CopyFile cf = new CopyFile();
    	cf.copyf(data);
    }
}
