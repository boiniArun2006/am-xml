package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R(\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u0007\u001a\u00020\u00058\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\"\u0004\b\u001a\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/FlowLineInfo;", "", "", "lineIndex", "positionInLine", "Landroidx/compose/ui/unit/Dp;", "maxMainAxisSize", "maxCrossAxisSize", "<init>", "(IIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "O", "(IIFF)V", c.f62177j, "I", "()I", "setLineIndex$foundation_layout_release", "(I)V", "rl", "nr", "setPositionInLine$foundation_layout_release", "t", "F", "()F", "setMaxMainAxisSize-0680j_4$foundation_layout_release", "(F)V", "setMaxCrossAxisSize-0680j_4$foundation_layout_release", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,594:1\n113#2:595\n113#2:596\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n*L\n577#1:595\n578#1:596\n*E\n"})
public final class FlowLineInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int lineIndex;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private float maxCrossAxisSize;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int positionInLine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float maxMainAxisSize;

    public /* synthetic */ FlowLineInfo(int i2, int i3, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, f3, f4);
    }

    private FlowLineInfo(int i2, int i3, float f3, float f4) {
        this.lineIndex = i2;
        this.positionInLine = i3;
        this.maxMainAxisSize = f3;
        this.maxCrossAxisSize = f4;
    }

    public final void O(int lineIndex, int positionInLine, float maxMainAxisSize, float maxCrossAxisSize) {
        this.lineIndex = lineIndex;
        this.positionInLine = positionInLine;
        this.maxMainAxisSize = maxMainAxisSize;
        this.maxCrossAxisSize = maxCrossAxisSize;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getLineIndex() {
        return this.lineIndex;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getPositionInLine() {
        return this.positionInLine;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final float getMaxCrossAxisSize() {
        return this.maxCrossAxisSize;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final float getMaxMainAxisSize() {
        return this.maxMainAxisSize;
    }

    public /* synthetic */ FlowLineInfo(int i2, int i3, float f3, float f4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? Dp.KN(0) : f3, (i5 & 8) != 0 ? Dp.KN(0) : f4, null);
    }
}
