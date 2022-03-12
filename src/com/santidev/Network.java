package com.santidev;

public abstract class Network {

    protected String userName;
    protected String password;

   public Network(){

    }

    //Hace una publicacion en cualquier red social

    public boolean post(String message){
       if(logIn(this.userName, this.password)){
           boolean result = sendData(message.getBytes());
           logOut();
           return result;
       }
       return false;
    }

   abstract boolean logIn(String userName, String password);
   abstract  boolean sendData(byte [] data);
   abstract void logOut();

}
