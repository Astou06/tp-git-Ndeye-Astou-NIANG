Q1:
--global enregistre la configuration dans le fichier ~/.gitconfig, là ou ce trouve les informations personnel de l'utilisateur.Avav --global e réglage s’applique à tous les dépôts du compte utilisateur alor que sans --global le réglage s’applique uniquement à un dépôt local.
Q2:
 l'email doit correspondre à celui de github pour que les commits puissent apparaîtrent sous le profil.
 Q3:
 le dossier .git contient tout ce dont tout les information du projet(tout ce qui est en rapport avec celui-ci).en le supprimant on perd tout l'historique de commits les branches et les tags,ce qui était préparé avec git add mais pas encore commité,
et lee lien avec GitHub (origin) et la configuration locale du dépôt.
Q4:
git diff : montre les modifications pas encore ajoutées avec git add
et git diff --staged : montre les modifications deja ajoutées avec git add.
Q5:
Ce sont les identifiants des commits : une version abrégée du SHA-1 de 40 caractères qui identifie de façon unique chaque commit.
