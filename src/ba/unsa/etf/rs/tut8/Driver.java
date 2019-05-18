package ba.unsa.etf.rs.tut8;

import java.time.LocalDate;
import java.util.Objects;

public class Driver {
    private int id;
    private String ime, prezime, JMB;
    private LocalDate datumRodjenja, datumZaposlenja;

    public Driver() {

    }

    public Driver(int ID, String Ime, String Prezime, String JMB, LocalDate DatumRodjenja, LocalDate DatumZaposlenja){
        this.id = ID;
        this.ime = Ime;
        this.prezime = Prezime;
        this.JMB = JMB;
        this.datumRodjenja = DatumRodjenja;
        this.datumZaposlenja = DatumZaposlenja;
    }

    public Driver(String ime, String prezime, String JMB, LocalDate datumRodjenja, LocalDate datumZaposlenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMB = JMB;
        this.datumRodjenja = datumRodjenja;
        this.datumZaposlenja = datumZaposlenja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJMB() {
        return JMB;
    }

    public void setJMB(String JMB) {
        this.JMB = JMB;
    }

    public String getName() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public LocalDate getBirthday() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public LocalDate getDatumZaposlenja() {
        return datumZaposlenja;
    }

    public void setDatumZaposlenja(LocalDate datumZaposlenja) {
        this.datumZaposlenja = datumZaposlenja;
    }

    @Override
    public boolean equals(Object o) throws IllegalArgumentException{
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(getJMB(), driver.getJMB());
    }
}

