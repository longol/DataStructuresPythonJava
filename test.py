pessoasEmFileirasAssentos = [
    ["João", "Maria", "Luiz"],
    ["Amanda", "José", "Paulo"]
]
# Imprir vetor
print("0) Pessoas em fileiras e assentos:")
print(pessoasEmFileirasAssentos)

# Pegar segunda(1) fileira do vetor pessoasEmFileirasAssentos - um vetor de assentos (que são strings)
pessoaSegundaFileiraTerceiroAssento = pessoasEmFileirasAssentos[1]

# Da segunda fileira, pegar pessoa no terceiro(2) assento - um string dentro do vetor segundaFileira
pessoaSegundaFileiraTerceiroAssento = pessoaSegundaFileiraTerceiroAssento[2]

# Imprimir resultado
print("1) Pessoa na segunda fileira, terceiro assento: ")
print(pessoaSegundaFileiraTerceiroAssento)

# Pegar pessoa na primeira(0) fileira, primeiro(0) assento diretamente do vetor pessoasEmFileirasAssentos
pessoaPrimeiraFileiraPrimeiroAssento = pessoasEmFileirasAssentos[0][0];

# Imprimir resultado
print("2) Pessoa na primeira fileira, primeiroAssento:")
print(pessoaPrimeiraFileiraPrimeiroAssento)

# Trocar o nome da pessoa na primeira fileira(0), segundo assento(1)
pessoasEmFileirasAssentos[0][1] = "Adriana"

# Imprimir resultado
print("3) Pessoas em fileiras e assentos:")
print(pessoasEmFileirasAssentos)
