3.1 Service. Создать сервис для проигрывания файла музыки, формат не важен (.mp3), хранитьcя файл должен в папке raw ресурсов приложения.

На экране должны присутствовать три кнопки — play, pause и stop с соответствующим функционалом, над ними должно располагаться название песни,

исполнитель и жанр (хардкод в три строки). Музыка должна проигрываться при выключении экрана, при рестарте приложения проигрывание должно начинаться с момента,

на котором оно было перезагружено.

3.2) Content Provider. Создать БД (SQLite) с десятью (минимум) музыкальными файлами необходимого формата.

При этом к каждому файлу в таблице должен быть привязан Исполнитель, Жанр и Название, сам файл можно хранить в папке raw, в

БД достаточно пути к нему (или хранить сам файл, на выбор). На главную активити внизу экрана необходимо добавить кнопку Выбрать исполнителя, 

которая открывает новую активити с двумя выпадающими списками (spinner) с дефолтными полями Выбрать исполнителя... и Выбрать жанр.... Ниже должен

отображаться стандартный список (recyclerview), отображающий искомый выбор в случае:

3.2.1)  Если выбран жанр, в списке отображаются все песни данного жанра.

уведомление главной активити об изменении файла с изменением информации над кнопками. Соответственно, 

при нажатии на play должен проигрываться выбранный файл.

Разрешено использовать только Core компоненты Android. Язык Java
