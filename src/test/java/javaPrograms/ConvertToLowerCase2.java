package javaPrograms;

public    class ConvertToLowerCase2{
    public static void main(String []args){
        String s1 = "Interview QUESTIONS";
        String s2="java";
        String newString = s1.toLowerCase();
        System.out.println("Old String: " + s1);
        System.out.println("New String: " + newString);
       // System.out.println(s1.toLowerCase());
        System.out.println(s1.length());
        System.out.println(s1+" "+s2);
        System.out.println(s1.replace("Interview", "mohit"));
        
    }
}