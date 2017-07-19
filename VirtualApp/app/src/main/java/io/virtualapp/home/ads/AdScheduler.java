package io.virtualapp.home.ads;

/**
 * @author Lody
 */

public class AdScheduler {

    private long adDeltaTime;
    private long lastShowAdTime;

    public AdScheduler(long adDeltaTime) {
        this.adDeltaTime = Long.MAX_VALUE;
    }

    public void adShowed() {
        lastShowAdTime = System.currentTimeMillis();
    }

    public boolean shouldShowAd() {
        return System.currentTimeMillis() - lastShowAdTime >= adDeltaTime;
    }
}
