package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/Measurable;", "", c.f62177j, "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/String;", "anyOrNullId", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MeasurerKt {
    public static final String n(Measurable measurable) {
        String string;
        Object objN = LayoutIdKt.n(measurable);
        if (objN == null) {
            objN = ConstraintLayoutTagKt.n(measurable);
        }
        if (objN != null && (string = objN.toString()) != null) {
            return string;
        }
        return V8ValueNull.NULL;
    }
}
