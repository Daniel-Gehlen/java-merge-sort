# Merge Sort Implementation in Java

Este repositório contém uma implementação em Java do algoritmo Merge Sort, 
uma técnica de ordenação do tipo dividir-e-conquistar com complexidade O(n log n).

## Como Executar
1. Compile: `javac MergeSort.java`
2. Execute: `java MergeSort`

## Diagrama do Algoritmo

```mermaid
graph TD

subgraph MergeSortClass
    mergeSort[mergeSort method]
    merge[merge method]
    recursiveLeft[Recursive Left Call]
    recursiveRight[Recursive Right Call]
    mergeCall[merge call]
end

subgraph ExampleExecution
    inputArray[[64, 34, 25, 12, 22]]
    sortedArray[Sorted Array]
    printOutput[Print Sorted Array]
end

subgraph HelperMethods
    Arrays.copyOfRange
    System.arraycopy
end

mergeSort --> |divides array| recursiveLeft
mergeSort --> |divides array| recursiveRight
recursiveLeft --> mergeCall
recursiveRight --> mergeCall
mergeCall --> merge

merge --> |uses| Arrays.copyOfRange
merge --> |uses| System.arraycopy
merge --> |creates| sortedArray

inputArray --> |passed to| mergeSort
mergeSort --> |produces| sortedArray
sortedArray --> |printed by| printOutput

classDef java fill:#f9f,stroke:#333;
class mergeSort,merge,Arrays.copyOfRange,System.arraycopy java;
```

## Testes
Compile e execute o arquivo de teste:
```bash
javac -cp junit.jar MergeSortTest.java
java -cp junit.jar:. org.junit.runner.JUnitCore MergeSortTest
```
