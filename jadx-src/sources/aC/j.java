package aC;

import GJW.iwV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j extends AbstractCoroutineContextElement implements iwV {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static boolean f12746O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f12747n = new j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f12749t = new Object();
    private static final List J2 = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Map f12748r = new LinkedHashMap();

    private j() {
        super(iwV.rl);
    }

    private final boolean qm(Throwable th) {
        Iterator it = f12748r.values().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(th);
            z2 = true;
        }
        return z2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) || (obj instanceof n);
    }

    public final boolean n1(Throwable th) {
        synchronized (f12749t) {
            if (!f12746O) {
                return false;
            }
            if (f12747n.qm(th)) {
                return true;
            }
            J2.add(th);
            return false;
        }
    }

    @Override // GJW.iwV
    public void a(CoroutineContext coroutineContext, Throwable th) {
        if (!n1(th)) {
        } else {
            throw ExceptionSuccessfullyProcessed.f70253n;
        }
    }
}
