package androidx.compose.foundation.lazy.layout;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\fR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\f¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/layout/Averages;", "", "<init>", "()V", "", "new", "current", c.f62177j, "(JJ)J", "timeNanos", "", "O", "(J)V", "J2", "rl", "()Landroidx/compose/foundation/lazy/layout/Averages;", "J", "t", "()J", "setCompositionTimeNanos", "compositionTimeNanos", "nr", "setMeasureTimeNanos", "measureTimeNanos", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class Averages {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long compositionTimeNanos;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private long measureTimeNanos;

    private final long n(long j2, long current) {
        if (current == 0) {
            return j2;
        }
        long j3 = 4;
        return ((current / j3) * ((long) 3)) + (j2 / j3);
    }

    public final void J2(long timeNanos) {
        this.measureTimeNanos = n(timeNanos, this.measureTimeNanos);
    }

    public final void O(long timeNanos) {
        this.compositionTimeNanos = n(timeNanos, this.compositionTimeNanos);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final long getMeasureTimeNanos() {
        return this.measureTimeNanos;
    }

    public final Averages rl() {
        Averages averages = new Averages();
        averages.compositionTimeNanos = this.compositionTimeNanos;
        averages.measureTimeNanos = this.measureTimeNanos;
        return averages;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getCompositionTimeNanos() {
        return this.compositionTimeNanos;
    }
}
