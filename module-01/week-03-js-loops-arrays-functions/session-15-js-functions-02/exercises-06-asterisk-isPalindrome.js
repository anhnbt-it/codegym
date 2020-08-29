function isPalindrome(str) {
  str = str.toLowerCase();
  let removeSpace = '', res = '';
  if (str.length > 2) {
    if (str.charAt(0) !== str.charAt(str.length-1)) {
      return false;
    } else {
      removeSpace = str.split(' ').join('');
      res = removeSpace.substr(1, removeSpace.length-2);
      return isPalindrome(res);
    }
  }
  return true;
}
console.log(isPalindrome("Was it a car or a cat I saw"));