var projectListObject = [{ name: "Project One" }, { name: "Project Two" }];

showProjects();

function showProjects() {
  projectListObject.forEach(function (value, index) {
    var template =
      '<div class="project-card">' +
      value.name +
      "<ul>" +
      " <li>Task One</li>" +
      " <li>Task Two</li>" +
      " </ul>" +
      "</div>";

    document.getElementById("projectList").innerHTML += template;
  });
}

function removeCards() {
  document.getElementById("projectList").innerHTML = "";
}

function toggleMenu() {
  var toggleVariable = document.getElementsByClassName("menu-block")[0];

  if (toggleVariable.style.display == "none") {
    toggleVariable.style.display = "";
  } else {
    toggleVariable.style.display = "none";
  }
}

function addBoard(id) {
  var templateBlock =
    "<section class='board-block'>" +
    "<div>" +
    id.value +
    '<button onclick="removeCards()">Remove Card</button></div>' +
    '<div class="project-block" id="projectList">' +
    "</div>" +
    "</section>";

  document.getElementById("boardBlockList").innerHTML += templateBlock;
}
