class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<command.length();i++){
            if(Character.isLetter(command.charAt(i))) sb.append(command.charAt(i));
            else if (command.charAt(i)=='('){
                if(command.charAt(i+1)==')'&& i<command.length()-1){
                 sb.append('o');}
            // }else sb.append(command.charAt(i));
        }}
    return sb.toString();}
}