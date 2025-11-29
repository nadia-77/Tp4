package ma.projet.test;
public class TestApp {

	public static void main(String[] args) {
	
	Categorie C1 = new Categorie("Ordinateur Portable", "O PR");
	Categorie C2 = new Categorie("Ordinateur Poste", "O PO");

    Categorie[] categories = { C1, C2 };

    Article a1 = new Article(14, "DELL INSPIRON", C1);
    Article a2 = new Article(4, "SONY VAIO", C1);
    Article a3 = new Article(74, "TERRA", C2);
    Article a4 = new Article(785, "HP Compaq", C2);

    Article[] articles = { a1, a2, a3, a4 };

    for (int i = 0; i < categories.length; i++) {
        System.out.println(categories[i].getLibelle());

        for (int j = 0; j < articles.length; j++) {

            if (articles[j].getCategorie().getId() == categories[i].getId()) {
                System.out.println("   " + articles[j].toString());
            }
         }
     }

  }

}
