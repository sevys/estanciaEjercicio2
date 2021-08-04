package sample;


import java.io.*;

public class Main {


    public static void main(String [] args) {
        String csvFile = "categoria.csv";
        BufferedReader br = null;
        String line = "";
//Se define separador ","
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                int aux = 0;
                String[] datos = line.split(cvsSplitBy);
                //Imprime datos.
                for(int i = 0; i< datos.length; i++){
                    if (datos[i].equals("NULL")){
                        //System.out.println(datos[i]);
                        i= datos.length+2;
                    }
                    aux++;
                }
                if (aux == datos.length){
                    System.out.println("+------+------+------+------+");
                    for (int l = 0; l< datos.length; l++){
                        System.out.print("|  "+datos[l]+"  ");
                    }
                    System.out.println("");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}