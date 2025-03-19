public class StringReverse 
{
    public static void main(String[] args)
    {
        String str="Hello World";
        StringBuilder rev=new StringBuilder();
        rev.append(str);
        rev=rev.reverse();
        System.out.println(rev);
    }
    
}
