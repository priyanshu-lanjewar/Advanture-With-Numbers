import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;

public class Main
{
    public static void main(String[] args)  {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input Numbers : ");
        String inp="";
        try {
            inp = s.readLine();
            if(new BigInteger(inp).signum()!=1) throw new Exception("Please Enter A Valid Number N where N > 0");

            String op=inp;
            CharSequence k;
            String unique="";
            for (int i=9;i>=0;i-- ) {
                k=""+i;
                if(op.contains(k)) {
                    unique=i+"  "+unique;
                    op = op.replace(k, "") + i;
                }
            }
            System.out.printf("Unique Digits in Inputted Number ( %s ) : %s ",inp,unique);
            System.out.printf("\nLargest Number Possible Using This String : %s",op);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
