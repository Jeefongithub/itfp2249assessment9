/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package itfp2249.assessment9;

/**
 *
 * @author jmazzie
 */
public class Assessment9 
{
    public static void main(String[] args) 
    {
        Course course[] = new Course[7];

        for(int i = 0; i < 7; i++)
        {
            course[i] = new Course();
            switch(i) 
            {
                case 0 ->                 
                {
                    course[i].Code("IT1006"); course[i].Hours(6);                
                }
                case 1 ->                 
                {
                    course[i].Code("IT4782"); course[i].Hours(3);                
                }
                case 2 ->                 
                {
                    course[i].Code("IT4789"); course[i].Hours(3);                
                }
                case 3 ->                 
                {
                    course[i].Code("IT4079"); course[i].Hours(6);                
                }
                case 4 ->                 
                {
                    course[i].Code("IT2230"); course[i].Hours(3);                
                }
                case 5 ->                 
                {
                    course[i].Code("IT3345"); course[i].Hours(3);                
                }
                case 6 ->                 
                {
                    course[i].Code("IT2249"); course[i].Hours(6);                
                }
            }
            
            System.out.println("[" + (i+1) +"]" + course[i].CourseNum() + "(" +course[i].courseHours() +")");
        }
    }   
}
class Course 
{
    private String code;
    private int credits;

    public void Code(String codestring) 
    {
        code = codestring;
    }

    public String CourseNum()
    {
        return code;
    }
    
    public void Hours(int hours)
    {
        credits = hours;
    }

    public int courseHours()
    {
        return credits;
    }

}