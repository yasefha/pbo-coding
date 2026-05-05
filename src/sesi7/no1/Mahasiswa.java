package sesi7.no1;

class Mahasiswa<N, NM, K> {

    private N nim;
    private NM name;
    private K clas;

    // setter
    public void setNim(N nim) {
        this.nim = nim;
    }

    public void setName(NM name) {
        this.name = name;
    }

    public void setClas(K clas) {
        this.clas = clas;
    }

    // getter
    public N getNim() {
        return nim;
    }

    public NM getName() {
        return name;
    }

    public K getClas() {
        return clas;
    }
}
