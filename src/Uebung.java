
public class Uebung {

    private String name;
    private String dozent;
    private Student[] zertifizierteTeilnehmer;
    private int anzahlZertifizierte;

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

}
