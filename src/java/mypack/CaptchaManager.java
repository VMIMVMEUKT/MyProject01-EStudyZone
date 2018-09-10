package mypack;

import java.util.Random;

public class CaptchaManager extends EncryptionManager{
    
    public int getNum(int min,int max)
    {
        Random r=new Random();
        return r.nextInt((max-min+1))+min;
    }

    public String getCapCode()
    {
        String code="";
        code+=(char)getNum('A','Z');
          code+=(char)getNum('A','Z');
        code+=(char)getNum('a','z');
        code+=(char)getNum('a','z');
        code+=(char)getNum('0','9');
        code+=(char)getNum('0','9');
        return code;
   }
  
}
