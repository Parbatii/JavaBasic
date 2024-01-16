import java.util.*;
public class un4methodoverride {
    public void makesound(){
        System.out.println("Animal make sound.");
    }
}

 class dog extends un4methodoverride{
    @Override
    public void makesound(){
        System.out.println("Dog make sound.");
    }
}
class sample{
    public static void main(String[] args)
    {
    un4methodoverride animal1 = new dog();
    animal1.makesound();
    }
}
