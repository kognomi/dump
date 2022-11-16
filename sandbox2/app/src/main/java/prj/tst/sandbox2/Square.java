package prj.tst.sandbox2;

public class Square {
  public double l;

  //добавление конструктора чтобы можно было при создании объекта сразу впиндюривать переменные
  public  Square(double l){
    this.l=l;
  }

  public double area(){
    return this.l*this.l;
  }
}
