let number = 6;
let sum = 0;
for (let i = 1; i <= number/2; i++) {
  // Tìm ước số chung
  if (number % i === 0) {
    sum += i;
    console.log(i);
  }
}
if (number == sum) {
  console.log(number + " la so HH");
} else {
  console.log(number + " khong phai la so HH");
}