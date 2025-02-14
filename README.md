# Transações Inválidas

## Problema "Transações" (ref: LeetCode Invalid Transactions)

### Empresas:
Apple, Google, Amazon, Microsoft, Adobe, Accenture, etc.

### Descrição do Problema:
Uma transação é possivelmente inválida se:
- O valor excede $1000, ou;
- Se ocorrer dentro (ou incluindo) de 60 minutos de outra transação com o mesmo nome em uma cidade diferente.

Você recebe um array de strings `transactions`, onde `transactions[i]` consiste em valores separados por vírgula representando o nome, tempo (em minutos), valor e cidade da transação. Retorne uma lista de transações que são possivelmente inválidas. A resposta pode ser retornada em qualquer ordem.

### Restrições:
- `transactions.length <= 1000`
- Cada `transactions[i]` tem o formato `"{name},{time},{amount},{city}"`
- Cada `{name}` e `{city}` consiste apenas em letras minúsculas do alfabeto inglês e tem tamanho entre 1 e 10.
- Cada `{time}` consiste apenas em dígitos e representa um inteiro entre 0 e 1000.
- Cada `{amount}` consiste apenas em dígitos e representa um inteiro entre 0 e 2000.

### Exemplos:
#### Exemplo 1:
**Entrada:**  
`["alice,20,800,mtv","alice,50,100,beijing"]`

**Saída:**  
`["alice,20,800,mtv","alice,50,100,beijing"]`

#### Exemplo 2:
**Entrada:**  
`["alice,20,800,mtv","alice,50,1200,mtv"]`

**Saída:**  
`["alice,50,1200,mtv"]`

#### Exemplo 3:
**Entrada:**  
`["alice,20,800,mtv","bob,50,1200,mtv"]`

**Saída:**  
`["bob,50,1200,mtv"]`

---

## Assinaturas das Funções:

### Java:
```java
public static List<String> invalidTransactions(String[] transactions) {
    // implementação aqui
}
```

---
