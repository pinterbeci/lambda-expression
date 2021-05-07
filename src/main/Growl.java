package main;


/*
* az adott annotáció jelzi, hogy az adott interfésznek egy absztrakt metódusa van csak.
* */

@FunctionalInterface
public interface Growl {

    public void growing(int a);

    //public void run();

}
