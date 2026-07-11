package androidx.compose.material3;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/TimePickerSelectionMode;", "", "", "value", "nr", "(I)I", "", "KN", "(I)Ljava/lang/String;", "Uo", InneractiveMediationNameConsts.OTHER, "", "O", "(ILjava/lang/Object;)Z", c.f62177j, "I", "getValue", "()I", "rl", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
public final class TimePickerSelectionMode {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f28733t = nr(0);
    private static final int nr = nr(1);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/TimePickerSelectionMode$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/TimePickerSelectionMode;", "Hour", "I", c.f62177j, "()I", "Minute", "rl", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int n() {
            return TimePickerSelectionMode.f28733t;
        }

        public final int rl() {
            return TimePickerSelectionMode.nr;
        }
    }

    public static final boolean J2(int i2, int i3) {
        return i2 == i3;
    }

    public static boolean O(int i2, Object obj) {
        return (obj instanceof TimePickerSelectionMode) && i2 == ((TimePickerSelectionMode) obj).getValue();
    }

    public static int Uo(int i2) {
        return Integer.hashCode(i2);
    }

    private static int nr(int i2) {
        return i2;
    }

    public static final /* synthetic */ TimePickerSelectionMode t(int i2) {
        return new TimePickerSelectionMode(i2);
    }

    public boolean equals(Object obj) {
        return O(this.value, obj);
    }

    public int hashCode() {
        return Uo(this.value);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public static String KN(int i2) {
        return J2(i2, f28733t) ? "Hour" : J2(i2, nr) ? "Minute" : "";
    }

    public String toString() {
        return KN(this.value);
    }

    private /* synthetic */ TimePickerSelectionMode(int i2) {
        this.value = i2;
    }
}
