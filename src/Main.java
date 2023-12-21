import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean continueExecution = true;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        while (continueExecution) {
            //Task roster
            int numberOfTask = taskRoaster();
            switch (numberOfTask) {
                case 1: {
                    task1(arr);
                    break;
                }
                case 2: {
                    task2(arr);
                    break;
                }
                case 3: {
                    task3(arr);
                    break;
                }
                case 4: {
                    task4(arr);
                    break;
                }
                case 5: {
                    task5(arr);
                    break;
                }
                case 6: {
                    task6(arr, 3);
                    break;
                }
                case 7: {
                    task7(arr);
                    break;
                }
                default:
                    System.out.println("\nВыберите задание!");
                    break;
            }
            nextTaskQuestion();
        }


    }

    public static int taskRoaster() {
        System.out.print("Выберите задание для проверки: ");
        return scanner.nextInt();
    }

    public static void nextTaskQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Хотите проверить другую задачу?  Да/Нет: ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("да") || choice.equalsIgnoreCase("yes")) {
            continueExecution = true;
        } else if (choice.equalsIgnoreCase("нет") || choice.equalsIgnoreCase("no")) {
            scanner.close();
            continueExecution = false;
        }
    }

    public static void task1(int[] arr) {
        //Напишите метод, вычисляющий сумму элементов
        //массива. Массив передаётся в качестве параметра
        int sumOfElements = 0;

        for (int j : arr) {
            sumOfElements += j;
        }

        System.out.println("Сумма элементов массива: " + sumOfElements);
    }

    public static void task2(int[] arr) {
        //Напишите метод для нахождения максимума в массиве. Массив передаётся в качестве параметра.
        Arrays.sort(arr);

        System.out.println("Максимальное значение в массиве: " + arr[arr.length - 1]);
    }

    public static void task3(int[] arr) {
        //Напишите метод, определяющий количество чётных,
        //нечётных, положительных, отрицательных элементов
        //массива. Массив передаётся в качестве параметра.
        int evenNumsCounter = 0;
        int oddNumsCounter = 0;
        int negativeNumsCounter = 0;
        int positiveNumsCounter = 0;

        for (int j : arr) {
            if (j % 2 == 0) {
                evenNumsCounter++;
            }
            if (j % 2 != 0) {
                oddNumsCounter++;
            }
            if (j < 0) {
                negativeNumsCounter++;
            }
            if (j > 0) {
                positiveNumsCounter++;
            }
        }
        System.out.println(
                "Количество чётных чисел в массиве: " + evenNumsCounter
                        + "\n"
                        + "Количество нечетных чисел в массиве: " + oddNumsCounter
                        + "\n"
                        + "Количество отрицательных чисел в массиве " + negativeNumsCounter
                        + "\n"
                        + "Количество положительных чисел в массиве: " + positiveNumsCounter
        );
    }

    public static void task4(int[] arr) {
        //Напишите метод, сортирующий массив по убыванию или возрастанию в зависимости от выбора
        //пользователя.

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Введите \"1\", если хотите отсортировать массив по убыванию."
                        + "\n"
                        + "Введите \"2\", если хотите отсортировать массив по возрастанию."
        );
        System.out.print("Ввод: ");
        int usersChoice = scanner.nextInt();

        switch (usersChoice) {
            case 1: {
                task5(arr);
                break;
            }
            case 2: {
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
                break;
            }
        }
    }

    public static void task5(int[] arr) {
        //Напишите метод, переворачивающий содержимое
        //массива.
        int arrStart = 0;
        int arrEnd = arr.length - 1;
        for (int i = arrStart; arrStart < arrEnd; i++) {
            int temp = arr[i];
            arr[i] = arr[arrEnd];
            arr[arrEnd] = temp;
            arrStart++;
            arrEnd--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void task6(int[] arr, int numToSearch) {
        //Напишите метод, который ищет некоторое число
        //с помощью двоичного поиска

        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, numToSearch);

        if (index < 0) {
            System.out.println("Такого числа в массиве нет!");
        } else System.out.println("Искомое число найдено под индексом: " + index);
    }

    public static void task7(int[] arr) {
        //Напишите метод, высчитывающий факториал каждого элемента массива. Метод возвращает новый массив,
        //содержащий полученные факториалы.
        int[] arrForFactorial = new int[arr.length];
        for (int i = 0; i < arrForFactorial.length; i++) {
            arrForFactorial[i] = returnFact(arr[i]);
        }

        System.out.println(Arrays.toString(arrForFactorial));
    }

    public static int returnFact (int n) {
        if (n == 1) {
            return n;
        } else if (n == 2) {
            return n;
        } else return returnFact(n - 1) * n;
    }
}
