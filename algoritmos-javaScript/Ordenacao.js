
        function quicksort(array) {
            if (array.length <= 1) {
                return array
            }

            var pivo = array[0]

            var right = []
            var left = []

            for (var i = 1; i < array.length; i++) {
                array[i] < pivo ? left.push(array[i]) : right.push(array[i])
            }
            return quicksort(left).concat(pivo, quicksort(right))
        }

        var n = parseInt(prompt("Digite quantos números serão passados no vetor: "))
        var unsorted = []

        for (var j = 0; j < n; j++) {
            unsorted[j] = parseInt(prompt("Numero: "))
        }

        var sorted = quicksort(unsorted)

        document.write("Vetor sortido: " + sorted)