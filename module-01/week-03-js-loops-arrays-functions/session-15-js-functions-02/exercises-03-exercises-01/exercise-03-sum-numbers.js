function sum(a, b) {
  if (!isNaN(a) && !isNaN(b)) {
    if (a > b) {
      console.log(a + " great than " + b);
      return false;
    } else {
      return a + b;
    }
  } else {
    return "Not a number";
  }
}
let result = sum("a", 10);
console.log(result);