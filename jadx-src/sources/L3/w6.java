package L3;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import ep.oxM.esLNYym;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final j f5923n;

    static {
        Object obj;
        Class<?> cls;
        j jVar;
        try {
            cls = Class.forName(esLNYym.jOkKyZncCfm);
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                jVar = (j) cls.asSubclass(j.class).getConstructor(Ml.class).newInstance(j.f5921n);
            } catch (Throwable th2) {
                obj = th2;
                jVar = null;
            }
        } else {
            jVar = null;
        }
        if (jVar != null) {
            f5923n = jVar;
        } else {
            f5923n = new j(j.f5921n);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, w6.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod(CreativeInfo.f62442f, cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static n J2() {
        return f5923n.O();
    }

    public static I28 KN(String str) {
        f5923n.J2(str);
        return I28.f5919n;
    }

    public static void O(n nVar) {
        f5923n.nr(nVar);
    }

    public static void Uo() {
        f5923n.Uo();
    }

    public static void n(Ml ml) {
        f5923n.n(ml);
    }

    public static void nr(String str, Ml ml) {
        f5923n.t(str, ml);
    }

    public static Ml rl(String str) {
        return f5923n.rl(str, Long.MIN_VALUE);
    }

    public static Ml t(String str, long j2) {
        return f5923n.rl(str, j2);
    }
}
