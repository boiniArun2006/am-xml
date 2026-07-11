package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/EditorInfoApi34;", "", "<init>", "()V", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/inputmethod/EditorInfo;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class EditorInfoApi34 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EditorInfoApi34 f20116n = new EditorInfoApi34();

    private EditorInfoApi34() {
    }

    public final void n(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(CollectionsKt.listOf((Object[]) new Class[]{eO.n(), AbstractC1514c.n(), AbstractC1518z.n(), QJ.n(), s4.n(), UGc.n(), Q.n()}));
        editorInfo.setSupportedHandwritingGesturePreviews(SetsKt.setOf((Object[]) new Class[]{eO.n(), AbstractC1514c.n(), AbstractC1518z.n(), QJ.n()}));
    }
}
