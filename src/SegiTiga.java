public class SegiTiga extends BangunDatar {
    // ====== ATRIBUT ======
    private double alas;
    private double tinggi;

    // ====== METHOD KONSTRUKTOR ======
    public SegiTiga(){
        setJumlahSisi(4);
    }

    public SegiTiga(String warna, int alas, int tinggi){
        super(4, warna);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // ====== METHOD SELEKTOR ======
    public double getAlas(){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    // ====== METHOD MUTATOR  ======
    public void setAlas(double alas){
        this.alas = alas;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    // ====== METHOD LAINNYA ======
    public void getKeliling(){

    }

    public void getLuas(){

    }

    public void printDetail(){
        
    }
}
