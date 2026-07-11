package androidx.compose.material3;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "value", "Landroidx/compose/material3/DateRangePickerStateImpl;", c.f62177j, "(Ljava/util/List;)Landroidx/compose/material3/DateRangePickerStateImpl;"}, k = 3, mv = {1, 8, 0})
final class DateRangePickerStateImpl$Companion$Saver$2 extends Lambda implements Function1<List, DateRangePickerStateImpl> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ SelectableDates f25656n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Locale f25657t;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final DateRangePickerStateImpl invoke(List list) {
        Long l2 = (Long) list.get(0);
        Long l5 = (Long) list.get(1);
        Long l6 = (Long) list.get(2);
        Object obj = list.get(3);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = list.get(4);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        IntRange intRange = new IntRange(iIntValue, ((Integer) obj2).intValue());
        Object obj3 = list.get(5);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
        return new DateRangePickerStateImpl(l2, l5, l6, intRange, DisplayMode.nr(((Integer) obj3).intValue()), this.f25656n, this.f25657t, null);
    }
}
