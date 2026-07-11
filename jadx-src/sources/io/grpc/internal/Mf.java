package io.grpc.internal;

import io.grpc.Dsr;
import io.grpc.Pl;
import io.grpc.internal.AbstractC2177t;
import io.grpc.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class Mf {
    private final Map J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f68330O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f68331n;
    private final AbstractC2177t.Ew nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f68332t;

    static final class n {
        static final n.w6 Uo = n.w6.rl("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
        final Zs J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final cA f68333O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Long f68334n;
        final Integer nr;
        final Boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Integer f68335t;

        public boolean equals(Object obj) {
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return t1.C.n(this.f68334n, nVar.f68334n) && t1.C.n(this.rl, nVar.rl) && t1.C.n(this.f68335t, nVar.f68335t) && t1.C.n(this.nr, nVar.nr) && t1.C.n(this.f68333O, nVar.f68333O) && t1.C.n(this.J2, nVar.J2);
        }

        public int hashCode() {
            return t1.C.rl(this.f68334n, this.rl, this.f68335t, this.nr, this.f68333O, this.J2);
        }

        n(Map map, boolean z2, int i2, int i3) {
            Map mapR;
            cA cAVarRl;
            Map mapNr;
            boolean z3;
            this.f68334n = T.WPU(map);
            this.rl = T.aYN(map);
            Integer numQie = T.qie(map);
            this.f68335t = numQie;
            if (numQie != null) {
                if (numQie.intValue() >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                t1.Xo.gh(z3, "maxInboundMessageSize %s exceeds bounds", numQie);
            }
            Integer numGh = T.gh(map);
            this.nr = numGh;
            if (numGh != null) {
                t1.Xo.gh(numGh.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numGh);
            }
            if (z2) {
                mapR = T.r(map);
            } else {
                mapR = null;
            }
            if (mapR == null) {
                cAVarRl = null;
            } else {
                cAVarRl = rl(mapR, i2);
            }
            this.f68333O = cAVarRl;
            if (z2) {
                mapNr = T.nr(map);
            } else {
                mapNr = null;
            }
            this.J2 = mapNr != null ? n(mapNr, i3) : null;
        }

        private static Zs n(Map map, int i2) {
            boolean z2;
            int iIntValue = ((Integer) t1.Xo.ck(T.KN(map), "maxAttempts cannot be empty")).intValue();
            boolean z3 = false;
            if (iIntValue >= 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            t1.Xo.KN(z2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i2);
            long jLongValue = ((Long) t1.Xo.ck(T.t(map), "hedgingDelay cannot be empty")).longValue();
            if (jLongValue >= 0) {
                z3 = true;
            }
            t1.Xo.mUb(z3, "hedgingDelay must not be negative: %s", jLongValue);
            return new Zs(iMin, jLongValue, T.ck(map));
        }

        private static cA rl(Map map, int i2) {
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int iIntValue = ((Integer) t1.Xo.ck(T.xMQ(map), "maxAttempts cannot be empty")).intValue();
            boolean z7 = false;
            if (iIntValue >= 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            t1.Xo.KN(z2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i2);
            long jLongValue = ((Long) t1.Xo.ck(T.O(map), "initialBackoff cannot be empty")).longValue();
            if (jLongValue > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            t1.Xo.mUb(z3, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) t1.Xo.ck(T.mUb(map), "maxBackoff cannot be empty")).longValue();
            if (jLongValue2 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            t1.Xo.mUb(z4, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double d2 = (Double) t1.Xo.ck(T.n(map), "backoffMultiplier cannot be empty");
            double dDoubleValue = d2.doubleValue();
            if (dDoubleValue > 0.0d) {
                z5 = true;
            } else {
                z5 = false;
            }
            t1.Xo.gh(z5, "backoffMultiplier must be greater than 0: %s", d2);
            Long lIk = T.Ik(map);
            if (lIk != null && lIk.longValue() < 0) {
                z6 = false;
            } else {
                z6 = true;
            }
            t1.Xo.gh(z6, "perAttemptRecvTimeout cannot be negative: %s", lIk);
            Set setO = T.o(map);
            if (lIk != null || !setO.isEmpty()) {
                z7 = true;
            }
            t1.Xo.O(z7, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new cA(iMin, jLongValue, jLongValue2, dDoubleValue, lIk, setO);
        }

        public String toString() {
            return t1.Dsr.t(this).nr("timeoutNanos", this.f68334n).nr("waitForReady", this.rl).nr("maxInboundMessageSize", this.f68335t).nr("maxOutboundMessageSize", this.nr).nr("retryPolicy", this.f68333O).nr("hedgingPolicy", this.J2).toString();
        }
    }

    static final class w6 extends io.grpc.Dsr {
        final Mf rl;

        private w6(Mf mf) {
            this.rl = mf;
        }

        @Override // io.grpc.Dsr
        public Dsr.n n(Pl.CN3 cn3) {
            return Dsr.n.nr().rl(this.rl).n();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Mf.class == obj.getClass()) {
            Mf mf = (Mf) obj;
            if (t1.C.n(this.f68331n, mf.f68331n) && t1.C.n(this.rl, mf.rl) && t1.C.n(this.f68332t, mf.f68332t) && t1.C.n(this.nr, mf.nr) && t1.C.n(this.f68330O, mf.f68330O)) {
                return true;
            }
        }
        return false;
    }

    static Mf n() {
        return new Mf(null, new HashMap(), new HashMap(), null, null, null);
    }

    static Mf rl(Map map, boolean z2, int i2, int i3, Object obj) {
        AbstractC2177t.Ew ewS = z2 ? T.S(map) : null;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapRl = T.rl(map);
        List<Map> listAz = T.az(map);
        if (listAz == null) {
            return new Mf(null, map2, map3, ewS, obj, mapRl);
        }
        n nVar = null;
        for (Map map4 : listAz) {
            n nVar2 = new n(map4, z2, i2, i3);
            List<Map> listHI = T.HI(map4);
            if (listHI != null && !listHI.isEmpty()) {
                for (Map map5 : listHI) {
                    String strZ = T.Z(map5);
                    String strTy = T.ty(map5);
                    if (t1.s4.rl(strZ)) {
                        t1.Xo.gh(t1.s4.rl(strTy), "missing service name for method %s", strTy);
                        t1.Xo.gh(nVar == null, "Duplicate default method config in service config %s", map);
                        nVar = nVar2;
                    } else if (t1.s4.rl(strTy)) {
                        t1.Xo.gh(!map3.containsKey(strZ), "Duplicate service %s", strZ);
                        map3.put(strZ, nVar2);
                    } else {
                        String strRl = JP.DAz.rl(strZ, strTy);
                        t1.Xo.gh(!map2.containsKey(strRl), "Duplicate method name %s", strRl);
                        map2.put(strRl, nVar2);
                    }
                }
            }
        }
        return new Mf(nVar, map2, map3, ewS, obj, mapRl);
    }

    n J2(JP.DAz dAz) {
        n nVar = (n) this.rl.get(dAz.t());
        if (nVar == null) {
            nVar = (n) this.f68332t.get(dAz.nr());
        }
        return nVar == null ? this.f68331n : nVar;
    }

    Object O() {
        return this.f68330O;
    }

    AbstractC2177t.Ew Uo() {
        return this.nr;
    }

    public int hashCode() {
        return t1.C.rl(this.f68331n, this.rl, this.f68332t, this.nr, this.f68330O);
    }

    Map nr() {
        return this.J2;
    }

    io.grpc.Dsr t() {
        if (this.f68332t.isEmpty() && this.rl.isEmpty() && this.f68331n == null) {
            return null;
        }
        return new w6();
    }

    Mf(n nVar, Map map, Map map2, AbstractC2177t.Ew ew, Object obj, Map map3) {
        Map mapUnmodifiableMap;
        this.f68331n = nVar;
        this.rl = Collections.unmodifiableMap(new HashMap(map));
        this.f68332t = Collections.unmodifiableMap(new HashMap(map2));
        this.nr = ew;
        this.f68330O = obj;
        if (map3 != null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(map3));
        } else {
            mapUnmodifiableMap = null;
        }
        this.J2 = mapUnmodifiableMap;
    }

    public String toString() {
        return t1.Dsr.t(this).nr("defaultMethodConfig", this.f68331n).nr("serviceMethodMap", this.rl).nr("serviceMap", this.f68332t).nr("retryThrottling", this.nr).nr("loadBalancingConfig", this.f68330O).toString();
    }
}
