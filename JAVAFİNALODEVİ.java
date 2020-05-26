  // Top adında üstsınıf oluşturup, basket ve futbol topları gibi  alt sınıflar oluştururak nesneler oluşturup üst sınıflarından aldıkları özellikleri ve metodları kullanıcaz 
package javafinalodevi;


  class Top //Üst sınıf(super class) sınıfımızı oluşturuyoruz böylece alt sınıfları oluşturucak ve özelliklerini miras bırakıcaz
    {
        
           String renk; // topun özellikleri olan değişkenlerimizi tanımlıyoruz     
          int hacim,basınc,agırlık;
         
        public Top() //üst sınıfın yapıcısı oluşturuyoruz böylece alt sınıflar hangi class dan miras aldıklarını görebilecekler
        {
            System.out.println("top sınıfının yapıcısı "); // yapıcı çağrıldığında ekrana hangi sınıfın yapıcısı olduğunu belirten ekrana yazdırma kodu 
        }
          void ozellik(String r,int h,int b, int a) //oluşturucağımız nesnenin özelliklerini isteyecek metod 
         {
             renk=r;
             hacim=h;
             basınc=b;
             agırlık=a;
             
         }
        
        void zıpla() //kullanıcının nesneyi oluşturduktan sonra fonksiyon olarak kullanacağı metod, bu metod ekrana topun zıpladığını yazıcak
        {
            System.out.println("top zıplıyor");
        }
        
        void ekranaYaz() // bu metod ise kullanıcıdan aldığımız özellikleri ekrana yazdırıcak 
        {
            System.out.println("Renk:"+renk+" hacim: "+hacim+" basınc: "+basınc+" agırlık: "+agırlık);
        }
    }
    class futboltopu extends Top // Üst sınıft olan Top classından futboltopu classını oluşturuyoruz böylece üst sınıftan miras alıcak
    {
       public futboltopu()// oluşturduğumuz alt sınıfının yapıcısı, ekrana miras aldığı sınıfı yazdırıcak
       {
           System.out.println("futbol sınıfının yapıcısı");
       }
        
    }
   
    class basketboltopu extends Top // Üst sınıft olan Top classından basketboltopu classını oluşturuyoruz böylece üst sınıftan miras alıcak
    {
        public basketboltopu() // oluşturduğumuz alt sınıfının yapıcısı, ekrana miras aldığı sınıfı yazdırıcak
        {
            System.out.println("basketbol sınıfının yapıcısı");
        }
    }
public class JAVAFİNALODEVİ {


    public static void main(String[] args) 
    {
      
       basketboltopu bskt=new basketboltopu(); // basketboltopu kullanarak değişken tanımlıyoruz, değişken oluşturulduğu sınıfın metodlarına ulaşabilecek 
       
       bskt.ozellik("siyah", 4, 5, 6); //oluşturduğumuz değişken ile özellik metoduna ulaşıp içine verileri giriyoruz
       bskt.zıpla(); // Top classından miras alınan zıplama metodunu kullanıyoruz
       bskt.ekranaYaz(); // Kullanıcıdan aldığımız verileri ekrana yazdırıyoruz 
    }

}
