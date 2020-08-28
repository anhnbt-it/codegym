function MyDate(day, month, year) {
  this.day = day;
  this.month = month;
  this.year = year;
  this.getDay = function () {
    return this.day;
  };
  this.getMonth = function () {
    return this.month;
  };
  this.getYear = function () {
    return this.year;
  };
  this.setDay = function(value) {
    this.day = value;
  };
  this.setMonth = function(value) {
    this.month = value;
  };
  this.setYear = function(value) {
    this.year = value;
  };
  this.setDate = function(d, m, y) {
    this.day = d;
    this.month = m;
    this.year = y;
  };
  this.getDate = function() {
    return this.day + '/' + this.month + '/' + this.year;
  }
}
let mdate = new MyDate(15, 06, 2019);
// let day = mdate.getDay();
// let month = mdate.getMonth();
// let year = mdate.getYear();
// mdate.setDate(16, 11, 1995);
// mdate.setMonth(11);
// mdate.setYear(1995);
// console.log(mdate.getDay() + '/' + mdate.getMonth() + '/' + mdate.getYear());
console.log(mdate.getDate());