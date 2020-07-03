package seleniumPrograms;

import org.testng.annotations.Test;
public class TestNGPriority {
 @Test (priority = 1)
 public void b_method() {
 
 System.out.println("This is B method");
 
 }
 @Test (priority = -1)
 public void x_method() {
 
 System.out.println("This is x method");
 
 }
 @Test (priority = -50)
 public void z_method() {
 
 System.out.println("This is z method");
 
 }
 @Test (priority = 0)
 public void t_method() {
 
 System.out.println("This is y method");
 
 }
 
 @Test (priority = 1)
 public void a_method() {
 
 System.out.println("This is A method");
 
 }
 
 @Test
 public void d_method() {
 System.out.println("This is D Method");
 }
 
 @Test
 public void c_method() {
 System.out.println("This is C Method");
 }
 }