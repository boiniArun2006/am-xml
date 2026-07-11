package androidx.compose.ui.graphics.layer;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/layer/OutlineUtils;", "", "<init>", "()V", "Landroid/view/View;", "view", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/View;)Z", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class OutlineUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final OutlineUtils f31726n = new OutlineUtils();

    private OutlineUtils() {
    }

    public final boolean n(View view) {
        view.invalidateOutline();
        return true;
    }
}
