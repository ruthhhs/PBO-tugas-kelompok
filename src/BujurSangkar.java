public class BujurSangkar extends BangunDatar {
    // ====== ATRIBUT ======
    private double sisi;

    // ====== METHOD KONSTRUKTOR ======
    public BujurSangkar(){
        setJumlahSisi(4);
    }
    
    public BujurSangkar(String warna, int sisi){
        super(4, warna);
        this.sisi = sisi;
    }

    // ====== METHOD SELEKTOR ======
    public double getSisi(){
        return sisi;
    }

    // ====== METHOD MUTATOR  ======
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // ====== METHOD LAINNYA ======
    // public double getDiagonal();

    public void getKeliling(){

    }

    public void getLuas(){

    }

    public void printDetail(){

    }
}
