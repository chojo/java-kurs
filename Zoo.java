class Zoo {
    public static void main(String[] args){
        Papagei alex = new Papagei();
        alex.sagHallo();
        alex.sagAlter();
        System.out.println(alex.getAlter());
        Ente dagobert = new Ente();
        dagobert.sagHallo();
        System.out.println(dagobert.getBegruessung());
    }
}
