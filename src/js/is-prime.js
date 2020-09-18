function isPrime(number) { // isPrime(3)
  if (number <= 1) {
    return false;
  } else if (number === 2) {
    return true;
  } else {
    for (let j = 2; j <= Math.sqrt(number); j++) {
      if (number % j === 0) {
        return false;
      }
    }
    return true;
  }
}