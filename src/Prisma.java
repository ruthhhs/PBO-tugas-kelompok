public class Prisma extends BangunRuang {
    // ====== ATRIBUT ======
    private SegiTiga sisiAlas;
    private PersegiPanjang sisiTegak;

    // ====== METHOD KONSTRUKTOR ======
    public Prisma(){
        setJumlahSisi(5);
        setJumlahRusuk(9);
        this.sisiAlas = new SegiTiga();
        this.sisiTegak = new PersegiPanjang();
    }
    
    public Prisma(SegiTiga sisiAlas, PersegiPanjang sisiTegak){
        super(5, 9);
        this.sisiAlas = sisiAlas;
        this.sisiTegak = sisiTegak;
    }

    // ====== METHOD SELEKTOR ======
    public SegiTiga getSisiAlas(){
        return sisiAlas;
    }

    public PersegiPanjang getSisiTegak(){
        return sisiTegak;
    }

    // ====== METHOD MUTATOR  ======
    public void setSisiAlas(SegiTiga sisiAlas){
        this.sisiAlas = sisiAlas;
    }

    public void setSisiTegak(PersegiPanjang sisiTegak){
        this.sisiTegak = sisiTegak;
    }

    // ====== METHOD LAINNYA ======
    public void getLuasPermukaan(){

    }

    public void getVolume(){
        
    }

    public void printDetail(){

    }
}
