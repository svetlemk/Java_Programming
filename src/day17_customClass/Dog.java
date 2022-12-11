package day17_customClass;

public class Dog { /// acts as a blue print for all dog objects
                        // instance variable , related to an Object
    public String name; // we will set the name "Max" in the objects.
    public String breed;// instance variable
    public String size;
    public char gender;
    public int age;
    public String color;

                         //"Max",     "Husky"      "M"          4        "small"         "white"
    public void setInfo(String name, String breed,char gender, int age,String size, String color){
       this.name = name; // this keyword is used to call instance variable "name"
       this.breed = breed;
       this.gender = gender;
       this.age = age;
       this.size = size;
       this.color = color;


    }

    public void eat(){    // instance method. each objects ahs ots own attributes and objects
        System.out.println( name + " is eating food");
    }
    public void drink(){
        System.out.println(name + "  is drinking water");
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
