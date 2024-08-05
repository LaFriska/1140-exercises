package comp1110.homework.O01;

public class TextSimpler {

    static String simplify(String text){
        StringBuffer sb = new StringBuffer(text);
        for(int i = 0; i < text.length(); i++){
            if(!(sb.charAt(i) == ' ') || Character.isLetter(sb.charAt(i))) sb.deleteCharAt(i);
        }
    }

}
