
import java.time.Instant;
import java.util.*;
import java.util.concurrent.*;

public class RateLimiter {
    private final int maxRequests;
    private final long timeWindowMillis;
    private final Map<String, List<Long>> userRequestLog = new ConcurrentHashMap<>();

    public RateLimiter(int maxRequests, long timeWindowMillis) {
        this.maxRequests = maxRequests;
        this.timeWindowMillis = timeWindowMillis;
    }

    public boolean isAllowed(String userId) {
        long now = Instant.now().toEpochMilli();
        userRequestLog.putIfAbsent(userId, new ArrayList<>());
        List<Long> timestamps = userRequestLog.get(userId);

        // Remove old timestamps
        timestamps.removeIf(ts -> ts <= now - timeWindowMillis);

        if (timestamps.size() >= maxRequests) {
            return false; // rate limit exceeded
        }

        timestamps.add(now);
        return true; // allowed
    }
}

class Examples{
    public static void main(String[] args) {
        RateLimiter rateLimiter = new RateLimiter(5, 60_000);
        System.out.println(rateLimiter.isAllowed("qwe"));
    }
}