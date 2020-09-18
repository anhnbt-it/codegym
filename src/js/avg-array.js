let numbers = [65, 44, 12, 4];
    
function avgArray(arr) {
  let sum = 0;
  for (let value of arr) {
    sum += value;
  }
  return sum / arr.length;
}

console.log(avgArray(numbers));