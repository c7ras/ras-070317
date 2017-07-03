
package ras_070317;

public class AbstractDemo {
    public static void main(String args[]){
       FlyingSuperHero fsh = new FlyingSuperHero();
       Spiderman sp = new Spiderman();
       //fsh.displayPower();
       //sp.displayPower();
       fsh.setSuperPower("New Power", 2);
       fsh.printSuperPowers();
    }
}
