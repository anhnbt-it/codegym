let products = [
  ["Điện Thoại iPhone SE 64GB (2020)", "", "./images/iphone.jpg"],
  ["Điện Thoại Samsung Galaxy S20", "./images/samsung.jpg"],
  ["Điện Thoại Vsmart Active 3", "./images/vsmart.png"],
  ["Điện thoại Xiaomi Redmi 9A (2GB/32GB)", "./images/xiaomi.jpg"]
];
console.log(products[0]);

function showProduct() {
  let tbl = "<table>";
  tbl += '<thead><tr><th>Image</th><th>Product Name</th><th>' + products.length + ' products</th></tr></thead>';
  tbl += '<tbody>';
  for (let p in products) {
    tbl += `<tr>
      <td><img width="140px" src="${products[p].image}" alt="${products[p].name}"></td>
      <td>${products[p].name}</td>
      <td>
        <button onclick="editProduct(${p});">Edit</button>&nbsp;
        <button onclick="deleteProduct(${p});">Delete</button>
      </td>
    </tr>`;
  }
  tbl += '</tbody>';
  tbl += '</table>';
  document.getElementById("products").innerHTML = tbl;
}

function addProduct() {
  let name = document.getElementById("name");
  let price = document.getElementById("price");
  if (name.value === "") {
    alert("Please enter name");
    name.focus();
  } else if (price.value === "") {
    alert("Please enter price");
    price.focus();
  } else {
    products.unshift([name, price, "images/no-image.jpg"]);
  }
  name.value = '';
  showProduct();
}

function editProduct(id) {
  let name = prompt("Enter name", products[id].name);
  if (name) {
    products[id].name = name;
    showProduct();
  }
}

function deleteProduct(id) {
  if(confirm("Are you sure?")) {
    products.splice(id, 1);
    showProduct();
  }
}