const root = window.document.getElementById("root");

function Titulo (props) {
    return(
        <h1>{props.texto}</h1>
    );
}

function Titulos () {
    return(
        <div>
            <Titulo texto="Teste" />
            <Titulo texto="Teste" />
            <Titulo texto="Teste" />
            <Titulo texto="Teste" />
            <Titulo texto="Teste" />
            <Titulo texto="Teste" />
            <Titulo texto="Teste" />
        </div>
    );
}

ReactDOM.createRoot(root).render(
    Titulos()
);