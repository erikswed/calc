package com.company;

public class Person {

    private String namn, adress, tlfn, personNbr;

    //default konstruktor
    public Person() {
        System.out.println("i Person default konstruktor ");
        this.namn = "default";
        this.personNbr = "XXXXXX-XXXX";
        this.adress = "default";
        this.tlfn = "default";
    }

    public Person(String namn, String personNbr, String adress, String tlfn) {
        setNamn(namn);
        setAdress(adress);
        setPersonNbr(personNbr);
        setTlfn(tlfn);
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
