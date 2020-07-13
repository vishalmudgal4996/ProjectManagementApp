var projectListObject = [
  { name: "Project One" },
  { name: "Project Two" },
  { name: "Project Three" },
];

function showProjects(listId) {
  projectListObject.forEach(function (value, index) {
    var template =
      '<div class="project-card">' +
      value.name +
      "<ul class = 'cardList'>" +
      "<li class = 'taskItem'>Task One</li>" +
      "<li class = 'taskItem'>Task Two</li>" +
      "</ul>" +
      "</div>";
    document.getElementById(listId).innerHTML += template;
  });
}

function removeCards(listId) {
  var removeCard = document.getElementById(listId.id);
  removeCard.innerHTML = "";
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
  if (id.value.length < 5) {
    alert("Board name can't be less than five characters!");
    id.value = id.defaultValue;
    return;
  } else if (id.value == null || id.value == "") {
    alert("Board name can't be empty!");
    return;
  } else {
    idName++;
    var listId = "projectList_" + idName;
    var boardId = "board_" + idName;
    var templateBlock =
      '<section class="board-block" id=' +
      boardId +
      ">" +
      "<div class = 'section-div'>" +
      id.value +
      '<button id = "remove-btn" onclick="removeCards(' +
      listId +
      ')">Remove Card</button></div>' +
      '<div class="project-block" id= ' +
      listId +
      ">" +
      "</div>" +
      "</section>";
    document.getElementById("boardBlockList").innerHTML += templateBlock;
    showProjects(listId);
    document.getElementById("menuList").innerHTML +=
      '<li class= "menuListItems" onclick = "loadMenu(' +
      boardId +
      ')">' +
      id.value +
      "</li>" +
      "<hr>";

    document.getElementById(id.id).value = "";
  }
}

function loadMenu(element) {
  document.getElementById(element.id).style.display = "block";
}
