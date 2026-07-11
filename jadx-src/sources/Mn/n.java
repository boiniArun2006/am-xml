package Mn;

import Ti.C;
import Ti.w6;
import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.s4;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f6744n = new n();
    private static final int rl = Process.myUid();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ScheduledExecutorService f6745t = Executors.newSingleThreadScheduledExecutor();
    private static String nr = "";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Runnable f6743O = new Runnable() { // from class: Mn.j
        @Override // java.lang.Runnable
        public final void run() {
            n.rl();
        }
    };

    public static final void nr() {
        if (VmF.j.nr(n.class)) {
            return;
        }
        try {
            f6745t.scheduleWithFixedDelay(f6743O, 0L, 500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl() {
        if (VmF.j.nr(n.class)) {
            return;
        }
        try {
            Object systemService = s4.qie().getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            t((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    public static final void t(ActivityManager activityManager) {
        if (VmF.j.nr(n.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == rl) {
                        Thread thread = Looper.getMainLooper().getThread();
                        Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
                        String strUo = C.Uo(thread);
                        if (!Intrinsics.areEqual(strUo, nr) && C.gh(thread)) {
                            nr = strUo;
                            w6.j.n(processErrorStateInfo.shortMsg, strUo).Uo();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
        }
    }

    private n() {
    }
}
