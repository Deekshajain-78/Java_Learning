class ConditionClass{
    public static void main(String[] args) {
        int score=33;
        String grade;
        if(score>90){
            System.out.println("grade" +"=" + "A++");
        }else if(score>=80 && score<=90){
            System.out.println("grade" + "=" + "A");
        }else if(score>=70 && score<=80){
            System.out.println("grade" + "=" + "B+");
        }else if(score>=35 && score<=75){
            System.out.println("grade" + "=" + "B");
        }else if(score<35) {
            System.out.println("Fail");
            
        }
        
    }
}