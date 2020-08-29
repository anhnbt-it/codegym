function checkPositiveNegative(n) {
  if (n < 0) {
    return false;
  }
  return true;
}
let number = 5;
if (checkPositiveNegative(number)) {
  console.log(number + " is Positive numbers");
} else {
  console.log(number + " is Negative numbers");
}