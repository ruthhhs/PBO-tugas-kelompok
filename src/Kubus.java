public class Kubus extends BangunRuang {
    // ====== ATRIBUT ======
    private BujurSangkar sisi;

    // ====== METHOD KONSTRUKTOR ======
    public Kubus(){
        setJumlahSisi(6);
        setJumlahRusuk(12);
        this.sisi = new BujurSangkar();
    }
    
    public Kubus(BujurSangkar sisi){
        super(6, 12);
        this.sisi = sisi;
    }

    // ====== METHOD SELEKTOR ======
    public BujurSangkar getSisi(){
        return sisi;
    }

    // ====== METHOD MUTATOR  ======
    public void setSisi(BujurSangkar sisi){
        this.sisi = sisi;
    }

    // ====== METHOD LAINNYA ======
    // public void getDiagonalRuang();

    public void getLuasPermukaan(){

    }

    public void getVolume(){
        
    }

    public void printDetail(){

    }
}
