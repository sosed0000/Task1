# Task1

1. Написати програму, яка розраховує суму двох дійсних чисел введених у 
консоль. Результат вивести у консоль у форматованому вигляді з одним 
знаком після коми.
2. Написати програму, яка приймає данні з консолі та формує з них один рядок. 
Отримані данні у рядку повинні розділятися пропуском. Ліворуч і праворуч 
рядок не повинен містити пропуски. Вивести результуючий рядок у консоль.
3. Написати програму, що визначає найбільший спільний дільник двох цілих 
чисел. Результат вивести у консоль.
4. Написати програму, яка обчислює суму окремих розрядів цілого числа. 
Результат вивести у консоль.
5. Написати програму, яка визначить и виведе усі прості числа в діапазоні від 
1 до n (число n вводиться у консоль).
6. Стовпці електронних таблиць (типу Excel) мають буквену нумерацію у 
вигляді латинських великих літер (послідовно, зліва направо):
A, B, ..., Y, AA, AB, ..., AY, AZ, BA, BB, … тощо.
При цьому кожна графа має свій порядковий номер: А - 1; Б - 2; ... ; Y - 25; … 
тощо
Напишіть клас, який містить такі три методи:
 метод визначення порядкового номера стовпця за його буквеним 
номером
 метод визначення літери стовпця за його порядковим номером
 використовуючи літеру стовпця, напишіть метод визначення номера 
стовпця, який розміщено праворуч від заданого.
Кожне з завдань оформити у вигляді оремого класу. Результат має бути 
представлений у вигляді проекту під назвою Task1. Крім того, додайте 
демонстраційний клас до кореневого пакета, який демонструє дії всіх 6 
підзадач, наприклад, таким чином:
public class Demo {
 public static void main(String[] args) {
 SubTask1.main(new String[] {"5", "6"});
 SubTask2.main(new String[] {"string1", "string2"});
 SubTask3.main(new String[] {"45", "67"});
 SubTask4.main(new String[] {"45"});
 SubTask5.main(new String[] {"10"});
 SubTask6.main(null);
 }
}
