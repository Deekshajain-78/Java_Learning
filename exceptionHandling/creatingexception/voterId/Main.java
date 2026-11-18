package exceptionHandling.creatingexception.voterId;

public class Main {
    public static void main(String[] args) {
        Person p=new Person(14,"abc");
        p.disp();
        try {
            p.checkEli(p.age);
            
        } catch(VoterIDException e)  {
            System.out.println(e.getMessage());
        }

    }

}
