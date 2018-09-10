package mypack;

public class EncryptionManager {
      
    public String getEncryptPassword(String simpleText)
    {
        String encryptText="";
        for(int i=0;i<simpleText.length();i++)
        {
            int n = simpleText.charAt(i);
            n=n+5;
            encryptText+=(char)n;
        }
        return encryptText;
    }
    
}
