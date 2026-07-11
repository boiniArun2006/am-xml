package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "selectableId", "", "rl", "(Landroidx/compose/foundation/text/selection/SelectionRegistrar;J)Z", "Landroidx/compose/runtime/ProvidableCompositionLocal;", c.f62177j, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalSelectionRegistrar", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectionRegistrarKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f20942n = CompositionLocalKt.O(null, new Function0<SelectionRegistrar>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarKt$LocalSelectionRegistrar$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SelectionRegistrar invoke() {
            return null;
        }
    }, 1, null);

    public static final ProvidableCompositionLocal n() {
        return f20942n;
    }

    public static final boolean rl(SelectionRegistrar selectionRegistrar, long j2) {
        LongObjectMap longObjectMapRl;
        if (selectionRegistrar == null || (longObjectMapRl = selectionRegistrar.rl()) == null) {
            return false;
        }
        return longObjectMapRl.n(j2);
    }
}
