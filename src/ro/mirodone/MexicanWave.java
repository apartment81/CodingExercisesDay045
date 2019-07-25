package ro.mirodone;

public class MexicanWave {


    public  String[] wave(String seatString) {
        seatString = seatString.toLowerCase();
        int seatCount = countSeats(seatString);
        String[] wave = new String[seatCount];
        for (int waveIndex = 0, seatIndex = 0; waveIndex < wave.length; waveIndex++, seatIndex++) {
            char seat = seatString.charAt(seatIndex);
            while (Character.isWhitespace(seat)) {
                seat = seatString.charAt(++seatIndex);
            }
            StringBuilder seatWaveStringBuilder = new StringBuilder(seatString);
            seatWaveStringBuilder.setCharAt(seatIndex, Character.toUpperCase(seat));
            wave[waveIndex] = seatWaveStringBuilder.toString();
        }
        return wave;
    }

    private  int countSeats(String seatString) {
        int whiteSpaceCount = (int) seatString.codePoints().filter(Character::isWhitespace).count();
        return seatString.length() - whiteSpaceCount;
    }


}
