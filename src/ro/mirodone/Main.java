package ro.mirodone;

public class Main {

    public static void main(String[] args) {


        MexicanWave mexicanWave = new MexicanWave();

        System.out.println(java.util.Arrays.toString(mexicanWave.wave("abcdef")));
        System.out.println(java.util.Arrays.toString(mexicanWave.wave("hello")));

        MexicanWave2 mexicanWave2 = new MexicanWave2();

        System.out.println(java.util.Arrays.toString(mexicanWave2.wave("hello")));

    }
}
