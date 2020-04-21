// The built-in sort method accepts an optional comparator function
// You can use this comparator function to tell JS how you want it to sort
// The comparator looks at pairs of elements (a and b),
// determines their sort order based on the return value
    // if it returns a negative number, a should come before b
    // if it returns a positive number, a should come after b
    // if it returns 0, a and b are the same as far as the sort is concerned

// // sorting numerically ascending
// function numberCompare(num1, num2) {
//     return num1 - num2;
// }

// [6, 4, 15, 10].sort(numberCompare);


// // sorting numerically descending
// function numberCompare(num1, num2) {
//     return num2 - num1;
// }

// [4, 10, 15, 20].sort(numberCompare);


// sorting my string length
function compareByLen(str1, str2) {
    return str1.length - str2.length;
}

["gustavo", "bautista", "elizabeth", "smith"].sort(compareByLen);