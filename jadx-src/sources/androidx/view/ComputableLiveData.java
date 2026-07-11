package androidx.view;

import androidx.annotation.RestrictTo;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001a\u0010\u0007\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/ComputableLiveData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Ljava/util/concurrent/Executor;", c.f62177j, "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "executor", "Ljava/lang/Runnable;", "rl", "Ljava/lang/Runnable;", "getRefreshRunnable$lifecycle_livedata_release$annotations", "()V", "refreshRunnable", "lifecycle-livedata_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
public abstract class ComputableLiveData<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public final Runnable refreshRunnable;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }
}
