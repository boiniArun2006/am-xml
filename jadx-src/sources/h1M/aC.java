package h1M;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final aC f67946n = new aC();

    private final String J2() {
        String processName;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 33) {
            return (i2 < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        Intrinsics.checkNotNullExpressionValue(strMyProcessName, "{\n      Process.myProcessName()\n    }");
        return strMyProcessName;
    }

    public static /* synthetic */ DAz.I28.Ml.j.w6 t(aC aCVar, String str, int i2, int i3, boolean z2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            z2 = false;
        }
        return aCVar.rl(str, i2, i3, z2);
    }

    public final DAz.I28.Ml.j.w6 O(Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = nr(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DAz.I28.Ml.j.w6) next).t() == iMyPid) {
                break;
            }
        }
        DAz.I28.Ml.j.w6 w6Var = (DAz.I28.Ml.j.w6) next;
        return w6Var == null ? t(this, J2(), iMyPid, 0, false, 12, null) : w6Var;
    }

    public final DAz.I28.Ml.j.w6 n(String processName, int i2, int i3) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return t(this, processName, i2, i3, false, 8, null);
    }

    public final List nr(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = CollectionsKt.emptyList();
        }
        List listFilterNotNull = CollectionsKt.filterNotNull(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(DAz.I28.Ml.j.w6.n().O(runningAppProcessInfo.processName).nr(runningAppProcessInfo.pid).t(runningAppProcessInfo.importance).rl(Intrinsics.areEqual(runningAppProcessInfo.processName, str)).n());
        }
        return arrayList2;
    }

    public final DAz.I28.Ml.j.w6 rl(String processName, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        DAz.I28.Ml.j.w6 w6VarN = DAz.I28.Ml.j.w6.n().O(processName).nr(i2).t(i3).rl(z2).n();
        Intrinsics.checkNotNullExpressionValue(w6VarN, "builder()\n      .setProc…ltProcess)\n      .build()");
        return w6VarN;
    }

    private aC() {
    }
}
