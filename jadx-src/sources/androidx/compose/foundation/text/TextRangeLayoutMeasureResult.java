package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;", "", "", "width", "height", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "place", "<init>", "(IILkotlin/jvm/functions/Function0;)V", c.f62177j, "I", "t", "()I", "rl", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextRangeLayoutMeasureResult {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function0 place;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final Function0 getPlace() {
        return this.place;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public TextRangeLayoutMeasureResult(int i2, int i3, Function0 function0) {
        this.width = i2;
        this.height = i3;
        this.place = function0;
    }
}
