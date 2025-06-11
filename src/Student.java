
public class Student {

    private String vorname;
    private String nachname;
    private String matrikelnummer;

    /**
     * @param vorname
     * @param nachname
     * @param matrikelnummer
     */
    public Student(String vorname, String nachname, String matrikelnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelnummer = matrikelnummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("vorname=").append(vorname);
        sb.append(", nachname=").append(nachname);
        sb.append(", matrikelnummer=").append(matrikelnummer);
        sb.append('}');
        return sb.toString();
    }

}
