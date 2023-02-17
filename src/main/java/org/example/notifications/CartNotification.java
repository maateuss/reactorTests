package org.example.notifications;

import org.example.model.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

public class CartNotification {
    private final Sinks.Many<Product> cartSink = Sinks.many().multicast().onBackpressureBuffer();
    
    public void addToCart(Product product){
        cartSink.tryEmitNext(product);
    }

    public Flux<Product> getCartFlux(){
        return cartSink.asFlux();
    }

}
