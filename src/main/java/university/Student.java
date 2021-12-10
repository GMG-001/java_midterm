package university;

public class Student {
    public String name;
    int age;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Student(){
        this.name = "გიორგი";
        this.age = 20;
    }

    public void printMessage(){
        System.out.printf("გამარჯობა მე ვარ %s ჩემი ასაკია %d წელი",getName(),getAge());
    }

}
