package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/FabPlacement;", "", "", "isDocked", "", TtmlNode.LEFT, "width", "height", "<init>", "(ZIII)V", c.f62177j, "Z", "nr", "()Z", "rl", "I", "()I", "t", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FabPlacement {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isDocked;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int left;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final boolean getIsDocked() {
        return this.isDocked;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public FabPlacement(boolean z2, int i2, int i3, int i5) {
        this.isDocked = z2;
        this.left = i2;
        this.width = i3;
        this.height = i5;
    }
}
