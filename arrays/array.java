
// Java arrays are dynamically allocated
// They are objects, Object is the direct superclass
// The size of an array must be spcified by an int value and not lon or short

// both are valid declarations
// int intArray[]
// or int[] intArray;

// byte byteArray[];
// short shortArray[];
// boolean booleanArray[];
// long longArray[];
// float floatArray[];
// double doubleArray[];
// char charArray[];

// an array of references to objects of the class MyClass (a class created by user)
// MyClass myClassArray[];

// int intArray[]; // declaring array
// intArray = new int[20]; // allocating memory to array

// or we can use dynamic allocation
// int[] intArray = new int[]{1,2,3,4,5,6,7,8};




// class GFG  
// { 
//     public static void main (String[] args)  
//     {          
//       // declares an Array of integers. 
//       int[] arr; 
          
//       // allocating memory for 5 integers. 
//       arr = new int[5]; 
          
//       // initialize the first elements of the array 
//       arr[0] = 10; 
          
//       // initialize the second elements of the array 
//       arr[1] = 20; 
          
//       //so on... 
//       arr[2] = 30; 
//       arr[3] = 40; 
//       arr[4] = 50; 
          
//       // accessing the elements of the specified array 
//       for (int i = 0; i < arr.length; i++) 
//          System.out.println("Element at index " + i +  
//                                       " : "+ arr[i]);  
                                      
//         // Element at index 0 : 10
//         // Element at index 1 : 20
//         // Element at index 2 : 30
//         // Element at index 3 : 40
//         // Element at index 4 : 50
//     } 
// }

// Array of Objects
// illustrate creating an array of objects

// class Student
// {
//     public int roll_no;
//     public String name;
//     Student(int roll_no, String name)
//     {
//         this.roll_no = roll_no;
//         this.name = name;
//     }
// }

// // Elements of arrays are obejcts of a class Student.
// public class GFG
// {
//     public static void main (String[] args)
//     {
//         // declares and Arrays of intergers
//         Student[] arr;
        
//         // allocating memory for 5 objects of type Student.
//         arr = new Student[5];
        
//         arr[0] = new Student(1, "john");
        
//         arr[1] = new Student(2, "Jim");
        
//         arr[2] = new Student(3, "Lisa");
        
//         arr[3] = new Student(4, "Joan");
        
//         arr[4] = new Student(5, "Kyle");
        
//         // accessing the elements of the specified array
//         for (int i = 0; i < arr.length; i++) 
//         System.out.println("Element at " + i + " : " + 
//                         arr[i].roll_no + " " + arr[i].name);
        
//         // Element at 0 : 1 john
//         // Element at 1 : 2 Jim
//         // Element at 2 : 3 Lisa
//         // Element at 3 : 4 Joan
//         // Element at 4 : 5 Kyle
//     }
// }



// Multidimensional arrays

// int[][] intArray = new int[10][20]; // a 2D array or matrix
// int[][][] intArray = new int[10][20][10]; // a 3D array

// class multiDimensional 
// { 
//     public static void main(String args[]) 
//     { 
//         // declaring and initializing 2D array 
//         int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
  
//         // printing 2D array 
//         for (int i=0; i< 3 ; i++) 
//         { 
//             for (int j=0; j < 3 ; j++) 
//                 System.out.print(arr[i][j] + " "); 
  
//             System.out.println(); 
            
//             // 2 7 9 
//             // 3 6 1 
//             // 7 4 2 
//         } 
//     } 
// } 


// passing arrays to methods
// demostrate passing of array to method

// class Test
// {
//     // Driver mwthod
//     public static void main(String args[]) {
//         int arr[] = {3, 1, 2, 5, 4};
        
//         // passing array to method m1
//         sum(arr);
//     }
    
//     public static void sum(int[] arr)
//     {
//         //getting sum of array values
//         int sum = 0;
        
//         for (int i = 0; i < arr.length; i++)
//             sum+= arr[i];
//         System.out.println("sum of array values : " + sum);
//     }
// }


// returning arrays from methods

// class Test
// {
//     // Driver method
//     public static void main(String args[])
//     {
//         int arr[] = m1();
        
//         for (int i = 0; i < arr.length; i++)
//             System.out.print(arr[i] + " ");
//     }
    
//     public static int[] m1()
//     {
//         // returning array
//         return new int[]{1, 2, 3};
//         // 1, 2, 3
//     }
// }


// Class Objects for arrays

// class Test 
// {
//     public static void main(String args[])
//     {
//         int intArray[] = new int[3];
//         byte byteArray[] = new byte[3];
//         short shortArray[] = new short[3];
        
//         // array of Strings 
//         String[] strArray = new String[3];
        
//         System.out.println(intArray.getClass());
//         System.out.println(intArray.getClass().getSuperclass());
//         System.out.println(byteArray.getClass());
//         System.out.println(shortArray.getClass());
//         System.out.println(strArray.getClass());
        
        
//         // class [I
//         // class java.lang.Object
//         // class [B
//         // class [S
//         // class [Ljava.lang.String;
//     }
// }


// // Cloning arrays

// class Test 
// {
//     public static void main(String args[])
//     {
//         int intArray[] = {1, 2, 3};
//         int cloneArray[] = intArray.clone();
        
//         // will print as false as deep copy is created
//         // for one-dimensional array
//         System.out.println(intArray == cloneArray);
        
//         for (int i  = 0; i < cloneArray.length; i++) {
//             System.out.print(cloneArray[i] + " ");
            
//         }
        
//         // false
//         // 1 2 3
//     }
// }

// Cloning multi-dimensional arrays
// shallow cloning, a single new array with each element a reference to an original array but subarrays are shared.

class Test 
{
    public static void main(String args[])
    {
        int intArray[][] = {{1, 2, 3},{4, 5}};
        
        int cloneArray[][] = intArray.clone();
        
        // will print false 
        System.out.println(intArray == cloneArray);
        
        // will print true as shollow copy is created 
        // sub-arrays are shared
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);
        
        // false
        // true
        // true
    }
}



