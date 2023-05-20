public class Medic extends Hero {
    private int healPoint=10;

    public int getHealPoint() {
        return healPoint;
    }

    public void setHealPoint(int healPoint) {
        this.healPoint = healPoint;
    }

    public void applySuperAbility() {
        System.out.println("Medic применил супер способность : + 10% к лечению");
    }
    public void increaseExperience(){
        int i= healPoint;
        System.out.println("healPoint увеличилось на: "+(i*=0.1)+"       //задание на сообразительность");
        System.out.println("теперь  healPoint: "+( healPoint+=(i))+"            //задание на сообразительность");
    }

}