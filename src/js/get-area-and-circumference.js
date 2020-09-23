function calcCircleArea(r) {
  if (isNaN(parseFloat(r))) {
    return "Not a number";
  }
  // Công thức: A = π * r**2
  return Math.PI * (r ** 2);
}

function calcCircumference(r) {
  if (isNaN(parseFloat(r))) {
    return "Not a number";
  }
  // Công thức tính chu vi hình tròn: C = 2π * radius
  return 2 * Math.PI * parseFloat(r);
}