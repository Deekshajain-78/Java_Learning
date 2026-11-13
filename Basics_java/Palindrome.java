class Palindrome{
    public static void main(String[] args) {
    int num=131;
      int temp=num;
      int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
                 }
        if (sum == num) {
            System.out.println("palindrome number.");
        } else {
            System.out.println("not a palindrome number.");
        }
    }
}