package patterns.behavioral.pubsub.task.pubsub;

public interface Publisher {
    void registerSubscriber(Observable observer);
    void deleteSubscriber(Observable observer);
    void notifySubscribers(Video video);
}
