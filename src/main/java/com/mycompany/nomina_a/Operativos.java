/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomina_a;

/**
 *
 * @author juanm
 */
public class Operativos {

  
   
    
    private String Nombre;
    private int SalarioBase;
    private double EPS;
    private double EPS_empleador;
    private double Resultado;
    private double Pension;
    private double Pension_empleador;
    private double Arl;
    private double Prima;
    private double Vacaciones;
    private double Cesantias;
    private double parafiscales;
    private double Intereses_Cesantias;
    private double Auxilio_Transporte;
    private double Salud;
    
    public Operativos(String nombre){
     
        SalarioBase = 1000000;
        Pension = 0.04;
        Pension_empleador = 0.12 ;
        EPS = 0.04;
        EPS_empleador = 0.085;
        Auxilio_Transporte = 117172;
        Salud = 0.04;
        Arl = 0.00522;
        Prima = 0.0833;
        Cesantias = 0.0833;
        Intereses_Cesantias = 0.01;
        Vacaciones = 0.0417;
        this.Nombre = nombre ;
       
    }
    
    public double empleado (){
        double eps_liquidacion = this.SalarioBase * this.EPS;
        double pension_liquidacion = this.SalarioBase * this.Pension;
        
        int eps_liquidacion_a = (int) eps_liquidacion;
        int pension_liquidacion_a = (int) pension_liquidacion;
        
        double salario_pension = this.SalarioBase - pension_liquidacion;
        double salario_eps = this.SalarioBase - eps_liquidacion ;
        
        int salario_pension_a = (int) salario_pension;
        int salario_eps_a = (int) salario_eps;
        
        double salud_descuento = this.SalarioBase * this.Salud;
        double Pago_total = this.SalarioBase - salud_descuento - pension_liquidacion + this.Auxilio_Transporte;
        
        int pago_total_int = (int) Pago_total;
        
        
        String Nombre_empleado = this.Nombre;
        
        System.out.println("\n" + "Nombre de Empleado : " + Nombre_empleado +  "\n");
        System.out.println( "El Salario base de " + Nombre_empleado + " es igual a : " + SalarioBase +"\n");
        
        
        System.out.println( "Total de descuento Empleado - Liquidacion_Eps : " + eps_liquidacion_a);
        System.out.println( "Total de descuento Empleado - Liquidacion_Pension : " + pension_liquidacion_a);
        
        System.out.println("Salario con descuento de Pension : " + salario_pension_a);
        System.out.println( "Salario con descuento de Eps : "  + salario_eps_a + "\n"  );
        
        System.out.println( "Pago total con descuentos : "  + pago_total_int + "\n"  );
        
       
        
        
        return pension_liquidacion;
       
    }
     public double empleador (){
         
        double eps_liquidacion_e = this.SalarioBase * this.EPS_empleador;
        double pension_liquidacion_e = this.SalarioBase * this.Pension_empleador;
        
        int eps_liquidacion_a = (int) eps_liquidacion_e;
        int pension_liquidacion_a = (int) pension_liquidacion_e;
        
        double salario_pension_e = this.SalarioBase - pension_liquidacion_e;
        double salario_eps_e = this.SalarioBase - eps_liquidacion_e ;
        
        int salario_pension_a = (int) salario_pension_e;
        int salario_eps_a = (int) salario_eps_e;
        
        double Pago_pension = this.SalarioBase  * this.Pension_empleador;
        int pago_pension_a = (int) Pago_pension;
       
        double Pago_Eps = this.SalarioBase  * this.EPS_empleador;
        int pago_eps_a = (int) Pago_Eps;
        
        double Pago_Arl = this.SalarioBase  * this.Arl;
        int pago_arl_a = (int) Pago_Arl;
        
        double Pago_prima = this.SalarioBase  * this.Prima;
        int pago_prima_a = (int) Pago_prima;
        
        double Pago_Cesantias = this.SalarioBase  * this.Cesantias;
        int pago_cesantias_a = (int) Pago_Cesantias;
        
        double Intereses_cesantias = this.SalarioBase  * this.Intereses_Cesantias;
        int intereses_cesantias_a = (int) Intereses_cesantias;
        
        double Pago_vacaciones = this.SalarioBase  * this.Vacaciones;
        int pago_vacaciones_a = (int) Pago_vacaciones;
        
        double Pago_parafiscales = this.SalarioBase  * this.parafiscales;
        int pago_parafiscales_a = (int) Pago_parafiscales;
        
        
     
        System.out.println( "Total de descuento Empleador : " + eps_liquidacion_a);
        System.out.println( "Total de descuento Empleador : " + pension_liquidacion_a);
        
        System.out.println("Salario con descuento de Pension Empleador : " + salario_pension_a);
        System.out.println("Salario con descuento de Eps Empleador  : " + salario_eps_a + "\n" );
        
        System.out.println( "valor pagar por el empleador de : " + "\n"  );
        
        System.out.println( "Pension : " + pago_pension_a);
        System.out.println( "Eps : " +  pago_eps_a );
        System.out.println( "Arl : " + pago_arl_a );
        System.out.println( "Prima : " + pago_prima_a );
        System.out.println( "Cesantias : " + pago_cesantias_a);
        System.out.println( "Intereses a la Cesantia : " + intereses_cesantias_a);
        System.out.println( "Vacaciones : " + pago_vacaciones_a );
        System.out.println( "Parafiscales : " + pago_parafiscales_a + "\n" );
            
        
         
        return pension_liquidacion_e;
    }
    
     public Operativos (String nombre, int salariobase, double eps, double pension, double resultado, 
             double arl, double prima, double vacaciones, double cesantias, double parafiscales,
             double intereses_cesantias, double eps_empleador){
       this.Nombre = nombre;
       this.SalarioBase = salariobase;
       this.EPS = eps;
       this.Pension = pension;
       this.Resultado = resultado;
       this.Arl = arl;
       this.Prima = prima;
       this.Vacaciones = vacaciones;
       this.Cesantias = cesantias;
       this.parafiscales = parafiscales;
       this.Intereses_Cesantias = intereses_cesantias;
       this.EPS_empleador = eps_empleador;
       
       
       
   }
     
      public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the SalarioBase
     */
    public int getSalarioBase() {
        return SalarioBase;
    }

    /**
     * @param SalarioBase the SalarioBase to set
     */
    public void setSalarioBase(int SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    /**
     * @return the EPS
     */
    public double getEPS() {
        return EPS;
    }

    /**
     * @param EPS the EPS to set
     */
    public void setEPS(double EPS) {
        this.EPS = EPS;
    }

    /**
     * @return the Pension
     */
    public double getPension() {
        return Pension;
    }

    /**
     * @param Pension the Pension to set
     */
    public void setPension(double Pension) {
        this.Pension = Pension;
    }

    /**
     * @return the Arl
     */
    public double getArl() {
        return Arl;
    }

    /**
     * @param Arl the Arl to set
     */
    public void setArl(double Arl) {
        this.Arl = Arl;
    }

    /**
     * @return the Prima
     */
    public double getPrima() {
        return Prima;
    }

    /**
     * @param Prima the Prima to set
     */
    public void setPrima(double Prima) {
        this.Prima = Prima;
    }

    /**
     * @return the Vacacione
     */
    public double getVacaciones() {
        return Vacaciones;
    }

    /**
     * @param Vacaciones the Vacaciones to set
     */
    public void setVacaciones(double Vacaciones) {
        this.Vacaciones = Vacaciones;
    }

    /**
     * @return the Cesantias
     */
    public double getCesantias() {
        return Cesantias;
    }

    /**
     * @param Cesantias the Cesantias to set
     */
    public void setCesantias(double Cesantias) {
        this.Cesantias = Cesantias;
    }

    /**
     * @return the parafiscales
     */
    public double getParafiscales() {
        return parafiscales;
    }

    /**
     * @param parafiscales the parafiscales to set
     */
    public void setParafiscales(double parafiscales) {
        this.parafiscales = parafiscales;
    }

    /**
     * @return the Intereses_Cesantias
     */
    public double getIntereses_Cesantias() {
        return Intereses_Cesantias;
    }

    /**
     * @param Intereses_Cesantias the Intereses_Cesantias to set
     */
    public void setIntereses_Cesantias(double Intereses_Cesantias) {
        this.Intereses_Cesantias = Intereses_Cesantias;
    }
    
     /**
     * @return the Pension_empleador
     */
    public double getPension_empleador() {
        return Pension_empleador;
    }

    /**
     * @param Pension_empleador the Pension_empleador to set
     */
    public void setPension_empleador(double Pension_empleador) {
        this.Pension_empleador = Pension_empleador;
    }

    /**
     * @return the EPS_empleador
     */
    public double getEPS_empleador() {
        return EPS_empleador;
    }

    /**
     * @param EPS_empleador the EPS_empleador to set
     */
    public void setEPS_empleador(double EPS_empleador) {
        this.EPS_empleador = EPS_empleador;
    }
      /**
     * @return the Auxilio_Transporte
     */
    public double getAuxilio_Transporte() {
        return Auxilio_Transporte;
    }

    /**
     * @param Auxilio_Transporte the Auxilio_Transporte to set
     */
    public void setAuxilio_Transporte(double Auxilio_Transporte) {
        this.Auxilio_Transporte = Auxilio_Transporte;
    }

    /**
     * @return the Salud
     */
    public double getSalud() {
        return Salud;
    }

    /**
     * @param Salud the Salud to set
     */
    public void setSalud(double Salud) {
        this.Salud = Salud;
    }

  
    
   
}
