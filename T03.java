// 12S22008- RAHEL ULI ROTUA SIMANJUNTAK 
// 12S22050- YOHANA SITANGGANG 
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int stok;
        String iSBN, judul, penulis, tahunTerbit, penerbit, formatBuku, katarating, kategoridiskon, valorant, tuB;
        double harga, mm, rating, totaldiskon;
        
        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
                valorant = "betul";
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunTerbit = input.nextLine();
                penerbit = input.nextLine();
                formatBuku = input.nextLine();
                harga = Double.parseDouble(input.nextLine());
                mm = Double.parseDouble(input.nextLine());
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                totaldiskon = mm / harga * 100;
                if (totaldiskon >= 0) {
                    kategoridiskon = "---";
                } else {
                    if (totaldiskon >= -20) {
                        kategoridiskon = "No regret";
                    } else {
                        if (totaldiskon >= -40) {
                            kategoridiskon = "Never come twice";
                        } else {
                            kategoridiskon = "Once in a lifetime";
                        }
                    }
                }
                if (rating >= 4.7) {
                    katarating = "Best Pick";
                } else {
                    if (rating >= 4.5) {
                        katarating = "Must Read";
                    } else {
                        if (rating >= 4.0) {
                            katarating = "Recommended";
                        } else {
                            if (rating >= 3.0) {
                                katarating = "Average";
                            } else {
                                katarating = "Low";
                            }
                        }
                    }
                }
                if (katarating.equals("Best Pick") && kategoridiskon.equals("Once in a lifetime")) {
                    tuB = "The ultimate best";
                } else {
                    tuB = "---";
                }
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBuku + "|" + harga + "|" + mm + "|" + stok + "|" + rating + "|" + katarating + "|" + kategoridiskon + "|" + tuB);
                valorant = "sangat betul";
            }
        } while (valorant.equals("sangat betul"));
    }
}
