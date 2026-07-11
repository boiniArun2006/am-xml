package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001d\b\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/constraintlayout/compose/DimensionDescription;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "Landroidx/compose/ui/unit/Dp;", "value", "", "valueSymbol", "<init>", "(Landroidx/compose/ui/unit/Dp;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "Landroidx/constraintlayout/core/parser/CLElement;", c.f62177j, "()Landroidx/constraintlayout/core/parser/CLElement;", "Landroidx/constraintlayout/compose/DimensionSymbol;", "rl", "Landroidx/constraintlayout/compose/DimensionSymbol;", "t", "()Landroidx/constraintlayout/compose/DimensionSymbol;", "min", "nr", "getMax$constraintlayout_compose_release", "max", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DimensionDescription implements Dimension.Coercible, Dimension.MinCoercible, Dimension.MaxCoercible, Dimension {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final DimensionSymbol max;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final DimensionSymbol valueSymbol;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final DimensionSymbol min;

    /* JADX WARN: Multi-variable type inference failed */
    private DimensionDescription(Dp dp, String str) {
        this.valueSymbol = new DimensionSymbol(dp, str, TtmlNode.RUBY_BASE, null);
        this.min = new DimensionSymbol(0 == true ? 1 : 0, 0 == true ? 1 : 0, "min", 0 == true ? 1 : 0);
        this.max = new DimensionSymbol(0 == true ? 1 : 0, 0 == true ? 1 : 0, "max", 0 == true ? 1 : 0);
    }

    public final CLElement n() {
        if (this.min.rl() && this.max.rl()) {
            return this.valueSymbol.n();
        }
        CLObject cLObject = new CLObject(new char[0]);
        if (!this.min.rl()) {
            cLObject.wTp("min", this.min.n());
        }
        if (!this.max.rl()) {
            cLObject.wTp("max", this.max.n());
        }
        cLObject.wTp("value", this.valueSymbol.n());
        return cLObject;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final DimensionSymbol getMin() {
        return this.min;
    }

    public DimensionDescription(String str) {
        this(null, str);
    }
}
