public class Balok extends BangunRuang {
    // ====== ATRIBUT ======
    private PersegiPanjang sisiAlas;
    private PersegiPanjang sisiTegak;

    // ====== METHOD KONSTRUKTOR ======
    public Balok(){
        setJumlahSisi(6);
        setJumlahRusuk(12);
        this.sisiAlas = new PersegiPanjang();
        this.sisiTegak = new PersegiPanjang();
    }
    
    public Balok(PersegiPanjang sisiAlas, PersegiPanjang sisiTegak){
        super(6, 12);
        this.sisiAlas = sisiAlas;
        this.sisiTegak = sisiTegak;
    }

    // ====== METHOD SELEKTOR ======
    public PersegiPanjang getSisiAlas(){
        return sisiAlas;
    }

    public PersegiPanjang getSisiTegak(){
        return sisiTegak;
    }

    // ====== METHOD MUTATOR  ======
    public void setSisiAlas(PersegiPanjang sisiAlas){
        this.sisiAlas = sisiAlas;
    }

    public void setSisiTegak(PersegiPanjang sisiTegak){
        this.sisiTegak = sisiTegak;
    }

    // ====== METHOD LAINNYA ======
    // public void getDiagonalRuang();

    @Override
    public void getLuasPermukaan(){

    }

    @Override
    public void getVolume(){
        
    }

    @Override
    public void printDetail(){

    }
}
