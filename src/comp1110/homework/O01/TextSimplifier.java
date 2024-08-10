package comp1110.homework.O01;

public class TextSimplifier {

    static String simplify(String text){
        StringBuffer sb = new StringBuffer(text);
        for(int i = 0; i < sb.length(); i++){
            if(!(sb.charAt(i) == ' ') && !Character.isLetter(sb.charAt(i))) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        delete(sb, "the ");
        delete(sb, "an ");
        delete(sb, "a ");
        delete(sb, "The ");
        delete(sb, "An ");
        delete(sb, "A ");
        String temp = sb.toString();
        System.out.println(temp);
        for(String word : temp.split(" ")){
            if(word.length() > 5){
                int ind = sb.indexOf(word);
                if(ind != -1)
                    sb.replace(ind, ind + word.length(), getAbbrev(word));
            }
        }
        return sb.toString();
    }

    static String getAbbrev(String word){
        if(word.length() <= 5) return word;
        return word.substring(0, 3) + word.charAt(word.length() - 1);
    }

    static void delete(StringBuffer sb, String word){
        int index = sb.indexOf(word);
        while(index != -1){
            sb.replace(index, index + word.length(), "");
            index = sb.indexOf(word);
        }
    }

    public static void main(String[] args) {
        System.out.println(simplify("The API has been designed to reject null early and to be clear about this behavior. A key exception is any method that takes an object and returns a boolean, for the purpose of checking or validating, will generally return false for null."));
    }

}
