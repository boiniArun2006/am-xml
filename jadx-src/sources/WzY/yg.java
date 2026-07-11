package WzY;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.alightcreative.app.motion.scene.BlendingMode;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.SolidColor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class yg {
    private final Paint mUb;
    private Typeface xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private w6 f11684n = w6.f11697t;
    private SolidColor rl = SolidColor.INSTANCE.getWHITE();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private j f11685t = j.f11687n;
    private n nr = n.f11691n;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private BlendingMode f11683O = BlendingMode.NORMAL;
    private float J2 = 1.0f;
    private float Uo = 12.0f;
    private Paint.Align KN = pO.f11668n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        private static final /* synthetic */ j[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f11688r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f11687n = new j("BUTT", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f11689t = new j("ROUND", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f11686O = new j("SQUARE", 2);

        static {
            j[] jVarArrN = n();
            J2 = jVarArrN;
            f11688r = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f11687n, f11689t, f11686O};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) J2.clone();
        }

        private j(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class n {
        private static final /* synthetic */ n[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f11692r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f11691n = new n("BEVEL", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f11693t = new n("ROUND", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f11690O = new n("MITER", 2);

        static {
            n[] nVarArrN = n();
            J2 = nVarArrN;
            f11692r = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f11691n, f11693t, f11690O};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) J2.clone();
        }

        private n(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class w6 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f11695o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ w6[] f11696r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Paint.Style f11698n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f11697t = new w6("FILL", 0, Paint.Style.FILL);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final w6 f11694O = new w6("STROKE", 1, Paint.Style.STROKE);
        public static final w6 J2 = new w6("FILL_AND_STROKE", 2, Paint.Style.FILL_AND_STROKE);

        static {
            w6[] w6VarArrN = n();
            f11696r = w6VarArrN;
            f11695o = EnumEntriesKt.enumEntries(w6VarArrN);
        }

        private static final /* synthetic */ w6[] n() {
            return new w6[]{f11697t, f11694O, J2};
        }

        public static w6 valueOf(String str) {
            return (w6) Enum.valueOf(w6.class, str);
        }

        public static w6[] values() {
            return (w6[]) f11696r.clone();
        }

        public final Paint.Style rl() {
            return this.f11698n;
        }

        private w6(String str, int i2, Paint.Style style) {
            this.f11698n = style;
        }
    }

    public /* synthetic */ class Ml {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[BlendingMode.values().length];
            try {
                iArr[BlendingMode.SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[j.values().length];
            try {
                iArr2[j.f11687n.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[j.f11689t.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[j.f11686O.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[n.values().length];
            try {
                iArr3[n.f11691n.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[n.f11693t.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[n.f11690O.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(yg ygVar) {
        return "paintCurrentPath: STROKE " + ygVar.rl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Uo(yg ygVar) {
        return "paintCurrentPath: FILL " + ygVar.rl;
    }

    public final void J2(QJ vg, float f3) {
        int i2;
        Intrinsics.checkNotNullParameter(vg, "vg");
        int i3 = 1;
        vg.xMQ(Ml.$EnumSwitchMapping$0[this.f11683O.ordinal()] == 1 ? 8 : 0);
        int i5 = Ml.$EnumSwitchMapping$1[this.f11685t.ordinal()];
        if (i5 == 1) {
            i2 = 0;
        } else if (i5 == 2) {
            i2 = 1;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 2;
        }
        vg.mUb(i2);
        int i7 = Ml.$EnumSwitchMapping$2[this.nr.ordinal()];
        if (i7 == 1) {
            i3 = 3;
        } else if (i7 != 2) {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 4;
        }
        vg.gh(i3);
        w6 w6Var = this.f11684n;
        if (w6Var == w6.f11697t || w6Var == w6.J2) {
            XoT.C.Uo(this, new Function0() { // from class: WzY.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return yg.Uo(this.f11662n);
                }
            });
            vg.KN(this.rl.getR(), this.rl.getG(), this.rl.getB(), this.rl.getA());
            vg.Uo();
        }
        w6 w6Var2 = this.f11684n;
        if (w6Var2 == w6.f11694O || w6Var2 == w6.J2) {
            XoT.C.Uo(this, new Function0() { // from class: WzY.iF
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return yg.KN(this.f11647n);
                }
            });
            vg.S(this.rl.getR(), this.rl.getG(), this.rl.getB(), this.rl.getA());
            vg.WPU(this.J2 * f3);
            vg.XQ();
        }
        vg.xMQ(0);
    }

    public final float O() {
        return this.J2;
    }

    public final void az(float f3) {
        if (this.J2 == f3) {
            return;
        }
        this.J2 = f3;
        this.mUb.setStrokeWidth(f3);
    }

    public final void gh(SolidColor value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.rl, value)) {
            return;
        }
        this.rl = value;
        this.mUb.setColor(ColorKt.toInt(value));
    }

    public final void mUb(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f11685t = jVar;
    }

    public final SolidColor nr() {
        return this.rl;
    }

    public final void qie(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.nr = nVar;
    }

    public final float t() {
        return this.rl.getA();
    }

    public final void ty(w6 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f11684n != value) {
            this.f11684n = value;
            this.mUb.setStyle(value.rl());
        }
    }

    public final void xMQ(float f3) {
        gh(SolidColor.copy$default(this.rl, 0.0f, 0.0f, 0.0f, f3, 7, null));
    }

    public yg() {
        Typeface typeface = pO.rl;
        Intrinsics.checkNotNullExpressionValue(typeface, "access$getPAINT_DEFAULT_TYPEFACE$p(...)");
        this.xMQ = typeface;
        Paint paint = new Paint(3);
        paint.setTextSize(12.0f);
        paint.setTextAlign(pO.f11668n);
        paint.setTypeface(pO.rl);
        this.mUb = paint;
    }
}
