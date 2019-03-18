package Grid;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
            String[] vals = {"a","b","b","d"};
            Grid test = new Grid(2,2,vals);
            System.out.println(test.findMax());
	}
}