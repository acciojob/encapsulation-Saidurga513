package com.driver;

public class Main {

  public  static void main(String arg[])
  {
      RWOnly obj=new RWOnly();
     // obj.name="sai";
      obj.setName("sai");
      obj.getName();
  }
}