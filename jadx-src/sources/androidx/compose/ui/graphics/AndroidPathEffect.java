package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathEffect;", "Landroidx/compose/ui/graphics/PathEffect;", "Landroid/graphics/PathEffect;", "nativePathEffect", "<init>", "(Landroid/graphics/PathEffect;)V", "rl", "Landroid/graphics/PathEffect;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Landroid/graphics/PathEffect;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidPathEffect implements PathEffect {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final android.graphics.PathEffect nativePathEffect;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final android.graphics.PathEffect getNativePathEffect() {
        return this.nativePathEffect;
    }

    public AndroidPathEffect(android.graphics.PathEffect pathEffect) {
        this.nativePathEffect = pathEffect;
    }
}
