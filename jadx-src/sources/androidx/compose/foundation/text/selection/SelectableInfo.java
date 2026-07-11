package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010.R\u0011\u00101\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0011\u00103\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b2\u0010#R\u0011\u00106\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b&\u00105¨\u00067"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectableInfo;", "", "", "selectableId", "", "slot", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "<init>", "(JIIIILandroidx/compose/ui/text/TextLayoutResult;)V", InneractiveMediationNameConsts.OTHER, "", "ty", "(Landroidx/compose/foundation/text/selection/SelectableInfo;)Z", "offset", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", c.f62177j, "(I)Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", TtmlNode.START, TtmlNode.END, "Landroidx/compose/foundation/text/selection/Selection;", "az", "(II)Landroidx/compose/foundation/text/selection/Selection;", "", "toString", "()Ljava/lang/String;", "J", "KN", "()J", "rl", "I", "xMQ", "()I", "t", "Uo", "nr", "O", "J2", "Landroidx/compose/ui/text/TextLayoutResult;", "gh", "()Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "mUb", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "startRunDirection", "endRunDirection", "inputText", "qie", "textLength", "Landroidx/compose/foundation/text/selection/CrossStatus;", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "rawCrossStatus", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelectableInfo {
    public static final int Uo = TextLayoutResult.Uo;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final TextLayoutResult textLayoutResult;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int rawPreviousHandleOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int rawEndHandleOffset;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int slot;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int rawStartHandleOffset;

    private final ResolvedTextDirection mUb() {
        return SelectionLayoutKt.rl(this.textLayoutResult, this.rawStartHandleOffset);
    }

    private final ResolvedTextDirection rl() {
        return SelectionLayoutKt.rl(this.textLayoutResult, this.rawEndHandleOffset);
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final int getRawPreviousHandleOffset() {
        return this.rawPreviousHandleOffset;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final long getSelectableId() {
        return this.selectableId;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getRawEndHandleOffset() {
        return this.rawEndHandleOffset;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final int getRawStartHandleOffset() {
        return this.rawStartHandleOffset;
    }

    public final Selection az(int start, int end) {
        return new Selection(n(start), n(end), start > end);
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public final Selection.AnchorInfo n(int offset) {
        return new Selection.AnchorInfo(SelectionLayoutKt.rl(this.textLayoutResult, offset), offset, this.selectableId);
    }

    public final CrossStatus nr() {
        int i2 = this.rawStartHandleOffset;
        int i3 = this.rawEndHandleOffset;
        return i2 < i3 ? CrossStatus.f20735t : i2 > i3 ? CrossStatus.f20733n : CrossStatus.f20732O;
    }

    public final String t() {
        return this.textLayoutResult.getLayoutInput().getText().getText();
    }

    public String toString() {
        return "SelectionInfo(id=" + this.selectableId + ", range=(" + this.rawStartHandleOffset + '-' + mUb() + ',' + this.rawEndHandleOffset + '-' + rl() + "), prevOffset=" + this.rawPreviousHandleOffset + ')';
    }

    public final boolean ty(SelectableInfo other) {
        return (this.selectableId == other.selectableId && this.rawStartHandleOffset == other.rawStartHandleOffset && this.rawEndHandleOffset == other.rawEndHandleOffset) ? false : true;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final int getSlot() {
        return this.slot;
    }

    public SelectableInfo(long j2, int i2, int i3, int i5, int i7, TextLayoutResult textLayoutResult) {
        this.selectableId = j2;
        this.slot = i2;
        this.rawStartHandleOffset = i3;
        this.rawEndHandleOffset = i5;
        this.rawPreviousHandleOffset = i7;
        this.textLayoutResult = textLayoutResult;
    }

    public final int qie() {
        return t().length();
    }
}
