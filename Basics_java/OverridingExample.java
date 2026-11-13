class Learning{
    public void course(){
        System.out.println("Only recorded video");
    }
}
class LearningV2 extends Learning{
    public void course(){
        super.course();
        System.out.println("also live session");
    }
    
}
public class OverridingExample{
    public static void main(String[] args) {
        LearningV2 v2=new LearningV2();
        v2.course();
    }
}