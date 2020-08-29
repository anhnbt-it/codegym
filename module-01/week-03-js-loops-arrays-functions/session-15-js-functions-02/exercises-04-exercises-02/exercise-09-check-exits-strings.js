function checkExitsStr(str, char) {
  let counter = 0;
  for (let s of str) {
    if (char === s) {
      counter++;
    }
  }
  return (counter !== 0) ? counter : -1;
}
let myStr = "Hello World! My names Tuan Anh";
let check = checkExitsStr(myStr, 'n');
if (check) {
  console.log(check)
} else {
  console.log('n not exit in array');
}