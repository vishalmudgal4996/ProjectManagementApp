var projectListObject = [{ name: "Project One" }, { name: "Project Two" }];

showProjects();

function showProjects(listId) {
  projectListObject.forEach(function (value, index) {
    var template =
      '<div class="project-card">' +
      value.name +
      "<ul>" +
      " <li>Task One</li>" +
      " <li>Task Two</li>" +
      " </ul>" +
      "</div>";

    if (listId) {
      document.getElementById(listId).innerHTML += template;
    } else {
      document.getElementById("projectList").innerHTML += template;
    }
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

var idName = 1;

function addBoard(id) {
  idName++;
  var listId = "projectList_" + idName;
  var templateBlock =
    "<section class='board-block'>" +
    "<div>" +
    id.value +
    '<button onclick="removeCards()">Remove Card</button></div>' +
    '<div class="project-block" id= ' +
    listId +
    ">" +
    "</div>" +
    "</section>";

  document.getElementById("boardBlockList").innerHTML += templateBlock;
  showProjects(listId);
  document.getElementById("menuList").innerHTML +=
    '<li onclick = "loadMenu(' + listId + ')">' + id.value + "</li>";
}

function loadMenu(element) {
  console.log(element.id);
  console.log(element);
}
