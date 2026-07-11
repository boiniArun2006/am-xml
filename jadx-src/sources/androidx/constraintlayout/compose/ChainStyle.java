package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000fB\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/constraintlayout/compose/ChainStyle;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "bias", "<init>", "(Ljava/lang/String;Ljava/lang/Float;)V", c.f62177j, "Ljava/lang/String;", "t", "()Ljava/lang/String;", "rl", "Ljava/lang/Float;", "()Ljava/lang/Float;", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChainStyle {
    private static final ChainStyle J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ChainStyle f34423O;
    private static final ChainStyle nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Float bias;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/constraintlayout/compose/ChainStyle$Companion;", "", "<init>", "()V", "", "bias", "Landroidx/constraintlayout/compose/ChainStyle;", c.f62177j, "(F)Landroidx/constraintlayout/compose/ChainStyle;", "Packed", "Landroidx/constraintlayout/compose/ChainStyle;", "rl", "()Landroidx/constraintlayout/compose/ChainStyle;", "getPacked$annotations", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChainStyle n(float bias) {
            return new ChainStyle("packed", Float.valueOf(bias));
        }

        public final ChainStyle rl() {
            return ChainStyle.J2;
        }
    }

    public ChainStyle(String str, Float f3) {
        this.name = str;
        this.bias = f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        int i2 = 2;
        nr = new ChainStyle("spread", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        f34423O = new ChainStyle("spread_inside", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        J2 = companion.n(0.5f);
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final Float getBias() {
        return this.bias;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public /* synthetic */ ChainStyle(String str, Float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : f3);
    }
}
