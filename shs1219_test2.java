package shs;

class Parent {
    int x = 100;
    Parent() {
        this(500);
        System.out.println("1");/*2*/
    }
 
    Parent(int x) {
        this.x = x;
        System.out.println("2");/*1*/
    }
 
    int getX() {
    	System.out.println("3");/*5*/
        return x;
    }
}
class Child extends Parent {
    int x = 4000;
    
    Child() {
        this(5000);
        System.out.println("4");/*4*/
    }
 
    Child(int x) {
        this.x = x;
        System.out.println("5");/*3*/
    }
}
public class shs1219_test2 {
    public static void main(String[] args) {
        Child obj = new Child();/*값은 자식은 자식에게 부모는 부모에게*/
        System.out.println(obj.getX());
    }
}//상속 하단에 있는 main이 제일 위로 올라간다. 