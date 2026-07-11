package TiW;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import dzu.DAz;
import dzu.qf;
import java.util.concurrent.TimeUnit;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f10549n = DAz.O("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long rl = qf.J2("kotlinx.coroutines.scheduler.resolution.ns", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 0, 0, 12, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f10550t = qf.O("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.coerceAtLeast(DAz.n(), 2), 1, 0, 8, null);
    public static final int nr = qf.O("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final long f10548O = TimeUnit.SECONDS.toNanos(qf.J2("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));
    public static CN3 J2 = I28.f10543n;

    public static final fuX rl(Runnable runnable, long j2, boolean z2) {
        return new Dsr(runnable, j2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(boolean z2) {
        return z2 ? pTYaLzzmJSGAPQ.CtuxZ : "Non-blocking";
    }
}
