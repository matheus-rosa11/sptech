    var tipo = '';
    var oviparo = '';
    var mamifero = '';

    function main() {

        resultado.style.display = 'none';
        opt_imagem.src = '';
        opt_imagem.alt = '';
        div_compra.style.display = 'none';

        tipo = ipt_tipo.value;
        
        if (tipo == 'oviparo') {
            div_img.style.display = 'none';
            content.style.display = 'block';
            ipt_mamifero.style.display = 'none';
            ipt_oviparo.style.display = 'block';

        } else if (tipo == 'mamifero') {
            div_img.style.display = 'none';
            content.style.display = 'block';
            ipt_oviparo.style.display = 'none';
            ipt_mamifero.style.display = 'block';

        } else if (tipo == '') {
            content.style.display = 'none';
        }
    }

    function func_oviparo() {
        oviparo = ipt_oviparo.value;

        resultado.style.display = 'none';

        div_img.style.display = 'block';
        resultado.innerHTML = '';
        
        if (oviparo == 'galinha') {
            opt_imagem.src = 'https://blog.cobasi.com.br/wp-content/uploads/2021/08/quantos-anos-vive-uma-galinha-1-1.png';
            opt_imagem.alt = 'Imagem de Galinha';

        } else if (oviparo == 'peixe') {
            opt_imagem.src = 'https://blog.cobasi.com.br/wp-content/uploads/2021/09/peixe-e-vertebrado-ou-invertebrado-topo.png';
            opt_imagem.alt = 'Imagem de Peixe Rosa';

        } else if (oviparo == 'tartaruga') {
            opt_imagem.src = 'https://cdn.diferenca.com/imagens/tartaruga-cagado-e-jabuti-og.jpg';
            opt_imagem.alt = 'Imagem de Tartaruga';
        } else if (oviparo == '') {
            opt_imagem.src = '';
            opt_imagem.alt = '';
        } else {
            opt_imagem.src = '';
            opt_imagem.alt = ''; 
        }

        div_compra.style.display = 'block';
    }

    function func_mamifero() {
        mamifero = ipt_mamifero.value;

        resultado.style.display = 'none';

        div_img.style.display = 'block';
        resultado.innerHTML = '';

        if (mamifero == 'elefante') {
            opt_imagem.src = 'https://static.biologianet.com/2020/05/elefante-africano.jpg';
            opt_imagem.alt = 'Imagem de Elefante';

        } else if (mamifero == 'porco') {
            opt_imagem.src = 'https://img.r7.com/images/porco-desaparicao-corpo-24022021174929573';
            opt_imagem.alt = 'Imagem de Porco';

        } else if (mamifero == 'coelho') {
            opt_imagem.src = 'https://www.petlove.com.br/images/breeds/227696/profile/original/perfil-coelho.jpg?1597789099';
            opt_imagem.alt = 'Imagem de Coelho'

        } else if (mamifero == '') {
            opt_imagem.src = '';
            opt_imagem.alt = '';
            
        } else {
            opt_imagem.src = '';
            opt_imagem.alt = ''; 
        }
        
        div_compra.style.display = 'block';

    }

    function calcular() {
        var valor = Number(ipt_valor.value)
        var total = 0;

        resultado.style.display = 'none';

        if (tipo == 'oviparo') {
            total = valor * 0.05;
        } else if (tipo == 'mamifero') {
            total = valor * 0.1;
        }
        
        resultado.style.display = 'block';
        resultado.innerHTML = `O imposto será de R$${total.toFixed(2)}`;
    }