import java.util.*;
import java.time.*;

public class Variavel { // declaração de classe variavel
    public static void main(String[] args) { // declaração do metodo executor main(),ou superclasse
        int minutoAtual = LocalDateTime.now().getMinute();
     // declaração de variavel horaAtual que vai receber o numero inteiro o resutado da chamada do metodo hetHour()
        int segundoAtual = LocalDateTime.now().getSecond();
        System.out.println(horaAtual +":"+ minutoAtual +":"+ segundoAtual);
    } // finalizou metodo executor main()
} // finalizou classe variavel 
