package Dao;

import java.util.List;

import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

public interface IDaoFormation {
public int addFormation (Formation f);
public List<Formation> getFormation();
public List <Formation> findByLocation (Lieu lieu);
}
