package com.mycompany.myapp.client.car.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Car
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-23T18:36:29.179+01:00")

public class Car   {
  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("doors")
  private String doors = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("plate")
  private String plate = null;

  @JsonProperty("year")
  private String year = null;

  public Car brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(value = "")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Car doors(String doors) {
    this.doors = doors;
    return this;
  }

   /**
   * Get doors
   * @return doors
  **/
  @ApiModelProperty(value = "")
  public String getDoors() {
    return doors;
  }

  public void setDoors(String doors) {
    this.doors = doors;
  }

  public Car id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Car plate(String plate) {
    this.plate = plate;
    return this;
  }

   /**
   * Get plate
   * @return plate
  **/
  @ApiModelProperty(value = "")
  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public Car year(String year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(value = "")
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(this.brand, car.brand) &&
        Objects.equals(this.doors, car.doors) &&
        Objects.equals(this.id, car.id) &&
        Objects.equals(this.plate, car.plate) &&
        Objects.equals(this.year, car.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, doors, id, plate, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Car {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    doors: ").append(toIndentedString(doors)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    plate: ").append(toIndentedString(plate)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

