package DK;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.o;
import com.google.firebase.w6;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile FirebaseAnalytics f1414n;
    private static final Object rl = new Object();

    public static final FirebaseAnalytics n(w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        if (f1414n == null) {
            synchronized (rl) {
                try {
                    if (f1414n == null) {
                        f1414n = FirebaseAnalytics.getInstance(o.n(w6.f60907n).qie());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f1414n;
        Intrinsics.checkNotNull(firebaseAnalytics);
        return firebaseAnalytics;
    }
}
