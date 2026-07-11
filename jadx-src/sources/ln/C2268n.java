package ln;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ln.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C2268n implements eO {
    public static final j J2 = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final ScheduledExecutorService f70532O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f70533n;
    private final Executor nr;
    private final Executor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f70534t;

    /* JADX INFO: renamed from: ln.n$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    @Override // ln.eO
    public Executor J2() {
        return this.f70533n;
    }

    @Override // ln.eO
    public Executor O() {
        return this.f70534t;
    }

    @Override // ln.eO
    public Executor Uo() {
        return this.f70533n;
    }

    @Override // ln.eO
    public Executor n() {
        return this.nr;
    }

    @Override // ln.eO
    public Executor nr() {
        return this.rl;
    }

    @Override // ln.eO
    public Executor rl() {
        return this.f70533n;
    }

    @Override // ln.eO
    public ScheduledExecutorService t() {
        return this.f70532O;
    }

    public C2268n(int i2) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new SPz(10, "FrescoIoBoundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        this.f70533n = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i2, new SPz(10, "FrescoDecodeExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool2, "newFixedThreadPool(...)");
        this.rl = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i2, new SPz(10, "FrescoBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool3, "newFixedThreadPool(...)");
        this.f70534t = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new SPz(10, "FrescoLightWeightBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool4, "newFixedThreadPool(...)");
        this.nr = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i2, new SPz(10, "FrescoBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        this.f70532O = scheduledExecutorServiceNewScheduledThreadPool;
    }
}
