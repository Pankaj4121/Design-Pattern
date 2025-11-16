package com.DesignPattern.Design.Pattern.BuilderDesign;

public class Showroom {
    private String Car;
    private String Bike;
    private String Scooty;
    private String XUV;

    private Showroom(Builder builder){
        this.Car=builder.Car;
        this.Bike=builder.Bike;
        this.Scooty=builder.Scooty != null ? builder.Scooty : "Not Available";
        this.XUV=builder.XUV;
    }

    public void Show(){
        System.out.println("Car : " + Car);
        System.out.println("Bike : " + Bike);
        System.out.println("Scooty : " + Scooty);
        System.out.println("XUV : " + XUV);

    }

    public static class Builder{
        private String Car;
        private String Bike;
        private String Scooty;
        private String XUV;

        public Builder setCar(String Car){
            this.Car=Car;
            return this;
        }
        public Builder setBike(String Bike){
            this.Bike=Bike;
            return this;
        }
        public Builder setScooty(String Scooty){
            this.Scooty=Scooty;
            return this;
        }
        public Builder setXUV(String XUV){
            this.XUV=XUV;
            return this;
        }
        public Showroom build(){
            return new Showroom(this);
        }
    }
}
