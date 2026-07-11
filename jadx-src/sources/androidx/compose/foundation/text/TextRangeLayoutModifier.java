package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0000*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text/TextRangeLayoutModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;", "measurePolicy", "<init>", "(Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "rl", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Landroidx/compose/foundation/text/TextRangeLayoutModifier;", c.f62177j, "Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;", "()Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextRangeLayoutModifier implements ParentDataModifier {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TextRangeScopeMeasurePolicy measurePolicy;

    @Override // androidx.compose.ui.layout.ParentDataModifier
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public TextRangeLayoutModifier Xw(Density density, Object obj) {
        return this;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextRangeScopeMeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public TextRangeLayoutModifier(TextRangeScopeMeasurePolicy textRangeScopeMeasurePolicy) {
        this.measurePolicy = textRangeScopeMeasurePolicy;
    }
}
