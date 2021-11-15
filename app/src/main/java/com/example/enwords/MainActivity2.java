package com.example.enwords;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.HashMap;

/** Класс для создания страницы выбора категории */
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    Category category;
    /**Выбор категории теста Shopping
     * @param view Внешнее представление кнопки 1*/
    public void onButtonClickCategory1(View view) {
        HashMap<String, String> shopping  = new HashMap<>();
        shopping.put("shop [ʃɒp]", "магазин");
        shopping.put("clothes [kloʊðz]", "одежда");
        shopping.put("discount [ˈdɪskaʊnt]", "скидка");
        shopping.put("shop assistant [ʃɒp əˈsɪstənt]", "продавец");
        shopping.put("purchase [ˈpəːtʃɪs]", "покупка");
        shopping.put("sale [seɪl]", "продажа");
        shopping.put("cashier [kæˈʃɪə]", "кассир");
        shopping.put("receipt [rɪˈsiːt]", "чек");
        shopping.put("cash [kæʃ]", "наличные");
        shopping.put("credit card [ˈkrɛdɪt kɑːd]", "кредитная карта");
        shopping.put("delivery [dɪˈlɪvəri]", "доставка");
        shopping.put("T-shirt [ˈtiːʃəːt]", "футболка");
        shopping.put("shirt [ʃəːt]", "рубашка");
        shopping.put("trousers [ˈtraʊzəz]", "брюки");
        shopping.put("bag [bæɡ]", "сумка");
        shopping.put("wool [wʊl]", "шерсть");
        shopping.put("cotton [ˈkɑːtn]", "хлопок");
        shopping.put("leather [ˈlɛðə]", "кожа");
        shopping.put("jacket [ˈdʒakɪt]", "куртка");
        shopping.put("shoes [ʃuːz]", "туфли");
        shopping.put("jeans [dʒiːnz]", "джинсы");
        shopping.put("shorts [ʃɔːts]", "шорты");
        shopping.put("socks [ˈsɒks]", "носки");
        shopping.put("underwear [ˈʌndəwɛː]", "нижнее белье");
        shopping.put("money [ˈmʌni]", "деньги");
        shopping.put("trolley [ˈtrɒli]", "тележка");
        shopping.put("basket [ˈbɑːskɪt]", "корзина");
        shopping.put("fitting room [ˈfɪtɪŋ ruːm]", "примерочная");
        shopping.put("chip [tʃɪp]", "дешевый");
        shopping.put("expensive [ɪkˈspɛnsɪv]", "дорогой");
        shopping.put("coins [kɔɪnz]", "монеты");
        shopping.put("price [prʌɪs]", "цена");
        category = new Category(shopping);
        Intent intent3 =  new  Intent(this, MainActivity3.class);
        intent3.putExtra(Category.class.getSimpleName(),category);
        startActivity(intent3);
    }
    /**Выбор категории теста Verbs
     *@param view  Внешнее представление кнопки 2*/
    public void onButtonClickCategory2(View view) {
        HashMap<String, String> verb  = new HashMap<>();
        verb.put("do [duː]", "делать");
        verb.put("go [ɡəʊ]", "идти");
        verb.put("work [wɜːk]", "работать");
        verb.put("eat [iːt]", "кушать");
        verb.put("see [siː]", "видеть");
        verb.put("watch [wɒtʃ]", "смотреть");
        verb.put("think [θɪŋk]", "думать");
        verb.put("buy [baɪ]", "покупать");
        verb.put("choose [tʃuːz]", "выбирать");
        verb.put("say [seɪ]", "сказать");
        verb.put("speak [spiːk]", "разговаривать");
        verb.put("feel [fiːl]", "чувствовать");
        verb.put("play [pleɪ]", "играть");
        verb.put("teach [tiːtʃ]", "учить кого-то");
        verb.put("sleep [sliːp]", "спать");
        verb.put("give [ɡɪv]", "давать");
        verb.put("take [teɪk]", "брать");
        verb.put("have [hæv]", "иметь");
        verb.put("hear [hɪə]", "слышать");
        verb.put("love [lʌv]", "любить");
        verb.put("live [lɪv]", "жить");
        verb.put("listen [ˈlɪsn]", "слушать");
        verb.put("want [wɒnt]", "хотеть");
        verb.put("use [juːz]", "использовать");
        verb.put("ask [ɑːsk]", "спрашивать");
        verb.put("get [ɡet]", "получать");
        verb.put("run [rʌn]", "бежать");
        verb.put("pay [peɪ]", "платить");
        verb.put("help [help]", "помогать");
        verb.put("win [wɪn]", "побеждать");
        verb.put("lose [luːz]", "терять");
        verb.put("sell [sel]", "продавать");
        verb.put("kill [kɪl]", "убивать");
        verb.put("cut [kʌt]", "резать");
        verb.put("stop [stɒp]", "остановить");
        verb.put("travel [ˈtrævl]", "путешествовать");
        verb.put("drive [draɪv]", "ехать");
        verb.put("accept [əkˈsept]","принимать");
        verb.put("add [æd]","добавлять");
        verb.put("agree [əˈɡriː]","соглашаться");
        verb.put("answer [ˈɑːnsə]","отвечать");
        verb.put("become [bɪˈkʌm]","становиться");
        verb.put("begin [bɪˈɡɪn]","начинать");
        verb.put("believe [bɪˈliːv]","верить");
        verb.put("borrow [ˈbɒrəʊ]","занимать");
        verb.put("break [breɪk]","ломать");
        verb.put("cancel [ˈkænsl]","отменять");
        verb.put("change [tʃeɪndʒ]","менять");
        verb.put("clean [kliːn]","чистить");
        verb.put("close [kləʊz]","закрывать");
        verb.put("come [kʌm]","приходить");
        verb.put("count [kaʊnt]","считать");
        verb.put("dance [dɑːns]","танцевать");
        verb.put("decide [dɪˈsaɪd]","решать");
        verb.put("drink [drɪŋk]","пить");
        verb.put("fly [flaɪ]","летать");
        verb.put("learn [lɜːn]","учить");
        verb.put("lie [laɪ]","лгать");
        verb.put("own [əʊn]","иметь");
        verb.put("open [ˈəʊpən]","открывать");
        verb.put("read [riːd]","читать");
        verb.put("remember [rɪˈmembə]","помнить");
        verb.put("swim [swɪm]","плыть");
        verb.put("write [raɪt]","писать");
        verb.put("wear [weə]","носить");
        verb.put("try [traɪ]","пробовать");
        verb.put("translate [trænsˈleɪt]","переводить");
        category = new Category(verb);
        Intent intent3 =  new  Intent(this, MainActivity3.class);
        intent3.putExtra(Category.class.getSimpleName(),category);
        startActivity(intent3);
    }
    /**Выбор категории теста Phrases
     * @param view Внешнее представление кнопки 3*/
    public void onButtonClickCategory3(View view) {
        HashMap<String, String> phrase  = new HashMap<>();
        phrase.put("i want... [aɪ wɒnt]", "я хочу...");
        phrase.put("i need... [aɪ niːd]", "мне нужно... ");
        phrase.put("where is the toilet? [weə ɪz ðə ˈtɔɪlɪt]", "где туалет?");
        phrase.put("excuse me [ɪkˈskjuːz mɪ]", "извините меня");
        phrase.put("i'm sorry [aɪm ˈsɒri]", "мне жаль");
        phrase.put("hello [həˈləʊ]", "здравствуйте");
        phrase.put("good morning [gʊd ˈmɔːnɪŋ]", "доброе утро");
        phrase.put("good afternoon [gʊd ˈɑːftəˈnuːn]", "добрый день");
        phrase.put("good evening [gʊd ˈiːvnɪŋ]", "добрый вечер");
        phrase.put("goodbye [ɡʊdˈbʌɪ]", "досвидания");
        phrase.put("please [pliːz]", "пожалуйста");
        phrase.put("how do you do? [haʊ duː juː duː]", "как дела?");
        phrase.put("how much does it cost? [ˈhaʊ ˈmʌtʃ dʌz ɪt kɒst]", "сколько это стоит");
        phrase.put("thank you [θæŋk juː]", "спасибо");
        phrase.put("here you are [hɪə juː ɑː]", "возьмите");
        phrase.put("could i have the bill please? [kʊd aɪ hæv ði: bɪl pliːz]", "можно пожалуйста счет?");
        phrase.put("could i have the menu please? [kʊd aɪ hæv ði: ˈmenjuː pliːz]", "можно пожалуйста меню?");
        phrase.put("help! [help]", "помогите!");
        phrase.put("call the police! [kɔːl ði: pəˈliːs]", "вызовите полицию!");
        phrase.put("call an ambulance! [kɔːl æn ˈæmbjələns]", "вызовите скорую помощ!");
        phrase.put("i don't speak English [aɪ dəʊnt spiːk ˈɪŋɡlɪʃ]", "я не говорю по-англитйски");
        phrase.put("hi [haɪ]", "привет");
        phrase.put("it's ok [ɪts ˌəʊˈkeɪ]", "все нормально");
        phrase.put("i don't understand [aɪ dəʊnt ʌndəˈstand]", "я не понимаю");
        phrase.put("turn left [tɜːn left]", "поверните налево");
        phrase.put("turn right [tɜːn rʌɪt]", "поверните направо");
        phrase.put("go straight ahead [ɡəʊ streɪt əˈhɛd]", "идите прямо");
        phrase.put("go back [ɡəʊ ˈbæk]", "идите назад");
        phrase.put("be careful [bi ˈkɛːfʊl]", "будте осторожнее");
        phrase.put("fire! [ˈfaɪə]", "пожар!");
        phrase.put("i'm lost [aɪm lɒst]", "я заблудился");
        category = new Category(phrase);
        Intent intent3 =  new  Intent(this, MainActivity3.class);
        intent3.putExtra(Category.class.getSimpleName(),category);
        startActivity(intent3);
    }
    /**Выбор категории теста Food
     * @param view Внешнее представление кнопки 4 */
    public void onButtonClickCategory4(View view) {
        HashMap<String, String> food  = new HashMap<>();
        food.put("apple [ˈæpl]", "яблоко");
        food.put("meat [miːt]", "мясо");
        food.put("milk [mɪlk]", "молоко");
        food.put("water [ˈwɔːtə]", "вода");
        food.put("juice [dʒuːs]", "сок");
        food.put("soda [ˈsəʊdə]", "газировка");
        food.put("beer [bɪə]", "пиво");
        food.put("tea [tiː]", "чай");
        food.put("coffee [ˈkɒfɪ]", "кофе");
        food.put("fish [fɪʃ]", "рыба");
        food.put("rise [raɪz]", "рис");
        food.put("bread [bred]", "хлеб");
        food.put("potato [pəˈteɪtəʊ]", "картофель");
        food.put("orange [ˈɔːrɪndʒ]", "апельсин");
        food.put("peach [piːtʃ]", "персик");
        food.put("strawberry [ˈstrɔːberɪ]", "клубника");
        food.put("wine [waɪn]", "вино");
        food.put("grape [ɡreɪp]", "виноград");
        food.put("porridge [ˈpɒrɪdʒ]", "каша");
        food.put("salad [ˈsæləd]", "салат");
        food.put("tomato [təˈmɑːtəʊ]", "помидор");
        food.put("onion [ˈʌnjən]", "лук");
        food.put("sugar [ˈʃʊɡə]", "сахар");
        food.put("carrot [ˈkærət]", "морковь");
        food.put("cucumber [ˈkjuːkʌmbə]", "огурец");
        food.put("cheese [tʃiːz]", "сыр");
        food.put("egg [eɡ]", "яйцо");
        food.put("butter [ˈbʌtə]", "сливочное мало");
        food.put("ice-cream [aɪs ˈkriːm]", "мороженое");
        food.put("yogurt [ˈjɒɡət]", "йогурт");
        food.put("cake [keɪk]", "торт");
        food.put("salt [sɔːlt]", "соль");
        food.put("oil [ɔɪl]", "подсолнечное масло");
        food.put("pepper [ˈpepə]", "перец");
        category = new Category(food);
        Intent intent3 =  new  Intent(this, MainActivity3.class);
        intent3.putExtra(Category.class.getSimpleName(),category);
        startActivity(intent3);
    }
}