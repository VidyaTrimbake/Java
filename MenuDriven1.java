 import java.util.Scanner;
 public class MenuDriven1
 {
 public static void main(String argvs[])
 {
         int ichoise = 0;  
         double dArea = 0.0; 
         int ilength = 0,ibreadth = 0, iheight = 0;
         int idiagonal1 = 0,diagonal2 = 0;
         int iSide = 0;
         int iRadius = 0;
         Scanner sc = new Scanner(System.in); // creating object of Scanner class
          // displaying the menu
          System.out.println("1: Right Angle Triangle");
          System.out.println("2: Area of Equilateral Triangle");
          System.out.println("3: Area of Square");
          System.out.println("4: Area of Rectangle");
          System.out.println("5: Area of Circle");
          System.out.println("6: Area of Rhombus");
          System.out.println("7: Program termination");

         while(true) // labeling the while loop
         {
             System.out.print("Make your choice: ");  
             ichoise = sc.nextInt(); // reading user's choice
              switch (ichoise)
              {
                case 1: // for Right Angled Triangle
                      System.out.print("Enter the height of Right Angle Triangle \n");
                      iheight = sc.nextInt();
                      System.out.print("Enter the base of Right Angle Triangle \n");
                      ibreadth = sc.nextInt();
                      dArea = (iheight * ibreadth)/2;
                      System.out.println("Area of the Right Angle Triangle is " + dArea + "\n\n");
                      break;

                case 2:               
                      System.out.print("Enter the side of an Equilateral Triangle \n");
                      iSide = sc.nextInt();
                      dArea=(iSide * iSide * Math.sqrt(3)) / 4;
                      System.out.println("Area of the Equilateral Triangle is " + dArea + "\n\n");
                      break;

                case 3:
                      System.out.print("Enter the side of a Square \n");
                      iSide = sc.nextInt();
                      dArea = iSide * iSide;
                      System.out.println("Area of the Square is "+ dArea + "\n\n");
                      break;

                case 4:
                      System.out.print("Enter the length of a Rectangle \n");
                      ilength = sc.nextInt();
                      System.out.print("Enter the breadth of the Rectangle \n");
                      ibreadth = sc.nextInt();
                      dArea = ilength * ibreadth;
                      System.out.println("Area of the Rectangle is " + dArea + "\n\n");
                      break;

                case 5:
                      System.out.print("Enter the radius of a Circle \n");
                      iRadius = sc.nextInt();
                      dArea = iRadius * iRadius * 22 / 7;
                      System.out.println("Area of the Circle is " + dArea + "\n\n");
                      break;

                case 6:
                      System.out.print("Enter the first diagonal of a Rhombus \n");
                      idiagonal1 = sc.nextInt();
                      System.out.print("Enter the second diagonal of the Rhombus \n");
                      diagonal2 = sc.nextInt();
                      dArea = idiagonal1 * diagonal2 * 1 / 2;
                      System.out.println("Area of the Rhombus is " + dArea + "\n\n");
                      break;

                case 7:
                 // exiting from the switch-case as well as from the while loop using its label lp
                      break;     
                default:
                 System.out.println("Invalid choice! Please make a valid choice. \n\n");
               }
             }
 }
 } 
