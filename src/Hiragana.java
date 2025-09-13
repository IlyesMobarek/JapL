import java.util.*;

public class Hiragana {
    private Map<String,String> hiragana;
    private Random rand = new Random();
    private List<String> hira = new ArrayList<>();

    public Hiragana() {
        hiragana = new HashMap<String, String>();

        hiragana.put("あ", "A");
        hiragana.put("い", "I");
        hiragana.put("う", "U");
        hiragana.put("え", "E");
        hiragana.put("お", "O");

        hiragana.put("か", "KA");
        hiragana.put("き", "KI");
        hiragana.put("く", "KU");
        hiragana.put("け", "KE");
        hiragana.put("こ", "KO");

        hiragana.put("さ", "SA");
        hiragana.put("し", "SHI");
        hiragana.put("す", "SU");
        hiragana.put("せ", "SE");
        hiragana.put("そ", "SO");

        hiragana.put("た", "TA");
        hiragana.put("ち", "CHI");
        hiragana.put("つ", "TSU");
        hiragana.put("て", "TE");
        hiragana.put("と", "TO");

        hiragana.put("な", "NA");
        hiragana.put("に", "NI");
        hiragana.put("ぬ", "NU");
        hiragana.put("ね", "NE");
        hiragana.put("の", "NO");

        hiragana.put("は", "HA");
        hiragana.put("ひ", "HI");
        hiragana.put("ふ", "FU");
        hiragana.put("へ", "HE");
        hiragana.put("ほ", "HO");

        hiragana.put("ま", "MA");
        hiragana.put("み", "MI");
        hiragana.put("む", "MU");
        hiragana.put("め", "ME");
        hiragana.put("も", "MO");

        hiragana.put("や", "YA");
        hiragana.put("ゆ", "YU");
        hiragana.put("よ", "YO");

        hiragana.put("ら", "RA");
        hiragana.put("り", "RI");
        hiragana.put("る", "RU");
        hiragana.put("れ", "RE");
        hiragana.put("ろ", "RO");

        hiragana.put("わ", "WA");
        hiragana.put("を", "WO");
        hiragana.put("ん", "N");
    }

    public String getHiragana(String l) {
        return hiragana.getOrDefault(l,"");
    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public String selectHiragana() {
        clearConsole();
        String rep="";
        for(String k : hiragana.keySet()){
            hira.add(k);
        }
        int randomIndex = rand.nextInt(hira.size());
        String carac = hira.get(randomIndex);
        System.out.println("Hiragana "+carac + "\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la phonetique : ");
        String entree = scanner.nextLine();
        entree = entree.toUpperCase();
        if(hiragana.get(carac).equals(entree)){
            rep=" Vous avez bon !";
        }else{
            rep="FAUX ! "+ carac + "correspond a :" + hiragana.get(carac);
        }
        return rep;
    }


}
