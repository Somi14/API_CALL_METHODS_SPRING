package org.example.WebClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// url = where api-feign-client is running
@FeignClient(name = "api-feign-client", url = "${feign.client.url}")
public interface ProductFeignClient {

    // must match the endpoint in api-feign-client exactly
    @GetMapping("/products/{id}")
    Product getProduct(@PathVariable("id") Long id);
}