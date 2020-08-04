package ThreadsTask.YieldExample;

public class YieldRunner {
    public static void main(String[] args) {
        Thread supplierThread=new SupplierTask();
        Thread consumerThread=new ConsumerTask();
        Thread producerThread=new ProducerTask();

        supplierThread.setPriority(4);
        consumerThread.setPriority(4);
        producerThread.setPriority(10);

        supplierThread.start();
        consumerThread.start();
        producerThread.start();
    }
}
