public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        //Konversi tipe data primitiv

        int iniInt2 = 100;

        Integer iniObject = iniInt2;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat2 = iniObject.floatValue();
        double iniDouble2 = iniObject.doubleValue();

        Long amount = 100000L;

    }
}
