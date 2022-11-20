package prj.tst.sandbox2;

import java.util.ArrayList;
import java.util.List;

public class Collections {

  public static void main(String[] args) {
    String[] langs = {"Java","C#" ,"Python", "PHP"};//  рамсер массива остается всегда такой как при создании, динамически его не поменять

    for (String l: langs) { //цикл по самими элементам массива а не по его id
      System.out.println("хочу выучить " + l);
    }

    for ( int i = 0;i<langs.length;i++) { // цикл по номерам массива
      System.out.println("хочу выучить " + langs[i]);
    }


    List<String> languages = new ArrayList<String>();
    languages.add("Java");
    languages.add("C#");
    languages.add("Python");
    languages.add("PHP");

    for (String l:languages){
      System.out.println("хочу выучить " + l);
    }



  }




}
