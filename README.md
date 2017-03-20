# LinguaLeo-Robot #

Робот, который выполняет добавление английских слов в словарь сайта **LinguaLeo**

### Описание проекта:
В **resources/Words.txt** хранятся английские слова, которые должны быть добавлены в словарь.  
В классе **NewWordsRead** реализован метод, который считывает слова из текст. файла  и сортирует их по алфавиту.  
В **TextTransfer** методы выполняют функции обработки данных из буфера обмена.  
В **Commands** реализованы методы, которые описывают действия робота: левый клик мышкой, вставка текста из буфера обмена, ожидание соответствующего цвета пикселя и т. д.  
А в **CommInterfaces** объявлены методы, которые реализованы в Commands и написаны комментарии к ним.  
В **RobotApp** выполняются непосредственно инструкции для робота и вызов основных методов.  

Демонстрацию работы робота посмотреть перейдя по этой ссылке:  
https://www.dropbox.com/s/33vjlp7l9io6g1s/LinguaLeoRobot%20Demonstration.mov?dl=0
