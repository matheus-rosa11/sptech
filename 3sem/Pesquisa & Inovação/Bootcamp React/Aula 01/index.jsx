const root = window.document.getElementById("root");

function Participante (props) {
    // var votos = 0;
    const [votos, setVotos] = React.useState(0);

    function acrescentar() {
        setVotos(votos + 1);
        console.log("Votos: " + votos);
    }

    function reduzir() {
        setVotos(votos - 1);
        console.log("Votos: " + votos);
    }

    return(
        <div>
            <div>Votos {props.nome}: {votos}</div>
            <button onClick={acrescentar}>+</button>
            <button onClick={reduzir}>-</button>
        </div>
    );  
}

function Votacao() {
    return(
        <div>
            <Participante nome="Biscoito"/>
            <Participante nome="Bolacha"/>
            <Participante nome="Breno"/>
        </div>
    );
}

ReactDOM.createRoot(root).render(
    <Votacao />
);