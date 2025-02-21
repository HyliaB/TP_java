class Type{
    /*************** 1G *******************/

    // Noms des espèces des pokemons dans le même ordre que le pokedex
    public static final String[] espece = {"Bulbizarre","Herbizarre","Florizarre","Salamèche","Reptincel","Dracaufeu","Carapuce","Carabaffe","Tortank","Chenipan","Chrysacier","Papilusion","Aspicot","Coconfort","Dardargnan","Roucool","Roucoups","Roucarnage","Rattata","Rattatac","Piafabec","Rapasdepic","Abo","Arbok","Pikachu","Raichu","Sabelette","Sablaireau","Nidoran♀","Nidorina","Nidoqueen","Nidoran♂","Nidorino","Nidoking","Mélofée","Mélodelfe","Goupix","Feunard","Rondoudou","Grodoudou","Nosferapti","Nosferalto","Mystherbe","Ortide","Rafflesia","Paras","Parasect","Mimitoss","Aéromite","Taupiqueur","Triopikeur","Miaouss","Persian","Psykokwak","Akwakwak","Férosinge","Colossinge","Caninos","Arcanin","Ptitard","Têtarte","Tartard","Abra","Kadabra","Alakazam","Machoc","Machopeur","Mackogneur","Chétiflor","Boustiflor","Empiflor","Tentacool","Tentacruel","Racaillou","Gravalanch","Grolem","Ponyta","Galopa","Ramoloss","Flagadoss","Magnéti","Magnéton","Canarticho","Doduo","Dodrio","Otaria","Lamantine","Tadmorv","Grotadmorv","Kokiyas","Crustabri","Fantominus","Spectrum","Ectoplasma","Onix","Soporifik","Hypnomade","Krabby","Krabboss","Voltorbe","Électrode","Noeunoeuf","Noadkoko","Osselait","Ossatueur","Kicklee","Tygnon","Excelangue","Smogo","Smogogo","Rhinocorne","Rhinoféros","Leveinard","Saquedeneu","Kangourex","Hypotrempe","Hypocéan","Poissirène","Poissoroy","Stari","Staross","M. Mime","Insécateur","Lippoutou","Élektek","Magmar","Scarabrute","Tauros","Magicarpe","Léviator","Lokhlass","Métamorph","Évoli","Aquali","Voltali","Pyroli","Porygon","Amonita","Amonistar","Kabuto","Kabutops","Ptéra","Ronflex","Artikodin","Électhor","Sulfura","Minidraco","Draco","Dracolosse","Mewtwo","Mew"};

    // Noms des différents types possibles pour les pokemons. Voir l'image pokemon_table_des_types_1G.png
    public static final String[] nomsType= {"NORMAL", "FEU", "EAU", "PLANTE", "ELECTRIK", "GLACE", "COMBAT", "POISON", "SOL", "VOL", "PSY", "INSECTE", "ROCHE", "SPECTRE", "DRAGON", "SANS"};

    // Constantes pour une utilisation plus pratique des types
    public static final int NORMAL = 0;
    public static final int FEU = 1;
    public static final int EAU = 2;
    public static final int PLANTE = 3;
    public static final int ELECTRIK = 4;
    public static final int GLACE = 5;
    public static final int COMBAT = 6;
    public static final int POISON = 7;
    public static final int SOL = 8;
    public static final int VOL = 9;
    public static final int PSY = 10;
    public static final int INSECTE = 11;
    public static final int ROCHE = 12;
    public static final int SPECTRE = 13;
    public static final int DRAGON = 14;
    public static final int SANS = 15;

    // Valeur possibles des différentes efficacités.
    public static final double NEUTRE = 1.0;
    public static final double INEFFICACE = 0.0;
    public static final double PAS_EFFICACE = 0.5;
    public static final double SUPER_EFFICACE = 2.0;

    // Tableau des efficacités de type. Voir l'image pokemon_table_des_types_1G.png.
    // Utilisation efficacite[typeAtt][typeDef].
    // Exemple : efficacite[Type.EAU][Type.FEU] retournera Type.SUPER_EFFICACE.
    private static final double efficacite[][] = {
	{NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, PAS_EFFICACE, INEFFICACE, NEUTRE}, // NORMAL
	{NEUTRE, PAS_EFFICACE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, NEUTRE, PAS_EFFICACE}, // FEU
	{NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, PAS_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, NEUTRE, PAS_EFFICACE}, // EAU
	{NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, PAS_EFFICACE, NEUTRE, NEUTRE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, PAS_EFFICACE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, PAS_EFFICACE}, // PLANTE
	{NEUTRE, NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, PAS_EFFICACE, NEUTRE, NEUTRE, NEUTRE, INEFFICACE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, PAS_EFFICACE}, // ELECTRIK
	{NEUTRE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, PAS_EFFICACE, NEUTRE, NEUTRE, SUPER_EFFICACE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE}, // GLACE
	{SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, NEUTRE, PAS_EFFICACE, NEUTRE, PAS_EFFICACE, PAS_EFFICACE, PAS_EFFICACE, SUPER_EFFICACE, INEFFICACE, NEUTRE}, // COMBAT
	{NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, PAS_EFFICACE, PAS_EFFICACE, NEUTRE, NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, PAS_EFFICACE, NEUTRE}, // POISON
	{NEUTRE, SUPER_EFFICACE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, NEUTRE, SUPER_EFFICACE, NEUTRE, INEFFICACE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, NEUTRE}, // SOL
	{NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, NEUTRE, NEUTRE}, // VOL
	{NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, SUPER_EFFICACE, NEUTRE, NEUTRE, PAS_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE}, // PSY
	{NEUTRE, PAS_EFFICACE, NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, NEUTRE, PAS_EFFICACE, NEUTRE}, // INSECTE
	{NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE}, // ROCHE
	{INEFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, INEFFICACE, NEUTRE, NEUTRE, SUPER_EFFICACE, NEUTRE}, // SPECTRE
	{NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE} // DRAGON
    };

    // Doit retourner une chaine des caractères contenant le nom de l'espèce du pokemon en fonction de son numero dans le pokedex.
    // Exemple :
    // Type.getEspece(97) doit retourner "Ectoplasma"
    public static String getEspece(int numPokedex){
    	if (numPokedex == 1){
            return new String(espece[0]);
        }
        if (numPokedex == 151){
            return new String (espece[150]);
        }
        else{
            return new String(espece[numPokedex-1]);
        }

    }

    // Doit retourner une chaine de caractères contenant le nom du type en fonction de son indice (comprendre constantes qui défini le type).
    // Exemple :
    // Type.getNomType(Type.EAU) doit retourner "eau"
    public static String getNomType(int type){
        return new String(nomsType[type]);
    }
    

    

    // Doit retourner l'efficacité lorsqu'un pokemon de type typeAtt attaque un pokemon de type typeDef.
    // Exemple :
    // Type.getEfficacite(Type.EAU, Type.FEU) doit retourner Type.SUPER_EFFICACE
    public static double getEfficacite(int typeAtt, int typeDef){
    	 if (typeAtt == 0  && typeDef == 12){
            return PAS_EFFICACE;
         }
         if (typeAtt == 0 && typeDef == 13){
            return INEFFICACE;
         }
         if (typeAtt == 1 && typeDef == 1 ){
            return PAS_EFFICACE ;
         }
         if (typeAtt == 1 && typeDef == 2 ){
            return PAS_EFFICACE ;
         }
         if (typeAtt == 1 && typeDef == 3 ){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 1 && typeDef == 5){
            return SUPER_EFFICACE;
         }
         if (typeAtt ==1 && typeDef == 11){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 1 && typeDef == 12){
            return PAS_EFFICACE;
         }
         if (typeAtt == 1 && typeDef == 14){
            return PAS_EFFICACE ;
         }
         if (typeAtt == 2 && typeDef == 1 ){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 2 && typeDef == 2 ){
            return PAS_EFFICACE;
         }
         if (typeAtt == 2 && typeDef == 3 ){
            return PAS_EFFICACE ;
         }
         if (typeAtt == 2 && typeDef == 8){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 2 && typeDef == 12 ){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 2 && typeDef == 14 ){
            return PAS_EFFICACE;
         }
         if (typeAtt == 3 && typeDef == 1){
            return PAS_EFFICACE;
         }
         if (typeAtt == 3 && typeDef == 2){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 3 && typeDef == 3){
            return PAS_EFFICACE;
         }
         if (typeAtt == 3 && typeDef == 7){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 3 && typeDef == 8){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 3 && typeDef == 9){
            return PAS_EFFICACE;
         }
         if (typeAtt == 3 && typeDef == 11){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 3 && typeDef == 12){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 3 && typeDef == 14){
            return PAS_EFFICACE;
         }
         if (typeAtt == 4 && typeDef == 2){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 4 && typeDef == 3){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 4 && typeDef == 4){
            return PAS_EFFICACE;
         }
         if (typeAtt == 4 && typeDef == 8){
            return INEFFICACE;
         }
         if (typeAtt == 4 && typeDef == 9){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 4 && typeDef == 14){
            return PAS_EFFICACE;
         }
         if (typeAtt == 5 && typeDef == 2){
            return PAS_EFFICACE;
         }
         if (typeAtt == 5 && typeDef == 3){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 5 && typeDef == 5){
            return PAS_EFFICACE;
         }
         if (typeAtt == 5 && typeDef == 8){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 5 && typeDef == 9 ){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 5 && typeDef == 14 ){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 6 && typeDef == 0){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 6 && typeDef == 5){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 6 && typeDef == 7){
            return PAS_EFFICACE;
         }
         if (typeAtt == 6 && typeDef == 9){
            return PAS_EFFICACE;
         }
         if (typeAtt == 6 && typeDef == 10){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 6 && typeDef == 11){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 6 && typeDef == 12){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 6 && typeDef == 13){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 7 && typeDef == 3){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 7 && typeDef == 7){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 7 && typeDef == 8){
            return PAS_EFFICACE;
         }
         if (typeAtt == 7 && typeDef == 11){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 7 && typeDef == 12 ){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 7 && typeDef == 13 ){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 8 && typeDef == 1){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 8 && typeDef == 3){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 8 && typeDef == 4){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 8 && typeDef == 7){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 8 && typeDef == 9){
            return INEFFICACE;
         }
         if ( typeAtt == 8 && typeDef == 11){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 8 && typeDef == 12){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 9 && typeDef == 3){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 9 && typeDef == 4){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 9 && typeDef == 6 ){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 9 && typeDef == 11){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 9 && typeDef == 12){
            return PAS_EFFICACE;
         }
         if (typeAtt == 10 && typeDef == 6 ){
            return SUPER_EFFICACE;
         }
         if (typeAtt == 10 && typeDef == 7){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 10 && typeDef == 10){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 11 && typeDef == 1  ){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 11 && typeDef == 3){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 11 && typeDef == 6){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 11 && typeDef == 7){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 11 && typeDef == 9){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 11 && typeDef == 10){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 11 && typeDef == 13){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 12 && typeDef == 1){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 12 && typeDef == 5){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 12 && typeDef == 6){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 12 && typeDef == 8){
            return PAS_EFFICACE;
         }
         if ( typeAtt == 12 && typeDef == 9){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 12 && typeDef == 11){
            return SUPER_EFFICACE;
         }
         if ( typeAtt == 13 && typeDef == 0){
            return INEFFICACE;
         }
         if ( typeAtt == 13 && typeDef == 10){
            return INEFFICACE;
         }
         if  (typeAtt == 14 && typeDef == 14 ){
            return SUPER_EFFICACE;
         }
	return NEUTRE;
    }

    // Doit retourner l'indice du type passé en pramètre sous forme de chaine de caractère.
    // Exemple :
    // Type.getIndiceType("spectre") doit retourner Type.SPECTRE ou 13 plus simplement.
    // Attention à la casse ! 
    public static int getIndiceType(String type){
        type = type.toUpperCase();
	int i;
    int MAX = 15;
    for (i=0;i<=MAX;i++){
        if (nomsType[i].equals(type)){
            return i; 
        }
    }
	return -1;
    }
    public static void main(String[] args) {
        System.out.println(getEspece(25));
        System.out.println(getNomType(15));
        System.out.println(getIndiceType("normal"));

    }
}
