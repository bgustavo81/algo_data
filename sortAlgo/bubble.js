// A sorting algo where the largest values bubble up to the top
// function bubbleSort(arr) {
//     for(var i = arr.length; i > 0; i--) {
//         for(var j = 0; j < i - 1; j++) {
//             console.log(arr, arr[j], arr[j+1]);
//             if(arr[j] > arr[j+1]){
//                 var temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//             }
//         }
//     }
//     return arr;
// }


// es2015 syntax
// function bubbleSort(arr) {
//     const swap = (arr, idx1, idx2) => {
//         [arr[idx1], arr[idx2]] = [arr[idx2], arr[idx1]];
//     };

//     for(let i = arr.length; i > 0; i--) {
//         for(let j = 0; j < i - 1; j++) {
//             if(arr[j] > arr[j + 1]) {
//                 swap(arr, j, j +1)
//             }
//         }
//     }
//     return arr;
// }


// optimized solution
function bubbleSort(arr) {
    let noSwaps;
    for(var i = arr.length; i > 0; i--) {
        noSwaps = true;     // noSwaps by default
        for(var j = 0; j < i - 1; j++) {
            console.log(arr, arr[j], arr[j+1]);
            if(arr[j] > arr[j+1]) {
                var temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                noSwaps = false; // if there is a swap noSwaps will be false
            }
        }
        if(noSwaps) break;
    }
    return arr;
}


bubbleSort([37, 45, 29, 80, 56]);


// the time complexity is O(n^2)
// in a best case senario it is O(n), granted it finished on first iteration 

// the best case is when it is almost sorted

// the noSwap break helps
// space complexity O(1)