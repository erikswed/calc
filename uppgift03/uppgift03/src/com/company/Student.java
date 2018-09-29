package com.company;

public class Student extends Person {
    private  double studentlon; //instans variable studentlon

    //default konstruktor
    public Student() {
        //spårutskrift
        //automatisk anrop till superklassens default konstruktor
        System.out.println("Superclass Person() och class Student()default konstruktor används");
        //studentlon har default värde 1000
        this.studentlon = 1000;
    }
    //kontruktor som tar emot fyra värde från superklassen plus lon
    public Student(String namn, String personNbr, String adress, String tlfn, double lon) {
        //anrop från superklassen
        super(namn, personNbr, adress, tlfn);
        setStudentlon(lon); //anrop metod
    }

    /**
     * Metoden tar emot parameter från main class om man vill ändra eller lägga ett nytt värde
     * Den kollar också om värdet är större än 0 annars default värde som ska köras
     * @param lon
     */
    public void setStudentlon(double lon) {
        if (lon >= 0) {
            this.studentlon = lon;
        } else {
            lon = 1000;
        }
    }

   //Metoden returnerar studentlon
    public double getStudentlon() {
        return studentlon;
    }
    @Override
    //Gör en utskrift
    public void printInfo() {
        super.printInfo();
        System.out.printf("Studentlön:%.2f\n" , getStudentlon());
    }
}
