package com.jc;

public class Etudiant {
        String nom;
        String classe;
        double note;

        Etudiant(String nom, String classe, double note) {
            this.nom = nom;
            this.classe = classe;
            this.note = note;
        }
        String getNom() {
            return nom;
        }
        String getClasse() {
            return classe;
        }
        double getNote() {
            return note;
        }
        @Override
        public String toString() {
            return "Etudiant{" + "nom=" + nom + ", classe=" + classe + ", note=" + note + '}';
        }
    }
