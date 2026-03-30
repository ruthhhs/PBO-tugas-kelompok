public class Main {
    public static void main(String[] args) {
        /* REALISASI */

        /* BANGUN DATAR */
        // Bujur Sangkar 
        BujurSangkar BS1 = new BujurSangkar();
        BS1.setSisi(7);
        BS1.setWarna("Kuning");
        System.out.println("Diagonal BS1 =  " + BS1.getDiagonal());
        System.out.println("Keliling BS1 = " + BS1.getKeliling());
        System.out.println("Luas BS1     = " + BS1.getLuas());
        BS1.printDetail();

        //Persegi Panjang dengan Parameter
        PersegiPanjang PP1 = new PersegiPanjang("Biru", 16, 9 );
        System.out.println("Diagonal PP1 =  " + PP1.getDiagonal());
        System.out.println("Keliling PP1 = " + PP1.getKeliling());
        System.out.println("Luas PP1     = " + PP1.getLuas());
        PP1.printDetail();

        PersegiPanjang PP2 = new PersegiPanjang();
        PP2.setWarna("Hijau");
        PP2.setLebar(15);
        PP2.setPanjang(20);
        System.out.println("Diagonal PP2 =  " + PP2.getDiagonal());
        System.out.println("Keliling PP2 = " + PP2.getKeliling());
        System.out.println("Luas PP2     = " + PP2.getLuas());
        PP2.printDetail();

        // Segitiga
        SegiTiga S1 = new SegiTiga();
        S1.setAlas(10);
        S1.setTinggi(12);
        S1.setWarna("Kuning");
        System.out.println("Keliling S1 = " + S1.getKeliling());
        System.out.println("Luas S1     = " + S1.getLuas());
        S1.printDetail();


        /* BANGUN RUANG */
        //Kubus
        Kubus K1 = new Kubus(new BujurSangkar("Hitam", 8));
        System.out.println("Sisi K1           = " + K1.getSisi().getSisi());
        System.out.println("Luas Permukaan K1 = " + K1.getLuasPermukaan());
        System.out.println("Volume K1         = " + K1.getVolume());
        System.out.println("Diagonal Ruang K1 = " + K1.getDiagonalRuang());
        System.out.println("Diagonal Sisi K1  = " + K1.getSisi().getDiagonal());
        K1.printDetail();

        Kubus K2 = new Kubus(BS1);
        System.out.println("Luas Permukaan K2 = " + K2.getLuasPermukaan());
        System.out.println("Volume K2         = " + K2.getVolume());
        System.out.println("Diagonal Ruang K2 = " + K2.getDiagonalRuang());
        System.out.println("Diagonal Sisi K2  = " + K2.getSisi().getDiagonal());
        K2.printDetail();

        //Balok
        Balok B1 = new Balok(new PersegiPanjang("Hitam", 20, 5),
                            new PersegiPanjang("Hitam", 5, 8),
                            new PersegiPanjang("Hitam", 20, 8));
        B1.printDetail();
        System.out.println("Luas Permukaan K2 = " + B1.getLuasPermukaan());
        System.out.println("Volume K2         = " + B1.getVolume());
        System.out.println("Diagonal Ruang K2 = " + B1.getDiagonalRuang());
        System.out.println("Diagonal Sisi K2  = " + B1.getSisiAlas().getDiagonal());

        Balok B2 = new Balok();
        B2.setSisiAlas(new PersegiPanjang("Hitam", 20, 2));
        B2.setSisiTegak(new PersegiPanjang("Hitam", 2, 2));
        B2.setSisiDepan(new PersegiPanjang("Hitam", 20, 2));
        System.out.println(B2.getVolume());
        System.out.println(B2.getDiagonalRuang());
        System.out.println(B2.getSisiAlas().getDiagonal());
        System.out.println(B2.isValidBalok());
        B2.printDetail();

    
        // Limas
        Limas L1 = new Limas(new BujurSangkar("Biru", 10), new SegiTiga("Biru", 10, 13));
        System.out.println(L1.isValidLimas());
        L1.printDetail();


        // Contoh implementasi Exception
        // Balok B3 = new Balok(new PersegiPanjang("Hitam", 12, 4), 
        //                     new PersegiPanjang("Hitam", 4, 6),
        //                     new PersegiPanjang("Hitam", 12, 4));
        // Limas L2 = new Limas(new BujurSangkar("Putih", 5), new SegiTiga("Putih", 6, 12));

        
        // Interface
        System.out.println("Volume Air L1 awal = " + L1.getVolumeAir()); //Volume Air awal
        L1.setVolumeAir(124);
        L1.isiAir(322);
        System.out.println("Volume Air L1 setelah diisi = " + L1.getVolumeAir()); //Volume Air setelah diisi
        L1.kurangiAir();
        System.out.println("Volume Air L1 setelah dikurangi = " + L1.getVolumeAir()); //Volume Air setelah dikurangi
        L1.isiAir();
        System.out.println("Volume Air L1 setelah diisi lagi = " + L1.getVolumeAir()); //Volume Air setelah diisi 
        
    }
}
