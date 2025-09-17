package org.example;// TestContext.java
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class TestContext implements Context {

    @Override
    public String getAwsRequestId() {
        return "test-request-id-12345";
    }

    @Override
    public String getLogGroupName() {
        return "/aws/lambda/test-function";
    }

    @Override
    public String getLogStreamName() {
        return "2025/09/15/[$LATEST]abcdef123456";
    }

    @Override
    public String getFunctionName() {
        return "test-function";
    }

    @Override
    public String getFunctionVersion() {
        return "$LATEST";
    }

    @Override
    public String getInvokedFunctionArn() {
        return "arn:aws:lambda:us-east-1:123456789012:function:test-function";
    }

    @Override
    public CognitoIdentity getIdentity() {
        return null;
    }

    @Override
    public ClientContext getClientContext() {
        return null;
    }

    @Override
    public int getRemainingTimeInMillis() {
        return 300000;
    }

    @Override
    public int getMemoryLimitInMB() {
        return 512;
    }

    @Override
    public LambdaLogger getLogger() {
        // Esta é a implementação importante: um logger que imprime no console local
        return new LambdaLogger() {
            @Override
            public void log(String message) {
                System.out.println("LOG: " + message);
            }
            @Override
            public void log(byte[] message) {
                System.out.println("LOG: " + new String(message));
            }
        };
    }
}