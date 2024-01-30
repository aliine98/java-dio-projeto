class Contador {
    void contar(int inicio,int fim) throws ParametroInvalidoException {
        if(inicio >= fim) {
            throw new ParametroInvalidoException("O segundo parâmetro deve ser maior que o primeiro");
        }
        System.out.println("contando de " + inicio + " até " + fim);
        for(int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }
}