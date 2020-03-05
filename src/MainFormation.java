import java.util.List;

import Dao.DaoFormation;
import Dao.DaoLieu;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;



public class MainFormation {

	public static void main(String[] args) {
		 
		Formation form = new Formation("Psychologie");
		Formation form1 = new Formation("Developement personnel");
		Formation form2 = new Formation("Informatique");
		Formation form3 = new Formation("Design");
		Formation form4 = new Formation("Montage");
		DaoFormation dao = new DaoFormation();
		dao.addFormation(form);
		dao.addFormation(form1);
		dao.addFormation(form2);
		dao.addFormation(form3);
		dao.addFormation(form4);
	
		Lieu l1 = new Lieu("2 rue Pasteur", "Paris");
		Lieu l2 = new Lieu("3 rue el foll", "Paris");
		Lieu l3 = new Lieu("5 rue fleur", "Toulouse");
		Lieu l4 = new Lieu("1 rue halte", "Montpellier");
		DaoLieu dao1 = new DaoLieu();
		dao1.createLieu(l1);        
		dao1.createLieu(l2); 
		dao1.createLieu(l3); 
		dao1.createLieu(l4); 
		
		
			
//		List<Formation> list=dao.getFormation();
//		System.out.println(list);
			}
	}


