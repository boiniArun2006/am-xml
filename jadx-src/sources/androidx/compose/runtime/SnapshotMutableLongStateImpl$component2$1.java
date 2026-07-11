package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", c.f62177j, "(J)V"}, k = 3, mv = {1, 9, 0})
final class SnapshotMutableLongStateImpl$component2$1 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ MutableLongState f30411n;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
        n(l2.longValue());
        return Unit.INSTANCE;
    }

    public final void n(long j2) {
        this.f30411n.nY(j2);
    }
}
