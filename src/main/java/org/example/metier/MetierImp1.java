package org.example.metier;
import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImp1 implements IMetier{
    /* Couplage faible */
    @Autowired
    private IDao dao;
     @Override
    public double calcul(){
         double t = dao.getData ( );
         double res = t*66;
         return res;
     }
    /* setter pour injection des dependances */
    public void setDao(IDao dao){ this.dao = dao;}

}
