package WorkbookPractice;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age)
    /* Once class Person is made into object with = new Person
    we can put name and age into Person(name, age) to call on it
    */

    {
        this.name = name;
        // this.name refers to the most recent instant of name
        // in case the same variable is used more than once
        this.age = age;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}
