package androidx.compose.foundation;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/NoIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", c.f62177j, "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class NoIndicationInstance implements IndicationInstance {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final NoIndicationInstance f16247n = new NoIndicationInstance();

    private NoIndicationInstance() {
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void n(ContentDrawScope contentDrawScope) {
        contentDrawScope.l2();
    }
}
