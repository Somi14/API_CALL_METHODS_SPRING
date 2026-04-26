package org.example.WebClient;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiCallingController {

    private final ProductFeignClient productFeignClient;

    public ApiCallingController(ProductFeignClient productFeignClient)
    {
        this.productFeignClient=productFeignClient;
    }

    @GetMapping("/call/{id}")
    public Product callFeignService(@PathVariable Long id) {
        // this single line triggers an HTTP GET to localhost:8081/products/{id}
        return productFeignClient.getProduct(id);
    }
}