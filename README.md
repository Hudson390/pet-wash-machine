<h1 align="center">
  🐾 Pet Wash Machine 🧼
</h1>

<p align="center">
  <strong>Um simulador interativo de máquina de banho automatizada para pets desenvolvido em Java.</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge" alt="Status" />
  <img src="https://img.shields.io/badge/Interface-CLI%20Console-blue?style=for-the-badge" alt="CLI" />
</p>

---

## 📌 Sobre o Projeto

O **Pet Wash Machine** é uma aplicação Java orientada a objetos (POO) executada via terminal que simula o funcionamento completo de uma máquina automática de higienização de animais de estimação.

O sistema controla com precisão:
- 🐕 **Entrada e saída do pet** na máquina;
- 💧 **Níveis de água e shampoo** (com capacidade máxima e consumo por lavagem);
- 🧼 **Ciclo de banho** do pet;
- 🧽 **Autolimpeza da máquina** após a saída de animais antes de receber o próximo pet.

---

## ⚙️ Regras de Negócio e Funcionamento

| Ação | Descrição |
| :--- | :--- |
| **Colocar Pet** | Só é permitido se a máquina estiver **vazia** e **limpa**. |
| **Dar Banho** | Requer um pet na máquina. Consome **10L de água** e **2L de shampoo**. |
| **Retirar Pet** | Retira o animal. Se o pet saiu sem banho ou após o ciclo, a máquina registra o estado de limpeza correspondente. |
| **Limpar Máquina** | Higieniza a máquina para o próximo pet. Consome **3L de água** e **2L de shampoo**. |
| **Abastecimento** | Água suporta até **30L** (adiciona de +2L em +2L). Shampoo suporta até **10L** (+2L em +2L). |

---

## 🎮 Menu Interativo do Console

Ao executar o sistema, você interage com o seguinte menu:

```text
=== Escolha uma das opções: ===
1 - Dar banho no Pet
2 - Abastecer a máquina com shampoo
3 - Abastecer a máquina com água
4 - Verificar água na máquina
5 - Verificar shampoo na máquina
6 - Verificar se tem pet no banho
7 - Colocar pet na máquina
8 - Retirar pet da máquina
9 - Limpar máquina
0 - Sair
```

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
- **Java JDK 17+** instalado ([download aqui](https://www.oracle.com/java/technologies/downloads/))
- Git instalado (opcional)

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Hudson390/pet-wash-machine.git
   cd pet-wash-machine
   ```

2. **Compile o projeto:**
   ```bash
   javac -d bin src/*.java
   ```

3. **Execute a aplicação:**
   ```bash
   java -cp bin App
   ```

---

## 📂 Estrutura de Pastas

```text
pet-wash-machine/
├── src/
│   ├── App.java          # Classe principal (Ponto de entrada e menu CLI)
│   ├── Pet.java          # Entidade Pet (nome e estado de limpeza)
│   └── PetMachine.java   # Regras de negócio e controle da máquina
├── bin/                  # Bytecodes compilados (.class)
└── README.md             # Documentação do projeto
```

---

## 🛠️ Tecnologias e Conceitos Aplicados

- **Linguagem:** Java
- **Paradigmas:** Programação Orientada a Objetos (POO)
  - Encapsulamento de atributos e métodos
  - Métodos assessores e mutadores (`getters` e `setters`)
  - Controle de estado e validações de fluxo
- **Controle de Fluxo & Entrada:** `switch-case` com arrow syntax, loops `do-while`, e leitura com `Scanner`.

---

<p align="center">
  Feito com dedicação por <strong>Hudson</strong> 🚀
</p>
