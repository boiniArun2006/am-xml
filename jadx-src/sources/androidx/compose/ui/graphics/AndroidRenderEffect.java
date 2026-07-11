package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "rl", "()Landroid/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "getAndroidRenderEffect", "androidRenderEffect", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidRenderEffect extends RenderEffect {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final android.graphics.RenderEffect androidRenderEffect;

    @Override // androidx.compose.ui.graphics.RenderEffect
    /* JADX INFO: renamed from: rl, reason: from getter */
    protected android.graphics.RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}
