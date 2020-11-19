# tp2.2
question1:

si on execute l application de travail à faire avant d implimenter onSaveInstanceState() le compteur est reinitialisé à 0 mais le contenu de l'editText reste preservé 

question2:

Lorsqu'un changement de configuration de peripherique (tel qu'une rotation) se produit :

	.Android ferme immédiatement l' activité en appelant onStop().Le code doit redemarrer 

question3:

Lorsque dans le cycle de vie de l'activité, onSaveInstanceState() est appelé:
	.onSaveInstanceState() est appelée avant la méthode onStop()   
	
	   
question4:

les meilleurs méthodes de cycle de vie d'Activité à utiliser pour enregistrer des données avant la fin ou la destruction de l'activité:

  .onResume() ou onCreate()
