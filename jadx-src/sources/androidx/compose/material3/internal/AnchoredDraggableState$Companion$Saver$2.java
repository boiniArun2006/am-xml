package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Landroidx/compose/material3/internal/AnchoredDraggableState;", c.f62177j, "(Ljava/lang/Object;)Landroidx/compose/material3/internal/AnchoredDraggableState;"}, k = 3, mv = {1, 8, 0})
final class AnchoredDraggableState$Companion$Saver$2 extends Lambda implements Function1<Object, AnchoredDraggableState<Object>> {
    final /* synthetic */ Function1 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f29043O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function1 f29044n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Function0 f29045t;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final AnchoredDraggableState invoke(Object obj) {
        return new AnchoredDraggableState(obj, this.f29044n, this.f29045t, this.f29043O, this.J2);
    }
}
