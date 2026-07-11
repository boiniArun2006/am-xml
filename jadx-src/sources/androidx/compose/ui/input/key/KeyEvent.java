package androidx.compose.ui.input.key;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "nativeKeyEvent", "rl", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "", "O", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "", "nr", "(Landroid/view/KeyEvent;)I", InneractiveMediationNameConsts.OTHER, "", "t", "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", c.f62177j, "Landroid/view/KeyEvent;", "getNativeKeyEvent", "()Landroid/view/KeyEvent;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class KeyEvent {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final android.view.KeyEvent nativeKeyEvent;

    public static String O(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public static final /* synthetic */ KeyEvent n(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    public static int nr(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static android.view.KeyEvent rl(android.view.KeyEvent keyEvent) {
        return keyEvent;
    }

    public static boolean t(android.view.KeyEvent keyEvent, Object obj) {
        return (obj instanceof KeyEvent) && Intrinsics.areEqual(keyEvent, ((KeyEvent) obj).getNativeKeyEvent());
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final /* synthetic */ android.view.KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public boolean equals(Object obj) {
        return t(this.nativeKeyEvent, obj);
    }

    public int hashCode() {
        return nr(this.nativeKeyEvent);
    }

    public String toString() {
        return O(this.nativeKeyEvent);
    }

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }
}
