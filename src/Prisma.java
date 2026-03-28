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
        double l = Math.sqrt(Math.pow(sisiAlas.getAlas() / 2, 2) + Math.pow(sisiAlas.getTinggi(), 2));;
        if (sisiTegak.getLebar() != l) {
            throw new IllegalArgumentException("Ukuran sisi tidak konsisten untuk membentuk prisma");
        }
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
