/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author mpupe
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
        System.out.println("0- pabaiga");
        System.out.println("1-akmuo");
        System.out.println("2-popierius");
        System.out.println("3-zirkles");
        double inf = Double.POSITIVE_INFINITY;
        int kompoTaskai=0;
        int tavoTaskai = 0;

        
    for(int i=0; i<inf; i++){
        int pasirinkimas = sc.nextInt(); 
        if(pasirinkimas == 0){
            System.out.println("Zaidimo pabaiga");
            break;
        }
        else if(pasirinkimas>3){
            System.out.println("Netinkamas skaicius");
        }else{
        double kp =Math.random()*3+1;
        int kps=(int)kp;
        
        System.out.println(kps);
        System.out.println("Kompo pasirinkimas:"+kps);
        System.out.print("Migles pasirinkimas: ");
        System.out.println(pasirinkimas);
            
         if((pasirinkimas == 1 && kps == 1)|| (kps == 1 && pasirinkimas == 1)){
        }if(pasirinkimas == 1 && kps ==2){
            kompoTaskai++;
        }if(pasirinkimas ==1 && kps ==3){
            tavoTaskai++;  
        }if((pasirinkimas==2 && kps ==2)||(kps==2 && pasirinkimas ==2)){   
        }if(pasirinkimas ==2 && kps ==1){
            tavoTaskai++;
        }if(pasirinkimas ==2 && kps ==3){
            kompoTaskai++;
        }if((pasirinkimas ==3 && kps==3)||(kps ==3 && pasirinkimas==3)){   
        }if(pasirinkimas ==3 && kps==1){
            kompoTaskai++;    
        }if(pasirinkimas ==3 && kps==2){
            tavoTaskai++;   
        }
            }
                }
        //laimetojas
        if(kompoTaskai >tavoTaskai){
            System.out.println("Kompas laimejo");
        }else if(tavoTaskai >kompoTaskai){
            System.out.println("Tu laimejai");
        }else{
            System.out.println("Lygiosios!");
            }   
        System.out.println(tavoTaskai+":"+kompoTaskai);
    }
}




    

