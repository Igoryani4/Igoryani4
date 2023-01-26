package Seminare_04;


interface Accountable <T, S> {
    T getId();
    S getSum();
    void setSum(S sum);
}
