# «Счётчик шагов».

## Постановка задачи

Компания по производству спортивных носков решила разработать свой счётчик шагов для дополнительной мотивации ведения здорового образа жизни. Написать прототип приложения поручили вам.
Оно должно предоставлять следующий функционал:

* Консольный интерфейс для управления программой;
* Хранение данных о количестве пройденных шагов;
* Ввод вашей цели по количеству шагов в день;
* Ввод пройденного количества шагов за день;
* Вывод статистики за определённый месяц.

## Класс Main

В этом классе должен быть реализован основной цикл приложения — считывание команд и вызов соответствующих методов основного класса приложения — StepTracker. Вся работа с пользовательским вводом и выводом должна осуществляться в этом классе.
Пользователь взаимодействует с приложением через консольный интерфейс, который позволяет произвести одно из действий по выбору:
* Ввести количество шагов за определённый день;
* Напечатать статистику за определённый месяц;
* Изменить цель по количеству шагов в день;
* Выйти из приложения.

После выбора и исполнения действия, программа должна позволять пользователю ввести следующее действие. Программа должна завершаться только при вводе пользователем команды выхода. При вводе несуществующей команды должно выводиться сообщение о том, что такой команды нет, после чего приложение позволяет снова выбрать следующее действие. Формат сообщений вы выбираете сами.

## Класс StepTracker

Это класс с основной логикой приложения — в нём хранится информация о пройденных шагах, реализована логика по сохранения и изменению количества шагов, а так же рассчитывается статистика.

В классе должна быть реализована следующая функциональность:

- Сохранение количества шагов за день. Пользователь должен указать название месяца, номер дня и количество шагов, пройденных в этот день. Количество шагов должно быть неотрицательным. Для ускорения прототипирования на данном этапе считается, что в месяце ровно 30 дней. Если за какой-то день статистика не сохранялась, то считаем количество шагов в этот день равным 0.
- Подсчёт и вывод статистики за указанный пользователем месяц. В статистике должны быть следующие данные:

## Класс Converter

В этом классе осуществляется преобразование шагов в километры и калории.

## Язык

Java 11
