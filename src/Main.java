//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Hiragana h = new Hiragana();
        System.out.println(h.getHiragana("ん"));


        Katakana k = new Katakana();
        System.out.println(k.getKatakana("ン")); // Affiche : N
        System.out.println(h.selectHiragana());
    }
}
