/*
 * Project: SelfVitalize
 * Founders: Peter Enescu, Dennis Mariano, Eric Perez
 * Copyright © 2017
 * 
 * File: User.java
 * Description: Single User Object that represent a User account and
 * its basic information.
 * Last Written by: Peter Enescu 
 * Date Last Update: October 21st, 2017
 */

import javax.validation.contraints.Min;
import javax.validation.contraints.NotNull;
import javax.validation.contraints.Size;

public class User {
  // String that represents username and name itself
  @NotNull
  private String username, name;
  
  /*
   * No args constructor. Sets up no name username/name.
   */
  public User() {
    username = name = "";
  }
  
  /*
   * Multiple args constructor. Sets up username/name by arguments.
   * @param un: username parameter String
   * @param n: name parameter String
   */
  public User(String un, String n) {
    username = un;
    name = n;
  }
  
  /*
   * Accessor method returns username field.
   * @return String: username
   */
  public String getUsername() {
    return username;
  }
  
  /*
   * Mutator method sets new username field.
   * @param un: new username to be set
   */
  public void setUsername(String un) {
    username = new String(un);
  }
  
  /*
   * Accessor method returns name field.
   * @return String: name
   */
  public String getName() {
    return name;
  }
  
  /*
   * Mutator method sets new name field.
   * @return String: name
   */
  public void setName(String n) {
    name = new String(n);
  }
}
