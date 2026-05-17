# 🛒 Sistema de Sumário de Pedidos (Sales Composition Model)

Este projeto simula o sistema de fechamento e sumário de pedidos de um e-commerce. O objetivo principal foi aplicar conceitos práticos de Orientação a Objetos, focando na relação entre entidades e modelagem de contratos de pedidos.

## 🧠 Conceitos Técnicos Praticados:

* **Enumerações (Enum):** Utilizado para controlar os estados do pedido (`PENDING_PAYMENT`, `PROCESSING`, `SHIPPED`, `DELIVERED`) de forma segura.
* **Composição de Objetos:** Implementação da relação "Tem-um" (Um pedido *tem um* cliente e *tem vários* itens).
* **Associação Bidirecional:** Manipulação de listas dinâmicas (`ArrayList`) dentro de objetos para representar os itens de um pedido (`OrderItem`).
* **Clean Code:** Formatação de Strings com `StringBuilder` para gerar relatórios de forma performática e otimização de saídas decimais.

## 📋 Exemplo de Funcionamento (Input/Output)

O sistema recebe os dados do cliente, o status atual do pedido, a quantidade de itens e calcula automaticamente o total com base nos preços unitários e quantidades de cada produto.

**Exemplo de saída no console (Order Summary):**
```text
ORDER SUMMARY:
Order moment: 17/05/2026 15:30:00
Order status: PROCESSING
Client: Alex Green (15/03/1985) - alex@gmail.com
Order items:
TV, $1000.00, Quantity: 2, Subtotal: $2000.00
Mouse, $40.00, Quantity: 2, Subtotal: $80.00
Total price: $2080.00