package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxValue;", "it", "Landroidx/compose/material3/SwipeToDismissBoxState;", c.f62177j, "(Landroidx/compose/material3/SwipeToDismissBoxValue;)Landroidx/compose/material3/SwipeToDismissBoxState;"}, k = 3, mv = {1, 8, 0})
final class SwipeToDismissBoxState$Companion$Saver$2 extends Lambda implements Function1<SwipeToDismissBoxValue, SwipeToDismissBoxState> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function1 f27995O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Density f27996n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Function1 f27997t;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final SwipeToDismissBoxState invoke(SwipeToDismissBoxValue swipeToDismissBoxValue) {
        return new SwipeToDismissBoxState(swipeToDismissBoxValue, this.f27996n, this.f27997t, this.f27995O);
    }
}
