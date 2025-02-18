# Merge Arrays

## Problema "Merge Arrays" (LeetCode)

### Descrição do Problema:
Dado dois arrays de números inteiros `nums1` e `nums2`, ordenados em ordem crescente, sendo `m` e `n` seus tamanhos, respectivamente.

Junte os arrays `nums1` e `nums2` em um único array ordenado de forma crescente.

O array final ordenado **não deve ser retornado pela função**, mas sim armazenado dentro do array `nums1`. Para acomodar os elementos, `nums1` possui um comprimento de `m + n`.

### Exemplos:
#### Exemplo 1:
**Entrada:**  
`nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3`

**Saída:**  
`[1,2,2,3,5,6]`

**Explicação:**  
Os arrays que queremos juntar são `[1,2,3]` e `[2,5,6]`. O resultado ao fazer o merge é `[1,2,2,3,5,6]`.

#### Exemplo 2:
**Entrada:**  
`nums1 = [1], m = 1, nums2 = [], n = 0`

**Saída:**  
`[1]`

**Explicação:**  
Os arrays que queremos juntar são `[1]` e `[]`. O resultado ao fazer o merge é `[1]`.

#### Exemplo 3:
**Entrada:**  
`nums1 = [0], m = 0, nums2 = [1], n = 1`

**Saída:**  
`[1]`

**Explicação:**  
Os arrays que queremos juntar são `[]` e `[1]`. O resultado ao fazer o merge é `[1]`.

---

## Assinaturas das Funções:

### JavaScript:

### Java:
```java
public static void merge(int[] nums1, int m, int[] nums2, int n) {
    // implementação aqui
}
```

---

