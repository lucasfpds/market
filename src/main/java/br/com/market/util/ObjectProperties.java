package br.com.market.util;

import java.lang.reflect.Field;

public class ObjectProperties {
    public void imprimeAtributoseValoresPojo(Object object) {
        Class<?> classe = object.getClass();
        Field[] campos = classe.getDeclaredFields();

        String nomeAtributo = "";
        Object valorAtributo = null;
        for (Field campo : campos) {
            try {
                campo.setAccessible(true); // Necessário por conta do encapsulamento das variáveis (private)
                nomeAtributo = campo.getName();
                valorAtributo = campo.get(object);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(nomeAtributo + ": " + valorAtributo);
        }
    }
}
