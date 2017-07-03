
package ras_070317;

class FlyingSuperHero extends SuperHero {
    /**
     * @param 
     * This method does not have a parameter
     * @return 
     * This method does not return any value
     */
    @Override
    void displayPower() {
        System.out.println("Fly...");
    }
    void setSP(String[] superPowers) {
        super.setSuperPowers(superPowers);
    }
    void printSP(){
        for (int i = 0; i < superPowers.length; i++){
            System.out.println(superPowers[i]);
        }
    }
}
