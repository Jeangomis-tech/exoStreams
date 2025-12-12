package com.jc;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Exercice 1: Filtrage simple

//        Affiche uniquement les nombres pairs
//        Affiche uniquement les nombres supérieurs à 5

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
// ✅   // Affiche uniquement les nombres supérieurs à 5
        numbers.stream().filter(number -> number > 5).forEach(System.out::println);

   //Exercice2:Transformation

        List<String> fruits = Arrays.asList("pomme", "banane", "orange", "kiwi");

// ✅        Convertis tous les fruits en majuscules

        fruits.stream().map(String::toUpperCase).forEach(System.out::println);
// ✅   Affiche la longueur de chaque fruit
        fruits.stream().map(String::length).forEach(System.out::println);

        //Exercice 3 : Comptage
        List<String> prenoms = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma", "Alain");
        //Compte combien de prénoms commencent par "A"

        long compteA = prenoms.stream().filter(prenom -> prenom.toLowerCase().startsWith("a")).count();
        System.out.println("Le nombre de noms commençant par A est de :" + compteA);

        //Compte combien de prénoms ont plus de 4 lettres
        long moreThenFour = prenoms.stream().filter(prenom -> prenom.length() > 4).count();
        System.out.println(moreThenFour);

        //Exercice 4 : Map et Collect
// ✅        Crée une nouvelle liste avec les mots en majuscules
        List<String> mots = Arrays.asList("chat", "chien", "oiseau", "poisson");
        List<String>motsMajuscule = mots.stream().map(String::toUpperCase).toList();
        System.out.println(motsMajuscule);
        motsMajuscule.stream().forEach(System.out::println);

// ✅        Crée une liste contenant la première lettre de chaque mot
        List<String> firstWords = mots.stream().map(mot-> String.valueOf(mot.charAt(0))).toList();
        System.out.println(firstWords);

       // Exercice 5 : Objets complexes
        /**
         * Affiche les noms des personnes de plus de 25 ans
         * Calcule l'âge moyen
         * Trouve la personne la plus âgée
         */
        List<Personne> personnes = Arrays.asList(
                new Personne("Jean", 25),
                new Personne("Marie", 30),
                new Personne("Pierre", 20),
                new Personne("Sophie", 35)
        );

        personnes.stream().filter(personne->personne.getAge() > 25).forEach(System.out::println);
        //Calcule l'âge moyen
        double avarageAge = personnes.stream().collect(Collectors.averagingInt(Personne::getAge));
        System.out.println( "L'age moyen est de " + avarageAge +" ans");
        // Trouve la personne la plus âgée
        Optional<Personne> older = personnes.stream().max(Comparator.comparingInt(Personne::getAge));
        older.ifPresent(personne-> System.out.println("La personne la plus agée est " + personne));

        /**
         * Exercice 6 : FlatMap
         */
        List<List<Integer>> listeDeListes = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        //Aplanis cette structure en une seule liste

        List<Integer> listAplanis = listeDeListes.stream().flatMap(List::stream).toList();
        System.out.println(listAplanis);
        //Affiche uniquement les nombres pairs de toutes les listes
    listAplanis.stream().filter(n-> n % 2 == 0).forEach(System.out::println);

    //Exercice 7
        /**
         * Groupe les étudiants par classe
         * Calcule la moyenne de notes par classe
         * Trouve le meilleur étudiant de chaque classe
         */
        List<Etudiant> etudiants = Arrays.asList(
                new Etudiant("Alice", "A", 15.5),
                new Etudiant("Bob", "B", 12.0),
                new Etudiant("Charlie", "A", 14.0),
                new Etudiant("David", "B", 16.5),
                new Etudiant("Emma", "A", 13.5)
        );
    // List<Etudiant> classeA =etudiants.stream().filter(etudiant->etudiant.getClasse().equals("A")).toList();
    //     System.out.println(classeA);
    //     List<Etudiant>classeB = etudiants.stream().filter(etudiant->etudiant.getClasse().equals("B")).toList();
    //     System.out.println(classeB);
        // Groupe les étudiants par classe 
         Map<String, List<Etudiant>> students = etudiants.stream().collect(Collectors.groupingBy(Etudiant::getClasse));
            students.forEach((classe, studentsByClasse)->{ 
          System.out.println("Les etudiants de la classe: " + classe);
          studentsByClasse.forEach(student->System.out.println("- " + student.getNom() + " " + student.getNote()));
        });
// ✅// 1: Moyenne par classe
        // double moyenneA = classeA.stream().collect(Collectors.averagingDouble(Etudiant::getNote));
        // System.out.println( String.format("% 2f" , moyenneA));
        // double moyenneB = classeB.stream().collect(Collectors.averagingDouble(Etudiant::getNote));
        // System.out.println(moyenneB);
        // Calculer la moyenne par  classe 
        
// ✅ // 2: Moyenne par classe
      Map<String, Double> averageByClasse = etudiants.stream()
      .collect(Collectors.groupingBy(Etudiant::getClasse,Collectors.averagingDouble(Etudiant::getNote)));
      averageByClasse.forEach((classe, average)->{
        System.out.println("La moyenne de la classe : " + classe + " est de : " + average);
      });

        Optional<Etudiant> meilleurEtudiantA = classeA.stream().max(Comparator.comparingDouble(Etudiant::getNote));
            meilleurEtudiantA.ifPresent(System.out::println);
        Optional<Etudiant>meilleurEtudiantB = classeB.stream().max(Comparator.comparingDouble(Etudiant::getNote));
        meilleurEtudiantB.ifPresent(System.out::println);
        //Meilleur etudiant 
// ✅  //Trouve le meilleur étudiant de chaque classe
        Map<String , Optional<Etudiant>> bestStudent = etudiants
          .stream()
          .collect(Collectors.
          groupingBy(Etudiant::getClasse, Collectors.maxBy(Comparator.comparingDouble(Etudiant::getNote))));
          
      bestStudent.forEach((classe, optionalStudent)->{
        
        System.out.println("Le meilleur etudiant de la classe: " + classe + " est ");
        
        optional
        //Exercice 8 : Opérations combinées
        /**
         * Compte le nombre total de mots dans toutes les phrases
         * Trouve tous les mots uniques (sans doublons)
         * Trouve le mot le plus long
         */
        List<String> phrases = Arrays.asList(
                "Java est génial",
                "Les streams facilitent le code",
                "La programmation fonctionnelle",
                "Java 8 et plus"
        );

        long nombreMots = phrases.stream().flatMap(phrase-> Arrays.stream(phrase.split(" "))).distinct().count();
        System.out.println(" Le nombre de mots est : " +nombreMots);

        List<String> motSansDoublons = phrases.stream().flatMap(phrase-> Arrays.stream(phrase.split("\\s +")))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(motSansDoublons);

        Set<String>motUniqueSet = phrases.stream()
                .flatMap(phrase-> Arrays.stream(phrase.split("\\s+")))
                .collect(Collectors.toSet());
        System.out.println(motUniqueSet);
// ✅  //Trouve le mot le plus long
        Optional<String> motLeplusLong = phrases.stream().flatMap(phrase->Arrays.stream(phrase.split("\\s+")))
                .max(Comparator.comparing(String::length));
        System.out.println("Le mot le plus long est : " + motLeplusLong.get());
        motLeplusLong.ifPresent(System.out::println);

        //
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
// ✅ //Calculer la somme
        Integer somme = nombres.stream().reduce(0, Integer::sum);
        System.out.println("La somme du tableau est: " +somme);
        //Calculer le produit
        int produit = nombres.stream().reduce(1,(a,b)-> a*b);
        System.out.println("La produit du tableau est: " +produit);

 // ✅ //Calculer le maximum

        int max = nombres.stream().reduce(0,Integer::max);
        System.out.println("La maximum du tableau est: " +max);

// ✅ //CHALLENGE COMPLET
        List<Produit> produits = Arrays.asList(
                new Produit("Laptop", "Electronique", 999.99, 5),
                new Produit("Souris", "Electronique", 25.50, 15),
                new Produit("Bureau", "Meuble", 299.00, 3),
                new Produit("Chaise", "Meuble", 150.00, 8),
                new Produit("Clavier", "Electronique", 75.00, 0)
        );
 // ✅  //Affiche les produits en stock (stock > 0)
        System.out.println("les stock supérieur à 0");
        List<Produit> positiveStock = produits.stream()
                .filter(p -> p.getStock() > 0)
                .toList();
        positiveStock.forEach(System.out::println);

// ✅  // Calculer la valeur totale du stock:

        Double valeurstock = produits.stream().mapToDouble(p->p.getPrix() * p.getStock()).sum();
     
     System.out.println("La valeur totale du stock est de " + valeurstock);


    }
}
