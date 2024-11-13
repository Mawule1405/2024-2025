package models

data class Etudiant(

    private var nom : String? = null,
    private var prenom : String? = null,
    private var age : Int? = null
)
{



    fun getNom() : String? {return this.nom}
    fun getPrenom() : String?{return this.prenom}
    fun getAge(): Int? {return this.age}


    fun setNom(nom: String){this.nom = nom}
    fun setPrenom(prenom : String){this.prenom =prenom}
    fun setAge(age : Int){this.age = age}



}