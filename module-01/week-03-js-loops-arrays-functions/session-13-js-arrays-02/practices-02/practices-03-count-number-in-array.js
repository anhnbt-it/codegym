let arrs = ["Saab", "Volvo", "BMW", "2020 la nam nhuan", "2019 khong phai la nam nhuan"];
let counter = 0;
for (let str of arrs) {
  if (str.length > 0) {
    for (let j of str) {
      if (!isNaN(parseFloat(j))) {
        console.log(parseFloat(j));
        counter++;
      }
    }
  }
}
console.log("So luong ky tu so trong mang la: " + counter);