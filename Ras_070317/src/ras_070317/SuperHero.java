
package ras_070317;

abstract class SuperHero {
    String superPowers[];
    SuperHero(){
        this.superPowers = new String[5];
        this.superPowers[0] = "First Power";
        this.superPowers[1] = "Second Power";
        this.superPowers[2] = "Third Power";
        this.superPowers[3] = "Fourth Power";
        this.superPowers[4] = "Five Power";        
    }
    void setSuperPowers(String superPowers[]){
        this.superPowers = superPowers;
    }
    void setSuperPower(String power, int element){
        this.superPowers[element] = power;
    }
    void printSuperPowers(){
        for (int i = 0; i < superPowers.length; i++){
            System.out.println(superPowers[i]);
        }
    }
    abstract void displayPower();

}
