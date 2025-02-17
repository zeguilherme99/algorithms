# Duplicar Zeros

## Problema "Duplicate Zeros" (LeetCode)

### Descrição do Problema:
Dado um array de inteiros `arr`, duplique cada ocorrência de zero, deslocando os elementos restantes para a direita (**shifting right**).

Observe que elementos além do tamanho do array original não são escritos.

Utilize a abordagem **"in-place"**, na qual a modificação é feita diretamente no array.

### Exemplos:
#### Exemplo 1:
**Entrada:**  
`nums = [1,0,2,3,0,4,5,0]`

**Saída:**  
`[1,0,0,2,3,0,0,4]`

#### Exemplo 2:
**Entrada:**  
`nums = [1,2,3]`

**Saída:**  
`[1,2,3]`

---

## Assinaturas das Funções:


### Java:
```java
public static void duplicateZeros(int[] arr) {
    // implementação aqui
}
```

---

## Notas:
- Teste sua solução com diferentes casos de entrada.
- Certifique-se de tratar corretamente casos onde há múltiplos zeros seguidos.
- Lembre-se de que a modificação deve ser feita **in-place**.

