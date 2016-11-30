/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author enviniom
 */
public class vReserva {
    private int idReserva, idVehiculo, idTrabajador, diai, mesi, anoi, horai, minutoi, diaf, mesf, anof, horaf, minutof, tiempoTotal;
    private Date fechaIngreso, fechaSalida;
    private double valorMin, valorTotal;
    private String EstadoV, placa;

    public vReserva() {
    }

    public vReserva(int idReserva, int idVehiculo, int idTrabajador, int diai, int mesi, int anoi, int horai, int minutoi, int diaf, int mesf, int anof, int horaf, int minutof, int tiempoTotal, Date fechaIngreso, Date fechaSalida, double valorMin, double valorTotal, String EstadoV, String placa) {
        this.idReserva = idReserva;
        this.idVehiculo = idVehiculo;
        this.placa=placa;
        this.idTrabajador = idTrabajador;
        this.diai = diai;
        this.mesi = mesi;
        this.anoi = anoi;
        this.horai = horai;
        this.minutoi = minutoi;
        this.diaf = diaf;
        this.mesf = mesf;
        this.anof = anof;
        this.horaf = horaf;
        this.minutof = minutof;
        this.tiempoTotal = tiempoTotal;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.valorMin = valorMin;
        this.valorTotal = valorTotal;
        this.EstadoV = EstadoV;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public int getDiai() {
        return diai;
    }

    public void setDiai(int diai) {
        this.diai = diai;
    }

    public int getMesi() {
        return mesi;
    }

    public void setMesi(int mesi) {
        this.mesi = mesi;
    }

    public int getAnoi() {
        return anoi;
    }

    public void setAnoi(int anoi) {
        this.anoi = anoi;
    }

    public int getHorai() {
        return horai;
    }

    public void setHorai(int horai) {
        this.horai = horai;
    }

    public int getMinutoi() {
        return minutoi;
    }

    public void setMinutoi(int minutoi) {
        this.minutoi = minutoi;
    }

    public int getDiaf() {
        return diaf;
    }

    public void setDiaf(int diaf) {
        this.diaf = diaf;
    }

    public int getMesf() {
        return mesf;
    }

    public void setMesf(int mesf) {
        this.mesf = mesf;
    }

    public int getAnof() {
        return anof;
    }

    public void setAnof(int anof) {
        this.anof = anof;
    }

    public int getHoraf() {
        return horaf;
    }

    public void setHoraf(int horaf) {
        this.horaf = horaf;
    }

    public int getMinutof() {
        return minutof;
    }

    public void setMinutof(int minutof) {
        this.minutof = minutof;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getValorMin() {
        return valorMin;
    }

    public void setValorMin(double valorMin) {
        this.valorMin = valorMin;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getEstadoV() {
        return EstadoV;
    }

    public void setEstadoV(String EstadoV) {
        this.EstadoV = EstadoV;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
    
}
