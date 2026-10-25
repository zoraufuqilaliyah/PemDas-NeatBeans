/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemdasarray;
public class ArrayMultidimensi {
    
    public static void main (String[]args){
        String[][][] dataMahasiswa = new String [3][3][5];
        
        String[][][]data = {
            {
                {"zara", "zare", "zaro", "zora", "zore"},
                {"rara", "rare", "riri", "arra", "rere"},
                {"tia", "tio", "tina", "tani", "tono"},
            },
            {
                {"tika", "fika", "tara", "tira", "lala"},
                {"lili", "lele", "lila", "laili", "laila"},
                {"tasya", "lisa", "lita", "dina", "dini"}
            },
            {
                {"ara", "gali", "lia", "laili", "teno"},
                {"tania", "tila", "tita", "tati", "tata"},
                {"asa", "ilya", "athi", "thela", "fani"}
            }
        };
            for(int i = 0; i < 3; i++){
                System.out.println("Prodi" +(i+1));
                for(int j = 0; j < 3; j++){
                System.out.print("kelas " +(j+1)+" ");
                    for(int k=0; k < 5; k++){
                        System.out.print(data[i][j][k] +" ");
                    }
                    System.out.println();
            }
        }
    }
}