package com.mycompany.myapp.client.car.api;

import com.mycompany.myapp.client.car.model.Car;
import com.mycompany.myapp.client.car.model.ProfileInfoVM;

import io.swagger.annotations.*;
import rx.Observable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-23T18:36:29.179+01:00")

@Api(value = "api", description = "the api API")
public interface ApiApi {

    @ApiOperation(value = "createCar", notes = "", response = Car.class, tags={ "car-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Car.class),
        @ApiResponse(code = 201, message = "Created", response = Car.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Car.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Car.class),
        @ApiResponse(code = 404, message = "Not Found", response = Car.class) })
    @RequestMapping(value = "/api/cars",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Car> createCarUsingPOST(@ApiParam(value = "car" ,required=true ) @RequestBody Car car);


    @ApiOperation(value = "deleteCar", notes = "", response = Void.class, tags={ "car-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/api/cars/{id}",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCarUsingDELETE(@ApiParam(value = "id",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "getActiveProfiles", notes = "", response = ProfileInfoVM.class, tags={ "profile-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProfileInfoVM.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ProfileInfoVM.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ProfileInfoVM.class),
        @ApiResponse(code = 404, message = "Not Found", response = ProfileInfoVM.class) })
    @RequestMapping(value = "/api/profile-info",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ProfileInfoVM> getActiveProfilesUsingGET();


    @ApiOperation(value = "getAllCars", notes = "", response = Car.class, responseContainer = "List", tags={ "car-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Car.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Car.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Car.class),
        @ApiResponse(code = 404, message = "Not Found", response = Car.class) })
    @RequestMapping(value = "/api/cars",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    Observable<List<Car>> getAllCarsUsingGET();


    @ApiOperation(value = "getCar", notes = "", response = Car.class, tags={ "car-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Car.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Car.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Car.class),
        @ApiResponse(code = 404, message = "Not Found", response = Car.class) })
    @RequestMapping(value = "/api/cars/{id}",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<Car> getCarUsingGET(@ApiParam(value = "id",required=true ) @PathVariable("id") Long id);


    @ApiOperation(value = "updateCar", notes = "", response = Car.class, tags={ "car-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Car.class),
        @ApiResponse(code = 201, message = "Created", response = Car.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Car.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Car.class),
        @ApiResponse(code = 404, message = "Not Found", response = Car.class) })
    @RequestMapping(value = "/api/cars",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<Car> updateCarUsingPUT(@ApiParam(value = "car" ,required=true ) @RequestBody Car car);

}
