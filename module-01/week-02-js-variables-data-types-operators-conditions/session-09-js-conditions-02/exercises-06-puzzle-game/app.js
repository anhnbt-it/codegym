const ANIMALS = ["cat", "monkey", "panda"];
window.onload = function() {
  makeRandomPuzzle();
}
function makeRandomPuzzle() {
  for (let i = 1; i <= 5; i++) {
    let random = Math.floor(Math.random() * ANIMALS.length);
    document.getElementById(i).src = "images/" + ANIMALS[random] + "_" + i + ".jpg";
    document.getElementById(i).setAttribute("data-animal-type", ANIMALS[random]);
  }
}
function checkPuzzleCompleted(animal) {
  let puzzleOne = document.getElementById("1").getAttribute("data-animal-type") === animal ? true : false;
  let puzzleTwo = document.getElementById("2").getAttribute("data-animal-type") === animal ? true : false;
  let puzzleThree = document.getElementById("3").getAttribute("data-animal-type") === animal ? true : false;
  let puzzleFour = document.getElementById("4").getAttribute("data-animal-type") === animal ? true : false;
  let puzzleFive = document.getElementById("5").getAttribute("data-animal-type") === animal ? true : false;
  if (puzzleOne && puzzleTwo && puzzleThree && puzzleFour && puzzleFive) {
    document.getElementById("puzzle-game-wrap").setAttribute("class", "blink-red-color");
  } else {
    document.getElementById("puzzle-game-wrap").classList.remove("blink-red-color");
  }
}
function swapImage(img) {
  let animal = ANIMALS[0];
  let isCat = (img.getAttribute("data-animal-type") === "cat");
  let isMonkey = (img.getAttribute("data-animal-type") === "monkey");
  if (isCat) {
    animal = ANIMALS[1];
  } else if (isMonkey) {
    animal = ANIMALS[2];
  }
  img.src = "images/" + animal + "_" + img.id + ".jpg";
  img.setAttribute("data-animal-type", animal);
  checkPuzzleCompleted(animal);
}