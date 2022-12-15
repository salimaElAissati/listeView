package com.example.listviewapp;
import java.io.Serializable;
public class Article implements Serializable {

    private int code;
    private String labelle;

    private int pu;

    public Article(int code, String labelle, int pu)  {
        this.code= code;
        this.labelle = labelle;
        this.pu= pu;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLabelle() {
        return labelle;
    }

    public int getPu() {
        return pu;
    }

    public void setPu(int pu) {
        this.pu = pu;
    }

    public void setLabelle(String labelle) {
        this.labelle = labelle;
    }

    @Override
    public String toString() {
        return "Article      "+ code+"       "  + labelle +"         " + pu ;
    }

}

