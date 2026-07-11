package androidx.compose.foundation.text.input.internal;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/input/internal/Api25CommitContentImpl;", "", "<init>", "()V", "Landroid/view/inputmethod/InputConnection;", "inputConnection", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "", "flags", "Landroid/os/Bundle;", "opts", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class Api25CommitContentImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Api25CommitContentImpl f20054n = new Api25CommitContentImpl();

    private Api25CommitContentImpl() {
    }

    public final boolean n(InputConnection inputConnection, InputContentInfo inputContentInfo, int flags, Bundle opts) {
        return inputConnection.commitContent(inputContentInfo, flags, opts);
    }
}
