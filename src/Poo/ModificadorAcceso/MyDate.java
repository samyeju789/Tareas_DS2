package Poo.ModificadorAcceso;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String rellenarCeros (int value ){

        if (value < 10){
            return "0" +value;
        }
        return String.valueOf(value);
    }

    public String imprimirFecha() {
        String errores = "";

        if (day > 31 || day <= 0) {
            errores += "dia incorrecto. ";
        }
        if (month > 12 || month <= 0) {
            errores += "mes inexistente. ";
        }
        if (this.year <= 0) {
            errores += "year incorrecto. ";
        }

        if (!errores.isEmpty()) {
            return errores.trim();
        }
        String day = rellenarCeros(this.day);
        String month = rellenarCeros(this.month);

        return day + "/" + month + "/" + this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
