package sesi10;

import java.io.*;
public class Test3 {
 public void methodA(){
 System.out.println("Method A");
 }
 public void methodB() throws IOException
 {
 System.out.println(20/0);
 System.out.println("Method B");
 }
}

class Utama
{
 public static void main(String[] args) throws IOException
 {
 Test3 c=new Test3();
 c.methodA();
 c.methodB();
 }
}

/*
 * Analisa:
 * Program menjalankan methodA() dengan normal. Saat methodB() dipanggil,
 * terjadi ArithmeticException karena pembagian 20/0 sehingga program
 * langsung berhenti. Meskipun methodB() mendeklarasikan throws IOException,
 * exception yang terjadi adalah ArithmeticException sehingga tidak ditangani
 * dan program berakhir dengan error.
 */

//Kemudian coba ubah class utama diatas dengan yang program baru di bawah ini:
//class Utama
//{
// public static void main(String[] args)
// {
// Test3 o=new Test3();
// o.methodA();
// try
// {
// o.methodB();
// }
// catch(Exception e)
// {
// System.out.println("Error di Method B");
// }
// finally
// {
// System.out.println("Ini selalu dicetak");
// };
// }
//}
//

/*
 * Analisa:
 * Program menjalankan methodA(), kemudian memanggil methodB() di dalam
 * blok try. Saat terjadi ArithmeticException akibat pembagian 20/0,
 * exception ditangkap oleh catch sehingga program menampilkan pesan
 * "Error di Method B". Blok finally tetap dijalankan sehingga pesan
 * "Ini selalu dicetak" akan selalu muncul.
 */
