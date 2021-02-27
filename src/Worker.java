public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    int err;
    public Worker(OnTaskDoneListener callback, int err) {
        this.callback = callback;
        this.err = err;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == err){
                errorCallback.onError();
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
