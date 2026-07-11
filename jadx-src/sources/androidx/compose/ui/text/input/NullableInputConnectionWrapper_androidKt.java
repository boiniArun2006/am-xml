package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "", "onConnectionClosed", c.f62177j, "(Landroid/view/inputmethod/InputConnection;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NullableInputConnectionWrapper_androidKt {
    public static final NullableInputConnectionWrapper n(InputConnection inputConnection, Function1 function1) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 34 ? new NullableInputConnectionWrapperApi34(inputConnection, function1) : i2 >= 25 ? new NullableInputConnectionWrapperApi25(inputConnection, function1) : new NullableInputConnectionWrapperApi24(inputConnection, function1);
    }
}
