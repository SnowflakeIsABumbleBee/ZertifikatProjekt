
public class Uebung implements Zertifizierbar {

    private String uebungsTyp;
    private String name;
    private String dozent;
    private Student[] zertifizierteTeilnehmer;
    private int anzahlZertifizierte;
    //private int maxteilnehmer;

    /**
     * @param name
     * @param dozent
     * @param zertifizierteTeilnehmer
     * @param anzahlZertifizierte
     */
    public Uebung(String name, String dozent, int maxteilnehmer) {
        this.name = name;
        this.dozent = dozent;
        this.zertifizierteTeilnehmer = new Student[maxteilnehmer];
        this.anzahlZertifizierte = 0;
        //this.maxteilnehmer = maxteilnehmer;
    }

    @Override
    public int zertifikatErwerben(Student student) {

        if (anzahlZertifizierte >= zertifizierteTeilnehmer.length) {
            System.out.println("voll");
            return anzahlZertifizierte; //ist wie bei schleifen ein break, nur bei if abfragen wird return genommen
        }
        if (hatZertifikat(student)) {
            System.out.println("alresdy certifcad");
            return anzahlZertifizierte;
        }
        this.zertifizierteTeilnehmer[anzahlZertifizierte] = student;
        this.anzahlZertifizierte += 1;
        return anzahlZertifizierte;
        /*Student[] currentArray = this.zertifizierteTeilnehmer;
        this.zertifizierteTeilnehmer = new Student[currentArray.length + 1];*/

 /*for (int i = 0; i<currentArray.length;i++) {
            this.zertifizierteTeilnehmer[i]= currentArray[i];
        }
        this.zertifizierteTeilnehmer[currentArray.length+1];
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'zertifikatErwerben'");*/
    }

    @Override
    public boolean hatZertifikat(Student student) {
        for (Student zertifizierteTeilnehmer : zertifizierteTeilnehmer) {
            if (zertifizierteTeilnehmer.equals(student)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dozent
     */
    public String getDozent() {
        return dozent;
    }

    /**
     * @param dozent the dozent to set
     */
    public void setDozent(String dozent) {
        this.dozent = dozent;
    }

    /**
     * @return the zertifizierteTeilnehmer
     */
    public Student[] getZertifizierteTeilnehmer() {
        return zertifizierteTeilnehmer;
    }

    /**
     * @param zertifizierteTeilnehmer the zertifizierteTeilnehmer to set
     */
    public void setZertifizierteTeilnehmer(Student[] zertifizierteTeilnehmer) {
        this.zertifizierteTeilnehmer = zertifizierteTeilnehmer;
    }

    /**
     * @return the anzahlZertifizierte
     */
    public int getAnzahlZertifizierte() {
        return anzahlZertifizierte;
    }

    /**
     * @param anzahlZertifizierte the anzahlZertifizierte to set
     */
    public void setAnzahlZertifizierte(int anzahlZertifizierte) {
        this.anzahlZertifizierte = anzahlZertifizierte;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Uebung{");
        sb.append("uebungsTyp=").append(uebungsTyp);
        sb.append(", name=").append(name);
        sb.append(", dozent=").append(dozent);
        sb.append(", zertifizierteTeilnehmer=").append(zertifizierteTeilnehmer);
        sb.append(", anzahlZertifizierte=").append(anzahlZertifizierte);
        sb.append('}');
        return sb.toString();
    }

}
