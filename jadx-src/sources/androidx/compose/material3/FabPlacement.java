package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/FabPlacement;", "", "", TtmlNode.LEFT, "width", "height", "<init>", "(III)V", c.f62177j, "I", "rl", "()I", "getWidth", "t", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FabPlacement {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int left;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    public FabPlacement(int i2, int i3, int i5) {
        this.left = i2;
        this.width = i3;
        this.height = i5;
    }
}
