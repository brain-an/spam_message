package JavaTest;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.KomoranResult;
import kr.co.shineware.nlp.komoran.model.Token;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class  helloJava{
   
   public static void main(String[] args) throws Exception{
      
      String m = "" ;
      String mm = "";
      
      ArrayList<String> listsp = new ArrayList<String>();
      listsp.add("����");
      listsp.add("����");
      listsp.add("����");
      listsp.add("�ҹ�����");
      listsp.add("url");
      
      int size = listsp.size();
      
      System.out.println("listsp: "+listsp.toString());
      
      try
      {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         while((m = br.readLine()) != null)
         {
             String[] puncts = {"!", "/", ",", ".", "#", "$", "%", "&", "(", ")", "{", "}", "@", "`", "*", ";", "-", "<", ">", "^", "|", "[", "]"};
             String punctStr = m;
             mm = m.replaceAll("\\p{Punct}", "");
             
            for(int j=0; j< size-1; j++) {
            	mm.contains()=listsp(j);
            	System.out.println("���Ը޽���");
            }
         }
         
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
    }
}
