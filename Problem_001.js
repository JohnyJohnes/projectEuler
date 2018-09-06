let max = 0;

for (var i = 0; i < 1000; i++) {
    if ( i%5==0 || i%3==0 ) {
        max+=i;
    }
}

console.log(max);
