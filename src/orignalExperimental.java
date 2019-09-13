
public class orignalExperimental {

		String nom;
		int nombreTetes,nombreYeux,nombrePattes;
		static boolean estRadioactif;
		boolean estDemoniaque;
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getNombreTetes() {
			return nombreTetes;
		}
		public void setNombreTetes(int nombreTetes) {
			this.nombreTetes = nombreTetes;
		}
		public int getNombreYeux() {
			return nombreYeux;
		}
		public void setNombreYeux(int nombreYeux) {
			this.nombreYeux = nombreYeux;
		}
		public int getNombrePattes() {
			return nombrePattes;
		}
		public void setNombrePattes(int nombrePattes) {
			this.nombrePattes = nombrePattes;
		}
		public static boolean isEstRadioactif() {
			return estRadioactif;
		}
		public static void setEstRadioactif(boolean estRadioactif) {
			orignalExperimental.estRadioactif = estRadioactif;
		}
		public boolean isEstDemoniaque() {
			return estDemoniaque;
		}
		public void setEstDemoniaque(boolean estDemoniaque) {
			this.estDemoniaque = estDemoniaque;
		}
		
		public void init() {
			this.nombreTetes=1;
			this.nombreYeux=2;
			this.nombrePattes=4;
			this.estRadioactif=false;
			this.estDemoniaque=false;
		}
		
		public orignalExperimental() {
			this.init();
		}
		
		public void afficherDetails() {
			System.out.println("Voici les details de votre orignal " + nom + ":");
			System.out.print("Nombre de tetes: " + nombreTetes + "\nNombre de Yeux: " + nombreYeux + "\nNombre de pattes: " + nombrePattes);
			System.out.print("\n" + nom);
			if (estRadioactif==true) System.out.print(" est radioactif");
			else System.out.print(" n'est pas radioactif");
			System.out.print("\n" + nom);
			if (estDemoniaque==true) System.out.print(" est demoniaque");
			else System.out.print(" n'est pas demoniaque");
		}
		public static void injecterModificateurDeGenes(orignalExperimental orignalCible) {
			orignalExperimental.setEstRadioactif(true);
			System.out.println("\n\n\nL'orignal infecte est: "+orignalCible.getNom());
			if (aleatoire()>5)orignalCible.setEstDemoniaque(true);
			else orignalCible.setEstDemoniaque(false);
			orignalCible.setNombreYeux(aleatoire());
			orignalCible.setNombreTetes(aleatoire());
			orignalCible.setNombrePattes(aleatoire());
		}
		public static int aleatoire() {
			int max=8;
			int min=2;
			int alea=min + (int)(Math.random() * ((max - min)+1));
			return alea;
			
		}
		
}
