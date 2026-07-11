package androidx.work;

import android.app.Notification;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class ForegroundInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f42726n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Notification f42727t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ForegroundInfo.class != obj.getClass()) {
            return false;
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (this.f42726n == foregroundInfo.f42726n && this.rl == foregroundInfo.rl) {
            return this.f42727t.equals(foregroundInfo.f42727t);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f42726n * 31) + this.rl) * 31) + this.f42727t.hashCode();
    }

    public int n() {
        return this.rl;
    }

    public Notification rl() {
        return this.f42727t;
    }

    public int t() {
        return this.f42726n;
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f42726n + ", mForegroundServiceType=" + this.rl + ", mNotification=" + this.f42727t + '}';
    }

    public ForegroundInfo(int i2, Notification notification, int i3) {
        this.f42726n = i2;
        this.f42727t = notification;
        this.rl = i3;
    }
}
