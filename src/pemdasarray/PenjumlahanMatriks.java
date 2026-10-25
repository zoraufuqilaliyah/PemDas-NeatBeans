/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pemdasarray;
public class PenjumlahanMatriks {

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};   
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = new int[2][2];
        
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int[] baris : c){
            for (int nilai : baris) {
                System.out.print(nilai +" ");
    }
            System.out.println();    
        }
    }   
}