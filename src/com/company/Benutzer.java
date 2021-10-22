package com.company;

import java.util.List;

public class Benutzer {

    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    /**
     *
     * @return double representig the total time required for all sports
     */
    public double kalkuliereZeit(){
        double summe =0 ;
        for ( Sport i: sport )
        {
            summe += i.kalkuliereZeit();

        }
        return summe;
    }
    /**
     *
     * @return double representig the total time required for all sports
     */
    public double kalkuliereZeit(Sport s){
        return s.kalkuliereZeit();
    }
    /**
     *
     * @return double representig the total time divided by the number of sports
     */
    public double kalkuliereDurschnittszeit() {
        double summe = 0;
        for (Sport i : sport) {
            summe += i.kalkuliereZeit();

        }
        return summe /sport.size();
    }


}
