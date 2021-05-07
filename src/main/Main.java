package main;

public class Main {

    public void letsDoThis(int a, Growl g){

        g.growing(a);
    }

    public void observe(){
        letsDoThis(2, (a) ->{

            System.out.println("(lambda kifejezéssel megoldva) A értéke = " + a);
            //itt viszont működik a 'this', mivel ez nem static-us környezet
            //a 'this' itt a lambdára értetődik, nem a környezetére

            System.out.println(this);

        });

    }

    public static void main(String[] args) {

        /*
            a Runnable egy anonim osztály, mivel létrehozom, de nem rendelkezik névvel.

        * */



        /*Program prog = new Program();
        Dog dog = new Dog();
        prog.doSomething(dog);

        Growl growing = (a) ->{
            System.out.println("Grrrrr" + a);
        };

        prog.doSomething(growing);


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("Lefutott ez a szál!");
            }
        });


        Thread t2 = new Thread( () -> {

            System.out.println("Én is futok!!");
        });

            //a t1 és t2 között az a külömbség, hogy míg az t1 incializálásánál, tudunk hivatkozni a 'this'
            //kulcsszóval a példányra, ADDIG a lambdás inicializálásnál nem tudjuk ezt megtenni.

        */

        Main lambda = new Main();
        lambda.letsDoThis(1, new Growl() {
            @Override
            public void growing(int a) {
                System.out.println("A értéke = " + a );
                System.out.println(this);

                /*
                * a 'this' kulcsszó ebben az esetben a Growl egy példányára utal.
                * */
            }


        });

        lambda.letsDoThis(2, (a) ->{

            System.out.println("(lambda kifejezéssel megoldva) A értéke = " + a);
            /*
                //nem is működik
            System.out.println(this);
             */
        });

        lambda.observe();
        lambda.toString();

        /*
        *
        * */
    }

    @Override
    public String toString() {
        return "Belső referencia!";
    }
}
