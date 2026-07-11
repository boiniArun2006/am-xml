package androidx.compose.foundation.layout;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "errorMessage", "Lkotlin/Function0;", "", "initializer", "Lkotlin/Lazy;", c.f62177j, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FlowLayoutOverflowKt {
    public static final Lazy n(String str, Function0 function0) {
        return new LazyImpl(function0, str);
    }

    public static /* synthetic */ Lazy rl(String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "Lazy item is not yet initialized";
        }
        return n(str, function0);
    }
}
