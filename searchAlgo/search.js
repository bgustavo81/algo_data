// there are many different search methods on arrays in Javascript
// indexOf
// includes
// find 
// findIndex

// linearSearch
arr1 = [1, 2, 3, 4, 5]
function linearSearch(arr, val) {
    for(var i = 0; i < arr.length; i++) {
        if(arr[i] === val) return i;
    }
    return -1;
}
linearSearch(arr1, 6);

// Linear search big O 
// best O(1)   average O(n)     worst O(n)


// binarySearch
function binarySearch(arr, elem) {
    var start = 0;
    var end = arr.length - 1;
    var middle = Math.floor((start + end) / 2);
    while(arr[middle] !== elem && start <= end) {
        if(elem < arr[middle]) end = middle - 1;
        else start = middle + 1;
        middle = Math.floor((start + end) / 2);
    } 
    return arr[middle] === elem ? middle : -1;
}

binarySearch([2, 5, 6, 9, 13, 15, 28, 30], 30)
// Binary Search Big O
// best O(1)       worst and average O(n)


// Naive string search alogrithm
function naiveSearch(long, short) {
    var count = 0;
    for(var i = 0; i < long.length; i++) {
        for(var j = 0; j < short.length; j++) {
            if(short[j] !== long[i + j]) break;
            if(j === short.length - 1) count++;
        }
    }
    return count;
}
naiveSearch("lorie loled loled loled", "loled");



//KNP String Search
//Comin soon