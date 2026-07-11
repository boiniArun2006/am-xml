package qE;

import android.app.ActivityManager;
import android.content.Context;
import androidx.core.content.ContextCompat;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f72309n;

    public n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f72309n = context;
    }

    public final boolean n() {
        List<ActivityManager.AppTask> appTasks;
        ActivityManager activityManager = (ActivityManager) ContextCompat.getSystemService(this.f72309n, ActivityManager.class);
        if (activityManager == null || (appTasks = activityManager.getAppTasks()) == null || appTasks.isEmpty()) {
            return true;
        }
        Iterator<T> it = appTasks.iterator();
        while (it.hasNext()) {
            if (((ActivityManager.AppTask) it.next()).getTaskInfo().baseActivity != null) {
                return false;
            }
        }
        return true;
    }
}
