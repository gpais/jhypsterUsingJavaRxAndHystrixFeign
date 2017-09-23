package com.mycompany.myapp.client.car.api;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.mycompany.myapp.client.OAuth2InterceptedFeignConfiguration;
import com.mycompany.myapp.client.car.ClientConfiguration;

@FeignClient(name="${car.name:car}", configuration = OAuth2InterceptedFeignConfiguration.class)
public interface ApiApiClient extends ApiApi {
}