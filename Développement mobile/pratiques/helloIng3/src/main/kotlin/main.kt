import models.Etudiant
import models.Person


/**
 * La fonction point d'entrée de l'application
 */

fun Salutation(){
    println("Welcome to ING 3");
}

fun Salutation(nom : String){
    println("Welcome $nom")
}

fun main() {

    /*
    var age: Int = 27
    val montant: Double = 2000000.0
    var salutation: String = "Welcome to ING3"
    var ageDeJohn: Int = 20


    println("Mon age est " + age + " ans. Je dois gagner " + montant + " par mois. " + salutation)
    println("John a $ageDeJohn ans.")


    //Affichage de la longueur
    println("$salutation, est de longueur ${salutation.length}")

    */

    /*
    Création d'un tableau avec arrayOf()
       .get(index) pour obtenir l'élément de la position index + 1
       .toList() pour obtenir tous les éléments de la list
    Création des tableaux aveccontenant rien que des entiers, on utilise intArrayOf()

        + permet de contener deux tableaux

*/
    var tabMoisAnnee = arrayOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
    println(tabMoisAnnee.get(2))
    println(tabMoisAnnee.toList())

    /*
    Création d'une liste avec listOf() pour les immutable list
                             mutableListOf() pour les mutables list

*/
    var listClassIai = mutableListOf("AP1", "AP2", "AP3", "ING1", "ING2", "ING3", "MIAGE1", "MIAGE2", "Master1", "Master2")
    var listFiliereIai = mutableListOf("AP", "ING", "MIAGE", "MASTER")


    listClassIai.add("LP1")
    listClassIai.addAll(arrayOf("LP2", "LP3"))

    listClassIai.remove("AP1")


    println(listClassIai)
    println(listFiliereIai)



    /*
        Création d'un dictionnaire avec mapOf() pour les dictionnaires non mutables
                                        mutableMapOf() pour les dictionnaires mutables

     */
    var repertoireTel = mapOf("bawana" to "062251798",
                              "apedo" to "077161421",
                              "helou" to "074630473")

    println(repertoireTel)

    /*
        Struture de contôle if
     */

    var note : Int = 15

    if(note in 10..20){
        println("Admis")
    }

    //when
    var moyenne = 5
    when(moyenne){

       in 10..11 -> println("Passable")
        in 12..13 -> println("Assez bien")
        in 14..15 -> println("Bien")
        in 16..17 -> println("Très bien")
        in 18..19 -> println("Excellent")
        20 -> println("Honorable")
        else -> println("Echoué")
    }

    //For

    for( contact in repertoireTel){
        println("Le numéro de  ${contact.key} est ${contact.value}")
    }

    //Repeat

    var nom = "John Doe"


    repeat(10){
        println(nom)
    }

    //Les fonctions

    Salutation()
    Salutation("Mathias")

    //Orienté objet

    var mathias = Etudiant()
    mathias.setNom("HELOU")
    mathias.setPrenom("Komlan Mawulé")
    mathias.setAge(27)

    println(mathias)




}


