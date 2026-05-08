let tasks = [];

class Task {
    constructor(title) {
        if (this.constructor === Task) {
            throw new Error("Abstract Class 'Task' cannot be instantiated directly");
        }
        this.title = title;
        this.isCompleted = false;
    }

    toggleStatus() {
        this.isCompleted = !this.isCompleted;
    }
}

class PersonalTask extends Task {
    constructor(title) {
        super(title);
    }

    render(index) {
        return `
            <li>
                <span style="text-decoration: ${this.isCompleted ? 'line-through' : 'none'}">
                    <strong>${this.title}</strong>
                </span>
                <button onclick="toggleTask(${index})">
                    ${this.isCompleted ? 'Undo' : 'Complete'}
                </button>
            </li>
        `;
    }
}

function refreshUI() {
    const taskList = document.getElementById("task-list");
    taskList.innerHTML = "";

    tasks.forEach((task, index) => {
        taskList.innerHTML += task.render(index);
    });
}

function addTask() {
    const textField = document.getElementById("txt-title");
    let title = textField.value;

    if (title.trim() === "") return;

    const newTask = new PersonalTask(title);
    tasks.push(newTask);

    refreshUI();
    textField.value = "";
}

window.toggleTask = function(index) {
    tasks[index].toggleStatus();
    refreshUI();
};

document.getElementById("btn-add").addEventListener("click", addTask);

document.getElementById("txt-title").addEventListener("keydown", (event) => {
    if (event.key === "Enter") {
        addTask();
    }
});