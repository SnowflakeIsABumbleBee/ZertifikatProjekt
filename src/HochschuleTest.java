
public class HochschuleTest {

    public static void main(String[] args) {
        Uebung prog1 = new Uebung("prog1", "dozent", 43);
        Student per = new Student("dfhgjkl", "nachname", "234567");
        Student per2 = new Student("hdvbkdg", "efivhk", "7998670");
        Student per3 = new Student("dgfhjlukg", "iuzfvvjv", "876545");
        prog1.zertifikatErwerben(per3);
        prog1.toString();
        System.out.println(prog1.hatZertifikat(per3));
        System.out.println(prog1.hatZertifikat(per));
    }

}
