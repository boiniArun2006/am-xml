package androidx.work;

import android.content.Context;
import androidx.startup.Initializer;
import androidx.work.Configuration;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class WorkManagerInitializer implements Initializer<WorkManager> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42754n = Logger.J2("WrkMgrInitializer");

    @Override // androidx.startup.Initializer
    public List n() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.startup.Initializer
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public WorkManager create(Context context) {
        Logger.t().n(f42754n, "Initializing WorkManager with default configuration.", new Throwable[0]);
        WorkManager.O(context, new Configuration.Builder().n());
        return WorkManager.nr(context);
    }
}
