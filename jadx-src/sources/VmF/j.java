package VmF;

import Ti.n;
import Ti.w6;
import android.os.Handler;
import android.os.Looper;
import com.facebook.s4;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f11283n = new j();
    private static final Set rl = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f11284t;

    /* JADX INFO: renamed from: VmF.j$j, reason: collision with other inner class name */
    public static final class RunnableC0403j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Throwable f11285n;

        RunnableC0403j(Throwable th) {
            this.f11285n = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException(this.f11285n);
        }
    }

    public static final void n() {
        f11284t = true;
    }

    public static final boolean t() {
        return false;
    }

    public static final boolean nr(Object o2) {
        Intrinsics.checkNotNullParameter(o2, "o");
        return rl.contains(o2);
    }

    public static final void rl(Throwable th, Object o2) {
        Intrinsics.checkNotNullParameter(o2, "o");
        if (f11284t) {
            rl.add(o2);
            if (s4.ck()) {
                n.t(th);
                w6.j.rl(th, w6.EnumC0373w6.CrashShield).Uo();
            }
            O(th);
        }
    }

    private j() {
    }

    public static final void O(Throwable th) {
        if (t()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0403j(th));
        }
    }
}
