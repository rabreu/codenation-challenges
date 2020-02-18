#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define NC 12

void main () {
	char cifrado[] = "o ue cgudwk, rxmiqp, mzp mz qzadyage egooqee. gzwzaiz";
	char letras[26] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	char decifrado[strlen(cifrado)];
	
	for(int x = 0; x < strlen(cifrado) ; x++) {
		for(int y = 0; y < strlen(letras) ; y++) {
			if ( cifrado[x] == letras[y]) {
				if ( y - NC < 0)
					decifrado[x] = letras[y-NC+26];
				else
					decifrado[x] = letras[y-NC];
				break;
			}
			else
				decifrado[x] = cifrado[x];
		}
	}
	printf("Cifrado:	%s\n", cifrado);
	printf("Decifrado:	%s\n", decifrado);
	printf("SHA1:	\n");
}