/*
 * Project: SelfVitalize
 * Founders: Peter Enescu, Dennis Mariano, Eric Perez
 * Copyright © 2017
 * 
 * File: User.java
 * Description: Single User Object that represent a User account and its basic
 * information.
 * Last Written by: Peter Enescu 
 * Date Last Update: October 21st, 2017
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Class UserTester tests User.java
 */
class UserTester {
  // User test field
  private User user1 = new User("user1", "User 1");
  
  /*
   * Test Username
   */
  @Test
  void testUsername() {
    assertEquals(user1.getUsername(), "user1");
  }
  
  /*
   * Test Name
   */
  @Test
  void testName() {
	  assertEquals(user1.getName(), "User 1");
  }
  
  /*
   * Test Mutator setUsername
   */
  @Test
  void testSetUsername() {
	  user1.setUsername("user2");
	  assertEquals(user1.getUsername(), "user2");
  }
  
  /*
   * Test Mutator setUsername
   */
  @Test
  void testSetName() {
	user1.setName("User 2");
    assertEquals(user1.getName(), "User 2");
  }
}
