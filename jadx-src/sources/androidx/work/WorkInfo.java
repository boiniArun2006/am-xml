package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class WorkInfo {
    private int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Data f42745O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private UUID f42746n;
    private Set nr;
    private State rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Data f42747t;

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean n() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.J2 == workInfo.J2 && this.f42746n.equals(workInfo.f42746n) && this.rl == workInfo.rl && this.f42747t.equals(workInfo.f42747t) && this.nr.equals(workInfo.nr)) {
            return this.f42745O.equals(workInfo.f42745O);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f42746n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f42747t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f42745O.hashCode()) * 31) + this.J2;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f42746n + "', mState=" + this.rl + ", mOutputData=" + this.f42747t + ", mTags=" + this.nr + ", mProgress=" + this.f42745O + '}';
    }

    public WorkInfo(UUID uuid, State state, Data data, List list, Data data2, int i2) {
        this.f42746n = uuid;
        this.rl = state;
        this.f42747t = data;
        this.nr = new HashSet(list);
        this.f42745O = data2;
        this.J2 = i2;
    }
}
