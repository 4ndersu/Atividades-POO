package atividade3poo;

public class ConversorTemperatura {
    
    //Atributos da classe ConversorTemperatura
    private double celsius, farenheit, kelvin;

    //Getters e Setters dos atributos
    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(double farenheit) {
        this.farenheit = farenheit;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }
    //Construtor que define as temperaturas em Celsius, Kelvin e Farenheint do objeto
    public ConversorTemperatura(double celsius, double farenheit, double kelvin) {
    this.setCelsius(celsius);
    this.setFarenheit(farenheit);
    this.setKelvin(kelvin);
    }

    //Função para converter Kelvin em Celsius
    public void KelvinPCel(double graus){
        double resultado=0;
        resultado=graus-273.15;
        System.out.println(graus + " graus K é " + resultado + " em Celsius");
    }

    //Função para converter Celsius em Kelvin
    public void CelsiusPKel(double graus){
        double resultado=0;
        resultado=graus+273.15;
        System.out.println(graus + " graus C é " + resultado + " em Kelvin");
    }

    //Função para converter Celsius em Farenheint
    public void CelsiusPFar(double graus){
        double resultado=0;
        resultado=(graus*1.8)+32;
        System.out.println(graus + " graus C é " + resultado + " em Farenheit");
    }
    //Função para converter Farenheint em Celsius
    public void FarenPCel(double graus){
        double resultado=0;
        resultado=((graus-32)/1.8);
        System.out.println(graus + " graus F é " + resultado + " em Celsius");
    }

    //Função para converter Farenheint em Kelvin
    public void FarenPKel(double graus){
        double resultado=0;
        resultado=(graus-32)*(0.55555555556)+273.15;
        System.out.println(graus + " graus F é " + resultado + " em Kelvin");
    }

    //Função para converter Kelvin em Farenheint
    public void KelPFaren(double graus){
        double resultado=0;
        resultado=(graus-273.15)*(1.8)+32;
        System.out.println(graus + " graus K é " + resultado + " em Farenheit");
    }
}
