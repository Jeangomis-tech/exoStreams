Voici une série d'exercices progressifs sur les streams Java pour te perfectionner :
Niveau Débutant
Exercice 1 : Filtrage simple

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

Affiche uniquement les nombres pairs
Affiche uniquement les nombres supérieurs à 5

Exercice 2 : Transformation

<String> fruits = Arrays.asList("pomme", "banane", "orange", "kiwi");

Convertis tous les fruits en majuscules
Affiche la longueur de chaque fruit

Exercice 3 : Comptage
List<String> prenoms = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma");

Compte combien de prénoms commencent par "A"
Compte combien de prénoms ont plus de 4 lettres

Niveau Intermédiaire
Exercice 4 : Map et Collect
List<String> mots = Arrays.asList("chat", "chien", "oiseau", "poisson");

Crée une nouvelle liste avec les mots en majuscules
Crée une liste contenant la première lettre de chaque mot

Exercice 5 : Objets complexes

class Personne {
String nom;
int age;

    Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
}

List<Personne> personnes = Arrays.asList(
new Personne("Jean", 25),
new Personne("Marie", 30),
new Personne("Pierre", 20),
new Personne("Sophie", 35)
);

Affiche les noms des personnes de plus de 25 ans
Calcule l'âge moyen
Trouve la personne la plus âgée

Exercice 6 : FlatMap
List<List<Integer>> listeDeListes = Arrays.asList(
Arrays.asList(1, 2, 3),
Arrays.asList(4, 5),
Arrays.asList(6, 7, 8, 9)
);

Aplanis cette structure en une seule liste
Affiche uniquement les nombres pairs de toutes les listes

Niveau Avancé
Exercice 7 : Groupement
javaclass Etudiant {
String nom;
String classe;
double note;

    Etudiant(String nom, String classe, double note) {
        this.nom = nom;
        this.classe = classe;
        this.note = note;
    }
}

List<Etudiant> etudiants = Arrays.asList(
new Etudiant("Alice", "A", 15.5),
new Etudiant("Bob", "B", 12.0),
new Etudiant("Charlie", "A", 14.0),
new Etudiant("David", "B", 16.5),
new Etudiant("Emma", "A", 13.5)
);

Groupe les étudiants par classe
Calcule la moyenne de notes par classe
Trouve le meilleur étudiant de chaque classe

Exercice 8 : Opérations combinées
List<String> phrases = Arrays.asList(
"Java est génial",
"Les streams facilitent le code",
"La programmation fonctionnelle",
"Java 8 et plus"
);

Compte le nombre total de mots dans toutes les phrases
Trouve tous les mots uniques (sans doublons)
Trouve le mot le plus long

Exercice 9 : Reduce
List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);

Calcule la somme avec reduce()
Calcule le produit avec reduce()
Trouve le maximum avec reduce()

Exercice 10 : Challenge complet
class Produit {
String nom;
String categorie;
double prix;
int stock;

    Produit(String nom, String categorie, double prix, int stock) {
        this.nom = nom;
        this.categorie = categorie;
        this.prix = prix;
        this.stock = stock;
    }
}

List<Produit> produits = Arrays.asList(
new Produit("Laptop", "Electronique", 999.99, 5),
new Produit("Souris", "Electronique", 25.50, 15),
new Produit("Bureau", "Meuble", 299.00, 3),
new Produit("Chaise", "Meuble", 150.00, 8),
new Produit("Clavier", "Electronique", 75.00, 0)
);

Affiche les produits en stock (stock > 0)
Calcule la valeur totale du stock par catégorie
Trouve les 3 produits les plus chers
Crée une Map avec la catégorie comme clé et la liste des noms de produits comme valeur
Augmente le prix de tous les produits électroniques de 10%


Conseils pour progresser :

Commence par les exercices débutants
Essaie de résoudre chaque exercice sans regarder la solution
Expérimente avec différentes méthodes de Stream
Consulte la documentation Java pour découvrir d'autres méthodes

Tu veux que je te donne les solutions d'un exercice en particulier, ou tu préfères essayer d'abord par toi-même ?