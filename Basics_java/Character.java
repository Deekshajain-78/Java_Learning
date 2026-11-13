class Character{
    public void add(){
        int a=10;
        int b=20;
        System.out.println("addition"+(a+b));
    }
     public static void sub(){
        int a=10;
        int b=20;
        System.out.println("substraction"+(a-b));
    }
    public void mult(){
        int a=30;
        int b=40;
        System.out.println("multiplication" +(a*b));
    }

        public static void div(){
        int a=30;
        int b=40;
        System.out.println("division" +(a/b));
    }

   
    public static void main(String[] args) {
        char a ='a';
        char b= 65;
        char c='\u0065'; //0*16^3+0*16^2+6*16*1+5*16^0
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Character ref=new Character();
        ref.add();
        ref.sub();
        ref.mult();
        ref.div();



    }
}