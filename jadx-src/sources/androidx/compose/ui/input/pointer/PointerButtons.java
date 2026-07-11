package androidx.compose.ui.input.pointer;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerButtons;", "", "", "Landroidx/compose/ui/input/pointer/NativePointerButtons;", "packedValue", c.f62177j, "(I)I", "", "nr", "(I)Ljava/lang/String;", "t", InneractiveMediationNameConsts.OTHER, "", "rl", "(ILjava/lang/Object;)Z", "I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class PointerButtons {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int packedValue;

    public static int n(int i2) {
        return i2;
    }

    public static String nr(int i2) {
        return "PointerButtons(packedValue=" + i2 + ')';
    }

    public static boolean rl(int i2, Object obj) {
        return (obj instanceof PointerButtons) && i2 == ((PointerButtons) obj).getPackedValue();
    }

    public static int t(int i2) {
        return Integer.hashCode(i2);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final /* synthetic */ int getPackedValue() {
        return this.packedValue;
    }

    public boolean equals(Object obj) {
        return rl(this.packedValue, obj);
    }

    public int hashCode() {
        return t(this.packedValue);
    }

    public String toString() {
        return nr(this.packedValue);
    }
}
