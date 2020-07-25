var xhr = new XMLHttpRequest();

function getBoards() {
  document.getElementById("boardBlockList").innerHTML = "";
  document.getElementById("menuList").innerHTML = "";

  xhr.open("GET", "http://localhost:8080/api/v1/boards");
  xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  var access = sessionStorage.getItem("access-token");
  xhr.setRequestHeader("Authorization", "Bearer " + access);
  xhr.send();
  xhr.onreadystatechange = function () {
    if (xhr.readyState === 4) {
      var boardList = JSON.parse(xhr.responseText);
      var boards = boardList.boards;
      boards.forEach(function (value, index) {
        var template =
          "<div id=" +
          value.id +
          " onclick = showProjects('" +
          value.id +
          "')>" +
          value.name +
          "<button class='delete-btn' onclick=deleteBoard(" +
          value.id.toString() +
          ")> Delete Board</button>" +
          "<button class='project-btn' onclick=addProject(" +
          value.id.toString() +
          ")> Add Project</button>" +
          "</div>";
        document.getElementById("boardBlockList").innerHTML += template;
        document.getElementById("menuList").innerHTML +=
          "<li class = 'menuListItems' onClick=loadMenu('" +
          value.id +
          "')>" +
          value.name +
          "<hr></li>";
      });
    }
  };
}

function addBoardAPI(element) {
  var userDetail = JSON.parse(sessionStorage.getItem("user-detail"));
  if (userDetail.role.id == 105) {
    alert("only admins allowed to perform this operation.");
  } else {
    var params = {
      description: "string",
      name: element.value,
      owner_id: userDetail.id,
    };

    xhr.open("POST", "http://localhost:8080/api/v1/boards");
    xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    var access = sessionStorage.getItem("access-token");
    xhr.setRequestHeader("Authorization", "Bearer " + access);
    xhr.send(JSON.stringify(params));
    xhr.onreadystatechange = function () {
      if (xhr.readyState === 4) {
        getBoards();
      }
    };
  }
}

function deleteBoard(id) {
  event.stopPropagation();
  xhr.open("DELETE", "http://localhost:8080/api/v1/boards/" + id);
  xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  var access = sessionStorage.getItem("access-token");
  xhr.setRequestHeader("Authorization", "Bearer " + access);
  xhr.send();
  xhr.onreadystatechange = function () {
    if (xhr.readyState === 4) {
      document.getElementById(id).remove();
    }
  };
}

function addProject(id) {
  event.stopPropagation();
  var userDetail = JSON.parse(sessionStorage.getItem("user-detail"));
  var params = {
    description: "New Project via API",
    end_date: new Date(),
    name: "project hello",
    owner_id: userDetail.id,
    start_date: new Date(),
  };

  xhr.open("POST", "http://localhost:8080/api/v1/boards/" + id + "/projects");
  xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  var access = sessionStorage.getItem("access-token");
  xhr.setRequestHeader("Authorization", "Bearer " + access);
  xhr.send(JSON.stringify(params));
  xhr.onreadystatechange = function () {
    if (xhr.readyState === 4) {
      console.log(xhr.response);
    }
  };
}

var boardList = [];

function showProjects(listId) {
  xhr.open(
    "GET",
    "http://localhost:8080/api/v1/boards/" + listId + "/projects"
  );
  xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  var access = sessionStorage.getItem("access-token");
  xhr.setRequestHeader("Authorization", "Bearer " + access);
  xhr.send();
  xhr.onreadystatechange = function () {
    if (xhr.readyState === 4) {
      var projectList = JSON.parse(xhr.responseText);
      var projects = projectList.projects;
      projects.forEach(function (value, index) {
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
  };
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
