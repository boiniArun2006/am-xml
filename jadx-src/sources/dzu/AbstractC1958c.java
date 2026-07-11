package dzu;

import GJW.DC;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: dzu.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class AbstractC1958c {
    private static final s4 n(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        nr();
        throw new KotlinNothingValueException();
    }

    public static final Void nr() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    static /* synthetic */ s4 rl(Throwable th, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return n(th, str);
    }

    public static final DC O(QJ qj, List list) {
        try {
            return qj.rl(list);
        } catch (Throwable th) {
            return n(th, qj.n());
        }
    }

    public static final boolean t(DC dc) {
        return dc.T3L() instanceof s4;
    }
}
