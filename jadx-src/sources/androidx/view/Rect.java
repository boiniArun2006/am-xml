package androidx.view;

import TFv.CN3;
import android.app.Activity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2, reason: from Kotlin metadata */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Rect;", "hint", "", c.f62177j, "(Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
final class Rect<T> implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Activity f13240n;

    @Override // TFv.CN3
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object rl(android.graphics.Rect rect, Continuation continuation) {
        Api26Impl.f13180n.n(this.f13240n, rect);
        return Unit.INSTANCE;
    }
}
