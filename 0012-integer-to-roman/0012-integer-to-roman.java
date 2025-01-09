class Solution {
    public String intToRoman(int n) {
        StringBuilder sb=new StringBuilder("");
        while(n!=0){
            if(n/1000>0){
                int val=n/1000;
                while(val!=0){
                    sb.append("M");
                    val--;
                }
                n=n%1000;
            }
             else  if(n/900>0){
                int val=n/900;
                while(val!=0){
                    sb.append("CM");
                    val--;
                }
                n=n%900;
            }
           else if(n/500>0){
                int val=n/500;
                while(val!=0){
                    sb.append("D");
                    val--;
                }
                n=n%500;
            }
            else if(n/400>0){
                int val=n/400;
                while(val!=0){
                    sb.append("CD");
                    val--;
                }
                n=n%400;
            }
           else if(n/100>0){
                int val=n/100;
                while(val!=0){
                    sb.append("C");
                    val--;
                }
                n=n%100;
            }
            else if(n/90>0){
                int val=n/90;
                while(val!=0){
                    sb.append("XC");
                    val--;
                }
                n=n%90;
            }
          else  if(n/50>0){
                int val=n/50;
                while(val!=0){
                    sb.append("L");
                    val--;
                }
                n=n%50;
            }
            else  if(n/40>0){
                int val=n/40;
                while(val!=0){
                    sb.append("XL");
                    val--;
                }
                n=n%40;
            }

             else  if(n/10>0){
                int val=n/10;
                while(val!=0){
                    sb.append("X");
                    val--;
                }
                n=n%10;
            }
            else  if(n/9>0){
                int val=n/9;
                while(val!=0){
                    sb.append("IX");
                    val--;
                }
                n=n%9;
            }
             else  if(n/5>0){
                int val=n/5;
                while(val!=0){
                    sb.append("V");
                    val--;
                }
                n=n%5;
            }
             else  if(n/4>0){
                int val=n/4;
                while(val!=0){
                    sb.append("IV");
                    val--;
                }
                n=n%4;
            }
             else  if(n/1>0){
                int val=n/1;
                while(val!=0){
                    sb.append("I");
                    val--;
                }
                n=n%1;
            }
           
        }
    return sb.toString();}
}