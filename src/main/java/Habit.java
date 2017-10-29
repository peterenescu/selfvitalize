/**
 * Project: SelfVitalize
 * Founders: Peter Enescu, Dennis Mariano, Eric Perez
 * Copyright © 2017
 *
 * File: Habit.java
 * Description: An activity that the user plans to keep track of.
 * Last Updated By: Peter Enescu
 * Date of Last Update: October 21st, 2017
 */

/*
 * Class Habit identifies an individual Habit
 */
public class Habit {

  // name of the habit
  private String name;
  // number of repeated goals completed
  private int repeats;
  // if the goal has been completed
  private boolean hasCompleted;

  /*
   * Initialize the name of the habit to the specified name.
   * @param habitName: The desired name of the new Habit
   */
  public Habit(String habitName) {
    name = habitName;
    repeats = 0;
    hasCompleted = false;
  }

  /*
   * Increment the amount of times that the habit has been completed.
   */
  public void complete() {
    if (!hasCompleted) {
      setHasCompleted(true);
      repeats++;
    }
  }

  /*
   * Reset the streak if the habit was not completed.
   */
  public void expire() {
    if (!hasCompleted) {
      repeats = 0;
    }
  }

  /*
   * Set whether the Habit has been completed or not.
   * @param completed: The desired value of hasCompleted
   */
  public void setHasCompleted(boolean completed) {
    hasCompleted = completed;
  }

  /*
   * Retrieve the value of whether the habit was completed or not.
   * @return True if the habit was completed, false otherwise
   */
  public boolean getHasCompleted() {
    return hasCompleted;
  }

  /*
   * Set the name of the Habit.
   * @param newName: The desired name of the Habit
   */
  public void setName(String newName) {
    name = newName;
  }

  /*
   * Retieve the name of the Habit.
   * @return The name of the Habit
   */
  public String getName() {
    return name;
  }

  /*
   * Retrieve the amount of times that the Habit has been repeated.
   */
  public int getRepeats() {
    return repeats;
  }
}
  
