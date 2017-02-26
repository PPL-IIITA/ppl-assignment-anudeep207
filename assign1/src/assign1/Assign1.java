/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1;

import java.util.*;
import java.io.*;

/**
 *
 * @author Deepu
 */

public class Assign1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.UnsupportedEncodingException
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // TODO code application logic here
        System.out.println("enter # girls");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        File file = new File(System.getProperty("user.dir")+"/input");
        try (PrintWriter pencil = new PrintWriter(file,"UTF-8")) {
            for ( int i = 0; i < n;i++)
            {
                pencil.println("g"+i+" "+Math.abs(r.nextInt()%10)+" "+Math.abs(r.nextInt()%10));
            }
            for(int i = 0; i < 2 * n; i ++)
            {
                pencil.println("b"+i+" "+Math.abs(r.nextInt()%10)+" "+Math.abs(r.nextInt()%10));
            }
            
        }
        sc = new Scanner(file);
        girl[] g = new girl[10];
        boy[] b = new boy[100];
        for(int i=0;i<n;i++) 
        {
            g[i]=new girl();
            g[i].name = sc.next();
            g[i].attraction=sc.nextInt();
            g[i].budget=sc.nextInt();
            
        }
        for(int i=0;i<2*n;i++) 
        {
            b[i]=new boy();
            b[i].name = sc.next();
            b[i].minAttr=sc.nextInt();
            b[i].budget=sc.nextInt();
            
        }
        for(int i=0;i<n;i++) 
        {
            if(g[i].attraction>=b[i].minAttr&&g[i].budget<=b[i].budget) 
            {
                System.out.println(b[i].name+" and "+g[i].name + " are couples");
            }
        }
    }

    
    
}
