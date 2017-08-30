package com.example.mode;/**
 * 
 * @author TonyC
 * @date 2017/8/24 14:42
 * @version 1.0.0  Person
 * @see TODO: Any other similar class.
 * @email cpy2013@sina.com
 **/
public class Person
{
  private String name;
  private String age;

  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public String getAge()
  {
    return age;
  }
  public void setAge(String age)
  {
    this.age = age;
  }
  @Override public String toString()
  {
    return "Person{" + "name='" + name + '\'' + ", age='" + age + '\'' + '}';
  }
}
