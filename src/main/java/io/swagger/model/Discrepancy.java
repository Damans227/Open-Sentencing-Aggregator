/*
 * Outcarcerate
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Discrepancy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-10-15T21:00:06.855Z")
public class Discrepancy   {
  @JsonProperty("model_name")
  private String modelName = null;

  @JsonProperty("sentencing_discrepancy")
  private Float sentencingDiscrepancy = null;

  @JsonProperty("severity")
  private Float severity = null;

  public Discrepancy modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * Get modelName
   * @return modelName
   **/
  @JsonProperty("model_name")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public Discrepancy sentencingDiscrepancy(Float sentencingDiscrepancy) {
    this.sentencingDiscrepancy = sentencingDiscrepancy;
    return this;
  }

  /**
   * Get sentencingDiscrepancy
   * @return sentencingDiscrepancy
   **/
  @JsonProperty("sentencing_discrepancy")
  @ApiModelProperty(value = "")
  public Float getSentencingDiscrepancy() {
    return sentencingDiscrepancy;
  }

  public void setSentencingDiscrepancy(Float sentencingDiscrepancy) {
    this.sentencingDiscrepancy = sentencingDiscrepancy;
  }

  public Discrepancy severity(Float severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
   **/
  @JsonProperty("severity")
  @ApiModelProperty(value = "")
  public Float getSeverity() {
    return severity;
  }

  public void setSeverity(Float severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Discrepancy discrepancy = (Discrepancy) o;
    return Objects.equals(this.modelName, discrepancy.modelName) &&
        Objects.equals(this.sentencingDiscrepancy, discrepancy.sentencingDiscrepancy) &&
        Objects.equals(this.severity, discrepancy.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, sentencingDiscrepancy, severity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discrepancy {\n");
    
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    sentencingDiscrepancy: ").append(toIndentedString(sentencingDiscrepancy)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
