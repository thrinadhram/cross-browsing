package Programs;

public class test2 {
    public static void main(String[] args) {
        int num=12321;
        int rev=0;
        int org_num=num;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;

        }
        if(org_num==rev){
            System.out.println("palindrome numbers");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
