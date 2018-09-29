package com.company;

public class Person {

    private String namn = "default";
    private String personNbr = "XXXXXX-XXXX";
    private String adress = "default";
    private String tlfn = "default";
        
    //default konstruktor
    public Person() {
        System.out.println("i Person default konstruktor ");
    }

    public Person(String namn, String personNbr, String adress, String tlfn) {
        this.namn = namn;
        this.personNbr = personNbr;
        this.adress = adress;
        this.tlfn = tlfn;
    }

    public void setNamn(String namn) {
        if (namn.length() > 3) {
            this.namn = namn;
        } else {
            this.namn = "unknown";
        }
    }

    public void setPersonNbr(String personNbr) {
        if (personNbr.length() > 9 && personNbr.length() <= 13) {
            this.personNbr = personNbr;
        } else {
            this.personNbr = "unknown";
        }

    }

    public void setAdress(String adress) {
        if (adress.length() > 3) {
            this.adress = adress;
        } else {
            this.adress = "unknown ";
        }
    }

    /**
     * Metoden setTln kollar om strängen är större än 0 annars blir tlfns värde unknown
     * @param tlfn
     */
    public void setTlfn(String tlfn) {
        if (tlfn.length() > 0) {
            this.tlfn = tlfn;
        } else {
            this.tlfn = "unknown";
        }

    }

    /**
     *
     * @return namn
     */
    public String getNamn() {
        return namn;
    }

    /**
     *
     * @return PersonNbr
     */
    public String getPersonNbr() {

        return personNbr;
    }

    /**
     *
     * @return adress
     */
    public String getAdress() {

        return adress;
    }

    /**
     *
     * @return tlfn
     */
    public String getTlfn() {
        return tlfn;
    }

    public void printInfo() {
        System.out.println("\nNamn:" + getNamn() + "\nPersonnummer: " + getPersonNbr() + "\nAdress: " + getAdress() + "\nTelefonnummer: " + getTlfn());
    }


}
