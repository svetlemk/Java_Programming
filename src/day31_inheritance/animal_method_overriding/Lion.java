package day31_inheritance.animal_method_overriding;

import javax.imageio.stream.ImageInputStream;

public class Lion extends Animal {

    private boolean isAfricanLion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }


    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer.");
    }

    public void roar() {
        System.out.println("Lion " + getName() + " is roaring");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", African lion='" + isAfricanLion + '\'' +
                '}';
    }

    public static void main(String[] args) {
        {
            Lion lion1 = new Lion("Alea", "Af",'F',23, "big", "striped",true);
            System.out.println(lion1);
        }

    }

}

