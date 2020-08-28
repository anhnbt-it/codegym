let arr = [3, 5, 1, 8, -3, 7, 8];
let arr3 = [];
let min = findMin(arr3);
console.log(min);
function findMin(arr) {
  if (arr.length < 1) {
    return false;
  }
  let min = arr[0];
  for (let i = 0; i < arr.length; i++) {
    if (min > arr[i]) {
      min = arr[i];
    }
  }
  return min;
}