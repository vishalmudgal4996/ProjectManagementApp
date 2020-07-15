var projectListObject = [
  { name: "Project One" },
  { name: "Project Two" },
  { name: "Project Three" },
];

var boardList = [];

function showProject(listId) {
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

var idName = 0;

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
      '<section class="board-block" id="' +
      boardId +
      '"style = "display:none">' +
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
    boardList.push({
      list_id: listId,
      board_id: boardId,
      templateNew: templateBlock,
    });
    document.getElementById("boardBlockList").innerHTML += templateBlock;
    showProject(listId);
    document.getElementById("menuList").innerHTML +=
      "<li class = 'menuListItems' onClick=loadMenu('" +
      boardId +
      "')>" +
      id.value +
      "<hr></li>";
    alert("Board Name: " + id.value + " added!");
    id.value = id.defaultValue;
  }
}

function loadMenu(element) {
  for (var i = 0; i < boardList.length; i++) {
    if (boardList[i].board_id == element) {
      document.getElementById(boardList[i].board_id).style.display = "block";
    } else {
      document.getElementById(boardList[i].board_id).style.display = "none";
    }
  }
}
