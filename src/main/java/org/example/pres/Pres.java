package org.example.pres;

import org.example.dao.IDao;
import org.example.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres {
    public static void main ( String[] args ) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // Statique
//        DaoImp1 d = new DaoImp1 ();
//        DaoImp12 d2 = new DaoImp12 ();
//
//        MetierImp1 m = new MetierImp1 ();
//        m.setDao ( d );
//        m.calcul ();


        // Dynamique
        Scanner scanner = new Scanner( new File ( "config.txt" ) );
        String daoClass =scanner.nextLine ();
        Class cDao = Class.forName ( daoClass );
        IDao dao = (IDao) cDao.newInstance ();


        String metierClass =scanner.nextLine ();
        Class cMetier = Class.forName ( metierClass );
        IMetier metier = (IMetier) cMetier.newInstance ();
        Method method = cMetier.    getMethod ( "setDao",IDao.class);
        method.invoke ( metier,dao );
        System.out.println ( "res"+metier.calcul () );




    }
}