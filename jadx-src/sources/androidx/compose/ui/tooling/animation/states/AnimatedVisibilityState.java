package androidx.compose.ui.tooling.animation.states;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "", "value", "nr", "(Ljava/lang/String;)Ljava/lang/String;", "KN", "", "Uo", "(Ljava/lang/String;)I", "", InneractiveMediationNameConsts.OTHER, "", "O", "(Ljava/lang/String;Ljava/lang/Object;)Z", c.f62177j, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "rl", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class AnimatedVisibilityState implements ComposeAnimationState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f34107t = nr("Enter");
    private static final String nr = nr("Exit");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "Enter", "Ljava/lang/String;", c.f62177j, "()Ljava/lang/String;", "Exit", "rl", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String n() {
            return AnimatedVisibilityState.f34107t;
        }

        public final String rl() {
            return AnimatedVisibilityState.nr;
        }
    }

    public static final boolean J2(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    public static String KN(String str) {
        return str;
    }

    public static boolean O(String str, Object obj) {
        return (obj instanceof AnimatedVisibilityState) && Intrinsics.areEqual(str, ((AnimatedVisibilityState) obj).getValue());
    }

    public static int Uo(String str) {
        return str.hashCode();
    }

    private static String nr(String str) {
        return str;
    }

    public static final /* synthetic */ AnimatedVisibilityState t(String str) {
        return new AnimatedVisibilityState(str);
    }

    public boolean equals(Object obj) {
        return O(this.value, obj);
    }

    public int hashCode() {
        return Uo(this.value);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }

    public String toString() {
        return KN(this.value);
    }

    private /* synthetic */ AnimatedVisibilityState(String str) {
        this.value = str;
    }
}
