package androidx.compose.material.pullrefresh;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", c.f62177j, "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
final class PullRefreshState$adjustedDistancePulled$2 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ PullRefreshState f23963n;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Float invoke() {
        return Float.valueOf(this.f23963n.KN() * 0.5f);
    }
}
