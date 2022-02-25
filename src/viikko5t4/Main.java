package viikko5t4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Puhelin puhelin1 = new Puhelin();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kokoa oma puhelin.");
        System.out.println("Käytetään 1=Broadcom-kaiutinta 2=Qualcomm-kaiutinta?");
        int kaiutin = scanner.nextInt();
        if (kaiutin == 1) {
            puhelin1.setKaiutin(new BroadcomKaiutin());
        }
        else if (kaiutin == 2) {
            puhelin1.setKaiutin(new QualcommKaiutin());
        }
        else {
            System.out.println("Tätä vaihtoehtoa ei ole.");
        }

        System.out.println("Käytetään 1=Broadcom-mikrofonia 2=Samsung-mikrofonia?");
        int mikrofoni = scanner.nextInt();
        if (mikrofoni == 1) {
            puhelin1.setMikrofoni(new BroadcomMikrofoni());
        }
        else if (mikrofoni == 2) {
            puhelin1.setMikrofoni(new SamsungMikrofoni());
        }
        else {
            System.out.println("Tätä vaihtoehtoa ei ole.");
        }

        System.out.println("Syötä äänenvoimakkuus.");
        int volyymi = scanner.nextInt();
        System.out.println("Avautuuko mikrofoni äänenvoimakkuudella: " + puhelin1.getMikrofoni().micOn());
        System.out.println("Voidaanko kaiutin laittaa päälle äänenvoimakkuudella: " + puhelin1.getKaiutin().unMute());
    }
}
