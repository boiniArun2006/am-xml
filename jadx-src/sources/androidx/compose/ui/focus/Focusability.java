package androidx.compose.ui.focus;

import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/focus/Focusability;", "", "", "value", "O", "(I)I", "", "xMQ", "(I)Ljava/lang/String;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "node", "", "nr", "(ILandroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Z", "KN", InneractiveMediationNameConsts.OTHER, "J2", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nFocusability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusability.kt\nandroidx/compose/ui/focus/Focusability\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class Focusability {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f31360t = O(1);
    private static final int nr = O(0);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f31359O = O(2);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/Focusability$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/focus/Focusability;", "Always", "I", c.f62177j, "()I", "SystemDefined", "t", "Never", "rl", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int n() {
            return Focusability.f31360t;
        }

        public final int rl() {
            return Focusability.f31359O;
        }

        public final int t() {
            return Focusability.nr;
        }
    }

    public static boolean J2(int i2, Object obj) {
        return (obj instanceof Focusability) && i2 == ((Focusability) obj).getValue();
    }

    public static int KN(int i2) {
        return Integer.hashCode(i2);
    }

    private static int O(int i2) {
        return i2;
    }

    public static final boolean Uo(int i2, int i3) {
        return i2 == i3;
    }

    public boolean equals(Object obj) {
        return J2(this.value, obj);
    }

    public int hashCode() {
        return KN(this.value);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public static final boolean nr(int i2, CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        if (Uo(i2, f31360t)) {
            return true;
        }
        if (Uo(i2, nr)) {
            return !InputMode.J2(((InputModeManager) CompositionLocalConsumerModifierNodeKt.n(compositionLocalConsumerModifierNode, CompositionLocalsKt.qie())).n(), InputMode.INSTANCE.rl());
        }
        if (Uo(i2, f31359O)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public static String xMQ(int i2) {
        if (Uo(i2, f31360t)) {
            return "Always";
        }
        if (Uo(i2, nr)) {
            return "SystemDefined";
        }
        if (Uo(i2, f31359O)) {
            return "Never";
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public String toString() {
        return xMQ(this.value);
    }
}
