package com.example.maxime.bach_tplistplanet_guerrero_maxime;

public class Planete {
    public String mNom;
    public int mDistance;
    Planete(String nom, int distance) {
        mNom = nom; // nom de la planète
        mDistance = distance; // distance au soleil en Gm
    }
    public String toString() {
        return mNom;
    }

};
