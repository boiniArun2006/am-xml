package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import oK9.CN3;
import uOq.C2403c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private oK9.Ml applicationProcessState;
    private final com.google.firebase.perf.config.j configResolver;
    private final C2403c cpuGaugeCollector;

    @Nullable
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final C2403c gaugeManagerExecutor;

    @Nullable
    private Dsr gaugeMetadataManager;
    private final C2403c memoryGaugeCollector;

    @Nullable
    private String sessionId;
    private final jMi.C transportManager;
    private static final yMa.j logger = yMa.j.O();
    private static final GaugeManager instance = new GaugeManager();

    private GaugeManager() {
        this(new C2403c(new oSp.n() { // from class: com.google.firebase.perf.session.gauges.Wre
            @Override // oSp.n
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), jMi.C.gh(), com.google.firebase.perf.config.j.Uo(), null, new C2403c(new oSp.n() { // from class: com.google.firebase.perf.session.gauges.CN3
            @Override // oSp.n
            public final Object get() {
                return GaugeManager.t();
            }
        }), new C2403c(new oSp.n() { // from class: com.google.firebase.perf.session.gauges.fuX
            @Override // oSp.n
            public final Object get() {
                return GaugeManager.rl();
            }
        }));
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((w6) this.cpuGaugeCollector.get(), (o) this.memoryGaugeCollector.get(), timer);
    }

    public void startCollectingGauges(PerfSession perfSession, final oK9.Ml ml) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(ml, perfSession.nr());
        if (jStartCollectingGauges == -1) {
            logger.mUb("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String strKN = perfSession.KN();
        this.sessionId = strKN;
        this.applicationProcessState = ml;
        try {
            long j2 = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.I28
                @Override // java.lang.Runnable
                public final void run() {
                    this.f60673n.syncFlush(strKN, ml);
                }
            }, j2, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            logger.mUb("Unable to start collecting Gauges: " + e2.getMessage());
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f60671n;

        static {
            int[] iArr = new int[oK9.Ml.values().length];
            f60671n = iArr;
            try {
                iArr[oK9.Ml.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60671n[oK9.Ml.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static void collectGaugeMetricOnce(w6 w6Var, o oVar, Timer timer) {
        w6Var.t(timer);
        oVar.t(timer);
    }

    private long getCpuGaugeCollectionFrequencyMs(oK9.Ml ml) {
        int i2 = j.f60671n[ml.ordinal()];
        long jNY = i2 != 1 ? i2 != 2 ? -1L : this.configResolver.nY() : this.configResolver.ViF();
        if (w6.J2(jNY)) {
            return -1L;
        }
        return jNY;
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(oK9.Ml ml) {
        int i2 = j.f60671n[ml.ordinal()];
        long jIF = i2 != 1 ? i2 != 2 ? -1L : this.configResolver.iF() : this.configResolver.te();
        if (o.O(jIF)) {
            return -1L;
        }
        return jIF;
    }

    public static /* synthetic */ o rl() {
        return new o();
    }

    private boolean startCollectingCpuMetrics(long j2, Timer timer) {
        if (j2 == -1) {
            logger.n("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((w6) this.cpuGaugeCollector.get()).xMQ(j2, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j2, Timer timer) {
        if (j2 == -1) {
            logger.n("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((o) this.memoryGaugeCollector.get()).KN(j2, timer);
        return true;
    }

    public static /* synthetic */ w6 t() {
        return new w6();
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new Dsr(context);
    }

    public boolean logGaugeMetadata(String str, oK9.Ml ml) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.S((oK9.CN3) oK9.CN3.WPU().qie(str).gh(getGaugeMetadata()).build(), ml);
        return true;
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final oK9.Ml ml = this.applicationProcessState;
        ((w6) this.cpuGaugeCollector.get()).mUb();
        ((o) this.memoryGaugeCollector.get()).xMQ();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.Ml
            @Override // java.lang.Runnable
            public final void run() {
                this.f60676n.syncFlush(str, ml);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = oK9.Ml.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private oK9.Wre getGaugeMetadata() {
        return (oK9.Wre) oK9.Wre.ty().xMQ(this.gaugeMetadataManager.n()).mUb(this.gaugeMetadataManager.rl()).gh(this.gaugeMetadataManager.t()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncFlush(String str, oK9.Ml ml) {
        CN3.n nVarWPU = oK9.CN3.WPU();
        while (!((w6) this.cpuGaugeCollector.get()).f60688n.isEmpty()) {
            nVarWPU.mUb((oK9.I28) ((w6) this.cpuGaugeCollector.get()).f60688n.poll());
        }
        while (!((o) this.memoryGaugeCollector.get()).rl.isEmpty()) {
            nVarWPU.xMQ((oK9.n) ((o) this.memoryGaugeCollector.get()).rl.poll());
        }
        nVarWPU.qie(str);
        this.transportManager.S((oK9.CN3) nVarWPU.build(), ml);
    }

    @VisibleForTesting
    GaugeManager(C2403c c2403c, jMi.C c2, com.google.firebase.perf.config.j jVar, Dsr dsr, C2403c c2403c2, C2403c c2403c3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = oK9.Ml.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = c2403c;
        this.transportManager = c2;
        this.configResolver = jVar;
        this.gaugeMetadataManager = dsr;
        this.cpuGaugeCollector = c2403c2;
        this.memoryGaugeCollector = c2403c3;
    }

    private long startCollectingGauges(oK9.Ml ml, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(ml);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(ml);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
