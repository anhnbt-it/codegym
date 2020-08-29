let products = [
  {
    name: "Điện Thoại iPhone SE 64GB (2020)",
    image: "images/iphone.jpg"
  },
  {
    name: "Điện Thoại Samsung Galaxy S20",
    image: "images/samsung.jpg"
  },
  {
    name: "Điện Thoại Vsmart Active 3",
    image: "images/vsmart.png"
  },
  {
    name: "Điện thoại Xiaomi Redmi 9A (2GB/32GB)",
    image: "images/xiaomi.jpg"
  }
];

function showProduct() {
  let tbl = "<table>";
  tbl += '<thead><tr><th>Image</th><th>Product Name</th><th>' + products.length + ' products</th></tr></thead>';
  tbl += '<tbody>';
  for (p in products) {
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
  if (name.value === "") {
    alert("Please enter name");
    name.focus();
  } else {
    products.unshift({name: name.value, image: "images/no-image.jpg"});
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