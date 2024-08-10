package comp1110.homework.O01;

public class TextSimplifier {

    static String simplify(String text){
        String[] words = text.split("\\s+");
        StringBuffer sb = new StringBuffer();
        for(String word : words){
            String simplified = simplifyWord(word);
            if(!simplified.isEmpty()){
                if(!sb.isEmpty()){
                    sb.append(" ");
                }
                sb.append(simplifyWord(word));
            }
        }
        return sb.toString();
    }

    static String simplifyWord(String word){
        word = deleteBadChars(word);
        if(word.equalsIgnoreCase("an") || word.equalsIgnoreCase("the") || word.equalsIgnoreCase("a")) return "";
        if(word.length() > 5) return shortenWord(word);
        return word;
    }

    static String deleteBadChars(String word){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(Character.isLetter(c)) sb.append(c);
        }
        return sb.toString();
    }

    static String shortenWord(String word){
        if(word.length() <= 5) return word;
        return word.substring(0, 3) + word.charAt(word.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(simplify("The API has been designed to reject null early and to be clear about this behavior. A key exception is any method that takes an object and returns a boolean, for the purpose of checking or validating, will generally return false for null."));
    }

}
