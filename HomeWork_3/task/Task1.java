package task;

public class Task1 {
    public static int[] mergeSort(int[] array) {
        int[] tmp; // временный массив
        int[] currentSrc = array; // массив источник
        int[] currentDest = new int[array.length];//массив приёмник

        int size = 1; // счётчик для слияния массивов
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;

            System.out.println(arrayToString(currentSrc));
        }
        return currentSrc;
    }
/*
    int[] src1 - 1 массив
    int src1Start - элемент с которого начинается слияние 1 - массива
    int[] src2 - 2 массив
    int src2Start - элемент с которого начинается слияние 2 - массива
    int[] dest - массив приёмник
    int destStart - элемент с которого начинаем запись в массив приёмник
    int size - показатель записи размера подмассива
 */
    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest,
                              int destStart, int size) {
        int index1 = src1Start; //индексы для сортировки
        int index2 = src2Start; //индексы для сортировки

        //вычисляем концы массива с учётом границ массивов в котором подмассивы содержаться
        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        // вычисляем итерации цикла для того что бы объденить два массива
        int iterationCount = src1End - src1Start + src2End - src2Start;//суммарное кол-во элементов в обоих подмассивов

        //если элемент за бортом
        if (src1Start + size > src1.length) {
            for (int i = src1Start; i < src1End; i++) {
                dest[i] = src1[i];
            }
            return;
        }

        for (int i = destStart; i < destStart + iterationCount; i++) {
            //обработка ситуации когда в заканчиваются элементы
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }

    public  static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
