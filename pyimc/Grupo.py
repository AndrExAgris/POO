from Pessoa import Pessoa

class Grupo:
    
    def __init__(self):
        self.__pessoas = []
        self.__quantPessoas = 0
        
    def setPessoa(self, pessoa: Pessoa):
        if self.__quantPessoas < 5:
            self.__pessoas[self.__quantPessoas] =  pessoa
            self.__quantPessoas += 1
            
    
            
        