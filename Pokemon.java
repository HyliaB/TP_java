class Pokemon {

    private int numPokemon;
    private String especes;
    private String nomPokemon;
    private String typePokemon1;
    private String typePokemon2;
    private int attPokemon;
    private int defPokemon;
    private int vitessePokemon;
    private int pvPokemon;

    public Pokemon() {
        this.numPokemon = 1;
        this.especes = Type.getEspece(25);
        this.nomPokemon = "pika_pika";
        this.typePokemon1 = Type.getNomType(3);
        this.typePokemon2 = Type.getNomType(2);
        this.attPokemon = 64;
        this.defPokemon = 58;
        this.vitessePokemon = 70;
        this.pvPokemon = 62;
    }

    public Pokemon(int numPokemon, String especes, String nomPokemon, String typePokemon1, String typePokemon2,
                   int attPokemon, int defPokemon, int vitessePokemon, int pvPokemon) {
        this.numPokemon = numPokemon;
        this.especes = especes;
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
                "Espece: " + especes + "\n" +
                "Nom: " + nomPokemon + "\n" +
                "Type 1: " + typePokemon1 + "\n" +
                "Type 2: " + (typePokemon2.isEmpty() ? "ø" : typePokemon2) + "\n" +
                "PV: " + pvPokemon + "\n" +
                "Att: " + attPokemon + "\n" +
                "Def: " + defPokemon + "\n" +
                "Vit: " + vitessePokemon;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Pokemon)) {
            return false;
        }
        Pokemon p = (Pokemon) o;
        return this.numPokemon == p.numPokemon &&
                this.especes.equals(p.especes) &&
                this.nomPokemon.equals(p.nomPokemon) &&
                this.typePokemon1.equals(p.typePokemon1) &&
                this.typePokemon2.equals(p.typePokemon2) &&
                this.attPokemon == p.attPokemon &&
                this.defPokemon == p.defPokemon &&
                this.vitessePokemon == p.vitessePokemon &&
                this.pvPokemon == p.pvPokemon;
    }


    public static void main(String[] args) {
        Pokemon poke001 = new Pokemon(151, "mew", "maurice", "feu", "sol", 88, 58, 70, 62);
        Pokemon poke002 = new Pokemon(151, "mew", "hylia", "feu", "sol", 88, 58, 70, 62);

        System.out.println(poke001.equals(poke002));

    }

}




























    
