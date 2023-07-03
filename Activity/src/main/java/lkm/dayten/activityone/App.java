package lkm.dayten.activityone;

import java.util.*;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
    	String[] str = {"Python", "Java", "ASP.NET", "Salesforce", "Generative AI"};
        ArrayList<String> strlist = new ArrayList<>(Arrays.asList(str));
        Collections.sort(strlist, (str1, str2) -> str1.compareToIgnoreCase(str2));
        System.out.println(strlist);
    }
}
