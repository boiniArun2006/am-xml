package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/material/DismissState;", "it", "Landroidx/compose/material/DismissValue;", c.f62177j, "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/material/DismissState;)Landroidx/compose/material/DismissValue;"}, k = 3, mv = {1, 9, 0})
final class DismissState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, DismissState, DismissValue> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DismissState$Companion$Saver$1 f21819n = new DismissState$Companion$Saver$1();

    DismissState$Companion$Saver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final DismissValue invoke(SaverScope saverScope, DismissState dismissState) {
        return (DismissValue) dismissState.ck();
    }
}
