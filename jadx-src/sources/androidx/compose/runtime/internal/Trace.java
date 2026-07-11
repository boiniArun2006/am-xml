package androidx.compose.runtime.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/internal/Trace;", "", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, c.f62177j, "(Ljava/lang/String;)Ljava/lang/Object;", "token", "", "rl", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Trace {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Trace f30884n = new Trace();

    private Trace() {
    }

    public final Object n(String name) {
        android.os.Trace.beginSection(name);
        return null;
    }

    public final void rl(Object token) {
        android.os.Trace.endSection();
    }
}
