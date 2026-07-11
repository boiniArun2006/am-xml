package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", c.f62177j, "(Ljava/lang/Object;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;"}, k = 3, mv = {1, 9, 0})
final class AnchoredDraggableState$Companion$Saver$8 extends Lambda implements Function1<Object, AnchoredDraggableState<Object>> {
    final /* synthetic */ DecayAnimationSpec J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f16545O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function1 f16546n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function1 f16547r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Function0 f16548t;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final AnchoredDraggableState invoke(Object obj) {
        return AnchoredDraggableKt.rl(obj, this.f16546n, this.f16548t, this.f16545O, this.J2, this.f16547r);
    }
}
