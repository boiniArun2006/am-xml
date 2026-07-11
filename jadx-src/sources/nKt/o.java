package nKt;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f71041n;
    private static final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f71042t;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        f71041n = DurationKt.toDuration(2, durationUnit);
        rl = DurationKt.toDuration(1, durationUnit);
        f71042t = DurationKt.toDuration(60, durationUnit);
    }
}
