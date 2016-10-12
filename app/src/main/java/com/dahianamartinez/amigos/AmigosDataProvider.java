package com.dahianamartinez.amigos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrador on 07/10/2016.
 */
public class AmigosDataProvider {
    public static List <Amigo> getAmigos(){
        List<Amigo> amigos = new ArrayList<Amigo>();

        for (int i = 1; i<101;i++){
            Amigo a = new Amigo();
            a.setNombre("Nombre"+i);
            a.setEmail("email"+i+"@usuario.com");
            amigos.add(a);

        }


        return amigos;



    }
}
