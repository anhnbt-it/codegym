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

let numbers = [4, 6, 7, 9, 12];
let idx = numbers.findIndex(isPrime);
console.log(numbers.findIndex(isPrime));
if (idx !== -1) {
  console.log("Prime number is:", numbers[idx]);
}