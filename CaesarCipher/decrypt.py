import hashlib

nc = 12
cifrado = "o ue cgudwk, rxmiqp, mzp mz qzadyage egooqee. gzwzaiz"
letras = [ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' ]
array = []
i = 0

while i < len(cifrado):
    if cifrado[i] in letras:
        l = letras.index(cifrado[i])
        l = l - nc
        if l < 0:
            l = l + len(letras)
        array.append(letras[l])
    else:
        array.append(cifrado[i])
    i += 1

decifrado = ''.join(array)

print("Cifrado:	", cifrado)
print("Descifrado:	", decifrado)

sha1 = hashlib.sha1()
sha1.update(decifrado.encode())
sha1 = sha1.hexdigest()
print("SHA1:		", sha1)