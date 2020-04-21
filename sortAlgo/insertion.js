function insertionSort(arr) {
    for(var i = 1; i < arr.length; i++) {
        var currentVal = arr[i];
        for (var j = i -1; j >= 0 && arr[j] > currentVal; j--) {
            arr[j+1] = arr[j]
        }
        arr[j+1] = currentVal;
        console.log(arr);
    }
    return arr;
}
insertionSort([2,1,9,71,3]);

// data nearly sorted it is good
// Big O best case scenario O(n)     worst case O(n^2)

// best case if it is almost sorted

// space complexity O(1)