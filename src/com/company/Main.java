package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

class GerenciarControlePonto {

    public static void main(String[] args) {
        // write your code here
        Gerente gerente = new Gerente();
        gerente.setLogin("gerente");
        gerente.setSenha("123");
        gerente.setDocumento("374915468");
        gerente.setEmail("gerente@chato.com");
        gerente.setIdFunc(13);
        gerente.setNome("João Augusto");

        Secretaria secretaria = new Secretaria();
        secretaria.setRamal("4040");
        secretaria.setTelefone("3897-1849");
        secretaria.setDocumento("123456789");
        secretaria.setEmail("secretaria@show.com");
        secretaria.setIdFunc(7);
        secretaria.setNome("Roberta Miranda");

        Operador operador = new Operador();
        operador.setValorHora(8.0);
        operador.setDocumento("987654321");
        operador.setEmail("operador@operador.com");
        operador.setIdFunc(1);
        operador.setNome("Cleiton Araujo");

        RegistroPonto registroGerente = new RegistroPonto();
        RegistroPonto registroSecretaria = new RegistroPonto();
        RegistroPonto registroOperador = new RegistroPonto();

        try { Thread.sleep (1000); } catch (InterruptedException ignored) {}

        registroGerente.setFunc(gerente);
        registroGerente.setDataRegistro(LocalDate.now());
        registroGerente.setHoraEntrada(LocalDateTime.now());
        registroGerente.setIdRegPonto(1);
        registroGerente.apresentarRegistroPonto();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {}

        registroOperador.setFunc(operador);
        registroOperador.setDataRegistro(LocalDate.now());
        registroOperador.setHoraEntrada(LocalDateTime.now());
        registroOperador.setIdRegPonto(2);
        registroOperador.apresentarRegistroPonto();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {}

        registroSecretaria.setFunc(secretaria);
        registroSecretaria.setDataRegistro(LocalDate.now());
        registroSecretaria.setHoraEntrada(LocalDateTime.now());
        registroSecretaria.setIdRegPonto(3);
        registroSecretaria.apresentarRegistroPonto();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {}

        registroGerente.setHoraSaida(LocalDateTime.now());
        registroGerente.apresentarRegistroPonto();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {}

        registroOperador.setHoraSaida(LocalDateTime.now());
        registroOperador.apresentarRegistroPonto();

        try { Thread.sleep (1000); } catch (InterruptedException ex) {}

        registroSecretaria.setHoraSaida(LocalDateTime.now());
        registroSecretaria.apresentarRegistroPonto();

    }
}