// Số nguyên tố là một số tự nhiên lớn hơn 1 và không thể tạo thành từ tích của hai số tự nhiên nhỏ hơn
function isPrime(num) {
  for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i < 1) {
      return false;
    }
  }
  return num > 1;
}

function primeNumbersLessThan(num) {
  // The first 25 prime numbers (all the prime numbers less than 100) are
  let numbers = [];
  for (let i = 1; i <= num; i++) {
    if (isPrime(i)) {
      numbers.push(i);
    }
  }
  return numbers;
}

console.log(primeNumbersLessThan(100));

// let numberArray = [4, 6, 7, 9, 12];
// let idx = numberArray.findIndex(isPrime);
// console.log(numberArray.findIndex(isPrime));
// if (idx !== -1) {
//   console.log("Prime number is:", numberArray[idx]);
// }