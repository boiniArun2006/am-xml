package cIr;

import Mj.j;
import com.vungle.ads.internal.signals.SignalManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class eO {
    private long rl = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f43593t = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Mj.j f43592n = new j.C0231j();

    private static int rl(int i2) {
        return (i2 == 400 || i2 == 404) ? 1 : 0;
    }

    public boolean n() {
        return this.f43593t <= this.f43592n.currentTimeMillis();
    }

    public void nr(int i2) {
        this.rl++;
        if (rl(i2) == 1) {
            this.f43593t = this.f43592n.currentTimeMillis() + SignalManager.TWENTY_FOUR_HOURS_MILLIS;
            return;
        }
        this.f43593t = this.f43592n.currentTimeMillis() + Math.min((long) (Math.pow(2.0d, this.rl * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L);
    }

    public void t() {
        this.rl = 0L;
        this.f43593t = -1L;
    }
}
