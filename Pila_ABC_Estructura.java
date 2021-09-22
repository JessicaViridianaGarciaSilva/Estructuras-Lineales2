package pila_abc_estructura;

import java.util.Scanner;
import java.util.Random;

public class Pila_ABC_Estructura {

    public static void main(String[] args) { //Método
       
        Scanner sc = new Scanner(System.in);
        int tope = 0, opt = 0, tam=26; //Varibles
        char letra; //Variable
        Random r= new Random (); //Variable random
        char[] pila = new char[tam];//Pila
        
        do { //Ciclo do while
        System.out.println("¿Qué deseas realizar?\n"+"1 - Llenar\n"+"2 - Mostrar\n"+ "3 - Eliminar\n" + "4 - Repetidos\n"+ "5 - Salir");
            //Menú de opciones
            switch (opt = sc.nextInt()) { //Condicional de casos switch
                case 1: //Caso 1 LLenar
                    for (int i = 0; i < tam; i++) { //ciclo for para determinar el rango del abecedario 
                         letra = (char)(r.nextInt(26)+'A'); //letra sera igual a letras random a partir de 26
                        if (tope < tam) { //condicional de si tope es menos a tam=26 entonce...
                            pila[tope] = letra; //los valores de la pila seran igual a letra la cual es igual a letras random
                            letra++;//Letra avanzara hasta llegar a tope
                            tope++; //Tope avanzara hasta cumplir con tam
                        } else { System.out.println("Pila llena"); //Si tope es mayor a tam entonces la pila esta llena
                        break; //cierra
                        } 
                    } System.out.println("Datos agregados");//Se manda a decir que los datos han sido agregados
                    break; //Termina caso 1
                    
                case 2: //Caso 2 Mostrar
                    if (tope > 0) { //Si tope es mayor a cero entonces...
                        for (int i = tope - 1; i >= 0; i--) { System.out.println(" " + pila[i]); } //para i tope-1, ira disminuyendo y dejara vacio los lugares y mostrara los valores que se encuentren
                    } else { System.out.println("Pila vacía");} //caso contrario la pila esta vacia
                    break; //Termina caso 2
                case 3: //Caso 3 Eliminar
                    if (tope > 0) { System.out.println("Dato eliminado" + tope); //Si tope es mayor a cero podrá eliminar dato
                        tope--;
                    } else { System.out.println("No hay elementos que eliminar");} //De lo contrario no podra ya que no hay elementos
                    break; //cierra caso 3
                
            case 4://Caso 4 Repetidos 
             
                if (tope>0){ //Si tope es mayor a cero quiere decikr que hay datos que contar
                       int c1 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'A') { c1=c1+1; }  //Para contador=c1=0 si el valor de la pila es igual a A contador uno sumara las veces que se repite la A
                    } if (( c1>2)){System.out.println("La letra: "+'A'+ " se repite "+ c1 + " veces");} //Si c1 es mayor a 2 repeticiones imprimira cuantas veces se repite la letra y así sucedera con las siguientes letras
                    
                       int c2 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'B') { c2=c2+1; }  
                    } if ( c2>2){System.out.println("La letra: "+'B'+ " se repite "+ c2 + " veces"); }
                    
                       int c3 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'C') { c3=c3+1;}  
                    } if ( c3>2){System.out.println("La letra: "+'C'+ " se repite "+ c3 + " veces"); }
                    
                       int c4 = 0;  for (int i=0; i<tam; i++ ){ if (pila[i]== 'D') { c4=c4+1;}  
                    } if ( c4>2){System.out.println("La letra: "+'D'+ " se repite "+ c4 + " veces");} 
                    
                       int c5 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'E') { c5=c5+1; }  
                    } if ( c5>2){System.out.println("La letra: "+'E'+ " se repite "+ c5 + " veces");} 
                    
                       int c6 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'F') { c6=c6+1; }  
                    } if ( c6>2){System.out.println("La letra: "+'F'+ " se repite "+ c6 + " veces");} 
                    
                       int c7 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'G') { c7=c7+1;}  
                    } if ( c7>2){System.out.println("La letra: "+'G'+ " se repite "+ c7 + " veces");} 
                    
                       int c8 = 0;  for (int i=0; i<tam; i++ ){ if (pila[i]== 'H') { c8=c8+1;}  
                    } if ( c8>2){System.out.println("La letra: "+'H'+ " se repite "+ c8 + " veces");}
                    
                       int c9 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'I') { c9=c9+1; }  
                    } if ( c9>2){System.out.println("La letra: "+'I'+ " se repite "+ c9 + " veces");} 
                    
                       int c10 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'J') { c10=c10+1; }  
                    } if ( c10>2){System.out.println("La letra: "+'J'+ " se repite "+ c10 + " veces");}
                    
                       int c11= 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'K') { c11=c11+1;}  
                    } if ( c11>2){System.out.println("La letra: "+'K'+ " se repite "+ c11 + " veces");}
                    
                       int c12= 0;  for (int i=0; i<tam; i++ ){ if (pila[i]== 'L') { c12=c12+1;}  
                    } if ( c12>2){System.out.println("La letra: "+'L'+ " se repite "+ c12 + " veces");} 
                    
                        int c13 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'M') { c13=c13+1; }  
                    } if ( c13>2){System.out.println("La letra: "+'M'+ " se repite "+ c13 + " veces");}
                    
                       int c14 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'N') { c14=c14+1; }  
                    } if ( c14>2){System.out.println("La letra: "+'N'+ " se repite "+ c14 + " veces"); }
                    
                       int c15 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'O') { c15=c15+1;}  
                    } if ( c15>2){System.out.println("La letra: "+'O'+ " se repite "+ c15 + " veces"); }
                    
                       int c16 = 0;  for (int i=0; i<tam; i++ ){ if (pila[i]== 'P') { c16=c16+1;}  
                    } if ( c16>2){System.out.println("La letra: "+'P'+ " se repite "+ c16 + " veces");} 
                    
                       int c17 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'Q') { c17=c17+1; }  
                    } if ( c17>2){System.out.println("La letra: "+'Q'+ " se repite "+ c17 + " veces");} 
                    
                       int c18 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'R') { c18=c18+1; }  
                    } if ( c18>2){System.out.println("La letra: "+'R'+ " se repite "+ c18 + " veces");}
                    
                       int c19 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'S') { c19=c19+1;}  
                    } if ( c19>2){System.out.println("La letra: "+'S'+ " se repite "+ c19 + " veces");}
                    
                       int c20 = 0;  for (int i=0; i<tam; i++ ){ if (pila[i]== 'T') { c20=c20+1;}  
                    } if ( c20>2){System.out.println("La letra: "+'T'+ " se repite "+ c20 + " veces");} 
                    
                       int c21= 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'U') { c21=c21+1; }  
                    } if ( c21>2){System.out.println("La letra: "+'U'+ " se repite "+ c21 + " veces");}
                    
                       int c22 = 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'V') { c22=c22+1; }  
                    } if ( c22>2){System.out.println("La letra: "+'V'+ " se repite "+ c22 + " veces");} 
                    
                       int c23= 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'W') { c23=c23+1;}  
                    } if ( c23>2){System.out.println("La letra: "+'W'+ " se repite "+ c23 + " veces");} 
                    
                       int c24= 0;  for (int i=0; i<tam; i++ ){ if (pila[i]== 'X') { c24=c24+1;}  
                    } if ( c24>2){System.out.println("La letra: "+'X'+ " se repite "+ c24 + " veces");} 
                    
                       int c25= 0; for (int i=0; i<tam; i++ ){ if (pila[i]== 'Y') { c25=c25+1;}  
                    } if (c25>2) {System.out.println("La letra: "+'Y'+ " se repite "+ c25 + " veces");}
                    
                       int c26= 0;  for (int i=0; i<tam; i++ ){ if (pila[i]== 'Z') { c26=c26+1;}  
                    } if (c26>2) {System.out.println("La letra: "+'Z'+ " se repite "+ c26 + " veces");} 
                    
                } else{ //Caso contrario no hay datos que contar 
                    System.out.println("No hay datos"); //Se dira que no hay datos
                } break;  //Cierra caso 4
            } //cierra switch   
        }while( opt != 5); ////Se estará ejecutando mientras opt sea distinto de 5
    } 
} //JESSICA VIRIDIANA GARCIA SILVA 
