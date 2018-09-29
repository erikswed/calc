package com.company;

public class Anstalld extends Person {
    private double anstalldlon;

    public Anstalld() {
        System.out.println("default konstruktor superclass Person() och class Anstalld () default konstruktor används");
        this.anstalldlon = 1000;

    }
    public Anstalld(String namn, String personNbr, String adress, String tlfn, double lon) {
        super(namn, personNbr, adress, tlfn);
        setLon(lon);
    }

    public void setLon(double lon) {
        if (lon > 0) {
            this.anstalldlon = lon;
        } else {
            lon = 1000;
        }
    }

    //returnerar lon
    public double getLon() {
        return anstalldlon;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Anstalld Lön: %.2f\n" , getLon());

    }



}
