package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0012J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "index", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "get", "(I)Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "fromIndex", "toIndex", "Lkotlin/Function1;", "", "block", c.f62177j, "(IILkotlin/jvm/functions/Function1;)V", "getSize", "()I", "size", "Interval", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IntervalList<T> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "startIndex", "size", "value", "<init>", "(IILjava/lang/Object;)V", c.f62177j, "I", "rl", "()I", "t", "Ljava/lang/Object;", "()Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,204:1\n96#2,5:205\n96#2,5:210\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n*L\n81#1:205,5\n82#1:210,5\n*E\n"})
    public static final class Interval<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int startIndex;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final int size;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Object value;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final int getStartIndex() {
            return this.startIndex;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public Interval(int i2, int i3, Object obj) {
            boolean z2;
            this.startIndex = i2;
            this.size = i3;
            this.value = obj;
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                InlineClassHelperKt.n("startIndex should be >= 0");
            }
            if (!(i3 > 0)) {
                InlineClassHelperKt.n("size should be > 0");
            }
        }
    }

    Interval get(int index);

    int getSize();

    void n(int fromIndex, int toIndex, Function1 block);
}
