package apps.proman.api.model;

import java.util.Objects;
import apps.proman.api.model.RoleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProjectOwnerDetailsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-15T15:55:15.993+05:30")

public class ProjectOwnerDetailsType   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("email_address")
  private String emailAddress = null;

  @JsonProperty("role")
  private RoleType role = null;

  public ProjectOwnerDetailsType id(UUID id) {
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

  public ProjectOwnerDetailsType firstName(String firstName) {
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

  public ProjectOwnerDetailsType lastName(String lastName) {
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

  public ProjectOwnerDetailsType emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email address of the owner (user)
   * @return emailAddress
  **/
  @ApiModelProperty(required = true, value = "Email address of the owner (user)")
  @NotNull


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public ProjectOwnerDetailsType role(RoleType role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RoleType getRole() {
    return role;
  }

  public void setRole(RoleType role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectOwnerDetailsType projectOwnerDetailsType = (ProjectOwnerDetailsType) o;
    return Objects.equals(this.id, projectOwnerDetailsType.id) &&
        Objects.equals(this.firstName, projectOwnerDetailsType.firstName) &&
        Objects.equals(this.lastName, projectOwnerDetailsType.lastName) &&
        Objects.equals(this.emailAddress, projectOwnerDetailsType.emailAddress) &&
        Objects.equals(this.role, projectOwnerDetailsType.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, emailAddress, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectOwnerDetailsType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

