# EasyMask-App

This simple application in an outcome of team end-of-term university project. EasyMask app is supposed to help it's user to keep track of current restrictions in our country, as well as provide daily number of total cases, deaths and cured CoVid-19 patients both worldwide and in our country(Poland). Last, the 3rd page is supposed to help to keep the track of "freshness" of the currently worn mask (Unfortunatelly this aspect of this app isn't actually finished due to lack of time and the fact that an external device for measuring the time of each mask is required).   

Sites used for gathering displayed information:
- https://www.medonet.pl/koronawirus/to-musisz-wiedziec,zasieg-koronawirusa-covid-19--mapa-,artykul,54726942.html?utm_source=sgonet&utm_medium=referral&utm_campaign=mapasgonet&srcc=mapasgonet
- https://www.gov.pl/web/koronawirus/aktualne-zasady-i-ograniczenia

First page displays a set of current restrictions in Poland

![image](https://user-images.githubusercontent.com/73364581/113206753-2209eb80-9270-11eb-8aa9-bd038a0f860e.png)

Second page conitains fields with present-day's date and basic information such as daily confirmed cases and death due to Covid

![image](https://user-images.githubusercontent.com/73364581/113208104-b759af80-9271-11eb-8274-af396092842a.png)

Third page allows the user to keep track of his/her currently used masks. Each mask-element should display it's current state which are: Fresh, Stale and Needed for replacement. App user is able to add and remove masks from the list using two buttons on the bottom of the screen respectively "Dodaj maseczkę" and "Usuń maseczkę".

![image](https://user-images.githubusercontent.com/73364581/113208784-7e6e0a80-9272-11eb-9954-f602c30ea82b.png)

Technologies Used:
- Android Studio
- Java
- Jsoup external library (for scraping necessary data)
