# UI-автотесты
![junit](https://img.shields.io/maven-central/v/junit/junit?versionSuffix=4.13.2&label=Junit) ![Selenium](https://img.shields.io/maven-central/v/org.seleniumhq.selenium/selenium-java?versionPrefix=4.14.1&label=Selenium) JDK 17
___
Написать автоматические тесты, покрывающие следующие кейсы:

> Кейс 1 Разница двух целых чисел

1.  Открыть сайт [https://testsheepnz.github.io/BasicCalculator.html](https://testsheepnz.github.io/BasicCalculator.html)
2.  Проскроллить вниз до конца
3.  Выбрать сборку (Build) «Prototype»
4.  Ввести в поле First number значение «2»
5.  Ввести в поле Second number значение «3»
6.  Выбрать операцию (Operation) «Subtract»
7.  Нажать на кнопку «Calculate»
8.  Проверить, что в поле ответа (Answer) значение равно «-1»

> Кейс 2 Конкатенация двух строк.

1.  Открыть сайт [https://testsheepnz.github.io/BasicCalculator.html](https://testsheepnz.github.io/BasicCalculator.html)
2.  Проскроллить вниз до конца
3.  Выбрать сборку (Build) «Prototype»
4.  Ввести в поле First number значение «gs»
5.  Ввести в поле Second number значение «bu»
6.  Выбрать операцию (Operation) «Concatenate»
7.  Нажать на кнопку «Calculate»
8.  Проверить, что в поле ответа (Answer) значение равно «gsbu»

> Кейс 3 Появление сообщения при вводе строки в поле

1.  Открыть сайт [https://testsheepnz.github.io/random-number.html](https://testsheepnz.github.io/random-number.html)
2.  Проскроллить вниз до конца
3.  Выбрать сборку (Select Build) «Demo»
4.  Нажать на кнопку «Roll the dice»
5.  Ввести в поле значение «string»
6.  Нажать на кнопку «Submit»
7.  Проверить, что появилось сообщение «string: Not a number!»

> Ожидаем выполнение данной задачи со следующим стеком технологий:

1.  Java
2.  Junit
3.  Maven
4.  Selenium/Selenide
5.  Использование паттерна PageObject
## Структура проекта
**src/test/java/org/nandi/AppTest.java** - Основной файл с тестами

**src/test/java/org/nandi/pages** - Каталок с классами страниц


## Запуск проекта
Для запуска тестирования, в консоли прописываем
```
mvn install
```
После запуска установятся все используемые библиотеки, и выполнятся тесты
