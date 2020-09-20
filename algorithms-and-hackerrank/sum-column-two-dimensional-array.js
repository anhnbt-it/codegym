// Tính tổng các ô trên cùng cột
let numbers = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
for (let i = 0; i < numbers[0].length; i++) {
  let sum = 0;
  for (let j = 0; j < numbers.length; j++) {
    sum += numbers[j][i];
  }
  console.log(sum);
}