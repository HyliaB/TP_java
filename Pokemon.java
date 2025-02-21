class Pokemon{

   private int numPokemon;
   private String especes;
   private String nomPokemon;
   private String typePokemon1; 
   private String typePokemon2; 
   private int attPokemon;
   private int defPokemon;
   private int vitessePokemon;
   private int pvPokemon; 

    public Pokemon(){
        this.numPokemon = 1;
        this.especes    = Type.getEspece(25);
        this.nomPokemon = "pika_pika";
        this.typePokemon1 = Type.getNomType(3);
        this.typePokemon2 = Type.getNomType(2);
        this.attPokemon   = 64;
        this.defPokemon   = 58;
        this.vitessePokemon = 70;
        this.pvPokemon      = 62;
    }
    





        public Pokemon(int numPokemon, String especes, String nomPokemon, String typePokemon1, String typePokemon2,
        int attPokemon, int defPokemon, int vitessePokemon, int pvPokemon) {
        this.numPokemon = numPokemon;
        this.nomPokemon = nomPokemon;
        this.typePokemon1 = typePokemon1;
        this.typePokemon2 = typePokemon2;
        this.attPokemon = attPokemon;
        this.defPokemon = defPokemon;
        this.vitessePokemon = vitessePokemon;
        this.pvPokemon = pvPokemon;
}




public String toString() {
    return "Numéro: " + numPokemon + "\n" +
           "Espece: " + especes + "\n"+
           "Nom: " + nomPokemon + "\n" +
           "Type 1: " + typePokemon1 + "\n" +
           "Type 2: " + (typePokemon2.isEmpty() ? "ø" : typePokemon2) + "\n" +
           "PV: " + pvPokemon + "\n" +
           "Att: " + attPokemon + "\n" +
           "Def: " + defPokemon + "\n" +
           "Vit: " + vitessePokemon;
}

public boolean equals(Pokemon pokemon1 , Pokemon pokemon2){
    if (pokemon1.numPokemon == pokemon2.numPokemon) && (pokemon1.especes == pokemon2.especes) && (pokemon1.nomPokemon == pokemon2.nomPokemon)
    && (pokemon1.typePokemon1 == pokemon2.typePokemon1) && (pokemon1.typePokemon2 == pokemon2.typePokemon2) && (pokemon1.attPokemon == pokemon2.attPokemon)
    && (pokemon1.defPokemon == pokemon2.defPokemon) && (pokemon1.vitessePokemon == pokemon2.vitessePokemon) && (pokemon1.pvPokemon == pokemon2.pvPokemon){
        return true;
    }
    else{
        return false;
    }






}





public static void main(String[] args){
    Pokemon poke001 = new Pokemon(151,"mew","maurice","feu","sol",88,58,70,62);
    System.out.println(poke001);




}






























    
}