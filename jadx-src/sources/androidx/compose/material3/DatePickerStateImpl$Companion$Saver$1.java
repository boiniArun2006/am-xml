package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/material3/DatePickerStateImpl;", "it", "", "", c.f62177j, "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/material3/DatePickerStateImpl;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
final class DatePickerStateImpl$Companion$Saver$1 extends Lambda implements Function2<SaverScope, DatePickerStateImpl, List<? extends Object>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DatePickerStateImpl$Companion$Saver$1 f25484n = new DatePickerStateImpl$Companion$Saver$1();

    DatePickerStateImpl$Companion$Saver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final List invoke(SaverScope saverScope, DatePickerStateImpl datePickerStateImpl) {
        return CollectionsKt.listOf(datePickerStateImpl.xMQ(), Long.valueOf(datePickerStateImpl.J2()), Integer.valueOf(datePickerStateImpl.getYearRange().getFirst()), Integer.valueOf(datePickerStateImpl.getYearRange().getLast()), Integer.valueOf(datePickerStateImpl.O()));
    }
}
