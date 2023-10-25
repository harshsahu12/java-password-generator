public class Alphabet {
    public static final String UPPER_CASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "1234567890";
    public static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";
    private final StringBuilder pool;

    public Alphabet(Boolean uppercase, Boolean lowercase, Boolean numbers, Boolean specialCharacters){
        pool = new StringBuilder();
        if(uppercase) pool.append(UPPER_CASE_LETTERS);
        if(lowercase) pool.append(LOWER_CASE_LETTERS);
        if(numbers) pool.append(NUMBERS);
        if(specialCharacters) pool.append(SYMBOLS);
    }

    public String getAlphabet(){
        return pool.toString();
    }
}
