package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\b\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "", "Landroidx/compose/ui/unit/Dp;", TtmlNode.START, "top", TtmlNode.END, "bottom", "", "isLayoutDirectionAware", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/node/TouchBoundsExpansion;", c.f62177j, "(Landroidx/compose/ui/unit/Density;)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "F", "getStart-D9Ej5fM", "()F", "rl", "getTop-D9Ej5fM", "t", "getEnd-D9Ej5fM", "nr", "getBottom-D9Ej5fM", "O", "Z", "()Z", "J2", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/DpTouchBoundsExpansion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,248:1\n102#2,5:249\n102#2,5:254\n102#2,5:259\n102#2,5:264\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/DpTouchBoundsExpansion\n*L\n164#1:249,5\n165#1:254,5\n166#1:259,5\n167#1:264,5\n*E\n"})
public final /* data */ class DpTouchBoundsExpansion {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean isLayoutDirectionAware;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float start;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float bottom;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float top;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float end;

    public /* synthetic */ DpTouchBoundsExpansion(float f3, float f4, float f5, float f6, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, f5, f6, z2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) other;
        return Dp.mUb(this.start, dpTouchBoundsExpansion.start) && Dp.mUb(this.top, dpTouchBoundsExpansion.top) && Dp.mUb(this.end, dpTouchBoundsExpansion.end) && Dp.mUb(this.bottom, dpTouchBoundsExpansion.bottom) && this.isLayoutDirectionAware == dpTouchBoundsExpansion.isLayoutDirectionAware;
    }

    public int hashCode() {
        return (((((((Dp.gh(this.start) * 31) + Dp.gh(this.top)) * 31) + Dp.gh(this.end)) * 31) + Dp.gh(this.bottom)) * 31) + Boolean.hashCode(this.isLayoutDirectionAware);
    }

    public String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) Dp.qie(this.start)) + KfLR.pLGxRa + ((Object) Dp.qie(this.top)) + ", end=" + ((Object) Dp.qie(this.end)) + ", bottom=" + ((Object) Dp.qie(this.bottom)) + ", isLayoutDirectionAware=" + this.isLayoutDirectionAware + ')';
    }

    private DpTouchBoundsExpansion(float f3, float f4, float f5, float f6, boolean z2) {
        this.start = f3;
        this.top = f4;
        this.end = f5;
        this.bottom = f6;
        this.isLayoutDirectionAware = z2;
        if (!(f3 >= 0.0f)) {
            InlineClassHelperKt.n("Left must be non-negative");
        }
        if (!(f4 >= 0.0f)) {
            InlineClassHelperKt.n("Top must be non-negative");
        }
        if (!(f5 >= 0.0f)) {
            InlineClassHelperKt.n("Right must be non-negative");
        }
        if (f6 >= 0.0f) {
            return;
        }
        InlineClassHelperKt.n("Bottom must be non-negative");
    }

    public final long n(Density density) {
        return TouchBoundsExpansion.nr(TouchBoundsExpansion.INSTANCE.t(density.How(this.start), density.How(this.top), density.How(this.end), density.How(this.bottom), this.isLayoutDirectionAware));
    }
}
