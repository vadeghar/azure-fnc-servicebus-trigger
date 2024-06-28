//package com.fabrikam.namespace;
//
//import com.fabrikam.model.ServiceBusQueueMessage;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//
//import java.util.function.Function;
//
//@Component
//@Slf4j
//public class NamespaceUpdate implements Function<ServiceBusQueueMessage, Boolean> {
//    @Override
//    public Boolean apply(ServiceBusQueueMessage serviceBusQueueMessage) {
//        log.debug("Processing in function {} ", serviceBusQueueMessage.getMessage());
//        return true;
//    }
//}
