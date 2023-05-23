package vvt.exercicio;

import java.util.*;

public class Cal { 
    static String dayOfWeek   = "Do Se Te Qa Qi Se Sa";
    static String monthName[] = new String[] {
        "Janeiro", "Fevereiro", "Março", "Abril",
        "Maio", "Junho", "Julho", "Agosto",
        "Setembro", "Outubro", "Novembro", "Dezembro",
    };

    /**
     * Esse é o método principal do programa. Podem ser recebidos 0, 1 ou 2 parâmetros
     * por meio do argumento argv. Se mais do que 2 parâmetros forem fornecidos, os
     * excedentes são simplesmente ignorados
     * @param argv : se argv.length == 0 então o programa deve mostrar o calendário 
     * do mês corrente. Se um parâmetro apenas for fornecido, então ele representa
     * um ano e então todos os meses daquele ano devem ser mostrados. Se dois parâmetros 
     * forem fornecidos o primeiro representa o mês e o segundo representa o ano. Então
     * apenas aquele mês deve ser exibido. Valores válidos para o mês são 1 a 12. Para
     * o ano, 1 a 9999. 
     * Se valores inválidos forem fornecidos, o programa irá exibir uma mensagem de 
     * erro dizendo que o mês ou o ano é inválido. 
     *  
     */
    public static void main(String[] argv) {
        int year = 0;
        int month = 0;
        int argc = argv.length;

        Cal myCal = new Cal();
        if(argc >= 2 || argc == 0) {
            /*
            * print out just month
            */
            if(argc == 0) {      /* current month */
                Calendar cl = Calendar.getInstance();
                month = cl.get(Calendar.MONTH) + 1;
                year = cl.get(Calendar.YEAR);
            } else {
                try { month = Integer.parseInt(argv[0]); }
                catch (Exception e) { ; }
                if(month < 1 || month > 12) {
                    System.err.printf("Cal: %s: mes invalido.\n", argv[0]);
                    return;
                }
                try { year = Integer.parseInt(argv[1]); }
                catch (Exception e) { ; }
                if(year < 1 || year > 9999) {
                    System.err.printf("Cal: %s: ano invalido.\n", argv[1]);
                    return;
                }
            }
            System.out.printf("   %s %d\n", monthName[month - 1], year);
            System.out.printf("%s\n", dayOfWeek);
            String s = myCal.cal(myCal.firstOfMonth(month, year), myCal.numberOfDays(month, year));
            System.out.println(s);
        } else {
            /*
            * print out complete year
            */
            try { year = Integer.parseInt(argv[0]); }
            catch (Exception e)
            { ; }
            if(year < 1 || year > 9999) {
                System.err.printf("Cal: %s: ano invalido.\n", argv[0]);
                return;
            }
            for (int zi = 1; zi < 13; zi++) {
                System.out.printf("   %s %d\n", monthName[zi-1], year);
                System.out.printf("%s\n", dayOfWeek);
                String s = myCal.cal(myCal.firstOfMonth(zi,year),myCal.numberOfDays(zi,year) );
                System.out.println(s);
                System.out.println();
            }
        }
    }

    static int  mon[] = {
    0,
    31, 28, 31, 30,
    31, 30, 31, 31,
    30, 31, 30, 31,
    };

    /**
     * Esse método computa qual é o dia da semana correspondente
     * ao primeiro dia de um determinado mês.
     * @param month: o mês do ano
     * 
     * @param year: o ano 
     * @return: Um valor entre 0 e 6 que corresponde ao dia da semana que 
     * cai o dia 1/m/a
     */
    int firstOfMonth(int month, int year) {
        int dayOfWeek = 0;
        if (isLeap(year) && month > 2) dayOfWeek++;
        for (int i = 0; i < month; i++) dayOfWeek += mon[i];
        if ( year == 1752 && month > 9 ) dayOfWeek -= 11;
        dayOfWeek %= 7;
        dayOfWeek = (dayOfWeek + jan1(year)) % 7;
        return dayOfWeek;
    }

    /**
     * Computa o número de dias de um determinado mês/ano
     * @param month: O mês
     * @param year: O ano
     * @return: O número de dias do mes m no ano a.
     */
    int numberOfDays(int month, int year)
    {
        if (isLeap(year) && month == 2) return 29;
        if (year == 1752 && month == 9) return 19;
        return mon[month];
    }

    /**
     * Verifica se um determinado ano é bisexto
     * @param year: O ano.
     * @return: Verdadeiro se o ano for bissexto e falso caso contrário.
     */
    boolean isLeap(int year) {
        if ( year <= 1752 ) {
            if ( year % 4 == 0 ) return true;
            else return false;
        } else {
            if ( year % 400 == 0 ) return true;
            if ( year % 100 == 0 ) return false;
            if ( year % 4 == 0 ) return true;
        }
        return false;
    }

    /**
     * Computa um string que representa o calendário de um determinado mês
     * 
     * @param dayOfWeek: Esse parâmetro indica em que dia da semana cai o dia 1 do mês
     * cujo calendário se quer calcular. Deve ser uma valor entre 0 e 6.
     * @param totalDaysInTheMonth: Indica quantos dias tem o mês. Pode ser um valor entre 28 e 31
     * ou o valor 19, que indica se tratar do mês de setembro de 1752, quando
     * considera-se a mudança do calendário Juliano/Gregoriano. 
     * 
     * @return: o string correspondente ao calendário de um determinado mês
     */
    String cal(int dayOfWeek, int totalDaysInTheMonth) {
        if ( totalDaysInTheMonth == 19 ) return "       1  2 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30";
        String monthCalendar = "";
        for (int k = 0; k < dayOfWeek; k++) monthCalendar += "   ";
        int cont = dayOfWeek + 1;
        for (int k = 1; k <= totalDaysInTheMonth; k++, cont++) {
            if ( k < 10 ) monthCalendar += " ";
            monthCalendar += k;
            if ( cont % 7 == 0) monthCalendar += "\n";
            else monthCalendar += " ";
        }
        return monthCalendar;
    }

    /**
     * Computa o dia da semana do primeiro dia do ano.
     * @param year: o ano que se deseja computar o dia da semana.
     * @return: um valor entre 0 e 6 que indica o dia da semana do primeirio
     * dia do ano.
     */
    int jan1(int year) {
        /*
        *  normal gregorian calendar
        *  one extra day per four years
        */
        int d = 4 + year + (year + 3) / 4;

        /*
        *  julian calendar
        *  regular gregorian
        *  less three days per 400
        */
        if(year > 1800) {
            d -= (year-1701)/100;
            d += (year-1601)/400;
        }

        /*
        *  great calendar changeover instant
        */
        if(year > 1752)
            d += 3;
        return(d%7);
    }
}