package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Stable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0092\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R1\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR1\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR1\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR1\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR1\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b!\u0010\u001b\"\u0004\b(\u0010\u001dR1\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR1\u0010\t\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b-\u0010\u001dR1\u0010\n\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b.\u0010\u0019\u001a\u0004\b,\u0010\u001b\"\u0004\b/\u0010\u001dR1\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b1\u0010\u001dR1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b'\u0010\u001b\"\u0004\b2\u0010\u001dR1\u0010\r\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b0\u0010\u001b\"\u0004\b3\u0010\u001dR1\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u001a\u0004\b)\u0010\u001b\"\u0004\b4\u0010\u001dR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0019\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/material/Colors;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", MRAIDPresenter.ERROR, "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "", "isLight", "<init>", "(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", c.f62177j, "(JJJJJJJJJJJJZ)Landroidx/compose/material/Colors;", "", "toString", "()Ljava/lang/String;", "<set-?>", "Landroidx/compose/runtime/MutableState;", "mUb", "()J", "aYN", "(J)V", "rl", "gh", "ViF", "t", "qie", "nY", "nr", "az", "g", "O", "ck", "J2", "ty", "te", "Uo", "Ik", "KN", "XQ", "xMQ", "S", "o", "WPU", "Z", "HI", "()Z", "r", "(Z)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,352:1\n85#2:353\n113#2,2:354\n85#2:356\n113#2,2:357\n85#2:359\n113#2,2:360\n85#2:362\n113#2,2:363\n85#2:365\n113#2,2:366\n85#2:368\n113#2,2:369\n85#2:371\n113#2,2:372\n85#2:374\n113#2,2:375\n85#2:377\n113#2,2:378\n85#2:380\n113#2,2:381\n85#2:383\n113#2,2:384\n85#2:386\n113#2,2:387\n85#2:389\n113#2,2:390\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n*L\n85#1:353\n85#1:354,2\n88#1:356\n88#1:357,2\n91#1:359\n91#1:360,2\n94#1:362\n94#1:363,2\n97#1:365\n97#1:366,2\n100#1:368\n100#1:369,2\n103#1:371\n103#1:372,2\n106#1:374\n106#1:375,2\n109#1:377\n109#1:378,2\n112#1:380\n112#1:381,2\n115#1:383\n115#1:384,2\n118#1:386\n118#1:387,2\n121#1:389\n121#1:390,2\n*E\n"})
public final class Colors {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableState surface;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MutableState onPrimary;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState background;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableState error;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final MutableState isLight;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MutableState onSurface;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final MutableState onBackground;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableState primary;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState secondaryVariant;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final MutableState onError;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableState primaryVariant;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState secondary;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutableState onSecondary;

    public /* synthetic */ Colors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13, j14, z2);
    }

    private Colors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, boolean z2) {
        this.primary = SnapshotStateKt.xMQ(Color.xMQ(j2), SnapshotStateKt.r());
        this.primaryVariant = SnapshotStateKt.xMQ(Color.xMQ(j3), SnapshotStateKt.r());
        this.secondary = SnapshotStateKt.xMQ(Color.xMQ(j4), SnapshotStateKt.r());
        this.secondaryVariant = SnapshotStateKt.xMQ(Color.xMQ(j5), SnapshotStateKt.r());
        this.background = SnapshotStateKt.xMQ(Color.xMQ(j6), SnapshotStateKt.r());
        this.surface = SnapshotStateKt.xMQ(Color.xMQ(j7), SnapshotStateKt.r());
        this.error = SnapshotStateKt.xMQ(Color.xMQ(j9), SnapshotStateKt.r());
        this.onPrimary = SnapshotStateKt.xMQ(Color.xMQ(j10), SnapshotStateKt.r());
        this.onSecondary = SnapshotStateKt.xMQ(Color.xMQ(j11), SnapshotStateKt.r());
        this.onBackground = SnapshotStateKt.xMQ(Color.xMQ(j12), SnapshotStateKt.r());
        this.onSurface = SnapshotStateKt.xMQ(Color.xMQ(j13), SnapshotStateKt.r());
        this.onError = SnapshotStateKt.xMQ(Color.xMQ(j14), SnapshotStateKt.r());
        this.isLight = SnapshotStateKt.xMQ(Boolean.valueOf(z2), SnapshotStateKt.r());
    }

    public final boolean HI() {
        return ((Boolean) this.isLight.getValue()).booleanValue();
    }

    public final void Ik(long j2) {
        this.error.setValue(Color.xMQ(j2));
    }

    public final long J2() {
        return ((Color) this.onError.getValue()).getValue();
    }

    public final long KN() {
        return ((Color) this.onSecondary.getValue()).getValue();
    }

    public final long O() {
        return ((Color) this.onBackground.getValue()).getValue();
    }

    public final void S(long j2) {
        this.onSecondary.setValue(Color.xMQ(j2));
    }

    public final long Uo() {
        return ((Color) this.onPrimary.getValue()).getValue();
    }

    public final void ViF(long j2) {
        this.primaryVariant.setValue(Color.xMQ(j2));
    }

    public final void WPU(long j2) {
        this.onSurface.setValue(Color.xMQ(j2));
    }

    public final void XQ(long j2) {
        this.onPrimary.setValue(Color.xMQ(j2));
    }

    public final void Z(long j2) {
        this.onError.setValue(Color.xMQ(j2));
    }

    public final void aYN(long j2) {
        this.primary.setValue(Color.xMQ(j2));
    }

    public final long az() {
        return ((Color) this.secondaryVariant.getValue()).getValue();
    }

    public final void ck(long j2) {
        this.background.setValue(Color.xMQ(j2));
    }

    public final void g(long j2) {
        this.secondaryVariant.setValue(Color.xMQ(j2));
    }

    public final long gh() {
        return ((Color) this.primaryVariant.getValue()).getValue();
    }

    public final long mUb() {
        return ((Color) this.primary.getValue()).getValue();
    }

    public final Colors n(long primary, long primaryVariant, long secondary, long secondaryVariant, long background, long surface, long error, long onPrimary, long onSecondary, long onBackground, long onSurface, long onError, boolean isLight) {
        return new Colors(primary, primaryVariant, secondary, secondaryVariant, background, surface, error, onPrimary, onSecondary, onBackground, onSurface, onError, isLight, null);
    }

    public final void nY(long j2) {
        this.secondary.setValue(Color.xMQ(j2));
    }

    public final long nr() {
        return ((Color) this.error.getValue()).getValue();
    }

    public final void o(long j2) {
        this.onBackground.setValue(Color.xMQ(j2));
    }

    public final long qie() {
        return ((Color) this.secondary.getValue()).getValue();
    }

    public final void r(boolean z2) {
        this.isLight.setValue(Boolean.valueOf(z2));
    }

    public final long t() {
        return ((Color) this.background.getValue()).getValue();
    }

    public final void te(long j2) {
        this.surface.setValue(Color.xMQ(j2));
    }

    public String toString() {
        return "Colors(primary=" + ((Object) Color.S(mUb())) + ", primaryVariant=" + ((Object) Color.S(gh())) + ", secondary=" + ((Object) Color.S(qie())) + ", secondaryVariant=" + ((Object) Color.S(az())) + ", background=" + ((Object) Color.S(t())) + ", surface=" + ((Object) Color.S(ty())) + ", error=" + ((Object) Color.S(nr())) + ", onPrimary=" + ((Object) Color.S(Uo())) + ", onSecondary=" + ((Object) Color.S(KN())) + ", onBackground=" + ((Object) Color.S(O())) + ", onSurface=" + ((Object) Color.S(xMQ())) + ", onError=" + ((Object) Color.S(J2())) + ", isLight=" + HI() + ')';
    }

    public final long ty() {
        return ((Color) this.surface.getValue()).getValue();
    }

    public final long xMQ() {
        return ((Color) this.onSurface.getValue()).getValue();
    }
}
