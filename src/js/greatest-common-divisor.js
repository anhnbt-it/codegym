/*
  * (ƯCLN) của hai số nguyên (greatest common divisor (gcd))
  * Là số lớn nhất có thể chia được bởi hai số nguyên đó với số dư bằng không
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