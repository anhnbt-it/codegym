const str = "Nguyen Ba Tuan Anh";
const array = Array.from(str.toLowerCase());
console.log(array);
const kyTuNguyenAm = array.filter(isNguyenAm);
console.log(kyTuNguyenAm.length);

function isNguyenAm(item) {
  return (item === 'a' || item === 'e' || item === 'o' || item === 'i' || item === 'u');
}