package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001!J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0017\u001a\u00020\f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R&\u0010\u001b\u001a\u00020\f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0019\u0010\u0010R&\u0010\u001f\u001a\u00020\f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001d\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/unit/DpRect;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/unit/Dp;", c.f62177j, "F", "getLeft-D9Ej5fM", "()F", "getLeft-D9Ej5fM$annotations", "()V", TtmlNode.LEFT, "rl", "getTop-D9Ej5fM", "getTop-D9Ej5fM$annotations", "top", "t", "getRight-D9Ej5fM", "getRight-D9Ej5fM$annotations", TtmlNode.RIGHT, "nr", "getBottom-D9Ej5fM", "getBottom-D9Ej5fM$annotations", "bottom", "O", "Companion", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n49#2:435\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n*L\n415#1:435\n*E\n"})
public final /* data */ class DpRect {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final float left;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final float bottom;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final float top;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final float right;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) other;
        return Dp.mUb(this.left, dpRect.left) && Dp.mUb(this.top, dpRect.top) && Dp.mUb(this.right, dpRect.right) && Dp.mUb(this.bottom, dpRect.bottom);
    }

    public int hashCode() {
        return (((((Dp.gh(this.left) * 31) + Dp.gh(this.top)) * 31) + Dp.gh(this.right)) * 31) + Dp.gh(this.bottom);
    }

    public String toString() {
        return "DpRect(left=" + ((Object) Dp.qie(this.left)) + ", top=" + ((Object) Dp.qie(this.top)) + ", right=" + ((Object) Dp.qie(this.right)) + ", bottom=" + ((Object) Dp.qie(this.bottom)) + ')';
    }
}
