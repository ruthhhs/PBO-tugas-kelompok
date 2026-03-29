public class Main {
    public static void main(String[] args) {
        // check
        Kubus k = new Kubus(new BujurSangkar("black", 10));
        System.out.println(k.getSisi().getSisi());
        System.out.println(k.getLuasPermukaan());
        System.out.println(k.getVolume());
        System.out.println(k.getDiagonalRuang());
        System.out.println(k.getSisi().getDiagonal());

        Balok b = new Balok(new PersegiPanjang("black", 20, 5),
                            new PersegiPanjang("black", 5, 8),
                            new PersegiPanjang("black", 20, 8));
        System.out.println(b.getLuasPermukaan());
        System.out.println(b.getVolume());
        System.out.println(b.getDiagonalRuang());
        System.out.println(b.getSisiAlas().getDiagonal());

        Balok b1 = new Balok();
        b1.setSisiAlas(new PersegiPanjang("black", 20, 2));
        b1.setSisiTegak(new PersegiPanjang("black", 2, 2));
        b1.setSisiDepan(new PersegiPanjang("black", 20, 2));
        System.out.println(b1.getVolume());
        System.out.println(b1.getDiagonalRuang());
        System.out.println(b1.getSisiAlas().getDiagonal());
        System.out.println(b1.isValidBalok());

        Prisma p = new Prisma(new SegiTiga("black", 6, 4), new PersegiPanjang("black", 10, 5));
        System.out.println(p.getLuasPermukaan());
        System.out.println(p.getVolume());
        System.out.println(p.getSisiTegak().getDiagonal());
        
        SegiTiga s = new SegiTiga("black", 6, 4);
        System.out.println(s.getKeliling());
    }
}
