package main;

public class Dog implements Growl{

    @Override
    public void growing(int a) {

        System.out.println("Grrrrrrttt!" + a);
    }
}
