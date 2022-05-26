package model.heroes;

public class Main {

    public static void main(String[] args) {

        Hero noob = new Knight();
        Hero mage = new Mage();
        Hero knight = new Knight();
        Hero archer = new Archer();
        noob.setName("Frodo");
        mage.setName("Gandalf");
        knight.setName("Aragorn");
        archer.setName("Legolas");
        for(int i = 0; i<100; i++){
            noob.levelUp();
            noob.raiseInt();
            noob.raiseAgi();
            noob.raiseDef();
            noob.raiseDex();
            noob.raiseSpd();
            noob.raiseStr();


            mage.levelUp();
            mage.raiseInt();
            mage.raiseAgi();
            mage.raiseDef();
            mage.raiseDex();
            mage.raiseSpd();
            mage.raiseStr();

            knight.levelUp();
            knight.raiseInt();
            knight.raiseAgi();
            knight.raiseDef();
            knight.raiseDex();
            knight.raiseSpd();
            knight.raiseStr();

            archer.levelUp();
            archer.raiseInt();
            archer.raiseAgi();
            archer.raiseDef();
            archer.raiseDex();
            archer.raiseSpd();
            archer.raiseStr();
        }
        printoutHero(mage);
        printoutHero(noob);
        printoutHero(knight);
        printoutHero(archer);
    }

    static void printoutHero(Hero hero){
        System.out.println("------------------------------------------------------");
        System.out.println(hero.getName()+"\t|"
                + "str: " + hero.getStrength()+"\t|"
                + "def: " + hero.getDefence()+"\t|"
                + "int: " + hero.getIntelligence()+"\t|"
                + "agi: " + hero.getAgility()+"\t|"
                + "dex: " + hero.getSpeed()+"\t|");
        System.out.println("------------------------------------------------------");
    }

}
