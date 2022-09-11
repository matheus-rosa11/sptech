function main() {
    var numero = Number(ipt_num.value);

    let binario = numero.toString(2);
    let octal = numero.toString(8);
    let hexa = numero.toString(16);

    document.getElementById("result_binario").innerHTML = `<strong>${binario}</strong>`
    document.getElementById("result_octal").innerHTML = `<strong>${octal}</strong>`
    document.getElementById("result_hexa").innerHTML = `<strong>${hexa}</strong>`

    container.style.display = "block";
}