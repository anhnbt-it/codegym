let str = "Cod eG ym _M         oncity";
let newStr = str.split(" ");
console.log(newStr);
// console.log(str.length);
let counter = 0;
for (let text of newStr) {
  console.log(text);
  if (text != "") {
    counter++;
  }
}
console.log(counter);