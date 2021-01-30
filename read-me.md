Git - good practicies
* commit powinien mieć dobry opis
* commit powinien mieć jedną zmianę
* zmiana opisu tylko dla ostatniego commita (amend)
* podróżuj po historii i branchach tylko przy czystym drzewie roboczym
* usuwanie branch'y:
    * zmergowany branch można usunąć
    * nie powinniśmy usuwać niezmergowanych branch'y bo nie będziemy w stanie do nich wrócić
    * nie usuwamy brancha na którym aktualnie się znajdujemy :)
* git flow - w skrócie
    * master - branch release-owy
    * develop - branch developerski
    * feature branch - branch do rozwoju funkcjonalności
    * feature branch - powinien startować od developa i do niego finalnie zostać zmergowany
* branch
    * własny branch nie musi być idealny (może nie działać, może zawierać komentarze //FIXME, //DOTO),
      ale wysłanie merge requesta z tego brancha musi zawierać "piękny kod"



GIT - przydatne komendy:
git status
git add .
git add read-me.md
git add read-me.md *\ComputerUtils.java // Ale coś tu nie działa
git add filename
git commit -m "[tag] - message"
git restore --staged read-me.md // zdejmij ze stage'a
git checkout branch-name // przełącz się na branch-name
git checkout -b branch-name // przełącz na nowo utworzony branch
git log --graph // rysuje graf w historii konsoli