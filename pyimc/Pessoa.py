class Pessoa:
    
    def __init__(self):
        self.__nome = ''
        self.__idade = 0
        self.__altura = 0.00
        self.__massa = 0.00
        
    def getNome(self) -> str:
        return self.__nome
    
    def setNome(self, nome: str):
        self.__nome = nome
    
    def getIdade(self) -> int:
        return self.__idade
    
    def setIdade(self, idade: int):
        self.__idade = idade
        
    def getAltura(self) -> float:
        return self.__altura
    
    def setAltura(self, altura: float):
        self.__altura = altura
        
    def getMassa(self) -> float:
        return self.__massa
    
    def setMassa(self, massa: float):
        self.__massa = massa
        
    def calculaIMC(self) -> float:
        imc = self.__massa / (self.__altura * self.__altura)
        return imc
    2
    