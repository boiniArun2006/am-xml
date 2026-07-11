package androidx.compose.material;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/DismissValue;", "it", "Landroidx/compose/material/DismissState;", c.f62177j, "(Landroidx/compose/material/DismissValue;)Landroidx/compose/material/DismissState;"}, k = 3, mv = {1, 9, 0})
final class DismissState$Companion$Saver$2 extends Lambda implements Function1<DismissValue, DismissState> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function1 f21820n;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final DismissState invoke(DismissValue dismissValue) {
        return new DismissState(dismissValue, this.f21820n);
    }
}
