let numbers = [65, 44, 12, 4];
    
function findMaxArray(arr) {
  let max = arr[0];
  for (let value of arr) {
    if (max < value) {
      max = value;
    }
  }
  return max;
}

console.log(findMaxArray(numbers));