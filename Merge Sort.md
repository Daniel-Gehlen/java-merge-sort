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
