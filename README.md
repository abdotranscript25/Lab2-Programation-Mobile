

##   Description
Application Android réalisée dans le cadre du Lab 2 de développement mobile.  
Elle permet de calculer le montant total des impôts locaux en fonction de la surface, du nombre de pièces et de la présence d'une piscine.

##   Fonctionnalités
- Saisie du nom et de l'adresse** du propriétaire
- Saisie de la surface** (en m²)
- Saisie du nombre de pièces**
- Case à cocher** pour indiquer la présence d'une piscine
- Calcul automatique** avec la formule : (surface × 2) + (pièces × 50) + (piscine ? 100 : 0)
- Affichage personnalisé** du résultat avec le nom du propriétaire

##   Technologies utilisées
- Langage : Java
- SDK minimum : API 24 (Android 7.0)
- Layout : LinearLayout avec padding et gravité centrée
- Composants : EditText, CheckBox, Button, TextView

##   Captures d'écran

### activity_main.xml

<img width="871" height="803" alt="1" src="https://github.com/user-attachments/assets/32d62212-8a5c-411e-9241-a49071780d83" />

<img width="897" height="765" alt="2" src="https://github.com/user-attachments/assets/7ad3e005-1e58-44ac-a14e-260b4da5804c" />

<img width="868" height="800" alt="4" src="https://github.com/user-attachments/assets/349e2098-4176-4d5e-858a-9e34fcdc6bbc" />

<img width="1083" height="729" alt="5" src="https://github.com/user-attachments/assets/f143d028-b885-4fd9-9079-8d420edcd8d1" />


### MainActivity.java

<img width="998" height="807" alt="6" src="https://github.com/user-attachments/assets/d0e44cce-70db-46f4-84f7-1589f3b0be1c" />

<img width="889" height="498" alt="7" src="https://github.com/user-attachments/assets/7feb0289-a9bd-4876-91aa-8eaaa25b0ac6" />


### Interface de l'application

<img width="788" height="791" alt="8" src="https://github.com/user-attachments/assets/e0ea4fe4-37ee-4e5a-8cb7-8e5dffb8fc41" />


##   Démonstration vidéo

https://drive.google.com/file/d/17Uo_CJzJulnZW4Puk3xF3dv6iMKzllk9/view?usp=sharing

##   Structure du projet
- `app/src/main/java/com/example/lab2/MainActivity.java` : Code principal avec la logique de calcul
- `app/src/main/res/layout/activity_main.xml` : Interface utilisateur avec les champs de saisie
- `Screenshots/` : Captures d'écran et vidéo de démonstration
- `app/src/main/java/com/example/lab2/MainActivity.java` : Code principal avec la logique de calcul
- `app/src/main/res/layout/activity_main.xml` : Interface utilisateur avec les champs de saisie
- `Screenshots/` : Captures d'écran et vidéo de démonstration


