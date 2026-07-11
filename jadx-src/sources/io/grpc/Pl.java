package io.grpc;

import JP.DAz;
import JP.M;
import io.grpc.j;
import io.grpc.w6;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f68163n;
    public static final j.w6 rl = j.w6.n("internal:health-checking-config");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n.C0970n f68162t = n.C0970n.rl("internal:health-check-consumer-listener");
    public static final j.w6 nr = j.w6.n("internal:has-health-check-producer-listener");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j.w6 f68161O = j.w6.n("io.grpc.IS_PETIOLE_POLICY");
    public static final aC J2 = new j();

    public interface C {
        void n(JP.Pl pl);
    }

    public static abstract class CN3 {
        public abstract io.grpc.n n();

        public abstract QJ rl();

        public abstract DAz t();
    }

    public static abstract class I28 {
        public abstract void J2(JP.qz qzVar, aC aCVar);

        public abstract void O();

        public abstract Dsr n(n nVar);

        public abstract M nr();

        public abstract JP.Ml rl();

        public abstract ScheduledExecutorService t();
    }

    public static final class Ml extends aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Wre f68164n;

        @Override // io.grpc.Pl.aC
        public Wre n(CN3 cn3) {
            return this.f68164n;
        }

        public String toString() {
            return "FixedResultPicker(" + this.f68164n + ")";
        }

        public Ml(Wre wre) {
            this.f68164n = (Wre) t1.Xo.ck(wre, "result");
        }
    }

    public static final class Wre {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final Wre f68165O = new Wre(null, null, SPz.f68184O, false);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Dsr f68166n;
        private final boolean nr;
        private final w6.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SPz f68167t;

        public static Wre KN(Dsr dsr) {
            return xMQ(dsr, null);
        }

        public static Wre Uo() {
            return f68165O;
        }

        public static Wre xMQ(Dsr dsr, w6.j jVar) {
            return new Wre((Dsr) t1.Xo.ck(dsr, "subchannel"), jVar, SPz.f68184O, false);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Wre)) {
                return false;
            }
            Wre wre = (Wre) obj;
            return t1.C.n(this.f68166n, wre.f68166n) && t1.C.n(this.f68167t, wre.f68167t) && t1.C.n(this.rl, wre.rl) && this.nr == wre.nr;
        }

        public int hashCode() {
            return t1.C.rl(this.f68166n, this.f68167t, this.rl, Boolean.valueOf(this.nr));
        }

        public SPz n() {
            return this.f68167t;
        }

        public boolean nr() {
            return this.nr;
        }

        public w6.j rl() {
            return this.rl;
        }

        public Dsr t() {
            return this.f68166n;
        }

        private Wre(Dsr dsr, w6.j jVar, SPz sPz, boolean z2) {
            this.f68166n = dsr;
            this.rl = jVar;
            this.f68167t = (SPz) t1.Xo.ck(sPz, "status");
            this.nr = z2;
        }

        public static Wre J2(SPz sPz) {
            t1.Xo.O(!sPz.HI(), "error status shouldn't be OK");
            return new Wre(null, null, sPz, false);
        }

        public static Wre O(SPz sPz) {
            t1.Xo.O(!sPz.HI(), "drop status shouldn't be OK");
            return new Wre(null, null, sPz, true);
        }

        public String toString() {
            return t1.Dsr.t(this).nr("subchannel", this.f68166n).nr("streamTracerFactory", this.rl).nr("status", this.f68167t).O("drop", this.nr).toString();
        }
    }

    public static abstract class aC {
        public abstract Wre n(CN3 cn3);

        public void rl() {
        }
    }

    public static final class fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f68168n;
        private final io.grpc.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Object f68169t;

        public static final class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List f68170n;
            private io.grpc.j rl = io.grpc.j.f68849t;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private Object f68171t;

            public fuX n() {
                return new fuX(this.f68170n, this.rl, this.f68171t, null);
            }

            public j nr(Object obj) {
                this.f68171t = obj;
                return this;
            }

            public j rl(List list) {
                this.f68170n = list;
                return this;
            }

            public j t(io.grpc.j jVar) {
                this.rl = jVar;
                return this;
            }

            j() {
            }
        }

        /* synthetic */ fuX(List list, io.grpc.j jVar, Object obj, j jVar2) {
            this(list, jVar, obj);
        }

        private fuX(List list, io.grpc.j jVar, Object obj) {
            this.f68168n = Collections.unmodifiableList(new ArrayList((Collection) t1.Xo.ck(list, "addresses")));
            this.rl = (io.grpc.j) t1.Xo.ck(jVar, "attributes");
            this.f68169t = obj;
        }

        public static j nr() {
            return new j();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof fuX)) {
                return false;
            }
            fuX fux = (fuX) obj;
            return t1.C.n(this.f68168n, fux.f68168n) && t1.C.n(this.rl, fux.rl) && t1.C.n(this.f68169t, fux.f68169t);
        }

        public int hashCode() {
            return t1.C.rl(this.f68168n, this.rl, this.f68169t);
        }

        public List n() {
            return this.f68168n;
        }

        public io.grpc.j rl() {
            return this.rl;
        }

        public Object t() {
            return this.f68169t;
        }

        public j O() {
            return nr().rl(this.f68168n).t(this.rl).nr(this.f68169t);
        }

        public String toString() {
            return t1.Dsr.t(this).nr("addresses", this.f68168n).nr("attributes", this.rl).nr("loadBalancingPolicyConfig", this.f68169t).toString();
        }
    }

    class j extends aC {
        public String toString() {
            return "EMPTY_PICKER";
        }

        j() {
        }

        @Override // io.grpc.Pl.aC
        public Wre n(CN3 cn3) {
            return Wre.Uo();
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f68172n;
        private final io.grpc.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Object[][] f68173t;

        public static final class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List f68174n;
            private io.grpc.j rl = io.grpc.j.f68849t;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private Object[][] f68175t = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            /* JADX INFO: Access modifiers changed from: private */
            public j nr(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                this.f68175t = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public j J2(io.grpc.j jVar) {
                this.rl = (io.grpc.j) t1.Xo.ck(jVar, "attrs");
                return this;
            }

            public j rl(C0970n c0970n, Object obj) {
                t1.Xo.ck(c0970n, "key");
                t1.Xo.ck(obj, "value");
                int length = 0;
                while (true) {
                    Object[][] objArr = this.f68175t;
                    if (length >= objArr.length) {
                        length = -1;
                        break;
                    }
                    if (c0970n.equals(objArr[length][0])) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f68175t.length + 1, 2);
                    Object[][] objArr3 = this.f68175t;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.f68175t = objArr2;
                    length = objArr2.length - 1;
                }
                this.f68175t[length] = new Object[]{c0970n, obj};
                return this;
            }

            public n t() {
                return new n(this.f68174n, this.rl, this.f68175t, null);
            }

            j() {
            }

            public j O(List list) {
                t1.Xo.O(!list.isEmpty(), "addrs is empty");
                this.f68174n = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }
        }

        /* JADX INFO: renamed from: io.grpc.Pl$n$n, reason: collision with other inner class name */
        public static final class C0970n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final String f68176n;
            private final Object rl;

            public static C0970n rl(String str) {
                t1.Xo.ck(str, "debugString");
                return new C0970n(str, null);
            }

            public String toString() {
                return this.f68176n;
            }

            private C0970n(String str, Object obj) {
                this.f68176n = str;
                this.rl = obj;
            }
        }

        /* synthetic */ n(List list, io.grpc.j jVar, Object[][] objArr, j jVar2) {
            this(list, jVar, objArr);
        }

        private n(List list, io.grpc.j jVar, Object[][] objArr) {
            this.f68172n = (List) t1.Xo.ck(list, "addresses are not set");
            this.rl = (io.grpc.j) t1.Xo.ck(jVar, "attrs");
            this.f68173t = (Object[][]) t1.Xo.ck(objArr, "customOptions");
        }

        public static j nr() {
            return new j();
        }

        public List n() {
            return this.f68172n;
        }

        public io.grpc.j rl() {
            return this.rl;
        }

        public Object t(C0970n c0970n) {
            t1.Xo.ck(c0970n, "key");
            int i2 = 0;
            while (true) {
                Object[][] objArr = this.f68173t;
                if (i2 >= objArr.length) {
                    return c0970n.rl;
                }
                if (c0970n.equals(objArr[i2][0])) {
                    return this.f68173t[i2][1];
                }
                i2++;
            }
        }

        public j O() {
            return nr().O(this.f68172n).J2(this.rl).nr(this.f68173t);
        }

        public String toString() {
            return t1.Dsr.t(this).nr("addrs", this.f68172n).nr("attrs", this.rl).nr("customOptions", Arrays.deepToString(this.f68173t)).toString();
        }
    }

    public static abstract class w6 {
        public abstract Pl n(I28 i28);
    }

    public abstract void J2();

    public void O() {
    }

    public boolean rl() {
        return false;
    }

    public abstract void t(SPz sPz);

    public static abstract class Dsr {
        public abstract void J2();

        public abstract void KN(C c2);

        public abstract Object O();

        public abstract void Uo();

        public abstract JP.Ml nr();

        public abstract List rl();

        public abstract io.grpc.j t();

        public abstract void xMQ(List list);

        /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final io.grpc.I28 n() {
            boolean z2;
            List listRl = rl();
            if (listRl != null) {
                z2 = true;
                if (listRl.size() != 1) {
                    z2 = false;
                }
            }
            t1.Xo.aYN(z2, "%s does not have exactly one group", listRl);
            return (io.grpc.I28) listRl.get(0);
        }
    }

    public void nr(fuX fux) {
        int i2 = this.f68163n;
        this.f68163n = i2 + 1;
        if (i2 == 0) {
            n(fux);
        }
        this.f68163n = 0;
    }

    public SPz n(fuX fux) {
        if (fux.n().isEmpty() && !rl()) {
            SPz sPzIk = SPz.f68186Z.Ik("NameResolver returned no usable address. addrs=" + fux.n() + ", attrs=" + fux.rl());
            t(sPzIk);
            return sPzIk;
        }
        int i2 = this.f68163n;
        this.f68163n = i2 + 1;
        if (i2 == 0) {
            nr(fux);
        }
        this.f68163n = 0;
        return SPz.f68184O;
    }
}
