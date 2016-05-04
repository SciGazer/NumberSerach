/*
 * The same with NumberSearch
 * Allows the user to enter array of numbers and use a search function
 * The program will print the records and search index
 * Added found numbers 
 */
package NumberSearch2;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class NumberSearch2 {
    public static void main(String[] args) {
        String a=" ",b=" ",c=" ",outnum=" ",outval=" ",outindex=" ";
        int countr,num,a1,i,counter,value,j,flag=0;
        a=JOptionPane.showInputDialog(null, "Enter the number of inputs:");
        a1=Integer.parseInt(a);
        int[] number=new int[a1];
        for(i=0;i<a1;i++)
        {
            countr=i+1;
            b=JOptionPane.showInputDialog(null, "Enter the value of input "+countr+" :");
            number[i]=Integer.parseInt(b);
            outval+=number[i]+"  ";
        }
        c=JOptionPane.showInputDialog(null, "Enter the value of input you want to search:");
        value=Integer.parseInt(c);
        for(j=0;j<number.length;j++)
        {
            if(number[j]==value)
            {
                outnum+=number[j]+"  ";
                outindex+="["+j+"] ";
                flag++;
            }
        }
        if(flag>0)
            JOptionPane.showMessageDialog(null, " Entered number:\n"+outval+
                    "\n Searched number:\n "+value+"\n Found numbers:\n"+outnum+"\n Index of found numbers:\n"+outindex);
         else
            JOptionPane.showMessageDialog(null, "SORRY!");
    }
    
}
