# 💻 Atividade Final – Programação Orientada a Objetos (POO)

## ✅ Questão 4 – Implementação da Classe `Turma`

Este projeto foi desenvolvido como parte da Atividade Final da disciplina de **Programação Orientada a Objetos**.  
O foco foi a implementação completa da **questão 4**, com criação da classe `Turma`, incluindo seus atributos, métodos e testes.

---

## 🎯 Objetivo da Questão

> Criar a classe `Turma` com os seguintes atributos:
- `codigo` (String)
- `disciplina` (objeto da classe `Disciplina`)
- `professor` (objeto da classe `Professor`)
- `alunos` (lista de objetos `Aluno` utilizando `ArrayList`)

> Implementar os seguintes métodos:
- `adicionarAluno(Aluno aluno)`
- `removerAluno(Aluno aluno)`
- `listarAlunos()`
- `imprimirInformacoes()`

---

## 🧱 Estrutura do Projeto

Embora a atividade solicitasse apenas a implementação da `Turma`, foi necessário criar outras classes de apoio para que os testes funcionassem corretamente e não houvesse erro de compilação.

### 📂 Classes criadas:

| Classe       | Função                                                                  |
|--------------|-------------------------------------------------------------------------|
| `Turma`      | Classe principal da questão, com associação a professor e disciplina, e composição de alunos |
| `Aluno`      | Representa um aluno (com nome e matrícula)                             |
| `Professor`  | Representa o professor da turma                                         |
| `Disciplina` | Representa a disciplina lecionada                                      |
| `Main`       | Classe de teste com `main()` para instanciar os objetos e demonstrar o funcionamento |

---

## 💬 Justificativa

As classes `Aluno`, `Professor` e `Disciplina` foram criadas como **versões base/simplificadas**, com os atributos mínimos necessários.  
Isso permitiu o funcionamento completo da `Turma`, mesmo que essas classes não façam parte diretamente da proposta da questão.

---

## ▶️ Execução

Para testar o projeto:

1. Abra o projeto em sua IDE Java (ex: IntelliJ IDEA)
2. Execute a classe `Main`
3. O terminal mostrará os dados da turma, alunos, disciplina e professor

---
