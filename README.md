# 📚 Plataforma de ensino

## 📌 Descrição

Programa em Java que simula um curso composto por diferentes tipos de aulas: **vídeos** e **tarefas**.
O sistema calcula automaticamente a **duração total do curso** com base no tipo de cada aula.

---

## 🚀 Funcionalidades

* Cadastro de aulas (vídeo ou tarefa)
* Cálculo da duração individual:

  * Vídeo → duração em segundos
  * Tarefa → 5 minutos por questão
* Soma da duração total do curso
* Uso de **polimorfismo** para tratar diferentes tipos de aula

---

## 🧠 Conceitos utilizados

* (POO)
* Herança
* Polimorfismo
* Classe abstrata
* Sobrescrita de métodos (`@Override`)
* Listas (`ArrayList`)

---

## 💻 Tecnologias

* Java
* Git & GitHub

---

## 📎 Observação

O projeto utiliza uma **classe abstrata (`Lesson`)** para garantir que todas as aulas implementem o método `duration()`, permitindo o uso de **polimorfismo** na lista de aulas.

---

## 👨‍💻 Autor

Leonardo Salerno
