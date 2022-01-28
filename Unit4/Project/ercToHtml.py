from erc import Erc
ercData = open("Unit4\\Project\\file.erc", "r").read()
ercd = Erc(ercData)
open("Unit4\\Project\\file.html", "w").write(ercd.html)