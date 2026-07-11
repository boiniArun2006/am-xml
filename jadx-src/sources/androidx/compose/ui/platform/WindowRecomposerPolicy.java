package androidx.compose.ui.platform;

import GJW.RzR;
import GJW.xuv;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "<init>", "()V", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "rl", "Ljava/util/concurrent/atomic/AtomicReference;", "factory", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InternalComposeUiApi
public final class WindowRecomposerPolicy {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final WindowRecomposerPolicy f33114n = new WindowRecomposerPolicy();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final AtomicReference factory = new AtomicReference(WindowRecomposerFactory.INSTANCE.t());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f33115t = 8;

    public final Recomposer n(View rootView) {
        Recomposer recomposerN = ((WindowRecomposerFactory) factory.get()).n(rootView);
        WindowRecomposer_androidKt.xMQ(rootView, recomposerN);
        final xuv xuvVarNr = GJW.C.nr(RzR.f3449n, YF.Wre.rl(rootView.getHandler(), "windowRecomposer cleanup").p0N(), null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(recomposerN, rootView, null), 2, null);
        rootView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v2) {
                v2.removeOnAttachStateChangeListener(this);
                xuv.j.rl(xuvVarNr, null, 1, null);
            }
        });
        return recomposerN;
    }

    private WindowRecomposerPolicy() {
    }
}
