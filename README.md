# To-Do List (Gerenciador de Tarefas) 📝

Um projeto simples de lista de tarefas (To-Do List) criado para praticar conhecimentos em **Java** e **Spring Boot**. A aplicação permite o gerenciamento básico de tarefas, ajudando a organizar os afazeres do dia a dia com eficiência.

---

## ✨ Funcionalidades Principais

* **Criar tarefas:** Adicione novas tarefas à sua lista.
* **Listar tarefas:** Visualize todas as tarefas pendentes e concluídas.
* **Marcar como concluída:** Altere o status de uma tarefa para "concluída".
* **Excluir tarefas:** Remova tarefas da lista.
* **(Opcional) Editar tarefas:** Atualize o texto de uma tarefa existente.
* **(Opcional) Filtrar tarefas:** Veja apenas tarefas ativas ou apenas as concluídas.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Framework:** Spring Boot
* **Banco de Dados:** H2 Database
* **Gerenciador de Pacotes:** Maven

---

## 🚀 Como Executar o Projeto

Siga estas instruções para obter uma cópia local do projeto e executá-la.

### Pré-requisitos

Antes de começar, certifique-se de ter o seguinte instalado:
* JDK 17 ou superior
* Maven 3.8+
* Um cliente de API como o [Postman](https://www.postman.com/) ou [Insomnia](https://insomnia.rest/)

### Instalação e Execução

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/Jvbarbosa00/To-Do.git](https://github.com/Jvbarbosa00/To-Do.git)
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd To-Do
    ```

3.  **Instale as dependências (baixa as bibliotecas do Maven):**
    ```bash
    mvn clean install
    ```

4.  **Execute a aplicação:**
    ```bash
    mvn spring-boot:run
    ```

5.  **Acesse a aplicação:**
    A API estará disponível em `http://localhost:8080`. Você pode usar o Postman ou Insomnia para testar os endpoints listados abaixo.

---

## 🧭 Endpoints da API

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/api/tasks` | Lista todas as tarefas. |
| `POST` | `/api/tasks` | Cria uma nova tarefa. |
| `PUT` | `/api/tasks/{id}` | Atualiza o status ou texto de uma tarefa. |
| `DELETE` | `/api/tasks/{id}` | Deleta uma tarefa. |

---

## 👤 Autor

**Jvbarbosa00**

* **GitHub:** [@Jvbarbosa00](https://github.com/Jvbarbosa00)
* **LinkedIn:** [João Victor Barbosa de Oliveira](https://www.linkedin.com/in/jo%C3%A3o-victor-barbosa-de-oliveira-091a812b6/)

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
