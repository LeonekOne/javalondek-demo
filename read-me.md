Git - good practicies
* commit powinien mieć dobry opis
* commit powinien mieć jedną zmianę
* zmiana opisu tylko dla ostatniego commita (amend)
* podróżuj po historii i branchach tylko przy czystym drzewie roboczym
* zmergowany branch można usunąć
* fast forward nie zawsze jest możliwy - działa tylko w przypadku gdy jeden branch może "dogonić" drugi
* zawsze można wymusić commit mergujący

GIT - przydatne komendy:
git status
git add .
git commit -m "[tag] - message"
git restore --staged read-me.md // zdejmij ze stage'a
git checkout branch-name // przełącz się na branch-name
git checkout -b branch-name // przełącz na nowo utworzony branch
