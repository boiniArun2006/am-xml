package androidx.work;

import androidx.work.impl.model.WorkSpec;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class WorkRequest {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private UUID f42757n;
    private WorkSpec rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Set f42758t;

    public static abstract class Builder<B extends Builder<?, ?>, W extends WorkRequest> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Class f42759O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f42760n = false;
        Set nr = new HashSet();
        UUID rl = UUID.randomUUID();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        WorkSpec f42761t;

        abstract Builder nr();

        abstract WorkRequest t();

        public final Builder J2(Data data) {
            this.f42761t.f42949O = data;
            return nr();
        }

        public final Builder O(Constraints constraints) {
            this.f42761t.mUb = constraints;
            return nr();
        }

        public final Builder n(String str) {
            this.nr.add(str);
            return nr();
        }

        Builder(Class cls) {
            this.f42759O = cls;
            this.f42761t = new WorkSpec(this.rl.toString(), cls.getName());
            n(cls.getName());
        }

        public final WorkRequest rl() {
            boolean z2;
            WorkRequest workRequestT = t();
            Constraints constraints = this.f42761t.mUb;
            if (!constraints.O() && !constraints.J2() && !constraints.Uo() && !constraints.KN()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f42761t.Ik && z2) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.rl = UUID.randomUUID();
            WorkSpec workSpec = new WorkSpec(this.f42761t);
            this.f42761t = workSpec;
            workSpec.f42950n = this.rl.toString();
            return workRequestT;
        }
    }

    public String n() {
        return this.f42757n.toString();
    }

    public Set rl() {
        return this.f42758t;
    }

    public WorkSpec t() {
        return this.rl;
    }

    protected WorkRequest(UUID uuid, WorkSpec workSpec, Set set) {
        this.f42757n = uuid;
        this.rl = workSpec;
        this.f42758t = set;
    }
}
