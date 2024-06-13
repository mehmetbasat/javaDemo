public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManager = new BaseKrediManager[]{
                new OgretmenKrediManager(),
                new TarımKrediManager(),
                new OgrenciKrediManager()

        };

        for (BaseKrediManager kredi : krediManager) {
            System.out.println(kredi.hesapla(1000));
        }
    }



}

