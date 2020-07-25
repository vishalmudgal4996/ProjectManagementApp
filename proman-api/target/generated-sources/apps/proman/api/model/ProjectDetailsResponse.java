package apps.proman.api.model;

import java.util.Objects;
import apps.proman.api.model.ProjectBoardSummaryType;
import apps.proman.api.model.ProjectOwnerDetailsType;
import apps.proman.api.model.ProjectStatusType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProjectDetailsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-15T15:55:15.993+05:30")

public class ProjectDetailsResponse   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("board")
  private ProjectBoardSummaryType board = null;

  @JsonProperty("owner")
  private ProjectOwnerDetailsType owner = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("start_date")
  private String startDate = null;

  @JsonProperty("end_date")
  private String endDate = null;

  @JsonProperty("status")
  private ProjectStatusType status = null;

  @JsonProperty("total_members")
  private Integer totalMembers = null;

  @JsonProperty("total_effort")
  private Integer totalEffort = null;

  @JsonProperty("remaining_effort")
  private Integer remainingEffort = null;

  public ProjectDetailsResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the project in a standard UUID format
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the project in a standard UUID format")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ProjectDetailsResponse board(ProjectBoardSummaryType board) {
    this.board = board;
    return this;
  }

  /**
   * Board that this Project belongs to of the project board
   * @return board
  **/
  @ApiModelProperty(value = "Board that this Project belongs to of the project board")

  @Valid

  public ProjectBoardSummaryType getBoard() {
    return board;
  }

  public void setBoard(ProjectBoardSummaryType board) {
    this.board = board;
  }

  public ProjectDetailsResponse owner(ProjectOwnerDetailsType owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Details of the project owner
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "Details of the project owner")
  @NotNull

  @Valid

  public ProjectOwnerDetailsType getOwner() {
    return owner;
  }

  public void setOwner(ProjectOwnerDetailsType owner) {
    this.owner = owner;
  }

  public ProjectDetailsResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the project
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the project")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectDetailsResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the project
   * @return description
  **/
  @ApiModelProperty(value = "Description of the project")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProjectDetailsResponse startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the project
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Start date of the project")
  @NotNull


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ProjectDetailsResponse endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the project
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "End date of the project")
  @NotNull


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ProjectDetailsResponse status(ProjectStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ProjectStatusType getStatus() {
    return status;
  }

  public void setStatus(ProjectStatusType status) {
    this.status = status;
  }

  public ProjectDetailsResponse totalMembers(Integer totalMembers) {
    this.totalMembers = totalMembers;
    return this;
  }

  /**
   * Total number of members (users) in the project
   * @return totalMembers
  **/
  @ApiModelProperty(required = true, value = "Total number of members (users) in the project")
  @NotNull


  public Integer getTotalMembers() {
    return totalMembers;
  }

  public void setTotalMembers(Integer totalMembers) {
    this.totalMembers = totalMembers;
  }

  public ProjectDetailsResponse totalEffort(Integer totalEffort) {
    this.totalEffort = totalEffort;
    return this;
  }

  /**
   * Total estimated effort (in seconds) of all tasks belonging to this Project
   * @return totalEffort
  **/
  @ApiModelProperty(required = true, value = "Total estimated effort (in seconds) of all tasks belonging to this Project")
  @NotNull


  public Integer getTotalEffort() {
    return totalEffort;
  }

  public void setTotalEffort(Integer totalEffort) {
    this.totalEffort = totalEffort;
  }

  public ProjectDetailsResponse remainingEffort(Integer remainingEffort) {
    this.remainingEffort = remainingEffort;
    return this;
  }

  /**
   * Total remaining effort (in seconds) of all tasks belonging to this Project
   * @return remainingEffort
  **/
  @ApiModelProperty(required = true, value = "Total remaining effort (in seconds) of all tasks belonging to this Project")
  @NotNull


  public Integer getRemainingEffort() {
    return remainingEffort;
  }

  public void setRemainingEffort(Integer remainingEffort) {
    this.remainingEffort = remainingEffort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDetailsResponse projectDetailsResponse = (ProjectDetailsResponse) o;
    return Objects.equals(this.id, projectDetailsResponse.id) &&
        Objects.equals(this.board, projectDetailsResponse.board) &&
        Objects.equals(this.owner, projectDetailsResponse.owner) &&
        Objects.equals(this.name, projectDetailsResponse.name) &&
        Objects.equals(this.description, projectDetailsResponse.description) &&
        Objects.equals(this.startDate, projectDetailsResponse.startDate) &&
        Objects.equals(this.endDate, projectDetailsResponse.endDate) &&
        Objects.equals(this.status, projectDetailsResponse.status) &&
        Objects.equals(this.totalMembers, projectDetailsResponse.totalMembers) &&
        Objects.equals(this.totalEffort, projectDetailsResponse.totalEffort) &&
        Objects.equals(this.remainingEffort, projectDetailsResponse.remainingEffort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, board, owner, name, description, startDate, endDate, status, totalMembers, totalEffort, remainingEffort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDetailsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    board: ").append(toIndentedString(board)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalMembers: ").append(toIndentedString(totalMembers)).append("\n");
    sb.append("    totalEffort: ").append(toIndentedString(totalEffort)).append("\n");
    sb.append("    remainingEffort: ").append(toIndentedString(remainingEffort)).append("\n");
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

