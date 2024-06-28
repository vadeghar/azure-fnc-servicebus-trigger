//package com.fabrikam.namespace;
//
//import com.fabrikam.model.ServiceBusQueueMessage;
//import com.microsoft.azure.functions.ExecutionContext;
//import com.microsoft.azure.functions.annotation.FunctionName;
//import com.microsoft.azure.functions.annotation.ServiceBusQueueTrigger;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.cloud.function.adapter.azure.FunctionInvoker;
//
//@Slf4j
//public class NamespaceUpdateInvoker extends FunctionInvoker<ServiceBusQueueMessage, Boolean> {
//
//    @FunctionName("UpdateOktaNamespace")
//    public void run(
//            @ServiceBusQueueTrigger(
//                    name = "message", queueName = "adf-item-queue", connection = "ServiceBusConnection")
//            String message, final ExecutionContext context) {
//        log.debug("Received Queue message: {}", message);
//        ServiceBusQueueMessage serviceBusQueueMessage = new ServiceBusQueueMessage();
//        serviceBusQueueMessage.setMessage(message);
//        handleRequest(serviceBusQueueMessage, context);
//    }
//
//}
