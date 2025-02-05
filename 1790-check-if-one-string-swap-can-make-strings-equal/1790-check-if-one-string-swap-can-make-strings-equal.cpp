class Solution {
public:
    bool areAlmostEqual(string s1, string s2) {
        int count=0;
        if(s1==s2) return true;
        for(int i=0;i<s1.length();i++){
            if(s1[i]!=s2[i]) count++;
    }
    if(count==0||count==2) return true;
    return false;}
};