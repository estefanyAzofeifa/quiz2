/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

import javax.swing.JOptionPane;

/**
 *
 * @author estef
 */
public class Local {

    public int cProducto;
    public String nproducto;
    public int cedulaEmpleado;
    public int cProductoIngresar;
    public int precioProducto;
    public String tipoProductro;
    public int precioBruto;
    public int gananciaEsperada;
//creo el contructor

    public Local(int cProducto, String nproducto, int cedulaEmpleado, int cProductoIngresar, int precioProducto, String tipoProductro, int precioBruto, int gananciaEsperada) {
        this.cProducto = cProducto;
        this.nproducto = nproducto;
        this.cedulaEmpleado = cedulaEmpleado;
        this.cProductoIngresar = cProductoIngresar;
        this.precioProducto = precioProducto;
        this.tipoProductro = tipoProductro;
        this.precioBruto = precioBruto;
        this.gananciaEsperada = gananciaEsperada;
    }
// creo los sett and gett

    public int getcProducto() {
        return cProducto;
    }

    public void setcProducto(int cProducto) {
        this.cProducto = cProducto;
    }

    public String getNproducto() {
        return nproducto;
    }

    public void setNproducto(String nproducto) {
        this.nproducto = nproducto;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public int getcProductoIngresar() {
        return cProductoIngresar;
    }

    public void setcProductoIngresar(int cProductoIngresar) {
        this.cProductoIngresar = cProductoIngresar;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getTipoProductro() {
        return tipoProductro;
    }

    public void setTipoProductro(String tipoProductro) {
        this.tipoProductro = tipoProductro;
    }

    public int getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(int precioBruto) {
        this.precioBruto = precioBruto;
    }

    public int getGananciaEsperada() {
        return gananciaEsperada;
    }

    public void setGananciaEsperada(int gananciaEsperada) {
        this.gananciaEsperada = gananciaEsperada;
    }
//constructor vacio

    public Local() {
    }

    void setcProducto(String cProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
