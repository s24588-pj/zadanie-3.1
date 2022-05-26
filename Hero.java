package model.heroes;

public abstract class Hero {

    protected String name;
    protected int strength;
    protected int defence;
    protected int intelligence;
    protected int dexterity;
    protected int agility;
    protected int speed;
    protected int availableStatsPoints;

    protected abstract void modifyStrength();
    protected abstract void modifyDefence();
    protected abstract void modifyIntelligence();
    protected abstract void modifyDexterity();
    protected abstract void modifyAgility();
    protected abstract void modifySpeed();

    public int getAvailableStatsPoints() {
        return availableStatsPoints;
    }

    public void levelUp(){
        availableStatsPoints+=10;
    }

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }

    public int getDefence() {
        return defence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseStr(){
        if(availableStatsPoints<=0)return;
        modifyStrength();
        availableStatsPoints--;
    }
    public void raiseDef(){
        if(availableStatsPoints<=0)return;
        modifyDefence();
        availableStatsPoints--;
    }
    public void raiseInt(){
        if(availableStatsPoints<=0)return;
        modifyIntelligence();
        availableStatsPoints--;
    }
    public void raiseDex() {
        if(availableStatsPoints<=0)return;
        modifyDexterity();
        availableStatsPoints--;
    }
    public void raiseAgi(){
        if(availableStatsPoints<=0)return;
        modifyAgility();
        availableStatsPoints--;
    }
    public void raiseSpd(){
        if(availableStatsPoints<=0)return;
        modifySpeed();
        availableStatsPoints--;
    }

//    @Override
//    public String toString() {
//        return "Hero{" +
//                "name='" + name + '\'' +
//                ", strength=" + strength +
//                ", defence=" + defence +
//                ", intelligence=" + intelligence +
//                ", dexterity=" + dexterity +
//                ", agility=" + agility +
//                ", speed=" + speed +
//                ", availableStatsPoints=" + availableStatsPoints +
//                '}';
//    }
}
