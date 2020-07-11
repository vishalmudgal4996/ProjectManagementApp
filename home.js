showProjects();

function showProjects() {
  var template =
    '<div class="project-card">' +
    "<span>Project JavaScript</span>" +
    "<ul>" +
    " <li>Task One</li>" +
    " <li>Task Two</li>" +
    " </ul>" +
    "</div>";
  document.getElementById("projectList").innerHTML += template;
}

function toggleMenu() {
  var toggleVariable = document.getElementsByClassName("menu-block")[0];

  if (toggleVariable.style.display == "none") {
    toggleVariable.style.display = "";
  } else {
    toggleVariable.style.display = "none";
  }
}
