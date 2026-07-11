package androidx.compose.material3;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "value", "Landroidx/compose/material3/TimePickerStateImpl;", c.f62177j, "(Ljava/util/List;)Landroidx/compose/material3/TimePickerStateImpl;"}, k = 3, mv = {1, 8, 0})
final class TimePickerStateImpl$Companion$Saver$2 extends Lambda implements Function1<List, TimePickerStateImpl> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TimePickerStateImpl$Companion$Saver$2 f28739n = new TimePickerStateImpl$Companion$Saver$2();

    TimePickerStateImpl$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final TimePickerStateImpl invoke(List list) {
        Object obj = list.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj2).intValue();
        Object obj3 = list.get(2);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
        return new TimePickerStateImpl(iIntValue, iIntValue2, ((Boolean) obj3).booleanValue());
    }
}
