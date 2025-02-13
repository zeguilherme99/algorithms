# Valid Anagram

## Problema "Valid Anagram" (ref: LeetCode Valid Anagram)

### Empresas:
Apple, Google, Amazon, Microsoft, Adobe, Spotify, etc.

### Descrição do Problema:
Dadas duas palavras `s` e `t`, retornar `true` se `t` é um anagrama de `s`, ou `false` caso contrário.

Um **anagrama** é uma palavra formada pelo rearranjo das letras de outra palavra, utilizando todas as letras originais exatamente uma vez.

### Limitações:
- `1 <= s.length, t.length <= 5 * 10^4`
- `s` e `t` contêm apenas letras minúsculas do alfabeto inglês.

### Exemplos:
#### Exemplo 1:
**Entrada:**  
`s = "anagram"`  
`t = "nagaram"`  
**Saída:**  
`true`

#### Exemplo 2:
**Entrada:**  
`s = "rat"`  
`t = "car"`  
**Saída:**  
`false`

---

## Assinaturas das Funções:


### Java:
```java
public static boolean isAnagram(String s, String t) {
    // implementação aqui
}
```

---

## Notas:
- Certifique-se de testar seu código com diferentes casos de entrada.
- Otimize sua solução para eficiência, considerando a limitação de tamanho da entrada.

