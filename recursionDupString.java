public class recursionDupString {

    public static void main(String[] args) {
        String str="aapnaacoolege";
      //  System.out.println(recursionDupString(str));
      removeDuplicateStr(str,0, new StringBuilder(" "),new boolean[26]);
    }
    public static void removeDuplicateStr(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicste
            removeDuplicateStr(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicateStr(str, idx+1, newStr.append(currChar), map);
        }
    }
}

//microsft google question