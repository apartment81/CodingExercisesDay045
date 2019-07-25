package ro.mirodone;

public class Main {

    public static void main(String[] args) {


        MexicanWave mexicanWave = new MexicanWave();
        String [] result = mexicanWave.wave("abcdef");

/*        for ( int i = 0; i < result.length ; i++){
            System.out.println(result[i]);
        }*/

        for (String aResult : result) {
            System.out.println(aResult);
        }

    }
}
