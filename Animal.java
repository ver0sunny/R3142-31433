import java.util.List;
import java.util.Objects;

public abstract class Animal {

    private String name;
    private List<PhysicalForm> physic;
    private TypeMoves speed;

    public Animal(String name) {
        this.name = name;

    }

//    public final String getName() {
//        return this.name;
//    }

//    public final void addForm(PhysicalForm form) {
//        this.physic.add(form);
//    }

//    public void setForm(PhysicalForm form) {
//        this.physic.clear();
//        this.physic.set(0, form);
//    }

    public void setMovingSpeed(TypeMoves speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object ex) {
        if (this == ex) return true;
        if (this.getClass() != ex.getClass() || ex == null) return false;
        Animal other = (Animal) ex;
        if (name == other.name) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Math.abs(Objects.hash(this.name));
    }

}
//    protected String getSpeed(Animal animal) {
//        if (speed == TypeMoves.RUN) {
////            if (var == 1) System.out.println("бежит");
////            else System.out.println("бегут");
//        }
//        if (speed == TypeMoves.WALK) {
////            if (var == 1) System.out.println("идти");
////            else System.out.println("идут");
//        }
//        if (speed == TypeMoves.STOP_AND_STAY_STILL) {
////            if (var == 1) System.out.println("стоит");
////            else System.out.println("стоят");
//        }
//        return
//    }