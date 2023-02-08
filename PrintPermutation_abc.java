public class PrintPermutation_abc{
public static void printPerm(String str, String permutation){
    if(str.length()==0){
        System.out.println(permutation);
        return;
    }
    
    for(int i=0; i<str.length();i++){
       char curChar =str.charAt(i);
       //"abc" -> "bc"
       String  newStr = str.substring(0,i) + str.substring(i+1);
       printPerm(newStr, permutation+curChar);
    }
}
public static  void main(String args[]){
    String str ="abc";
    printPerm(str,"");
}
}