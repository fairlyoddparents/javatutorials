public class myOwnIndexMethod{
    public static void main(String[] args){
        String s = "four score and seven year ago";
        indexOf('r', s);
    }

    public static int indexOf(char ch, String s){
        for(int i=0; i < s.lenght(); i++){
            if(s.charAt(i) == ch){
                return i;
            } else {
                return -1;
            }
        }
    }
}
