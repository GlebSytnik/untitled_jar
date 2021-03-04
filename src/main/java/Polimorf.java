public class Polimorf {

    public static void main(String[] args) {
        Polimorf polimorf = new Polimorf();
        polimorf.pain();
        Polimorf circle = new Circle();
        circle.pain();
        Polimorf paralel = new Paralel();
        paralel.pain();
        polimorf.someMethod();
        circle.someMethod();
        paralel.someMethod();
    }

    public void pain(){
        System.out.println("Polimorf");
    }

    public void someMethod(){
        System.out.println("Одно и тоже");
    }
}

class Circle extends  Polimorf{

    public void pain(){
        System.out.println("Circle");
    }
}

class Paralel extends Polimorf{
    public void pain(){
        System.out.println("Paralel");
    }
}


