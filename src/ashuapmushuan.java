
public class ashuapmushuan {

	public static void main(String[] args) {
		
		orignalExperimental alice = new orignalExperimental();
		orignalExperimental bob = new orignalExperimental();
		orignalExperimental marvin = new orignalExperimental();
		orignalExperimental nantucket = new orignalExperimental();
		
		alice.nom="Alice";
		bob.nom="Bob";
		marvin.nom="Marvin";
		nantucket.nom="Nantucket";
		
		
		
		System.out.println(">>> Voici les details des orignaux <<<");
		alice.afficherDetails();
		System.out.println("\n");
		bob.afficherDetails();
		System.out.println("\n");
		marvin.afficherDetails();
		System.out.println("\n");
		nantucket.afficherDetails();
		
		bob.injecterModificateurDeGenes(bob);
		marvin.injecterModificateurDeGenes(marvin);
		
		System.out.println("\n\n>>> Quelques jours plus tard... <<<");
		System.out.println(">>> Voici les details des orignaux <<<");
		alice.afficherDetails();
		System.out.println("\n");
		bob.afficherDetails();
		System.out.println("\n");
		marvin.afficherDetails();
		System.out.println("\n");
		nantucket.afficherDetails();
	}
	

}
