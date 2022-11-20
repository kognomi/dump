package prj.tst.sandbox2;

public class Collections {

  public static void main(String[] args) {
    String[] langs = {"Java","C#" ,"Python", "PHP"};


    for (String l: langs) { //цикл по самими элементам массива а не по его id
      System.out.println("хочу выучить " + l);
    }

    for ( int i = 0;i<langs.length;i++) {
      System.out.println("хочу выучить " + langs[i]);
    }
  }




}
