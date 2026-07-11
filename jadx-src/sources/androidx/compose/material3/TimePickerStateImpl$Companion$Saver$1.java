package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/material3/TimePickerStateImpl;", "it", "", "", c.f62177j, "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/material3/TimePickerStateImpl;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
final class TimePickerStateImpl$Companion$Saver$1 extends Lambda implements Function2<SaverScope, TimePickerStateImpl, List<? extends Object>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TimePickerStateImpl$Companion$Saver$1 f28738n = new TimePickerStateImpl$Companion$Saver$1();

    TimePickerStateImpl$Companion$Saver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final List invoke(SaverScope saverScope, TimePickerStateImpl timePickerStateImpl) {
        return CollectionsKt.listOf(Integer.valueOf(timePickerStateImpl.t()), Integer.valueOf(timePickerStateImpl.rl()), Boolean.valueOf(timePickerStateImpl.getIs24hour()));
    }
}
