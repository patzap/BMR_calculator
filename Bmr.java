
public class Bmr {

    private double age;
    private double weight;
    private double height;

    private int excerisePerDay;
    

    public Bmr(double age, double weight, double height){

        this.age = age;
        this.weight = weight;
        this.height = height;

        System.out.println((10 * weight) + (6.25 * height) - (5 * age) + 5);

    }


    public void trueBMR(int excerisePerDay){

        this.excerisePerDay = excerisePerDay;

        switch (excerisePerDay){

            case 3:

                
        }
    }

}