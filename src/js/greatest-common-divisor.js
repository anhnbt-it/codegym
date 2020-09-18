/*
  * (ƯCLN) của hai số nguyên (greatest common divisor (gcd))
  * Là số lớn nhất có thể chia được bởi hai số nguyên đó với số dư bằng không
  * Ước chung lớn nhất g là số lớn nhất chia được bởi cả a và b mà không để lại số dư 
  */
function greatestCommonDivisor(number) {
  // greatestCommonDivisor(16);
  if (number < 1) {
    return false;
  }
  let result = [];
  for (let i = 1; i <= number; i++) {
    if (number % i === 0) {
      result.push(i);
    }
  }
  return result;
}

function euclidAlgorithm(a, b) { // hai số tự nhiên a và b
  // Euclid's algorithm for greatest common divisor (gcd)
  if (a < 1 || b < 1) {
    return false;
  }
  a = Math.abs(a);
  b = Math.abs(b);
  while (a !== b) {
    if (a > b) {
      a = a - b;
    } else {
      b = b - a;
    }
  }
  return a;
}

function gcd(a, b) {
  if (b === 0) {
    return a;
  } else {
    return gcd(b, a % b);
  }
}

// let g = euclidAlgorithm(1071, 462); // a và b đều là bội của g
// let gcd = greatestCommonDivisor(16);
// console.log(g);
// console.log(gcd);
console.log(gcd(1071, 462));