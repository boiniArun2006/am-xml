package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "", c.f62177j, "(I)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusOwnerImplKt {
    public static final boolean n(int i2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.qie(i2, companion.O())) {
            return true;
        }
        return FocusDirection.qie(i2, companion.J2());
    }
}
