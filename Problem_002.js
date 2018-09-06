let variable_1 = 0,
    variable_2 = 1,
    sum = 0,
    buff;

while (variable_2 < 4000000) {
    if ((variable_1+variable_2)%2==0)
                sum+=variable_1+variable_2;
            buff=variable_2;
            variable_2+=variable_1;
            variable_1=buff;
}

console.log(sum);
