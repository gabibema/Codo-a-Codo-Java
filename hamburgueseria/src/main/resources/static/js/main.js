if (document.getElementById("app")){
    const app=new Vue({
        el:"#app",
        data(){
            return{
            hamburguesas:[],
            errored:false,
            loading:true,
            }
        },
        created(){
            var url="http://localhost:8080/hamburguesas"
            this.fetchData(url);
        },
        methods:{
            fetchData(url) {
                fetch(url)
                    .then(response => response.json())
                    .then(data => {
                        this.hamburguesas = data;
                        this.loading = false;
                    })
                    .catch(err => {
                        this.errored = true
                    })
            },
            eliminar(hamburguesa) {
                const url = 'http://localhost:8080/hamburguesas/' + hamburguesa;
                var options = {
                    method: 'DELETE',
                }
                fetch(url, options)
                    .then(res => res.text()) // or res.json()
                    .then(res => {
                        location.reload();
                    })
            }
        }
    })
}
