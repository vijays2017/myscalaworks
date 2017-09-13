package com.tests
import scala.beans.BeanProperty;
/*
 * https://resources.oreilly.com/examples/0636920043386/blob/master/Beginning%20Scala%20Programming%20-%20Working%20Files/Chapter%205/Models.scala
 * */
abstract class Person {
  def firstName : String
  def lastName : String
  
}

class Employee (@BeanProperty val  firstName : String,
                      @BeanProperty val lastName : String, 
                       val title : String = "Programmer") extends Person
  {
  
  require (firstName.nonEmpty , "First name is required ")
  require (lastName.nonEmpty, "last name is required ")
  require (title.nonEmpty, "title is required ")

  
//  def this (firstName : String,   lastName : String ) = this (firstName, lastName, "Programmer")

  def fullName = s"$firstName $lastName"
  
  def copy (firstName : String = this.firstName, 
                            lastName : String = this.lastName, 
                            title : String = this.title ) = new Employee (firstName, lastName, title)
 
  override def toString() = s"$firstName $lastName"
  
  }


class Department (val name : String )

class Manager (firstName : String , lastName : String , title : String,  val department : Department) 
        extends Employee (firstName , lastName, title){
  
  
  override def fullName = s"$firstName $lastName ${department.name} Manager" 
  
  override def copy (firstName : String = this.firstName, 
                            lastName : String = this.lastName, 
                            title : String = this.title ) = new Employee (firstName, lastName, title)
}
