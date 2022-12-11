package day18_garbageCollector;

public class Pizza {

    public char size; // declare size as am instance variable;
    public int numberOfCheeseTopping,
            numberOfPepperoniTopping;
    // calculate the total price of the pizza, and return it as double
    public double calcCost(){ // parameters in custom method// static is not there since it is instance method
        double totalPrice = 0;

        switch(size){
            case 'S':
            case 's':
                totalPrice = 10 + 2*(numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2*(numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping +numberOfPepperoniTopping);
            default:
                System.out.println("Invalid size: "+ size);

        }

        return totalPrice;// since return type is double, and reusable,
        // we need to return the value to make if reusable.
    }



    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
      this.size = size;
      this.numberOfCheeseTopping = numberOfCheeseTopping;
      this.numberOfPepperoniTopping = numberOfPepperoniTopping;


    }

    // used for displaying the information.
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }




}

/*
1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping

 */



