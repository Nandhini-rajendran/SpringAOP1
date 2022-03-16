package com.loonycorn.pointcuts;

import com.loonycorn.AppContextWrapper;
import com.loonycorn.aopadvices.Order;
import org.springframework.context.ApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext context = AppContextWrapper.getContext();

        Order myOrder = (Order) context.getBean("orderBean");

        myOrder.getOrderItems().clear();

        myOrder.displayOrderItems();

    }
}