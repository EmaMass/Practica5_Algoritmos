/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uabc.emamass.practica5_algoritmos;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.util.Random;
import java.util.Arrays;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author poppe
 */
public class OrdenamientosGUI extends javax.swing.JFrame {

    static int[] arreglo1 = new int[100];
    static int[] arreglo2 = new int[500];
    static int[] arreglo3 = new int[1000];
    static int[] arreglo4 = new int[1500];
    static int[] arreglo5 = new int[2000];
    static int[] arreglo6 = new int[3000];
    static int[] arreglo7 = new int[4000];
    static int[] arreglo8 = new int[5000];
    static int[] arreglo9 = new int[7000];
    static int[] arreglo10 = new int[10000];
    /**
     * Creates new form OrdenamientosGUI
     */
    public OrdenamientosGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrdenamientosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenamientosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenamientosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenamientosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenamientosGUI().setVisible(true);
                Random rmd = new Random();
                long tiempoInicio = System.nanoTime();
                for(int n = 0; n < arreglo1.length; n++){
                    arreglo1[n] = rmd.nextInt(arreglo1.length);
                }
                for(int n = 0; n < arreglo2.length; n++){
                    arreglo2[n] = rmd.nextInt(arreglo2.length);
                }
                for(int n = 0; n < arreglo3.length; n++){
                    arreglo3[n] = rmd.nextInt(arreglo3.length);
                }
                for(int n = 0; n < arreglo4.length; n++){
                    arreglo4[n] = rmd.nextInt(arreglo4.length);
                }
                for(int n = 0; n < arreglo5.length; n++){
                    arreglo5[n] = rmd.nextInt(arreglo5.length);
                }
                for(int n = 0; n < arreglo6.length; n++){
                    arreglo6[n] = rmd.nextInt(arreglo6.length);
                }
                for(int n = 0; n < arreglo7.length; n++){
                    arreglo7[n] = rmd.nextInt(arreglo7.length);
                }
                for(int n = 0; n < arreglo8.length; n++){
                    arreglo8[n] = rmd.nextInt(arreglo8.length);
                }
                for(int n = 0; n < arreglo9.length; n++){
                    arreglo9[n] = rmd.nextInt(arreglo9.length);
                }
                for(int n = 0; n < arreglo1.length; n++){
                    arreglo10[n] = rmd.nextInt(arreglo10.length);
                }
                long tiempoFin = System.nanoTime();
                long tiempo = tiempoFin - tiempoInicio;
                System.out.println("Tiempo de ejecucion:"+tiempo);
            }
        });
    }
    
    public static void escribirArchivo(String nombreArchivo){
        File file = new File("./"+nombreArchivo);
        try{
            FileWriter outputfile = new FileWriter(file);
            
            CSVWriter writer = new CSVWriter(outputfile);
            /*
            String[] data1 = {"1","100",tiempos[0]+""};
            writer.writeNext(data1);
            String[] data2 = {"2","500",tiempos[1]+""};
            writer.writeNext(data2);
            String[] data3 = {"2","1000",tiempos[2]+""};
            writer.writeNext(data3);
            String[] data4 = {"2","1500",tiempos[3]+""};
            writer.writeNext(data4);
            String[] data5 = {"2","2000",tiempos[4]+""};
            writer.writeNext(data5);
            String[] data6 = {"2","3000",tiempos[5]+""};
            writer.writeNext(data6);
            String[] data7 = {"2","4000",tiempos[6]+""};
            writer.writeNext(data7);
            String[] data8 = {"2","5000",tiempos[7]+""};
            writer.writeNext(data8);
            String[] data9 = {"2","7000",tiempos[8]+""};
            writer.writeNext(data9);
            String[] data10 = {"2","10000",tiempos[9]+""};
            writer.writeNext(data10);
            */ /*
            String[] data = {"1","100","1000"};
            writer.writeNext(data);
            */ //Prueba para escribir archivos 
            writer.close();
        } catch(IOException e){}
    }
    
    public static void leerArchivo(String nombreArchivo){
        try{
            FileReader filereader = new FileReader(nombreArchivo);
            
            CSVReader csvReader = new CSVReader(filereader);
            String[] datos;
            //Lectura de datos / Modificar para guardar datos para graficar 
            while((datos = csvReader.readNext()) != null) { 
            for (String cell : datos) { 
                System.out.print(cell + "\t"); 
            } 
            System.out.println(); 
        } 
        } catch(IOException e){}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
