import java.util.Arrays;

class Fag {
    private String navn;
    private String år;
    private Student[] studenter = new Student[10];

    public void registrerStudent(String navn, String studNr){

            Student studenter = new Student(navn, studNr);
            this.studenter[0]=studenter;
            registrerStudent++;

    }

    public Fag(String navn, String år, Student[] studenter) {
        this.navn = navn;
        this.år = år;
        this.studenter = studenter;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getÅr() {
        return år;
    }

    public void setÅr(String år) {
        this.år = år;
    }

    public Student[] getStudenter() {
        return studenter;
    }

    public void setStudenter(Student[] studenter) {
        this.studenter = studenter;
    }

    @Override
    public String toString() {
        return "Fag: " +
                "Navn=" + navn + '\'' +
                "År=" + år + '\'' +
                "Antall studenter: " + Arrays.toString(studenter);
    }
}

class Student {
    private String navn;
    private String studNr;

    public Student(String navn, String studNr) {
        this.navn = navn;
        this.studNr = studNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getStudNr() {
        return studNr;
    }

    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }

    @Override
    public String toString() {
        return "Student : " +
                "Navn: " + navn + '\'' +
                "StudentNr: " + studNr + '\'';

    }
}
public class Main {
    public static void main(String[] args) {
        Fag Programmering = new Fag("Programmering","2020",);
        Student KariOlsen = new Student("Kari Olsen","S234556");
        Student OleHansen = new Student("Ole Hansen","S356734");
        System.out.println(Programmering);
        System.out.println(KariOlsen);
        System.out.println(OleHansen);
    }
}
