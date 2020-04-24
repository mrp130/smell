# Imperative Abstraction

Smell ini terjadi ketika sebuah operasi dibuat menjadi sebuah class, dan di dalam class ini, hanya punya satu method saja.

Sesuai namanya, paradigma OOP: **OBJECT**-oriented programming. Class di dalam OOP haruslah berupa kata benda. Bukan kata kerja atau kata sifat. Method baru boleh kata kerja. Interface baru boleh kata sifat.

### Penyebab Smell

- **Procedural thinking**: software developer menggunakan paradigma prosedural saat coding paradigma OOP.

### Contoh

#### Masalah

Perhatikan package [before](before). Terdapat class CreateReport, DisplayReport, dan CopyReport. Disini sudah jelas terjadi imperative abstraction karena ketiga class tersebut merupakan kata kerja, bukan kata benda.

#### Penyelesaian

Operasi di dalam DisplayReport dan CopyReport, dipindahkan sebagai method ke dalam class Report. CreateReport dipindahkan sebagai constructor class Report.