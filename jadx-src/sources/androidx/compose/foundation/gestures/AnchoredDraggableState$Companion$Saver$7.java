package androidx.compose.foundation.gestures;

import androidx.compose.runtime.saveable.SaverScope;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "it", c.f62177j, "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/gestures/AnchoredDraggableState;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
final class AnchoredDraggableState$Companion$Saver$7 extends Lambda implements Function2<SaverScope, AnchoredDraggableState<Object>, Object> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AnchoredDraggableState$Companion$Saver$7 f16544n = new AnchoredDraggableState$Companion$Saver$7();

    AnchoredDraggableState$Companion$Saver$7() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(SaverScope saverScope, AnchoredDraggableState anchoredDraggableState) {
        return anchoredDraggableState.ty();
    }
}
