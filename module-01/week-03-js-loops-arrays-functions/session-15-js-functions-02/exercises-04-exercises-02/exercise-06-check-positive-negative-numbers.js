function checkPositiveNegative(n) {
  if (n < 0) {
    return "NOT positive";
  }
  return "positive";
}
let number = 5;
console.log(checkPositiveNegative(number));