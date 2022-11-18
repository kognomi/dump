package prj.tst.sandbox2;

public class Equality {
 public static void main(String[] args) {

   String s1="firefox 2.0";
   String s2= "firefox "+Math.sqrt(4.0);//такое компилятор не осилит
//String s2="firefox"; // компилятор оптимизирует код и ссылает на один и тот же объект
   //String s2="fire"+"fox";// компилятор снова догадывается
   //String s2=s1; .. так копируется ссылка на объект s1
   //String  s2= new String(s1); // создается новый объект с содержимым как в s1


   System.out.println(s1==s2);// сравнение переменных (ссылок на объекты)
   System.out.println(s1.equals(s2)); // сравнение содержимого переменных
 }

}
