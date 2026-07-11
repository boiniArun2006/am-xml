package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLString;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/constraintlayout/compose/DimensionSymbol;", "", "Landroidx/compose/ui/unit/Dp;", "value", "", JavetError.PARAMETER_SYMBOL, "debugName", "<init>", "(Landroidx/compose/ui/unit/Dp;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "t", "(Ljava/lang/String;)V", "", "rl", "()Z", "Landroidx/constraintlayout/core/parser/CLElement;", c.f62177j, "()Landroidx/constraintlayout/core/parser/CLElement;", "Landroidx/compose/ui/unit/Dp;", "Ljava/lang/String;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DimensionSymbol {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Dp value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private String symbol;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String debugName;

    public /* synthetic */ DimensionSymbol(Dp dp, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dp, str, str2);
    }

    public final void t(String symbol) {
        this.value = null;
        this.symbol = symbol;
    }

    private DimensionSymbol(Dp dp, String str, String str2) {
        this.value = dp;
        this.symbol = str;
        this.debugName = str2;
    }

    public final CLElement n() {
        Dp dp = this.value;
        if (dp != null) {
            return new CLNumber(dp.getValue());
        }
        String str = this.symbol;
        if (str != null) {
            return CLString.o(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + this.debugName + ". Using WrapContent.");
        return CLString.o("wrap");
    }

    public final boolean rl() {
        return this.value == null && this.symbol == null;
    }
}
