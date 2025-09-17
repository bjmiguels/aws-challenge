// Main.java
package org.example;

import com.amazonaws.services.lambda.runtime.Context; // Importe o Context

public class Main {
    public static void main( String[] args ) {
        System.out.println("Iniciando teste local da função Lambda...");

        // 1. Instancie o seu handler
        HelloWorldHandler handler = new HelloWorldHandler();

        // 2. Crie uma instância do nosso contexto de teste
        Context testContext = new TestContext();

        // 3. Prepare um objeto de entrada (input). Como seu handler aceita
        //    qualquer 'Object', podemos simplesmente passar null.
        Object testInput = null;

        // 4. Chame o método handleRequest e armazene o resultado
        String result = handler.handleRequest(testInput, testContext);

        // 5. Imprima o resultado para verificar
        System.out.println("\n--- RESULTADO ---");
        System.out.println(result);
        System.out.println("-----------------");
    }
}