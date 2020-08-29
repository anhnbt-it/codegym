function isPalindrome(str) {
  str = str.split(' ').join('').toLowerCase();
  let result = '';
  if (str.length > 2) {
    if (str.charAt(0) !== str.charAt(str.length-1)) {
      return false;
    } else {
      result = str.substr(1, str.length-2);
      return isPalindrome(result);
    }
  }
  return true;
}
console.log(isPalindrome("kaka"));