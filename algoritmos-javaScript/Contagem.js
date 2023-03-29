
        var n = Math.trunc(Math.random() * 10);
        var nota;
        var cont = 0;
        var i = 0;

        while (i < n) {
            nota = prompt("diga uma nota");

            if (nota >= 50) {
                cont = cont + 1;
            }

            i = i + 1;
        }

        console.log("Número de alunos que passaram no exame: " + cont);