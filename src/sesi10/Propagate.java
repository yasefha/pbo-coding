package sesi10;

class Propagate {

 public static void main(String[] args)
 {
 try
 {
 System.out.println(reverse("This is a string"));
 }
 catch(Exception e)
 {
 System.out.println("The String was blank");
 }
 finally
 {
 System.out.println("All done");
 }
 }
 public static String reverse(String s) throws Exception
 {
 if(s.length()==0)
 {
	 throw new Exception();
	 }
	 String reverseStr = "";
	 for(int i=s.length()-1 ; i>=0 ; --i){
	 reverseStr+=s.charAt(i);
	 }
	 return reverseStr;
	 }
	}

/*
 * Analisa:
 * Program membalik isi string menggunakan method reverse(). Jika string
 * berisi karakter, hasil pembalikan akan ditampilkan. Namun jika string
 * dikosongkan (""), method reverse() melempar Exception karena panjang
 * string adalah 0. Exception tersebut ditangkap oleh catch sehingga
 * program menampilkan "The String was blank". Blok finally tetap
 * dijalankan dan mencetak "All done".
 */