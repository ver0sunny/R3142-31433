public class Vinni extends Animal implements VinniPux {
    public Vinni(String name) {
        super(name);
//        setForm(PhysicalForm.FAT);
    }

    @Override
    public void getFatterRhyme() {
        System.out.println("\"неважно, чем я занят, так как я толстеть не стану, а ведь я толстеть не стану\"");
    }

    @Override
    public void walk() {
        System.out.println(this + " продолжал прогулку ");

    }

    @Override
    public void readPoetical(Animal teller, Animal receiver) {
        System.out.println(teller + " рассказывал в стихах " + receiver);
    }

//    @Override
//    public void say(String whatToSay) {
//        System.out.println(whatToSay);
//    }
}
