package Seminare_04;

public class AccounWorker implements Accountable<Integer, Double> {
    private Integer id;
    private  Double sum;

    public AccounWorker(int id, Double sum) {
        this.sum = sum;
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

}
