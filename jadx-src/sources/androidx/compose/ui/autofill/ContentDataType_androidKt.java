package androidx.compose.ui.autofill;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0001\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "dataType", "Landroidx/compose/ui/autofill/ContentDataType;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(I)Landroidx/compose/ui/autofill/ContentDataType;", "rl", "(Landroidx/compose/ui/autofill/ContentDataType;)I", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContentDataType_androidKt {
    public static final int rl(ContentDataType contentDataType) {
        Intrinsics.checkNotNull(contentDataType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentDataType");
        return ((AndroidContentDataType) contentDataType).getAndroidAutofillType();
    }

    public static final ContentDataType n(int i2) {
        return AndroidContentDataType.n(AndroidContentDataType.rl(i2));
    }
}
