/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasbancarias;

/**
 *
 * @author cata7
 */
class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private String representante;

    public Cliente(String nombre, String apellido, int edad, String representante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.representante = representante;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public boolean esMenorDeEdad() {
        return edad < 18;
    }
}