function swapNumber(n1, n2) {
  let temp = n1;
  n1 = n2;
  n2 = temp;
  return n1 + " " + n2;
}
console.log(swapNumber(30, 20));