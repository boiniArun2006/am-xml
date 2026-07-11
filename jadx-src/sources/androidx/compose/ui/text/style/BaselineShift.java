package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift;", "", "", "multiplier", "t", "(F)F", "", "Uo", "(F)Ljava/lang/String;", "", "J2", "(F)I", InneractiveMediationNameConsts.OTHER, "", "nr", "(FLjava/lang/Object;)Z", c.f62177j, "F", "getMultiplier", "()F", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class BaselineShift {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float multiplier;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f33878t = t(0.5f);
    private static final float nr = t(-0.5f);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f33877O = t(0.0f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/BaselineShift;", "None", "F", c.f62177j, "()F", "getNone-y9eOQZs$annotations", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final float n() {
            return BaselineShift.f33877O;
        }
    }

    public static int J2(float f3) {
        return Float.hashCode(f3);
    }

    public static final boolean O(float f3, float f4) {
        return Float.compare(f3, f4) == 0;
    }

    public static String Uo(float f3) {
        return "BaselineShift(multiplier=" + f3 + ')';
    }

    public static boolean nr(float f3, Object obj) {
        return (obj instanceof BaselineShift) && Float.compare(f3, ((BaselineShift) obj).getMultiplier()) == 0;
    }

    public static final /* synthetic */ BaselineShift rl(float f3) {
        return new BaselineShift(f3);
    }

    public static float t(float f3) {
        return f3;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final /* synthetic */ float getMultiplier() {
        return this.multiplier;
    }

    public boolean equals(Object obj) {
        return nr(this.multiplier, obj);
    }

    public int hashCode() {
        return J2(this.multiplier);
    }

    public String toString() {
        return Uo(this.multiplier);
    }

    private /* synthetic */ BaselineShift(float f3) {
        this.multiplier = f3;
    }
}
