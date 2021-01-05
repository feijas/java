package Testes;

public class ArCondicionado { // classe

       private int temperatura; // variável

    void trocarTemperatura( int temperatura){  // metodo da linha 7 a 9
        if(temperatura >= 17 && temperatura <= 25) {
            this.temperatura = temperatura;
            }
        }
         int obterTemperatura() {
            return temperatura;
        }
    }


