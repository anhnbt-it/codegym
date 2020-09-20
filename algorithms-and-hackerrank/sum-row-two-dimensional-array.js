// Tính tổng các ô trên cùng hàng
let numbers = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
for (let i = 0; i < numbers.length; i++) {
  let sum = 0;
  for (let j = 0; j < numbers[i].length; j++) {
    sum += numbers[i][j];
  }
  console.log(sum);
}