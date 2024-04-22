public class Main5 {

    public static void main(String[] args) {

        String str = "Ornek Metin";
        String str2 = "Example Sentence";


        System.out.println("Büyük harf: " + str.toUpperCase());


        System.out.println("Küçük harf: " + str.toLowerCase());


        System.out.println("Uzunluk: " + str.length());


        System.out.println("Index: " + str.indexOf("n"));


        System.out.println("Substring: " + str.substring(4));


        System.out.println("Contains: " + str.contains("a"));


        System.out.println("CompareTo: " + str.compareTo(str2));

    }
}
