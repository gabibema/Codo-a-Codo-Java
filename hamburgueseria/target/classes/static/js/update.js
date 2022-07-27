
 
var args = location.search.substr(1).split('&');
console.log(args)

var parts = []
for (let i = 0; i < args.length; ++i) {
    parts[i] = args[i].split('=');
    console.log(parts[i])
}

document.getElementById("txtId").value = parts[0][1]
document.getElementById("txtNombre").value = decodeURI(parts[1][1])
document.getElementById("txtDescripcion").value = decodeURI(parts[2][1])
document.getElementById("txtPrecio").value = parts[3][1]
document.getElementById("txtImagen").value = parts[4][1]
 
function modificar() {
    let i = document.getElementById("txtId").value
    let n = document.getElementById("txtNombre").value
    let d = document.getElementById("txtDescripcion").value
    let img = document.getElementById("txtImagen").value
    let p = parseInt(document.getElementById("txtPrecio").value)
    let hamburguesa = {
        id:i,
        nombre: n,
        descripcion: d,
        imagen: img,
        precio: p
    }
    let url = "http://localhost:8080/hamburguesas"
    var options = {
        body: JSON.stringify(hamburguesa),
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        redirect: 'follow'
    }
    fetch(url, options)
        .then(function () {
            console.log("modificado")
            alert("Registro modificado")
           
        })
        .catch(err => {
            
            console.error(err);
            alert("Error al Modificar")
        })      
}


