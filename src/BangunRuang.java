public abstract class BangunRuang implements IAir{
    // ====== ATRIBUT ======
    private int jumlahSisi;
    private int jumlahRusuk;
    protected double volumeAir;
    private static int counterBangunRuang;

    // ====== METHOD KONSTRUKTOR ======
    public BangunRuang() {
        this(0, 0, 0);
    }
    
    public BangunRuang(int jumlahSisi, int jumlahRusuk, double volumeAir) {
        this.jumlahSisi = jumlahSisi;
        this.jumlahRusuk = jumlahRusuk;
        this.volumeAir = volumeAir;
        counterBangunRuang ++;
    }

    // ====== METHOD SELEKTOR ======
    public int getJumlahSisi() {
        return jumlahSisi;
    }

    public int getJumlahRusuk() {
        return jumlahRusuk;
    }

    public double getVolumeAir(){
        return volumeAir;
    }

    static public int getCounterBangunRuang() {
        return counterBangunRuang;
    }

    // ====== METHOD MUTATOR  ======
    public void setJumlahSisi (int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
    }

    public void setJumlahRusuk (int jumlahRusuk) {
        this.jumlahRusuk = jumlahRusuk;
    }

    public void setVolumeAir(double volumeAir){
        this.volumeAir = volumeAir;
    }

    // ====== METHOD LAINNYA ======
    abstract public double getLuasPermukaan();
    abstract public double getVolume();
    abstract public void printDetail();

    
    public void isiPenuh(){
        this.volumeAir = this.getVolume();
    }
    public void kosongkan(){
        this.volumeAir = 0;
    }
    public void isiAir(){
        double volume = this.volumeAir+2;
        if (volume > getVolume()){
            this.volumeAir = getVolume();
        } else {
            this.volumeAir = volume;
        }

    }
    public void kurangiAir(){
        double volume = this.volumeAir-1;
        if (volume < 0) {
            this.volumeAir = 0;
        } else {
            this.volumeAir = volume;
        }
    }

    public void isiAir(double volume){
        double newVolume = this.volumeAir + volume;
        if (newVolume>getVolume()) {
            this.volumeAir = getVolume();
        } else {
            this.volumeAir = newVolume;
        }

    }
    public void kurangiAir(double volume){
        double newVolume = this.volumeAir-volume;
        if (newVolume < 0) {
            this.volumeAir = 0;
        } else {
            this.volumeAir = newVolume;
        }
    }
}
