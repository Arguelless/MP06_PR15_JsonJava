package marc.arguelles;

public class Llibre {
    private int id;
    private String titol;
    private String autor;
    private int any;

    public Llibre() {
    }
    public Llibre(int id, String titol, String autor, int any) {
        this.id = id;
        this.titol = titol;
        this.autor = autor;
        this.any = any;
    }
    public int getId() {
        return id;
    }
    public String getTitol() {
        return titol;
    }
    public String getAutor() {
        return autor;
    }
    public int getAny() {
        return any;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitol(String titol) {
        this.titol = titol;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAny(int any) {
        this.any = any;
    }
    
    
    public String toString() {
        return "Llibre [id=" + id + ", titol=" + titol + ", autor=" + autor + ", any=" + any + "]";
    }
}
