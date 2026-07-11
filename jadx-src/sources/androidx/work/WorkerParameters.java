package androidx.work;

import android.net.Network;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class WorkerParameters {
    private Executor J2;
    private WorkerFactory KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f42764O;
    private TaskExecutor Uo;
    private ForegroundUpdater mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private UUID f42765n;
    private RuntimeExtras nr;
    private Data rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Set f42766t;
    private ProgressUpdater xMQ;

    @RestrictTo
    public static class RuntimeExtras {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List f42767n;
        public List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Network f42768t;

        public RuntimeExtras() {
            List list = Collections.EMPTY_LIST;
            this.f42767n = list;
            this.rl = list;
        }
    }

    public ProgressUpdater J2() {
        return this.xMQ;
    }

    public Set KN() {
        return this.f42766t;
    }

    public Network O() {
        return this.nr.f42768t;
    }

    public int Uo() {
        return this.f42764O;
    }

    public List gh() {
        return this.nr.rl;
    }

    public List mUb() {
        return this.nr.f42767n;
    }

    public Executor n() {
        return this.J2;
    }

    public Data nr() {
        return this.rl;
    }

    public WorkerFactory qie() {
        return this.KN;
    }

    public ForegroundUpdater rl() {
        return this.mUb;
    }

    public UUID t() {
        return this.f42765n;
    }

    public TaskExecutor xMQ() {
        return this.Uo;
    }

    public WorkerParameters(UUID uuid, Data data, Collection collection, RuntimeExtras runtimeExtras, int i2, Executor executor, TaskExecutor taskExecutor, WorkerFactory workerFactory, ProgressUpdater progressUpdater, ForegroundUpdater foregroundUpdater) {
        this.f42765n = uuid;
        this.rl = data;
        this.f42766t = new HashSet(collection);
        this.nr = runtimeExtras;
        this.f42764O = i2;
        this.J2 = executor;
        this.Uo = taskExecutor;
        this.KN = workerFactory;
        this.xMQ = progressUpdater;
        this.mUb = foregroundUpdater;
    }
}
