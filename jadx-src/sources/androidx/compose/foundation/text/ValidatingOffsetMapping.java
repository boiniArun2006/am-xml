package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.OffsetMapping;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/ValidatingOffsetMapping;", "Landroidx/compose/ui/text/input/OffsetMapping;", "delegate", "", "originalLength", "transformedLength", "<init>", "(Landroidx/compose/ui/text/input/OffsetMapping;II)V", "offset", "rl", "(I)I", c.f62177j, "Landroidx/compose/ui/text/input/OffsetMapping;", "t", "I", "nr", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ValidatingOffsetMapping implements OffsetMapping {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int transformedLength;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final OffsetMapping delegate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int originalLength;

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int n(int offset) {
        int iN = this.delegate.n(offset);
        if (offset >= 0 && offset <= this.transformedLength) {
            ValidatingOffsetMappingKt.KN(iN, this.originalLength, offset);
        }
        return iN;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int rl(int offset) {
        int iRl = this.delegate.rl(offset);
        if (offset >= 0 && offset <= this.originalLength) {
            ValidatingOffsetMappingKt.Uo(iRl, this.transformedLength, offset);
        }
        return iRl;
    }

    public ValidatingOffsetMapping(OffsetMapping offsetMapping, int i2, int i3) {
        this.delegate = offsetMapping;
        this.originalLength = i2;
        this.transformedLength = i3;
    }
}
