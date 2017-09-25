
public class UpperCaseToLowerCase {

	  public  static Scanner sc;
	  public   static PrintWriter out;

	  public   static void init() throws Exception
	    {
	        sc=new Scanner(new File("si.txt"));
	        out=new PrintWriter(new File("so.txt"));
	    }

	    public static void main(String args[]) throws Exception
	    {
	        init();
	        char[] a=sc.next().toCharArray();
	        for(int i=0;i<a.length;i++)
	        {
	            if(a[i]>=97 && a[i]<=122)
	            {
	                a[i]-=32;
	            }
	            else
	            {
	                a[i]+=32;
	            }
	        }
	        for(char ch:a)
	        {
	            out.print(ch);
	        }
	        out.close();
	    }
	}
}
