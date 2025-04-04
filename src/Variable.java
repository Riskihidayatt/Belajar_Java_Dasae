public class Variable {
    public static void main(String[] args) {

        String name ;
        name = "Riski Hidayat";
        System.out.println(name);

        int age = 20;
        String Address = "Indonesia";
        System.out.println(age);
        System.out.println(Address);

        name = "Marina";
        System.out.println(name);
        System.out.println("===".repeat(20));


        //Var Variable dimana ketika kita ingin membuat varibele tanpa harus menuliskan jenis tipe datanya

        var name1 = "Riski Hidayat";

        var age1 = 20;
        var Address1 = "Indonesia";

        System.out.println(name1);
        System.out.println(age1);
        System.out.println(Address1);

        System.out.println("===".repeat(20));

        //Kata Kunci Final
        //Artinya ketika kita menuliskan sebuah variable dengan kata kunci final kita tidak nisa mengubahnya nya lagi atau bernilai konstant
        //dalam arti lain berati dia sudah di tentukan nilai nya tetap

        final String Aplication = "Belajar Java Dasar";

//        Aplication = "Belajar PHP";
        System.out.println(Aplication);




    }
}
