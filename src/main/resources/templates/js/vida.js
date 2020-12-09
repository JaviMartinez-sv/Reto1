
function addProduct(id_product) {

    let url = 'http://shopjm.azurewebsites.net/orders/3/products/1?action=add'

    fetch('http://shopjm.azurewebsites.net/products/' + id_product)
        .then(res => respones = res.json())
        .then(data => {

            fetch(url, {
                method: 'PUT',
                body: JSON.stringify(data),
                headers: {
                    'Content-Type': 'application/json'
                }
            }).then(res => {
                window.location.href = "/index";
            });
        })

}

function removeProduct(id_product) {

    let url = 'http://shopjm.azurewebsites.net/orders/3/products/1?action=delete'

    fetch('http://shopjm.azurewebsites.net/products/' + id_product)
        .then(res => respones = res.json())
        .then(data => {

            fetch(url, {
                method: 'PUT',
                body: JSON.stringify(data),
                headers: {
                    'Content-Type': 'application/json'
                }
            }).then(res => {
                window.location.href = "/index";
            });
        })
}


function getBodyProduct(id) {
    let product = {}
    fetch('http://shopjm.azurewebsites.net/products/' + id)
        .then(res => respones = res.json())
        .then(data => {
            product = { '"id_product"': parseInt(data.id_product), '"name"': data.name, '"price"': data.price, '"url_product"': data.url_product };
            return product;
        })
}

function addNewProduct(id_product) {

    let url = 'http://shopjm.azurewebsites.net/oders/3/product'

    fetch('http://shopjm.azurewebsites.net/products/' + id_product)
        .then(res => respones = res.json())
        .then(data => {

            fetch(url, {
                method: 'POST',
                body: JSON.stringify(data),
                headers: {
                    'Content-Type': 'application/json'
                }
            }).then(res => {
                window.location.href = "/index";
            });
        })

}

function deleteProducts(id) {
    fetch('http://shopjm.azurewebsites.net/orderproducts/' + id, {
            method: 'DELETE',
        })
        .then(res => res.text())
        .then(res => {
            console.log(res);
            window.location.href = "/index";
        })
}

function deleteCompleteOrder(id) {
    fetch('http://shopjm.azurewebsites.net/orderproducts/order/' + id, {
            method: 'DELETE',
        })
        .then(res => res.text())
        .then(res => {
            console.log(res);
            window.location.href = "/index";
        })
}

function reload() {
    var e = document.getElementById("languages");
    var selectedLang = e.options[e.selectedIndex].value;

    var url = "?lang=" + selectedLang
    location.href = url;
}
