import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBaslat {


    @Test
    public void baslangic(){

        System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\SeleniumDrivers\\geckodriver.exe");
        String expectedUrl = "https://www.n11.com";

        WebDriver driver = new FirefoxDriver ();
        driver.manage ().window ().maximize ();
        driver.get(expectedUrl);



        // Login Sayfasının çalıştırılması.
        Login login =new Login ( driver );
        login.signButton ();
        login.setMail ( "deneme4141@gmail.com" );
        login.setPassword ( "Deneme4141" );



        //Search işleminin yapılması.
        Search search = login.loginButton ();
        search.kelimeGirisi ();
        search.aramaYap ();



        //Aranan Kelimenin Kontrolü

        SearchCheck searchCheck = new SearchCheck ( driver );
       // SearchCheck searchCheck = search.aramaYap ();

        boolean arananKelime = searchCheck.karsilastimaKontrol ();
        Assert.assertTrue ( "Aranan kelimeye ait Sonuç bulunamadı!",arananKelime);



        //Doğru sayfa'da bulunma kontrolü
        PageCheck pageCheck = new PageCheck ( driver );
        pageCheck.sayfayiBul ();
        boolean arananSayfa = pageCheck.sayfaOnay ();
        Assert.assertTrue ( "Doğru Sayfada değilsiniz!" ,arananSayfa );


        //Üstten 3. ürünün favorilere eklenmesi
        FavoriteProduct favoriteProduct = new FavoriteProduct ( driver );
        favoriteProduct.urunIdsi ();
        favoriteProduct.urunuFavoriEkle ();


        //Favori sayfasının açılması
        FavoritePageClick favoritePageClick = new FavoritePageClick ( driver );
        favoritePageClick.sayfaClick ();


        //Bir Onceki sayfada izlemeye alinmis ürünün karşılaştırılıp onaylanması.
        PageControl pageControl = new PageControl (driver);
        boolean idKarsilastirma = pageControl.karsilastirma ();
        Assert.assertTrue ( "Karşılaştırılan id'ler eşit değil!" ,idKarsilastirma);

        //Ürünü favorilerden kaldırıp , favori ürünün olmadığını onaylama.
        ProductRemoval productRemoval = new ProductRemoval (driver);
        productRemoval.urunuKaldir ();
        boolean mesaj = productRemoval.urunMesaj ();
        Assert.assertTrue ( "Urun mesaji kontrolunde problem oluştu!" , mesaj );




    }

}
