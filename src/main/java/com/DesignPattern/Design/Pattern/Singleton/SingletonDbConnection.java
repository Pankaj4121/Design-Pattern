package com.DesignPattern.Design.Pattern.Singleton;

public class SingletonDbConnection {
    /* Lazy Loading - Create Object when this class called
     * When two thread come they both get instance == null, so both create obj
     */

//    private static SingletonDbConnection instance;
//
//    private SingletonDbConnection(){
//        System.out.println("DB Connected Successfully");
//    }
//
//    public static SingletonDbConnection getInstance(){
//        if(instance == null){
//            instance = new SingletonDbConnection();
//        }
//        return instance;
//    }


    /*
     * Eager Loading - Created Object when class loaded
     * its a waste of memory if the obj isnt get called
     */
//    private static final SingletonDbConnection instance = new SingletonDbConnection();
//
//    private SingletonDbConnection(){
//        System.out.println("DB Connection Succesfull...");
//    }
//
//    public static SingletonDbConnection getInstance(){
//        return instance;
//    }

    /*
     * Thread-safe Singleton using lazy loading.
     * Object is created only when getInstance() is called.
     * Uses double-checked locking to avoid performance overhead.
     */
    private static volatile SingletonDbConnection instance;

    private SingletonDbConnection(){
        System.out.println("Db Connected Successfully");
    }

    public static SingletonDbConnection getInstance(){
        if(instance == null){                       //first check
            synchronized (SingletonDbConnection.class){      //single thread access
                if (instance == null){              //Second check
                    instance = new SingletonDbConnection();
                }
            }
        }
        return instance;
    }
}
