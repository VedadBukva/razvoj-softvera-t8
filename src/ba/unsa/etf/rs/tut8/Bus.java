package ba.unsa.etf.rs.tut8;

public class Bus {
    private String proizvodjac, serija;
    private int brojSjedista, id;


    public Bus(int id, String brand, String series, int numOfSeats) {
        this.id = id;
        this.proizvodjac = brand;
        this.serija = series;
        this.brojSjedista = numOfSeats;
    }

    public Bus(String proizvodjac, String serija, int brojSjedista) {
        this.id = -1;
        this.proizvodjac = proizvodjac;
        this.serija = serija;
        this.brojSjedista = brojSjedista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaker() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public String getSerija() {
        return serija;
    }

    public void setSerija(String serija) {
        this.serija = serija;
    }

    public int getSeatNumber() {
        return brojSjedista;
    }

    public void setBrojSjedista(int brojSjedista) {
        this.brojSjedista = brojSjedista;
    }
}
