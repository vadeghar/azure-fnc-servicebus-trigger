package com.fabrikam;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.ServiceBusQueueTrigger;

public class QueueTriggerFunction {
    /**
     * This function listens at endpoint "/api/HttpExample". Two ways to invoke it using "curl" command in bash:
     * 1. curl -d "HTTP Body" {your host}/api/HttpExample
     * 2. curl "{your host}/api/HttpExample?name=HTTP%20Query"
     */
    @FunctionName("QueueTriggerFunction")
    public Boolean run(
            @ServiceBusQueueTrigger(
                    name = "message", queueName = "adf-item-queue", connection = "ServiceBusConnection")
            String message, final ExecutionContext context) {
        context.getLogger().info("Received Queue message: "+message);

        return true;
    }
}
