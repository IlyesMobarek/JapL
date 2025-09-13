import java.util.*;

public class Katakana {
    private Map<String, String> katakana;
    private Random rand = new Random();
    private List<String> kata = new ArrayList<>();

    public Katakana() {
        katakana = new HashMap<String, String>();

        katakana.put("ア", "A");
        katakana.put("イ", "I");
        katakana.put("ウ", "U");
        katakana.put("エ", "E");
        katakana.put("オ", "O");

        katakana.put("カ", "KA");
        katakana.put("キ", "KI");
        katakana.put("ク", "KU");
        katakana.put("ケ", "KE");
        katakana.put("コ", "KO");

        katakana.put("サ", "SA");
        katakana.put("シ", "SHI");
        katakana.put("ス", "SU");
        katakana.put("セ", "SE");
        katakana.put("ソ", "SO");

        katakana.put("タ", "TA");
        katakana.put("チ", "CHI");
        katakana.put("ツ", "TSU");
        katakana.put("テ", "TE");
        katakana.put("ト", "TO");

        katakana.put("ナ", "NA");
        katakana.put("ニ", "NI");
        katakana.put("ヌ", "NU");
        katakana.put("ネ", "NE");
        katakana.put("ノ", "NO");

        katakana.put("ハ", "HA");
        katakana.put("ヒ", "HI");
        katakana.put("フ", "FU");
        katakana.put("ヘ", "HE");
        katakana.put("ホ", "HO");

        katakana.put("マ", "MA");
        katakana.put("ミ", "MI");
        katakana.put("ム", "MU");
        katakana.put("メ", "ME");
        katakana.put("モ", "MO");

        katakana.put("ヤ", "YA");
        katakana.put("ユ", "YU");
        katakana.put("ヨ", "YO");

        katakana.put("ラ", "RA");
        katakana.put("リ", "RI");
        katakana.put("ル", "RU");
        katakana.put("レ", "RE");
        katakana.put("ロ", "RO");

        katakana.put("ワ", "WA");
        katakana.put("ヲ", "WO");
        katakana.put("ン", "N");
    }

    public String getKatakana(String k) {
        return katakana.getOrDefault(k, "");
    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public String afficheKatakana(){
        String phrase = "";
        for(String k : katakana.keySet()){
            phrase += k + " - " + katakana.get(k) + "\n";
        }
        return phrase;
    }

    public String affichKatakana(){
        String phrase = "";
        for(String k : katakana.keySet()){
            phrase += k + " - " + katakana.get(k) + "\n";
        }
        System.out.println(phrase);
        return phrase;
    }

    public String selectKatakana() {
        clearConsole();
        String rep="";
        for(String k : katakana.keySet()){
            kata.add(k);
        }
        int randomIndex = rand.nextInt(kata.size());
        String carac = kata.get(randomIndex);
        System.out.println("katakana "+carac + "\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la phonetique : ");
        String entree = scanner.nextLine();
        entree = entree.toUpperCase();
        if(katakana.get(carac).equals(entree)){
            rep=" Vous avez bon !";
        }else{
            rep="FAUX ! "+ carac + " correspond a : " + katakana.get(carac);
        }
        System.out.println(rep);
        return rep;
    }
}
