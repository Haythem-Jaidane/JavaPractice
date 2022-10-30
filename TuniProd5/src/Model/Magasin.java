/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TheBigBrother
 */
public class Magasin{
    
    private final int MAXEMPLOYE=20;
    private final int MAX_PRODUIT = 2;
    
    private int id;
    private String entreprise;
    private String adresse;
    private Employe[] employes = new Employe[this.MAXEMPLOYE];
    private int tailmagasin;
    private int capacite;
    private Produit[] produits = new Produit[this.MAX_PRODUIT];
    private MagasinPleinException M;
    
    public Magasin(){
        this.id = 0 ;
        this.entreprise = "el 3atar";
        this.adresse = "el 9amra";
        this.tailmagasin=0;
    }
    
    public Magasin(int id,String entreprise,String adresse){
        this.id = id ;
        this.entreprise = entreprise;
        this.adresse = adresse;
        this.tailmagasin=0;
    }
    
    public int getIdentifiant() {
        return id;
    }

    public String getAdresse() {
        return adresse;
    }

    public Produit[] getProduits() {
        return produits;
    }

    public int getMAX_PRODUIT() {
        return MAX_PRODUIT;
    }

    public void setIdentifiant(int id) {
        this.id = id;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setProduits(Produit[] produits) {
        this.produits = produits;
    }
    
    public boolean chercherProduit(Produit p){
        for(int i=0;i<this.capacite;i++){
            if(this.produits[i].comparer(p)){
                return true;
            }
        }
        return false;
    }
    
    
    public void ajouterProduit(Produit p) throws MagasinPleinException{
        if(p.getPrix()>0 && !this.chercherProduit(p)){
            capacite++;
            if(this.capacite>this.MAX_PRODUIT){
                capacite--;
                throw new MagasinPleinException("le magasin est plein");  
            }
            this.produits[this.capacite-1]=p;
            
        }
    }
    
    public void supprimerProduit(Produit p){
        if(this.chercherProduit(p)){
            Produit[] tmp=new Produit[capacite - 1];
            int j=0;
            for(int i=0;i<this.capacite;i++){
                if(!this.produits[i].comparer(p)){
                    tmp[j]=this.produits[i];
                }
                j+=1;
            }
            this.produits=tmp;
            this.capacite-=1;
        }
        else{
            System.out.println("produit non trouvé");
        }
    }
    
    public int getCapacite(){
        return this.capacite;
    }
    
    private float calculerSalair(Employe emp){
        int heur = emp.getNbr_heures();
        int heur_sub = 0;
        if(emp instanceof Caissier){
            if(emp.getNbr_heures()>160){
                heur_sub = heur - 160;
                heur = 160;   
            }
            return heur*5 + heur_sub*5*1.15f;
        }
        else if(emp instanceof Vendeur){
            return 450 * ((Vendeur)emp).getTauxDeVente();
        }
        else if(emp instanceof Responsable){
            if(emp.getNbr_heures()>160){
                heur_sub = heur - 160;
                heur = 160;   
            }
            return heur*10 + ((Responsable)emp).getPrime() + heur_sub*1.2f;
        }
        else{
            return -1;
        }       
    }
    
    public void afficherSalaies(){
        for (int i=0;i<this.tailmagasin;i++){
            System.out.print("************************\n");
            System.out.print("Id : "+this.employes[i].getId()+"\n");
            System.out.print("Salaire in DT : ");
            System.out.print(this.calculerSalair(this.employes[i]));
            System.out.print("\n************************\n");
        }
    }
    
    public void afficherProduits(){
        for (int i=0;i<this.capacite;i++){
            System.out.print(produits[i]);
        }
    }
    
    public Magasin magasinPlusSature(Magasin m1,Magasin m2){
        if(m1.getCapacite()>m2.getCapacite()){
            return m1;
        }
        else{
            return m2;
        }
    }
    
    public void ajouterEmploye(Employe a){
        this.employes[this.tailmagasin] = a;
        this.tailmagasin += 1;
    }
    
    public String toString(){
        return "************************\n"+"id : "+this.id+"\nentreprise : "+this.entreprise+"\nAdresse : "+this.adresse+"\ncapacite : "+this.tailmagasin+"\n************************\n";
    }
}
