/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.practica5_algoritmos;
import au.com.bytecode.opencsv.CSVReader;
import java.io.*;
import java.awt.Color; 
import java.awt.BasicStroke; 
import org.jfree.chart.*;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.xy.XYDataset; 
import org.jfree.data.xy.XYSeries; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 
import org.jfree.chart.plot.XYPlot; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.xy.XYSeriesCollection; 
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author poppe
 */
public class Graficar extends ApplicationFrame{
    
     public Graficar(String applicationTitle, String chartTitle, List<String> archivos) throws IOException {
      super(applicationTitle);
      JFreeChart xylineChart = ChartFactory.createXYLineChart(
         chartTitle,
         "Tamaño del arreglo",
         "Tiempo (Nanosegundos)",
         createDataset(archivos),
         PlotOrientation.VERTICAL,
         true ,true ,false);
         
      ChartPanel chartPanel = new ChartPanel(xylineChart);
      chartPanel.setPreferredSize(new java.awt.Dimension(560 ,367));
      final XYPlot plot = xylineChart.getXYPlot();
      
      XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
      renderer.setSeriesPaint(0 ,Color.RED );
      renderer.setSeriesPaint(1 ,Color.GREEN );
      renderer.setSeriesPaint(2 ,Color.YELLOW );
      renderer.setSeriesStroke(0 ,new BasicStroke( 4.0f ));
      renderer.setSeriesStroke(1 ,new BasicStroke( 3.0f ));
      renderer.setSeriesStroke(2 ,new BasicStroke( 2.0f ));
      plot.setRenderer(renderer); 
      setContentPane(chartPanel); 
      File XYChart = new File("XYChartOrdenamientos.jpeg");
      ChartUtilities.saveChartAsJPEG(XYChart,xylineChart,560,367);
      
      pack();          
      RefineryUtilities.centerFrameOnScreen(Graficar.this);          
      setVisible(true); 
   }
   
   private XYDataset createDataset(List<String> archivos) {
      List<XYSeries> listaGrafica = new ArrayList<XYSeries>();
      final XYSeriesCollection dataset = new XYSeriesCollection();
      int contador = 0;
         for(String archivo : archivos){
             listaGrafica.add(leerArchivo(archivo));
             dataset.addSeries(listaGrafica.get(contador));
             contador++;
         }
      
      return dataset;
   }

   public void graficar() throws IOException {}
   
   public long sumatoria0aN(long n){
        long sumatoria = 0;
        for(int i = 0; i <= n; i++){
            sumatoria += i;
        }
        return sumatoria; 
    }
   
   public long sumatoriaGauss(long n){
       return (n*(n+1))/2;
   }
   
   public long sumatoriaRecursiva(long n, long i){
       if(n == i){
           return i;
       } else{
           return i + sumatoriaRecursiva(n,i+1);
       }
   }
   
   public XYSeries leerArchivo(String nombreArchivo){
       XYSeries linea = new XYSeries(nombreArchivo); 
       try{
            FileReader filereader = new FileReader(nombreArchivo);
            
            CSVReader csvReader = new CSVReader(filereader);
            String[] datos;
            List<String> contenido = new ArrayList<>();
            //Lectura de datos / Modificar para guardar datos para graficar 
            while((datos = csvReader.readNext()) != null) { 
                for (String cell : datos) { 
                    contenido.add(cell);
                } 
            }
            int cont = 1;
            String contador = String.valueOf(cont);
            for(int i = 0; i < contenido.size(); i++){
                if(contenido.get(i).compareTo(contador) == 0){
                    linea.add(Integer.valueOf(contenido.get(i)), Integer.valueOf(contenido.get(i+2)));
                    cont++;
                    contador = String.valueOf(cont);
                }
            }
        } catch(IOException e){}
        return linea;
   }
}
