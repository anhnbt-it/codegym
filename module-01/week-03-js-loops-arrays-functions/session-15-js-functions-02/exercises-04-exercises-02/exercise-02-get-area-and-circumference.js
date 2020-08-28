function getCircleArea(radius) {
  // Công thức: A = π * r**2
  // Math.PI Trả về hệ số PI (3.14)
  if (isNaN(Number.parseFloat(radius))) {
    return "Not a number";
  }
  return Math.PI * (radius ** 2);
}
function getCircumference(radius) {
  // Công thức tính chu vi hình tròn: C = 2π * radius
  if (isNaN(Number.parseFloat(radius))) {
    return "Not a number";
  }
  return 2 * Math.PI * parseFloat(radius);
}
console.log(getCircumference("haha"));