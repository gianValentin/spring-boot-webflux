package com.bolsadeideas.springboot.webflux.app.models.services;

import com.bolsadeideas.springboot.webflux.app.models.documents.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Flux<Producto> findAll();
    Flux<Producto> findAllConNombreUpperCase();
    Flux<Producto> findAllConNombreUpperCaseRepeat();
    Flux<Producto> findAllConNombreUpperCaseDelay();
    Mono<Producto> findById(String id);
    Mono<Producto> save(Producto producto);
    Mono<Producto> delte(Producto producto);
}
