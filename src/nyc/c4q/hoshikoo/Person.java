package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/19/15.
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args){
        /*
        int n =0;

        Person fred = new Person("Fred", 10);
        System.out.println(fred.getAge());
        Person bob = new Person("Bib", 28);
        System.out.println(bob.getAge());

        Calendar c = Calendar.getInstance();
         */

        String s1 =new String("hello");
        String s2 =new String("hello");
        String s3 = s2;
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s3==s2);

        System.out.println("apple"=="apple");
        System.out.println("apple"=="app"+"le");

        Person bob = new Person("bob");
        Person bob2 = new Person("bob");
        System.out.println("bob" == bob2.getName());

        Person mary= new Person("Mary", 23);

        System.out.println(mary.getName());
        System.out.println(mary.name.toString());
        System.out.println(mary.toString());

    }
}
