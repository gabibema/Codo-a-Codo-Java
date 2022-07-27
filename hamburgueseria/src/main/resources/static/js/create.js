function guardar() {
 
    let n = document.getElementById("txtNombre").value
    let d = document.getElementById("txtDescripcion").value
    let p = parseInt(document.getElementById("txtPrecio").value)
    let i = document.getElementById("txtImagen").value

    let hamburguesa = {
        nombre: n,
        descripcion: d,
        precio: p,
        imagen: i
    }        
    let url = "http://localhost:8080/hamburguesas"
    var options = {
        body: JSON.stringify(hamburguesa),
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
       // redirect: 'follow'
    }
    fetch(url, options)
        .then(function () {
            console.log("creado")
            // Handle response we get from the API
        })
        .catch(err => {
            //this.errored = true
            alert("Error al grabar" )
            console.error(err);
        })
}
