package apps.proman.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskOwnerType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-15T15:55:15.993+05:30")

public class TaskOwnerType   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  public TaskOwnerType id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the owner (user) in a standard UUID format generated by API backend
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the owner (user) in a standard UUID format generated by API backend")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public TaskOwnerType firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the owner (user)
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "First name of the owner (user)")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public TaskOwnerType lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the owner (user)
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Last name of the owner (user)")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskOwnerType taskOwnerType = (TaskOwnerType) o;
    return Objects.equals(this.id, taskOwnerType.id) &&
        Objects.equals(this.firstName, taskOwnerType.firstName) &&
        Objects.equals(this.lastName, taskOwnerType.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskOwnerType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

