package Seminar1;
//Необходимо написать алгоритм поиска всех доступных комбинаций
//(посчитать количество) для количества кубиков K с количеством граней N.
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int facet = scanner.nextInt();
        int count = 0;
        scanner.close();
        count = getCount(facet, count);
        System.out.println("count = " + count);
    }

    /**
     * Алгоритм поиска всех доступных комбинаций для 4 кубиков с количеством граней N.
     * @param facet - количество граней
     * @param count - счетчик вхождений цикла
     * @return - возвращаем счетчик
     */
    private static int getCount(int facet, int count) {
        for (int i = 0; i < facet; i++) {
            for (int j = 0; j < facet; j++) {
                for (int k = 0; k < facet; k++) {
                    for (int l = 0; l < facet; l++) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
