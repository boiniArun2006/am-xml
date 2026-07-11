package androidx.work;

import android.content.Context;
import androidx.work.impl.WorkManagerImpl;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class WorkManager {
    public abstract Operation n(String str);

    public abstract Operation t(List list);

    protected WorkManager() {
    }

    public static void O(Context context, Configuration configuration) {
        WorkManagerImpl.O(context, configuration);
    }

    public static WorkManager nr(Context context) {
        return WorkManagerImpl.gh(context);
    }

    public final Operation rl(WorkRequest workRequest) {
        return t(Collections.singletonList(workRequest));
    }
}
