package ICC;

import HI0.Q;
import ICC.C;
import android.net.Uri;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tu.SPz;
import tu.r;
import tu.u;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class CN3 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Integer f4085O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Q f4086n;
    private long nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f4087t;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float J2(float f3, long j2) {
        return f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float qie(float f3, long j2) {
        return f3;
    }

    public CN3(Q contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f4086n = contentResolver;
        this.rl = new ArrayList();
        this.f4087t = new LinkedHashSet();
        this.nr = 1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Uo(long j2) {
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float az(long j2) {
        return 1.0f;
    }

    public final Integer KN() {
        return this.f4085O;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[PHI: r1
      0x0069: PHI (r1v20 java.lang.Double) = (r1v6 java.lang.Double), (r1v9 java.lang.Double) binds: [B:25:0x0067, B:31:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(Uri uri, Function1 init) {
        double dDoubleValue;
        Function1 function1;
        long jLongValue;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(init, "init");
        o oVar = new o();
        init.invoke(oVar);
        try {
            Function1 function12 = null;
            SPz sPzTe = r.te(this.f4086n, uri, false, 4, null);
            tu.aC aCVar = sPzTe instanceof tu.aC ? (tu.aC) sPzTe : null;
            if (aCVar != null && r.ty(aCVar)) {
                Double dO = oVar.O();
                double dDoubleValue2 = dO != null ? dO.doubleValue() : 0.0d;
                Double dUo = oVar.Uo();
                double dDoubleValue3 = dUo != null ? dUo.doubleValue() : aCVar.t() / 1000000.0d;
                Double dXMQ = oVar.xMQ();
                double dDoubleValue4 = dXMQ != null ? dXMQ.doubleValue() : 0.0d;
                Double dRl = oVar.rl();
                if (dRl == null) {
                    Double dN = oVar.n();
                    dRl = dN != null ? Double.valueOf(dN.doubleValue() + dDoubleValue4) : null;
                    dDoubleValue = dRl != null ? dRl.doubleValue() : (dDoubleValue3 - dDoubleValue2) + dDoubleValue4;
                }
                Function1 function1Gh = oVar.gh();
                if (function1Gh != null) {
                    function1 = function1Gh;
                } else {
                    Double dMUb = oVar.mUb();
                    if (dMUb != null) {
                        final float fDoubleValue = (float) dMUb.doubleValue();
                        function12 = new Function1() { // from class: ICC.w6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Float.valueOf(CN3.J2(fDoubleValue, ((Long) obj).longValue()));
                            }
                        };
                    }
                    if (function12 == null) {
                        function1Gh = new Function1() { // from class: ICC.Ml
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Float.valueOf(CN3.Uo(((Long) obj).longValue()));
                            }
                        };
                        function1 = function1Gh;
                    } else {
                        function1 = function12;
                    }
                }
                Long lNr = oVar.nr();
                if (lNr != null) {
                    jLongValue = lNr.longValue();
                } else {
                    jLongValue = this.nr;
                    this.nr = 1 + jLongValue;
                }
                C.j jVar = C.j.f4083n;
                long j2 = (long) (dDoubleValue2 * 1.0E9d);
                long j3 = (long) (dDoubleValue3 * 1.0E9d);
                long j4 = (long) (dDoubleValue4 * 1.0E9d);
                long j5 = (long) (dDoubleValue * 1.0E9d);
                Float fKN = oVar.KN();
                float fFloatValue = fKN != null ? fKN.floatValue() : 1.0f;
                Boolean boolJ2 = oVar.J2();
                boolean zBooleanValue = boolJ2 != null ? boolJ2.booleanValue() : false;
                long j6 = jLongValue;
                C c2 = new C(j6, jVar, uri, j2, j3, j4, j5, zBooleanValue, fFloatValue, function1, 30);
                if (!this.f4087t.contains(Long.valueOf(j6))) {
                    this.f4087t.add(Long.valueOf(j6));
                    this.rl.add(c2);
                } else {
                    throw new IllegalStateException("Duplicate ID: " + j6);
                }
            }
        } catch (FileNotFoundException | SecurityException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[PHI: r3
      0x0064: PHI (r3v22 java.lang.Double) = (r3v6 java.lang.Double), (r3v9 java.lang.Double) binds: [B:22:0x0062, B:28:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gh(Uri uri, Function1 init) {
        double dDoubleValue;
        Function1 function1;
        long jLongValue;
        int iO;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(init, "init");
        o oVar = new o();
        init.invoke(oVar);
        try {
            Function1 function12 = null;
            SPz sPzTe = r.te(this.f4086n, uri, false, 4, null);
            tu.aC aCVar = sPzTe instanceof tu.aC ? (tu.aC) sPzTe : null;
            if (aCVar == null) {
                return;
            }
            Double dO = oVar.O();
            double dDoubleValue2 = (dO != null ? dO.doubleValue() : 0.0d) + ((double) 0.0f);
            Double dUo = oVar.Uo();
            double dDoubleValue3 = dUo != null ? dUo.doubleValue() : aCVar.t() / 1000000.0d;
            Double dXMQ = oVar.xMQ();
            double dDoubleValue4 = dXMQ != null ? dXMQ.doubleValue() : 0.0d;
            Double dRl = oVar.rl();
            if (dRl == null) {
                Double dN = oVar.n();
                dRl = dN != null ? Double.valueOf(dN.doubleValue() + dDoubleValue4) : null;
                dDoubleValue = dRl != null ? dRl.doubleValue() : (dDoubleValue3 - dDoubleValue2) + dDoubleValue4;
            }
            Function1 function1Gh = oVar.gh();
            if (function1Gh != null) {
                function1 = function1Gh;
            } else {
                Double dMUb = oVar.mUb();
                if (dMUb != null) {
                    final float fDoubleValue = (float) dMUb.doubleValue();
                    function12 = new Function1() { // from class: ICC.I28
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(CN3.qie(fDoubleValue, ((Long) obj).longValue()));
                        }
                    };
                }
                if (function12 == null) {
                    function1Gh = new Function1() { // from class: ICC.Wre
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(CN3.az(((Long) obj).longValue()));
                        }
                    };
                    function1 = function1Gh;
                } else {
                    function1 = function12;
                }
            }
            Long lNr = oVar.nr();
            if (lNr != null) {
                jLongValue = lNr.longValue();
            } else {
                jLongValue = this.nr;
                this.nr = 1 + jLongValue;
            }
            C.j jVar = C.j.f4084t;
            long j2 = (long) (dDoubleValue2 * 1.0E9d);
            long j3 = (long) (dDoubleValue3 * 1.0E9d);
            long j4 = (long) (dDoubleValue4 * 1.0E9d);
            long j5 = (long) (dDoubleValue * 1.0E9d);
            Float fKN = oVar.KN();
            float fFloatValue = fKN != null ? fKN.floatValue() : 1.0f;
            Boolean boolJ2 = oVar.J2();
            boolean zBooleanValue = boolJ2 != null ? boolJ2.booleanValue() : false;
            Integer numT = oVar.t();
            if (numT != null) {
                iO = numT.intValue();
            } else {
                u uVarGh = aCVar.gh();
                iO = (uVarGh != null ? uVarGh.O() : AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS) / 100;
            }
            long j6 = jLongValue;
            C c2 = new C(j6, jVar, uri, j2, j3, j4, j5, zBooleanValue, fFloatValue, function1, iO);
            if (!this.f4087t.contains(Long.valueOf(j6))) {
                this.f4087t.add(Long.valueOf(j6));
                this.rl.add(c2);
            } else {
                throw new IllegalStateException("Duplicate ID: " + j6);
            }
        } catch (FileNotFoundException | SecurityException unused) {
        }
    }

    public final void mUb(Integer num) {
        this.f4085O = num;
    }

    public final List xMQ() {
        return this.rl;
    }
}
