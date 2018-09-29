package com.company;

public class Main {

    public static void main(String[] args) {
       Anstalld person1 = new Anstalld("Kristine","8502344-9023","Malmö, Sverige", "070794330", 19000);
       Anstalld person2 = new Anstalld("Johnny", "786574-1332", "Hörby, Sverige", "456398760",  45000);
       Student stud1 = new Student("Rosabelle", "867829-2345", "Coldwater,Michigan",  "4356788912", 23000);
       //Om man inte skickar några värde till class Student är default konstruktor som ska användas
       Student stud2 = new Student();
       Student stud3 = new Student();
       stud3.setNamn("Heidi");
       stud3.setPersonNbr("768593-4536");
       stud3.setAdress("Herlev, Danmark");
       stud3.setTlfn("3765739012");
       stud3.setStudentlon(45000);
        //Personvektor
       Person [] perVekt = new Person[5];
        perVekt[0] = person1;
        perVekt[1] = person2;
        perVekt[2] = stud1;
        perVekt[3] = stud2;
        perVekt[4] = stud3;

        Student stud4 = (Student)perVekt[2];
        stud4.setStudentlon(12000);

        Anstalld person3 = (Anstalld)perVekt[0];
        person3.setLon(30000);

        for(int i = 0; i<perVekt.length; i++){
           perVekt[i].printInfo();
        }


    }
}
