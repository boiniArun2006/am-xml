package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "layoutId", "rl", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/Measurable;", c.f62177j, "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LayoutIdKt {
    public static final Modifier rl(Modifier modifier, Object obj) {
        return modifier.Zmq(new LayoutIdElement(obj));
    }

    public static final Object n(Measurable measurable) {
        LayoutIdParentData layoutIdParentData;
        Object objJ2 = measurable.J2();
        if (objJ2 instanceof LayoutIdParentData) {
            layoutIdParentData = (LayoutIdParentData) objJ2;
        } else {
            layoutIdParentData = null;
        }
        if (layoutIdParentData == null) {
            return null;
        }
        return layoutIdParentData.getLayoutId();
    }
}
