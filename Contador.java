class Contador {
    void contar(int inicio,int fim) {
        System.out.println("contando de " + inicio + " até " + fim);
        for(int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }
}