package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
final /* synthetic */ class PullRefreshKt$pullRefresh$1 extends FunctionReferenceImpl implements Function1<Float, Float> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f3) {
        return n(f3.floatValue());
    }

    public final Float n(float f3) {
        return Float.valueOf(((PullRefreshState) this.receiver).Ik(f3));
    }
}
