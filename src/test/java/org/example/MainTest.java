package org.example;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

import com.amazonaws.services.lambda.runtime.Context;

public class MainTest {

    @Test
    public void testHandleRequest() {
        System.out.println("Iniciando teste unitário da função Lambda...");

        HelloWorldHandler handler = new HelloWorldHandler();

        Context testContext = new TestContext();

        Object testInput = null;

        String result = handler.handleRequest(testInput, testContext);

        assertEquals("Lambda está usando Java corretamente", result);

        System.out.println("Teste unitário finalizado com sucesso!");
    }
}