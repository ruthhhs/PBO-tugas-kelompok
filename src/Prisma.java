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
        if (!isValidPrisma()) {
            throw new IllegalArgumentException("Ukuran prisma tidak valid");
        }
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
    public boolean isValidPrisma(){
        double l = Math.sqrt(Math.pow(sisiAlas.getAlas() / 2, 2) + Math.pow(sisiAlas.getTinggi(), 2));
        return (sisiTegak.getLebar() == l);

    }
    @Override
    public double getLuasPermukaan(){
        return (2 * sisiAlas.getLuas()) + (sisiAlas.getKeliling() * sisiTegak.getPanjang());
    }

    @Override
    public double getVolume(){
        return sisiAlas.getLuas() * sisiTegak.getPanjang();
    }

    @Override
    public void printDetail(){

    }
}
