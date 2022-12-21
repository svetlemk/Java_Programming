package day30_inheritance.types_of_inheritance;

import java.time.LocalDate;

public class President extends Person {

    public President(String name, char gender, LocalDate DOB, LocalDate electedDate) {
        super(name, gender, DOB);
        this.electedDate = electedDate;
    }

    private LocalDate electedDate;

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }

    public void lie(){
        System.out.println(" President " + getName() + " is laying");
    }


}
