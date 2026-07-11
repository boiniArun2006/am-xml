package io.grpc.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.base.VerifyException;
import io.grpc.AbstractC2170c;
import io.grpc.SPz;
import io.grpc.internal.AbstractC2177t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class T {

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f68378n;
        private final Map rl;

        public boolean equals(Object obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (this.f68378n.equals(jVar.f68378n) && this.rl.equals(jVar.rl)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return t1.C.rl(this.f68378n, this.rl);
        }

        public String n() {
            return this.f68378n;
        }

        public Map rl() {
            return this.rl;
        }

        public j(String str, Map map) {
            this.f68378n = (String) t1.Xo.ck(str, "policyName");
            this.rl = (Map) t1.Xo.ck(map, "rawConfigValue");
        }

        public String toString() {
            return t1.Dsr.t(this).nr("policyName", this.f68378n).nr("rawConfigValue", this.rl).toString();
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final io.grpc.Xo f68379n;
        final Object rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (t1.C.n(this.f68379n, nVar.f68379n) && t1.C.n(this.rl, nVar.rl)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return t1.C.rl(this.f68379n, this.rl);
        }

        public Object n() {
            return this.rl;
        }

        public io.grpc.Xo rl() {
            return this.f68379n;
        }

        public n(io.grpc.Xo xo, Object obj) {
            this.f68379n = (io.grpc.Xo) t1.Xo.ck(xo, "provider");
            this.rl = obj;
        }

        public String toString() {
            return t1.Dsr.t(this).nr("provider", this.f68379n).nr("config", this.rl).toString();
        }
    }

    static AbstractC2177t.Ew S(Map map) {
        Map mapMUb;
        if (map == null || (mapMUb = mz.mUb(map, "retryThrottling")) == null) {
            return null;
        }
        float fFloatValue = mz.KN(mapMUb, "maxTokens").floatValue();
        float fFloatValue2 = mz.KN(mapMUb, "tokenRatio").floatValue();
        t1.Xo.S(fFloatValue > 0.0f, "maxToken should be greater than zero");
        t1.Xo.S(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new AbstractC2177t.Ew(fFloatValue, fFloatValue2);
    }

    static List HI(Map map) {
        return mz.J2(map, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    static Long Ik(Map map) {
        return mz.qie(map, "perAttemptRecvTimeout");
    }

    static Integer KN(Map map) {
        return mz.xMQ(map, "maxAttempts");
    }

    static Long O(Map map) {
        return mz.qie(map, "initialBackoff");
    }

    public static List Uo(Map map) {
        String strGh;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(mz.J2(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (strGh = mz.gh(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(strGh.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static AbstractC2170c.n ViF(List list, io.grpc.eO eOVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            String strN = jVar.n();
            io.grpc.Xo xoNr = eOVar.nr(strN);
            if (xoNr != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(T.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                AbstractC2170c.n nVarO = xoNr.O(jVar.rl());
                return nVarO.nr() != null ? nVarO : AbstractC2170c.n.n(new n(xoNr, nVarO.t()));
            }
            arrayList.add(strN);
        }
        return AbstractC2170c.n.rl(io.grpc.SPz.Uo.Ik("None of " + arrayList + " specified by Service Config are available."));
    }

    static Long WPU(Map map) {
        return mz.qie(map, "timeout");
    }

    private static Set XQ(List list) {
        SPz.n nVarValueOf;
        EnumSet enumSetNoneOf = EnumSet.noneOf(SPz.n.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d2 = (Double) obj;
                int iIntValue = d2.intValue();
                t1.g9s.n(((double) iIntValue) == d2.doubleValue(), "Status code %s is not integral", obj);
                nVarValueOf = io.grpc.SPz.KN(iIntValue).az();
                t1.g9s.n(nVarValueOf.t() == d2.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new VerifyException("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    nVarValueOf = SPz.n.valueOf((String) obj);
                } catch (IllegalArgumentException e2) {
                    throw new VerifyException("Status code " + obj + " is not valid", e2);
                }
            }
            enumSetNoneOf.add(nVarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    static String Z(Map map) {
        return mz.gh(map, "service");
    }

    static Boolean aYN(Map map) {
        return mz.nr(map, "waitForReady");
    }

    static List az(Map map) {
        return mz.J2(map, "methodConfig");
    }

    static Set ck(Map map) {
        Set setJ2 = J2(map, "nonFatalStatusCodes");
        if (setJ2 == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(SPz.n.class));
        }
        t1.g9s.n(!setJ2.contains(SPz.n.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setJ2;
    }

    public static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(nY((Map) it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    static Integer gh(Map map) {
        return mz.xMQ(map, "maxRequestMessageBytes");
    }

    static Long mUb(Map map) {
        return mz.qie(map, "maxBackoff");
    }

    static Double n(Map map) {
        return mz.KN(map, "backoffMultiplier");
    }

    static Map nr(Map map) {
        return mz.mUb(map, "hedgingPolicy");
    }

    static Set o(Map map) {
        Set setJ2 = J2(map, "retryableStatusCodes");
        t1.g9s.n(setJ2 != null, "%s is required in retry policy", "retryableStatusCodes");
        t1.g9s.n(true ^ setJ2.contains(SPz.n.OK), "%s must not contain OK", "retryableStatusCodes");
        return setJ2;
    }

    static Integer qie(Map map) {
        return mz.xMQ(map, "maxResponseMessageBytes");
    }

    static Map r(Map map) {
        return mz.mUb(map, "retryPolicy");
    }

    public static Map rl(Map map) {
        if (map == null) {
            return null;
        }
        return mz.mUb(map, "healthCheckConfig");
    }

    static Long t(Map map) {
        return mz.qie(map, "hedgingDelay");
    }

    static String ty(Map map) {
        return mz.gh(map, "method");
    }

    static Integer xMQ(Map map) {
        return mz.xMQ(map, "maxAttempts");
    }

    private static Set J2(Map map, String str) {
        List listO = mz.O(map, str);
        if (listO == null) {
            return null;
        }
        return XQ(listO);
    }

    public static j nY(Map map) {
        if (map.size() == 1) {
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            return new j(str, mz.mUb(map, str));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
