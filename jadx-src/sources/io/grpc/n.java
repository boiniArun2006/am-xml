package io.grpc;

import io.grpc.w6;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import t1.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {
    public static final n gh;
    private final Object[][] J2;
    private final Boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f68853O;
    private final List Uo;
    private final Integer mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JP.eO f68854n;
    private final JP.j nr;
    private final Executor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f68855t;
    private final Integer xMQ;

    /* JADX INFO: renamed from: io.grpc.n$n, reason: collision with other inner class name */
    static class C0980n {
        Object[][] J2;
        Boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        String f68856O;
        List Uo;
        Integer mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        JP.eO f68857n;
        JP.j nr;
        Executor rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        String f68858t;
        Integer xMQ;

        /* JADX INFO: Access modifiers changed from: private */
        public n rl() {
            return new n(this);
        }

        C0980n() {
        }
    }

    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f68859n;
        private final Object rl;

        public static w6 rl(String str) {
            t1.Xo.ck(str, "debugString");
            return new w6(str, null);
        }

        public String toString() {
            return this.f68859n;
        }

        private w6(String str, Object obj) {
            this.f68859n = str;
            this.rl = obj;
        }
    }

    static {
        C0980n c0980n = new C0980n();
        c0980n.J2 = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        c0980n.Uo = Collections.EMPTY_LIST;
        gh = c0980n.rl();
    }

    private n(C0980n c0980n) {
        this.f68854n = c0980n.f68857n;
        this.rl = c0980n.rl;
        this.f68855t = c0980n.f68858t;
        this.nr = c0980n.nr;
        this.f68853O = c0980n.f68856O;
        this.J2 = c0980n.J2;
        this.Uo = c0980n.Uo;
        this.KN = c0980n.KN;
        this.xMQ = c0980n.xMQ;
        this.mUb = c0980n.mUb;
    }

    private static C0980n gh(n nVar) {
        C0980n c0980n = new C0980n();
        c0980n.f68857n = nVar.f68854n;
        c0980n.rl = nVar.rl;
        c0980n.f68858t = nVar.f68855t;
        c0980n.nr = nVar.nr;
        c0980n.f68856O = nVar.f68853O;
        c0980n.J2 = nVar.J2;
        c0980n.Uo = nVar.Uo;
        c0980n.KN = nVar.KN;
        c0980n.xMQ = nVar.xMQ;
        c0980n.mUb = nVar.mUb;
        return c0980n;
    }

    public n HI(int i2) {
        t1.Xo.KN(i2 >= 0, "invalid maxsize %s", i2);
        C0980n c0980nGh = gh(this);
        c0980nGh.xMQ = Integer.valueOf(i2);
        return c0980nGh.rl();
    }

    public n Ik(w6 w6Var, Object obj) {
        t1.Xo.ck(w6Var, "key");
        t1.Xo.ck(obj, "value");
        C0980n c0980nGh = gh(this);
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.J2;
            if (i2 >= objArr.length) {
                i2 = -1;
                break;
            }
            if (w6Var.equals(objArr[i2][0])) {
                break;
            }
            i2++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.J2.length + (i2 == -1 ? 1 : 0), 2);
        c0980nGh.J2 = objArr2;
        Object[][] objArr3 = this.J2;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i2 == -1) {
            c0980nGh.J2[this.J2.length] = new Object[]{w6Var, obj};
        } else {
            c0980nGh.J2[i2] = new Object[]{w6Var, obj};
        }
        return c0980nGh.rl();
    }

    public Integer J2() {
        return this.xMQ;
    }

    public Object KN(w6 w6Var) {
        t1.Xo.ck(w6Var, "key");
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.J2;
            if (i2 >= objArr.length) {
                return w6Var.rl;
            }
            if (w6Var.equals(objArr[i2][0])) {
                return this.J2[i2][1];
            }
            i2++;
        }
    }

    public Executor O() {
        return this.rl;
    }

    public Integer Uo() {
        return this.mUb;
    }

    public n ck(int i2) {
        t1.Xo.KN(i2 >= 0, "invalid maxsize %s", i2);
        C0980n c0980nGh = gh(this);
        c0980nGh.mUb = Integer.valueOf(i2);
        return c0980nGh.rl();
    }

    public boolean mUb() {
        return Boolean.TRUE.equals(this.KN);
    }

    public String n() {
        return this.f68855t;
    }

    public JP.eO nr() {
        return this.f68854n;
    }

    public n r(w6.j jVar) {
        ArrayList arrayList = new ArrayList(this.Uo.size() + 1);
        arrayList.addAll(this.Uo);
        arrayList.add(jVar);
        C0980n c0980nGh = gh(this);
        c0980nGh.Uo = Collections.unmodifiableList(arrayList);
        return c0980nGh.rl();
    }

    public String rl() {
        return this.f68853O;
    }

    public JP.j t() {
        return this.nr;
    }

    public List xMQ() {
        return this.Uo;
    }

    public n Z() {
        C0980n c0980nGh = gh(this);
        c0980nGh.KN = Boolean.FALSE;
        return c0980nGh.rl();
    }

    public n az(JP.eO eOVar) {
        C0980n c0980nGh = gh(this);
        c0980nGh.f68857n = eOVar;
        return c0980nGh.rl();
    }

    public n o() {
        C0980n c0980nGh = gh(this);
        c0980nGh.KN = Boolean.TRUE;
        return c0980nGh.rl();
    }

    public n qie(JP.j jVar) {
        C0980n c0980nGh = gh(this);
        c0980nGh.nr = jVar;
        return c0980nGh.rl();
    }

    public String toString() {
        Class<?> cls;
        Dsr.n nVarNr = t1.Dsr.t(this).nr("deadline", this.f68854n).nr("authority", this.f68855t).nr("callCredentials", this.nr);
        Executor executor = this.rl;
        if (executor != null) {
            cls = executor.getClass();
        } else {
            cls = null;
        }
        return nVarNr.nr("executor", cls).nr("compressorName", this.f68853O).nr("customOptions", Arrays.deepToString(this.J2)).O("waitForReady", mUb()).nr("maxInboundMessageSize", this.xMQ).nr("maxOutboundMessageSize", this.mUb).nr("streamTracerFactories", this.Uo).toString();
    }

    public n ty(Executor executor) {
        C0980n c0980nGh = gh(this);
        c0980nGh.rl = executor;
        return c0980nGh.rl();
    }
}
