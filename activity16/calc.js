const outputBox = document.getElementById("output");
let operands = [];
let currentOperand = "";
let currentOperator = null;

const processNumClick = (num) => {
    currentOperand += num;
    outputBox.textContent = currentOperand;
}


for (let i = 0; i <= 9; i++) {
    const btn = document.getElementById(btn${i});
    if (btn) {
        btn.addEventListener("click", () => processNumClick(i));
    }
}


const handleOperator = (op) => {
    if (currentOperand !== "") {
        operands.push(parseFloat(currentOperand));
        currentOperand = "";
    }
    currentOperator = op;
    console.log("Current Operands:", operands, "Mode:", op);
}

document.getElementById("btnplus").addEventListener("click", () => handleOperator("+"));
document.getElementById("btnminus").addEventListener("click", () => handleOperator("-"));

document.getElementById("btnequal").addEventListener("click", () => {
    if (currentOperand !== "") {
        operands.push(parseFloat(currentOperand));
        currentOperand = "";
    }

    if (operands.length < 2) return;

    let result = operands[0];

    
    for (let i = 1; i < operands.length; i++) {
        if (currentOperator === "-") {
            result -= operands[i];
        } else {
            result += operands[i];
        }
    }

    outputBox.textContent = result;
    operands = []; 
    currentOperator = null;
});