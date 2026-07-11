package Si;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class QJ {
    private static int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static long f9822O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile long f9823n;
    private static final List nr = new ArrayList();
    private static volatile long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile long f9824t;

    public static final int J2() {
        return J2;
    }

    public static final long KN() {
        return f9824t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O() {
        return "clearScenePlayerTexCaches OUT";
    }

    public static final long Uo() {
        return f9822O;
    }

    public static final void az(long j2) {
        rl = j2;
    }

    public static final void gh(long j2) {
        f9822O = j2;
    }

    public static final void mUb(int i2) {
        J2 = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nr() {
        return "clearScenePlayerTexCaches IN";
    }

    public static final void qie(long j2) {
        f9824t = j2;
    }

    public static final void t() {
        ArrayList arrayList;
        XoT.C.KN("ScenePlayer", new Function0() { // from class: Si.eO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QJ.nr();
            }
        });
        List list = nr;
        synchronized (list) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Xo xo = (Xo) ((WeakReference) it.next()).get();
                if (xo != null) {
                    arrayList.add(xo);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Xo) it2.next()).aYN();
        }
        XoT.C.KN("ScenePlayer", new Function0() { // from class: Si.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QJ.O();
            }
        });
    }

    public static final void ty(long j2) {
        f9823n = j2;
    }

    public static final long xMQ() {
        return f9823n;
    }
}
