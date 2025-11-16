package com.DesignPattern.Design.Pattern.FactoryDesign;

public class CarFactory {

    /* Because we don’t want to create objects using new everywhere.
     * Factory pattern gives you one central place to create objects.
     * Factory solves this by keeping object creation in ONE place.
     */

    public static Car getCar(String type){
        if(type.equalsIgnoreCase("Porche")) {
            return new Porche();
        } else if(type.equalsIgnoreCase("Ferrari")){
            return new Ferrari();
        } else if (type.equalsIgnoreCase("Lambo")) {
            return new Lambo();
        } else {
            return null;
        }
    }

}
