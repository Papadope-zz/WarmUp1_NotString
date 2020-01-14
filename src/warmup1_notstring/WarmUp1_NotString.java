package warmup1_notstring;

public class WarmUp1_NotString {

    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }
    
    public static String notString(String str){
        if(!str.startsWith("not")){
            return "not " + str;
        }
        return str;
    }
    
}
