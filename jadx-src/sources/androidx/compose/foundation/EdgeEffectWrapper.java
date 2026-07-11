package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0012J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0012J\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u0012J\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012J\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u001fJ\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\u001fJ\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\u001fJ\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\u001fJ\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\u001fJ\u0018\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00102R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00102R\u0018\u00108\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00102R\u0018\u00109\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00102R\u0018\u0010:\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00102R\u001a\u0010=\u001a\u00020\u0010*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010?\u001a\u00020\u0010*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/foundation/EdgeEffectWrapper;", "", "Landroid/content/Context;", "context", "", "glowColor", "<init>", "(Landroid/content/Context;I)V", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroid/widget/EdgeEffect;", "O", "(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;", "", "J2", "()V", "", "te", "()Z", "r", "XQ", "aYN", "g", "Ik", "Z", "WPU", "nY", "ck", "o", "S", "az", "()Landroid/widget/EdgeEffect;", "Uo", "xMQ", "gh", "ty", "KN", "mUb", "qie", "Landroidx/compose/ui/unit/IntSize;", "size", "iF", "(J)V", c.f62177j, "Landroid/content/Context;", "rl", "I", "t", "J", "nr", "Landroid/widget/EdgeEffect;", "topEffect", "bottomEffect", "leftEffect", "rightEffect", "topEffectNegation", "bottomEffectNegation", "leftEffectNegation", "rightEffectNegation", "ViF", "(Landroid/widget/EdgeEffect;)Z", "isStretched", "HI", "isAnimating", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1073:1\n1#2:1074\n54#3:1075\n59#3:1077\n59#3:1079\n54#3:1081\n54#3:1083\n59#3:1085\n54#3:1087\n59#3:1089\n59#3:1091\n54#3:1093\n59#3:1095\n54#3:1097\n54#3:1099\n59#3:1101\n54#3:1103\n59#3:1105\n59#3:1107\n54#3:1109\n59#3:1111\n54#3:1113\n85#4:1076\n90#4:1078\n90#4:1080\n85#4:1082\n85#4:1084\n90#4:1086\n85#4:1088\n90#4:1090\n90#4:1092\n85#4:1094\n90#4:1096\n85#4:1098\n85#4:1100\n90#4:1102\n85#4:1104\n90#4:1106\n90#4:1108\n85#4:1110\n90#4:1112\n85#4:1114\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n*L\n1034#1:1075\n1034#1:1077\n1036#1:1079\n1036#1:1081\n1043#1:1083\n1043#1:1085\n1044#1:1087\n1044#1:1089\n1045#1:1091\n1045#1:1093\n1046#1:1095\n1046#1:1097\n1048#1:1099\n1048#1:1101\n1049#1:1103\n1049#1:1105\n1050#1:1107\n1050#1:1109\n1051#1:1111\n1051#1:1113\n1034#1:1076\n1034#1:1078\n1036#1:1080\n1036#1:1082\n1043#1:1084\n1043#1:1086\n1044#1:1088\n1044#1:1090\n1045#1:1092\n1045#1:1094\n1046#1:1096\n1046#1:1098\n1048#1:1100\n1048#1:1102\n1049#1:1104\n1049#1:1106\n1050#1:1108\n1050#1:1110\n1051#1:1112\n1051#1:1114\n*E\n"})
final class EdgeEffectWrapper {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private EdgeEffect leftEffect;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private EdgeEffect topEffectNegation;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect bottomEffect;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private EdgeEffect rightEffect;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private EdgeEffect rightEffectNegation;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private EdgeEffect leftEffectNegation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private EdgeEffect topEffect;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int glowColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long size = IntSize.INSTANCE.n();

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private EdgeEffect bottomEffectNegation;

    private final boolean ViF(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(EdgeEffectCompat.f16103n.t(edgeEffect) == 0.0f);
    }

    private final boolean HI(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final EdgeEffect O(Orientation orientation) {
        EdgeEffect edgeEffectRl = EdgeEffectCompat.f16103n.rl(this.context);
        edgeEffectRl.setColor(this.glowColor);
        if (!IntSize.O(this.size, IntSize.INSTANCE.n())) {
            if (orientation == Orientation.f16969n) {
                long j2 = this.size;
                edgeEffectRl.setSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
                return edgeEffectRl;
            }
            long j3 = this.size;
            edgeEffectRl.setSize((int) (j3 & 4294967295L), (int) (j3 >> 32));
        }
        return edgeEffectRl;
    }

    public final boolean Ik() {
        return ViF(this.bottomEffectNegation);
    }

    public final void J2() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    public final EdgeEffect KN() {
        EdgeEffect edgeEffect = this.bottomEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectO = O(Orientation.f16969n);
        this.bottomEffectNegation = edgeEffectO;
        return edgeEffectO;
    }

    public final boolean S() {
        return HI(this.rightEffect);
    }

    public final EdgeEffect Uo() {
        EdgeEffect edgeEffect = this.bottomEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectO = O(Orientation.f16969n);
        this.bottomEffect = edgeEffectO;
        return edgeEffectO;
    }

    public final boolean WPU() {
        return ViF(this.rightEffectNegation);
    }

    public final boolean XQ() {
        return ViF(this.leftEffect);
    }

    public final boolean Z() {
        return ViF(this.leftEffectNegation);
    }

    public final boolean aYN() {
        return ViF(this.rightEffect);
    }

    public final EdgeEffect az() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectO = O(Orientation.f16969n);
        this.topEffect = edgeEffectO;
        return edgeEffectO;
    }

    public final boolean ck() {
        return HI(this.bottomEffect);
    }

    public final boolean g() {
        return ViF(this.topEffectNegation);
    }

    public final EdgeEffect gh() {
        EdgeEffect edgeEffect = this.rightEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectO = O(Orientation.f16970t);
        this.rightEffect = edgeEffectO;
        return edgeEffectO;
    }

    public final void iF(long size) {
        this.size = size;
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (size & 4294967295L), (int) (size >> 32));
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (size & 4294967295L), (int) (size >> 32));
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (size >> 32), (int) (size & 4294967295L));
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (size & 4294967295L), (int) (size >> 32));
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (4294967295L & size), (int) (size >> 32));
        }
    }

    public final EdgeEffect mUb() {
        EdgeEffect edgeEffect = this.leftEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectO = O(Orientation.f16970t);
        this.leftEffectNegation = edgeEffectO;
        return edgeEffectO;
    }

    public final boolean nY() {
        return HI(this.topEffect);
    }

    public final boolean o() {
        return HI(this.leftEffect);
    }

    public final EdgeEffect qie() {
        EdgeEffect edgeEffect = this.rightEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectO = O(Orientation.f16970t);
        this.rightEffectNegation = edgeEffectO;
        return edgeEffectO;
    }

    public final boolean r() {
        return ViF(this.bottomEffect);
    }

    public final boolean te() {
        return ViF(this.topEffect);
    }

    public final EdgeEffect ty() {
        EdgeEffect edgeEffect = this.topEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectO = O(Orientation.f16969n);
        this.topEffectNegation = edgeEffectO;
        return edgeEffectO;
    }

    public final EdgeEffect xMQ() {
        EdgeEffect edgeEffect = this.leftEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectO = O(Orientation.f16970t);
        this.leftEffect = edgeEffectO;
        return edgeEffectO;
    }

    public EdgeEffectWrapper(Context context, int i2) {
        this.context = context;
        this.glowColor = i2;
    }
}
