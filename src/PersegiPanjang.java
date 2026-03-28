public class PersegiPanjang extends BangunDatar {
    // ====== ATRIBUT ======
    private double panjang;
    private double lebar;

    // ====== METHOD KONSTRUKTOR ======
    public PersegiPanjang(){
        setJumlahSisi(4);
    }

    public PersegiPanjang(String warna, int panjang, int lebar){
        super(4, warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // ====== METHOD SELEKTOR ======
    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    // ====== METHOD MUTATOR  ======
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
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
