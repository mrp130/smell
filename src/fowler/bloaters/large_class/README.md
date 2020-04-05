# Large Class

[sourcemaking](https://sourcemaking.com/refactoring/smells/large-class)

### Penjelasan Smell

Smell ini terjadi ketika ada sebuah class melanggar [Single Responsibility Principle](https://en.wikipedia.org/wiki/Single-responsibility_principle). Terdapat terlalu banyak jenis tanggungjawab yang dilakukan oleh satu class.

Pada contoh [SemesterMenu.java](before/SemesterMenu.java), class ini bukan hanya berurusan dengan menu dan input console untuk CRUD semester saja. Class ini juga pegang kendali untuk pembuatan vector semester. Class ini juga terbebani dengan banyaknya variasi cara input di method `getDateInput`, `getIntInput`, dan `getStringInput`.

### Penyelesaian

Dilakukan [Extract Class](https://sourcemaking.com/refactoring/extract-class) pada: 

- vector Semester dan validasi-validasinya diekstrak ke class baru bernama [Semesters](after/Semesters.java).
- fungsi `getDateInput`, `getIntInput`, dan `getStringInput` dibuat menjadi 3 class yang terpisah. Lalu [Extract Superclass](https://sourcemaking.com/refactoring/extract-superclass) menjadi abstract class Console.

Dilakukan [Move Method](https://sourcemaking.com/refactoring/move-method) pada:

- fungsi `showSemester` menjadi `toString` di class Semester.
- fungsi `showSemesters` menjadi `show` di class Semesters.
- fungsi `isLabelUnique` pindah ke class Semesters.

Lihat hasilnya di package [after](after/SemesterMenu.java).
