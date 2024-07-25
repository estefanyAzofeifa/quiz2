/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

import javax.swing.JOptionPane;

/**
 *
 * @author estef
 */
public class Quiz2 {

    /**
     * public int cProducto; public String nproducto; public String
     * cedulaEmpleado; public int cProductoIngresar; public int precioProducto;
     * public String tipoProductro; public int precioBruto; public int
     * gananciaEsperada;
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//hago los metodos
//for para que se corra las vaces necesarias
        int x;
        int Local = 0;
        for (x = Local; x < 3; x++) {
            Local local = new Local();
            local.getClass();

            int cProducto = Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo de su producto"));
            local.setcProducto(cProducto);

            String nProducto = JOptionPane.showInputDialog("ingrese en nombre del producto");
            local.setNproducto(nProducto);

            int cedulaEmpleado = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cedula"));
            local.setCedulaEmpleado(cedulaEmpleado);

            int precioProducto = Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio del producto"));
            local.setPrecioProducto(precioProducto);

            String tipoProductro = JOptionPane.showInputDialog("ingrese en tipo del producto: " + " bebida,alimento,higiene,limpieza");
            local.setTipoProductro(tipoProductro);
            
          //  String bebida;
          //  bebida= "";
          //  if ( precioProducto >= "bebida"){
                
             System.out.println("codigo " + cProducto+ "cedula" +cedulaEmpleado + " nombre " + nProducto + " precio "   + precioProducto+ " tipo producto" + tipoProductro);
                
            }
                
            }
      


  
            
        }
    

    
