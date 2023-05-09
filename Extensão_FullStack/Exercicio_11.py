# desafio 11
# input para receber numero total de eleitor, votos de cand1, votos de cand2 e calcular porcentagem de cada cand e nulos

totaleleitores = int(input("Quantos eleitores tem ao total: "))
candidatoA = int(input("Quantos votaram no candidato A: "))
candidatoB = int(input("Quantos votaram no candidato B: "))
nulos = totaleleitores-(candidatoA+candidatoB)

perccandA = round((candidatoA/totaleleitores),2)*100

perccandB = round((candidatoB/totaleleitores),2)*100

percnulos = 100-(perccandA+perccandB)

print("%s %% (%s pessoas) dos eleitores votaram no candidato A" %(perccandA, candidatoA))
print("%s %% (%s pessoas) dos eleitores votaram no candidato B" %(perccandB, candidatoB))
print("%s %% (%s pessoas) dos eleitores votaram nulo" %(percnulos, nulos))

# colocar % na string colocar %%