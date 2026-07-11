package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/Api34StartStylusHandwriting;", "", "<init>", "()V", "Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroid/view/View;", "view", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Api34StartStylusHandwriting {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Api34StartStylusHandwriting f20057n = new Api34StartStylusHandwriting();

    private Api34StartStylusHandwriting() {
    }

    public final void n(android.view.inputmethod.InputMethodManager imm, View view) {
        imm.startStylusHandwriting(view);
    }
}
