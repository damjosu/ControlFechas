import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/**
 *
 * @author Admin
 */
public class ControlFechas {

    public ControlFechas() {}

    public static String getFechaActual() {
        Calendar currentDate = Calendar.getInstance();             
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        String formatted = format1.format(currentDate.getTime());   
        return formatted;
    }

    public static int getEdad(int year, int month, int day) {
        Calendar currentDate = Calendar.getInstance(); 
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(year, (month - 1), day);
        int age = currentDate.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        return age;
    }

    public static int getEdad(Calendar fechaNac) {
        Calendar currentDate = Calendar.getInstance(); 
        int age = currentDate.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        return age;
    }

    public static long[] getTiempoTanscurrido(int year, int month, int day) {
        Calendar currentDate = Calendar.getInstance(); 
        Calendar date = Calendar.getInstance();
        date.set(year, (month - 1), day);
        long tiempoTranscurrido[] = new long[8];
        tiempoTranscurrido[0] = Math.abs(date.getTimeInMillis() - currentDate.getTimeInMillis());   //  Milisegundos.
        tiempoTranscurrido[1] = tiempoTranscurrido[0] / 1000;   //  Segundos.
        tiempoTranscurrido[2] = tiempoTranscurrido[1] / 60;   //  Minutos.        
        tiempoTranscurrido[3] = tiempoTranscurrido[2] / 60;  //  Horas.
        tiempoTranscurrido[4] = tiempoTranscurrido[3] / 24;   //  Días.
        tiempoTranscurrido[5] = tiempoTranscurrido[4] / 4;   //  Semanas.        
        tiempoTranscurrido[6] = tiempoTranscurrido[4] / 30;   //  Meses.
        tiempoTranscurrido[7] = tiempoTranscurrido[6] / 12; //  Años.
        return tiempoTranscurrido;      
    }

    public static long[] getTiempoTanscurridoDias(Calendar fecha) {
        Calendar currentDate = Calendar.getInstance(); 
        long tiempoTranscurrido[] = new long[8]; 
        tiempoTranscurrido[0] = Math.abs(fecha.getTimeInMillis() - currentDate.getTimeInMillis());   //  Milisegundos.
        tiempoTranscurrido[1] = tiempoTranscurrido[0] / 1000;   //  Segundos.
        tiempoTranscurrido[2] = tiempoTranscurrido[1] / 60;   //  Minutos.        
        tiempoTranscurrido[3] = tiempoTranscurrido[2] / 60;  //  Horas.
        tiempoTranscurrido[4] = tiempoTranscurrido[3] / 24;   //  Días.
        tiempoTranscurrido[5] = tiempoTranscurrido[4] / 4;   //  Semanas.        
        tiempoTranscurrido[6] = tiempoTranscurrido[4] / 30;   //  Meses.
        tiempoTranscurrido[7] = tiempoTranscurrido[6] / 12; //  Años.
        return tiempoTranscurrido;   
    }

    public static long[] getTiempoTanscurrido(int year1, int month1, int day1, int year2, int month2, int day2) {
        Calendar date1 = Calendar.getInstance(); 
        Calendar date2 = Calendar.getInstance();
        date1.set(year1, (month1 - 1), day1);
        date2.set(year2, (month2 - 1), day2);
        long tiempoTranscurrido[] = new long[8];
        tiempoTranscurrido[0] = Math.abs(date2.getTimeInMillis() - date1.getTimeInMillis());   //  Milisegundos.
        tiempoTranscurrido[1] = tiempoTranscurrido[0] / 1000;   //  Segundos.
        tiempoTranscurrido[2] = tiempoTranscurrido[1] / 60;   //  Minutos.        
        tiempoTranscurrido[3] = tiempoTranscurrido[2] / 60;  //  Horas.
        tiempoTranscurrido[4] = tiempoTranscurrido[3] / 24;   //  Días.
        tiempoTranscurrido[5] = tiempoTranscurrido[4] / 4;   //  Semanas.        
        tiempoTranscurrido[6] = tiempoTranscurrido[4] / 30;   //  Meses.
        tiempoTranscurrido[7] = tiempoTranscurrido[6] / 12; //  Años.
        return tiempoTranscurrido;      
    }

    public static long[] getTiempoTanscurridoDias(Calendar fecha1, Calendar fecha2) {
        long tiempoTranscurrido[] = new long[8]; 
        tiempoTranscurrido[0] = Math.abs(fecha2.getTimeInMillis() - fecha1.getTimeInMillis());   //  Milisegundos.
        tiempoTranscurrido[1] = tiempoTranscurrido[0] / 1000;   //  Segundos.
        tiempoTranscurrido[2] = tiempoTranscurrido[1] / 60;   //  Minutos.        
        tiempoTranscurrido[3] = tiempoTranscurrido[2] / 60;  //  Horas.
        tiempoTranscurrido[4] = tiempoTranscurrido[3] / 24;   //  Días.
        tiempoTranscurrido[5] = tiempoTranscurrido[4] / 4;   //  Semanas.        
        tiempoTranscurrido[6] = tiempoTranscurrido[4] / 30;   //  Meses.
        tiempoTranscurrido[7] = tiempoTranscurrido[6] / 12; //  Años.
        return tiempoTranscurrido;   
    }

    public static long[] getTiempoTanscurridoDias(Calendar fecha, int year, int month, int day) {
        Calendar date = Calendar.getInstance();
        date.set(year, (month - 1), day);
        long tiempoTranscurrido[] = new long[8];        
        tiempoTranscurrido[0] = Math.abs(fecha.getTimeInMillis() - date.getTimeInMillis());   //  Milisegundos.
        tiempoTranscurrido[1] = tiempoTranscurrido[0] / 1000;   //  Segundos.
        tiempoTranscurrido[2] = tiempoTranscurrido[1] / 60;   //  Minutos.        
        tiempoTranscurrido[3] = tiempoTranscurrido[2] / 60;  //  Horas.
        tiempoTranscurrido[4] = tiempoTranscurrido[3] / 24;   //  Días.
        tiempoTranscurrido[5] = tiempoTranscurrido[4] / 4;   //  Semanas.        
        tiempoTranscurrido[6] = tiempoTranscurrido[4] / 30;   //  Meses.
        tiempoTranscurrido[7] = tiempoTranscurrido[6] / 12; //  Años.
        return tiempoTranscurrido;   
    }
    
    public static boolean fechaValida(String fecha) {
        boolean validDate = true;
        String date[] = new String[2];
        date = fecha.split("/");
        try {
            int day = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int year = Integer.parseInt(date[2]);
            if (year < 0 || month <= 0 || month > 12 || day <= 0 || day > 31) {
                validDate = false;
            }
        } catch (NumberFormatException e) {
            validDate = false;
        }
        return validDate;
    }
    
    public static int[] desglosarFecha(String fecha) {
        int fechaDesglosada[] = null;
        if (fechaValida(fecha)) {
            String date[] = new String[2];
            date = fecha.split("/");
            int day = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int year = Integer.parseInt(date[2]);
            fechaDesglosada = new int[3];
            fechaDesglosada[0] = year;
            fechaDesglosada[1] = month;
            fechaDesglosada[2] = day;
        }
        return fechaDesglosada;
    }    
}
