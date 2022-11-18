package Programs;

public class RevString {
    public static void main(String[] args) {
        String str="Madam";
        String rev="";
       String org_str=str;
       char a[]=str.toCharArray();
       int len=a.length;
       for(int i=len-1;i>=0;i--){
           rev=rev+a[i];
       }
        System.out.println(rev);



    }
}
