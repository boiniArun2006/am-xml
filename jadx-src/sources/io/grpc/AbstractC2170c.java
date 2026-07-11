package io.grpc;

import JP.Ln;
import JP.M;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: io.grpc.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class AbstractC2170c {

    /* JADX INFO: renamed from: io.grpc.c$I28 */
    public static final class I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f68217n;
        private final io.grpc.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final n f68218t;

        /* JADX INFO: renamed from: io.grpc.c$I28$j */
        public static final class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List f68219n = Collections.EMPTY_LIST;
            private io.grpc.j rl = io.grpc.j.f68849t;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private n f68220t;

            public I28 n() {
                return new I28(this.f68219n, this.rl, this.f68220t);
            }

            public j nr(n nVar) {
                this.f68220t = nVar;
                return this;
            }

            public j rl(List list) {
                this.f68219n = list;
                return this;
            }

            public j t(io.grpc.j jVar) {
                this.rl = jVar;
                return this;
            }

            j() {
            }
        }

        public static j nr() {
            return new j();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof I28)) {
                return false;
            }
            I28 i28 = (I28) obj;
            return t1.C.n(this.f68217n, i28.f68217n) && t1.C.n(this.rl, i28.rl) && t1.C.n(this.f68218t, i28.f68218t);
        }

        public int hashCode() {
            return t1.C.rl(this.f68217n, this.rl, this.f68218t);
        }

        public List n() {
            return this.f68217n;
        }

        public io.grpc.j rl() {
            return this.rl;
        }

        public n t() {
            return this.f68218t;
        }

        I28(List list, io.grpc.j jVar, n nVar) {
            this.f68217n = Collections.unmodifiableList(new ArrayList(list));
            this.rl = (io.grpc.j) t1.Xo.ck(jVar, "attributes");
            this.f68218t = nVar;
        }

        public j O() {
            return nr().rl(this.f68217n).t(this.rl).nr(this.f68218t);
        }

        public String toString() {
            return t1.Dsr.t(this).nr("addresses", this.f68217n).nr("attributes", this.rl).nr("serviceConfig", this.f68218t).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.c$Ml */
    public static abstract class Ml {
        public abstract void n(SPz sPz);

        public abstract void rl(I28 i28);
    }

    /* JADX INFO: renamed from: io.grpc.c$Wre */
    public static abstract class Wre {
        public abstract n n(Map map);
    }

    /* JADX INFO: renamed from: io.grpc.c$j */
    public static final class j {
        private final JP.Ml J2;
        private final String KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final ScheduledExecutorService f68221O;
        private final Executor Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f68222n;
        private final Wre nr;
        private final Ln rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final M f68223t;

        /* JADX INFO: renamed from: io.grpc.c$j$j, reason: collision with other inner class name */
        public static final class C0971j {
            private JP.Ml J2;
            private String KN;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private ScheduledExecutorService f68224O;
            private Executor Uo;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private Integer f68225n;
            private Wre nr;
            private Ln rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private M f68226t;

            public C0971j O(String str) {
                this.KN = str;
                return this;
            }

            public j n() {
                return new j(this.f68225n, this.rl, this.f68226t, this.nr, this.f68224O, this.J2, this.Uo, this.KN, null);
            }

            public C0971j nr(Executor executor) {
                this.Uo = executor;
                return this;
            }

            C0971j() {
            }

            public C0971j J2(Ln ln2) {
                this.rl = (Ln) t1.Xo.HI(ln2);
                return this;
            }

            public C0971j KN(Wre wre) {
                this.nr = (Wre) t1.Xo.HI(wre);
                return this;
            }

            public C0971j Uo(ScheduledExecutorService scheduledExecutorService) {
                this.f68224O = (ScheduledExecutorService) t1.Xo.HI(scheduledExecutorService);
                return this;
            }

            public C0971j rl(JP.Ml ml) {
                this.J2 = (JP.Ml) t1.Xo.HI(ml);
                return this;
            }

            public C0971j t(int i2) {
                this.f68225n = Integer.valueOf(i2);
                return this;
            }

            public C0971j xMQ(M m2) {
                this.f68226t = (M) t1.Xo.HI(m2);
                return this;
            }
        }

        /* synthetic */ j(Integer num, Ln ln2, M m2, Wre wre, ScheduledExecutorService scheduledExecutorService, JP.Ml ml, Executor executor, String str, l3D l3d) {
            this(num, ln2, m2, wre, scheduledExecutorService, ml, executor, str);
        }

        private j(Integer num, Ln ln2, M m2, Wre wre, ScheduledExecutorService scheduledExecutorService, JP.Ml ml, Executor executor, String str) {
            this.f68222n = ((Integer) t1.Xo.ck(num, "defaultPort not set")).intValue();
            this.rl = (Ln) t1.Xo.ck(ln2, "proxyDetector not set");
            this.f68223t = (M) t1.Xo.ck(m2, "syncContext not set");
            this.nr = (Wre) t1.Xo.ck(wre, "serviceConfigParser not set");
            this.f68221O = scheduledExecutorService;
            this.J2 = ml;
            this.Uo = executor;
            this.KN = str;
        }

        public static C0971j Uo() {
            return new C0971j();
        }

        public M J2() {
            return this.f68223t;
        }

        public Wre O() {
            return this.nr;
        }

        public int n() {
            return this.f68222n;
        }

        public ScheduledExecutorService nr() {
            ScheduledExecutorService scheduledExecutorService = this.f68221O;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService;
            }
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }

        public Executor rl() {
            return this.Uo;
        }

        public Ln t() {
            return this.rl;
        }

        public String toString() {
            return t1.Dsr.t(this).rl("defaultPort", this.f68222n).nr("proxyDetector", this.rl).nr("syncContext", this.f68223t).nr("serviceConfigParser", this.nr).nr("scheduledExecutorService", this.f68221O).nr("channelLogger", this.J2).nr("executor", this.Uo).nr("overrideAuthority", this.KN).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.c$n */
    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SPz f68227n;
        private final Object rl;

        private n(Object obj) {
            this.rl = t1.Xo.ck(obj, "config");
            this.f68227n = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (t1.C.n(this.f68227n, nVar.f68227n) && t1.C.n(this.rl, nVar.rl)) {
                    return true;
                }
            }
            return false;
        }

        public static n n(Object obj) {
            return new n(obj);
        }

        public static n rl(SPz sPz) {
            return new n(sPz);
        }

        public int hashCode() {
            return t1.C.rl(this.f68227n, this.rl);
        }

        public SPz nr() {
            return this.f68227n;
        }

        public Object t() {
            return this.rl;
        }

        public String toString() {
            return this.rl != null ? t1.Dsr.t(this).nr("config", this.rl).toString() : t1.Dsr.t(this).nr(MRAIDPresenter.ERROR, this.f68227n).toString();
        }

        private n(SPz sPz) {
            this.rl = null;
            this.f68227n = (SPz) t1.Xo.ck(sPz, "status");
            t1.Xo.gh(!sPz.HI(), "cannot use OK status: %s", sPz);
        }
    }

    /* JADX INFO: renamed from: io.grpc.c$w6 */
    public static abstract class w6 {
        public abstract String n();

        public abstract AbstractC2170c rl(URI uri, j jVar);
    }

    public abstract String n();

    public abstract void nr(Ml ml);

    public abstract void rl();

    public abstract void t();
}
