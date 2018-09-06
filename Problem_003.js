let number = 600851475143,
    max = 2;

for (var i = 2; i <= number ; i++) {
    while (number % i == 0) {
        max = i;
        number /= i;
    }
}

console.log(max);

// for (var i = 1; i < number; i++) {
//     let counter = 0;
//     for (var j = 1; j < i; j++) {
//         if (i % j == 0) {
//             counter++;
//         }
//     }
//     if ((counter == 2) && (number % i == 0)) {
//         max = i;
//     }
//     counter = 0;
// }
// console.log(max);
