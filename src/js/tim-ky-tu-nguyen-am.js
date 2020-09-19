function lettersAreVowels(arr) {
  let counter = 0;

  arr.forEach(function (value, index) {
    if (
      value === "a" ||
      value === "e" ||
      value === "o" ||
      value === "i" ||
      value === "u"
    ) {
      counter++;
    }
  });

  return counter > 0 ? counter : false;
}
