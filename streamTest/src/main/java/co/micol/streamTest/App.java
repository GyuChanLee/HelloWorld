package co.micol.streamTest;

import java.io.*;

import co.micol.streamTest.read.ReadExample;
import co.micol.streamTest.read.ReadExample2;
import co.micol.streamTest.writer.WriteExample;

public class App 
{
    public static void main( String[] args )
    {
    	WriteExample os = new WriteExample();
    	os.write();
    	
    	ReadExample is = new ReadExample();
    	is.run();
    	
    	ReadExample2 is2 = new ReadExample2();
    	is2.run();
    }
}
