// function Student(id, name, age) {
//   this.id = id;
//   this.name = name;
//   this.age = age;
//   this.getInfor = function() {
  // return "Id: " + this.id + "/ Name: " + this.name + "/ Age: " + this.age;
//   }
// }
// let student = new Student(1, "Tuan Anh", 25);


let student = {
  id: 1,
  name: 'Tuan Anh',
  age: 25,
  getInfor: function() {
    return "Id: " + this.id + "/ Name: " + this.name + "/ Age: " + this.age;
  }
}
console.log(student.getInfor());