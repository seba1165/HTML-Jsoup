/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebahtml;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import java.io.*;

/**
 *
 * @author Seba
 */
public class PruebaHTML {
    static String htmlLocation = "C:\\Users\\Seba\\Documents\\NetBeansProjects\\PruebaHTML\\";               
    static String fileName = "NotificacionFactura.html";                            // Just for demonstration, easily modified.
    static String img = "https://www.dropbox.com/s/74thrmfwox1ssyk/Logo_ServiVentas2.png?raw=1";
    static String nombre = "Sebastián Calderón";
    static String encabezado = "<th style='border: 1px solid #000000' scope=\"col\">Fecha</th>\n" +
"                            <th style='border: 1px solid #000000' scope=\"col\">Vehículo</th>\n" +
"                            <th style='border: 1px solid #000000' scope=\"col\">Categoria</th>\n" +
"                            <th style='border: 1px solid #000000' scope=\"col\">Producto</th>\n" +
"                            <th style='border: 1px solid #000000' scope=\"col\">Factura</th>";
    static String contenido ="<td style='border: 1px solid #000000'>asd</td>\n" +
"                            <td style='border: 1px solid #000000'>asd</td>\n" +
"                            <td style='border: 1px solid #000000'>asd</td>\n" +
"                            <td style='border: 1px solid #000000'>asd</td>\n" +
"                            <td style='border: 1px solid #000000'>asd</td>";
    static String imgServicio="https://www.dropbox.com/s/74thrmfwox1ssyk/Logo_ServiVentas2.png?raw=1";
    static String web="https://capno.cl/ServiVentas-web";
    static String direccion="San Pablo 9507, Pudahuel, Santiago,";
    static String telefono="(562) 6438-799";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File input = new File(htmlLocation+fileName);
        Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
        
        Element content = doc.getElementById("imgdb");
        content.attr("src", img);
        content = doc.getElementById("titulo");
        content.text("Factura");
        content = doc.getElementById("saludo");
        content.text("Estimado "+nombre+":");
        content = doc.getElementById("mensaje");
        content.text("Se ha creado la factura (Adjunta en este correo) al siguiente servicio:");
        content = doc.getElementById("subtitulo");
        content.text("Servicios");
        content = doc.getElementById("encabezadoTabla");
        content.append(encabezado);
        content = doc.getElementById("contenidoTabla");
        content.append(contenido);
        content = doc.getElementById("imagenServicio");
        content.attr("src", imgServicio);
        content = doc.getElementById("botonAcceder");
        content.attr("href", web);
        content = doc.getElementById("direccion");
        content.text(direccion);
        content = doc.getElementById("telefono");
        content.text(telefono);
        System.out.println(doc.html());
    }
    
}
