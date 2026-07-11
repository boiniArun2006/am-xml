package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "Lkotlin/Function0;", "", "value", "maxValue", "", "reverseScrolling", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "", "toString", "()Ljava/lang/String;", c.f62177j, "Lkotlin/jvm/functions/Function0;", "t", "()Lkotlin/jvm/functions/Function0;", "rl", "Z", "()Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ScrollAxisRange {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function0 value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function0 maxValue;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean reverseScrolling;

    public ScrollAxisRange(Function0 function0, Function0 function02, boolean z2) {
        this.value = function0;
        this.maxValue = function02;
        this.reverseScrolling = z2;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Function0 getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Function0 getValue() {
        return this.value;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.value.invoke()).floatValue() + ", maxValue=" + ((Number) this.maxValue.invoke()).floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }

    public /* synthetic */ ScrollAxisRange(Function0 function0, Function0 function02, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, (i2 & 4) != 0 ? false : z2);
    }
}
