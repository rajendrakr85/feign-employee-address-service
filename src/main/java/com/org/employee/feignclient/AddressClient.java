package com.org.employee.feignclient;

import com.org.employee.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="feignAddressService",url="http://localhost:8084",path = "/address")
public interface AddressClient {
    @GetMapping("/address/{id}")
    public ResponseEntity<AddressResponse>getAddressResponse(@PathVariable(value = "id")Long id);
}
