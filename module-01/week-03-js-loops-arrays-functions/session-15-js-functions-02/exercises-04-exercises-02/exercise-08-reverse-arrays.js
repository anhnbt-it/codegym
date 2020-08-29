function reverseArrays(arr) {
  for (let i = 0, j = arr.length-1; i < arr.length/2; i++, j--) {
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp; 
  }
  return arr;
}
let arrs = [1, 2, 3, 4, 5, 6];
console.log(reverseArrays(arrs));