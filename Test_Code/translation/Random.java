package rnd;
public class Random {
    public static final String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-=_+`~,<.>/?;:";
    public static final String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String random (String inputSeed) {
        String seed = inputSeed + inputSeed.charAt(0);
        try {
            seed += letters.charAt(letters.indexOf(inputSeed.length()));
        } catch (Exception e) {
            seed += letters.charAt(1 + letters.indexOf(inputSeed.length()));
        }
        int casingFactor = 1;
        for (int i = 0 ; i < seed.length(); i++) {
            if (uppercaseLetters.indexOf(seed.charAt(i)) != 0) {
                casingFactor += 1;
            }
        }
        int length = seed.length();
        String rndNumber = "";
        for (int i = 0; i < length; i++) {
            rndNumber += getChar((((i * casingFactor) + 1) * (letters.indexOf(seed.charAt(i)) * i)) + length);
        }
        String newAnswer = "" + seed.charAt(0);
        for (int i = 1; i < rndNumber.length(); i++) {
            newAnswer += rndNumber.charAt(i);
        }
        return lengthen(reverse(format(newAnswer + letters.charAt(loop(casingFactor, 0, letters.length())))), seed);
    }
    public char getChar(int index) {
    	int i = index;
    	while (i >= letters.length()) {
    		i -= letters.length();
    	}
    	if (i < 0) {
    		i = 0;
    	}
    	return letters.charAt(i);
    }
    int loop (int number, int start, int stop) {
    	if (number > stop) {
    		return number % stop;
    	} else if (number < start) {
    		return stop - Math.abs(number % stop);
    	} else {
    		return number;
    	}
    }
    String format (String answer) {
    	return answer.substring(1);
    }
    String reverse(String answer) {
    	String newAnswer = "";
    	for (int i = answer.length(); i > 0; i--) {
            try {
                newAnswer += answer.charAt(i - 1);
            } catch (Exception e) {
                newAnswer += "";
            }
    	}
    	return newAnswer;
    }
    String lengthen (String string, String seed) {
    	int index = 0;
    	for (int i = 0; i < string.length(); i++) {
    		index += letters.indexOf(string.charAt(i));
    	}
    	String newString = "";
    	for (int i = 0; i < index; i++) {
    		newString += letters.charAt(loop(index, 0, letters.length()));
    		index -= seed.length();
    	}
    	return newString;
    }
}
