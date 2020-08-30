let myGameArea = document.getElementById("myGameArea");
const PLAYER_1 = "X";
const PLAYER_2 = "O";
let turn = PLAYER_2;
const NUM_GAME_BOARD = 10; // Hằng số lưu số ô cờ caro 20x20.
let winner = false;
let board = [];

for (let i = 0; i < NUM_GAME_BOARD; i++) {
  board[i] = [0, 0, 0];
}
for (let i = 0; i < NUM_GAME_BOARD; i++) { //Chạy vòng lặp row.
  let rows = document.createElement("div");
  rows.setAttribute('class', 'rows');
  for (let j = 0; j < NUM_GAME_BOARD; j++) { //Chạy vòng lặp column lồng trong vòng lặp row.
    let cols = document.createElement("div");
    cols.setAttribute('class', 'cols');
    let colsText = document.createTextNode("\u00A0\u00A0\u00A0");
    cols.appendChild(colsText);
    cols.onclick = function () { // Thêm sự kiện click vào mỗi ô.
      if (!winner) {
        if (this.textContent === "\u00A0\u00A0\u00A0") { // Chỉ chèn x hoặc o vào ô trống.
          if (turn === PLAYER_1) {
            this.innerHTML = "<span class=\"text-o\">" + PLAYER_2 + "</span>";
            document.getElementById("output").innerHTML = "<span class=\"font-weight-bold\">" + PLAYER_1 + "</span> Turn";
            board[i][j] = PLAYER_2; // Gán phần tử board[i][j] bằng giá trị "o".
            turn = PLAYER_2;
          } else {
            this.innerHTML = "<span class=\"text-x\">" + PLAYER_1 + "</span>";
            document.getElementById("output").innerHTML = "<span class=\"font-weight-bold\">" + PLAYER_2 + "</span> Turn";
            board[i][j] = PLAYER_1; // Gán phần tử board[i][j] bằng giá trị "x".
            turn = PLAYER_1;
          }
        }
      }
      checkForWin(turn);
    };
    rows.appendChild(cols); // Chèn cột vào hàng.
  }
  myGameArea.appendChild(rows); // Vẽ bảng.
}

function checkForWin(turn) {
  if (!winner) {
    let turn_count = 0;
    for (let i = 0; i < NUM_GAME_BOARD; i++) {
      for (let j = NUM_GAME_BOARD; j > 0; j--) {
        if (board[i][j] !== 0) {
          turn_count++;
        }
        if (board[i][j] == turn && board[i][j] == board[0][j] && board[2][j] == board[0][j]) {
          // Check hàng dọc
          document.getElementById("output").innerHTML = "<span class=\"font-weight-bold\">" + turn + "</span> WINNER!";
          winner = true;
        }
      }
      if (board[i][0] == turn && board[i][1] == board[i][0] && board[i][2] == board[i][0]) {
        // Check hàng ngang
        document.getElementById("output").innerHTML = "<span class=\"font-weight-bold\">" + turn + "</span> WINNER!";
        winner = true;
      }
    }

    if (board[0][2] == turn && board[1][1] == board[0][2] && board[2][0] == board[0][2]) {
      // Check chéo 1
      document.getElementById("output").innerHTML = "<span class=\"font-weight-bold\">" + turn + "</span> WINNER!";
      winner = true;
    }
    if (board[0][0] == turn && board[1][1] == board[0][0] && board[2][2] == board[0][0]) {
      // Check chéo 2
      document.getElementById("output").innerHTML = "<span class=\"font-weight-bold\">" + turn + "</span> WINNER!";
      winner = true;
    }
    if (turn_count === NUM_GAME_BOARD * NUM_GAME_BOARD) {
      // Board bị đầy khi màn chơi chuyển đến lượt số 9.
      document.getElementById("output").innerHTML = "Game Over! <span class=\"font-weight-bold\">Cat's game</span>";
      winner = true;
    }
  }
}

function startGame() {
}