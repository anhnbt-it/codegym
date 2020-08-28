let animals = [
  {
    id: 1,
    name: "Cat"
  },
  {
    id: 2,
    name: "Dog"
  },
  {
    id: 3,
    name: "Monkey"
  },
  {
    id: 4,
    name: "Panda"
  }
];
animals.forEach(function(value, key) {
  // console.log(value);
  console.log(value.name);
  console.log(key);
});