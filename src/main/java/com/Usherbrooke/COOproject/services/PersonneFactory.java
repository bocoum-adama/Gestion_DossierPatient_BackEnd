package com.Usherbrooke.COOproject.services;

import java.util.Date;

public interface PersonneFactory {

    public void creeDossier(String nom, String prenom, Date datenaiss,
                            String adresse, String tel,String mailinstit,String specialiter,
                            Date datedouvertur,String etatpatient, String role);
}
