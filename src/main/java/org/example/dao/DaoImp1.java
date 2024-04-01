package org.example.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp1 implements IDao {

    public double getData(){
        System.out.println ("Version autre" );

        double data = 66;

        return data;
    }
}
