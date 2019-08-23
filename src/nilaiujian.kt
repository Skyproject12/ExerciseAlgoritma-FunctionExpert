import java.util.*

fun main (args : Array<String>)  {
        nilaiuts()
}
fun nilaiuts () {
    var scan = Scanner(System.`in`)
    println("masukkan nilai")
    var nilaiujian = scan.nextInt()
    println("masukkan uas")
    var uas = scan.nextInt()
    println("masukkan tugas")
    var tugas = scan.nextInt()
    var nilaihasil= 0.4*nilaiujian
    var nilaiuas = 0.4*uas
    var nilaitugas=0.2*tugas
    var hasila=nilaihasil+nilaiuas+nilaitugas
    println(hasila)
}

