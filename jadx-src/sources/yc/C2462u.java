package yc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yc.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C2462u extends Drawable {
    private final int J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Paint f76141O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f76142n;
    private final Path nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f76143t;
    private final int xMQ;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: yc.u$j */
    public static final class j {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f76146o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ j[] f76147r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f76145n = new j("TOP_LEFT", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f76148t = new j("TOP_RIGHT", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f76144O = new j("BOTTOM_LEFT", 2);
        public static final j J2 = new j("BOTTOM_RIGHT", 3);

        static {
            j[] jVarArrN = n();
            f76147r = jVarArrN;
            f76146o = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f76145n, f76148t, f76144O, J2};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f76147r.clone();
        }

        private j(String str, int i2) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: renamed from: yc.u$n */
    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.f76144O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.f76145n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.f76148t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C2462u(j arrowPos, Context context, int i2) {
        Intrinsics.checkNotNullParameter(arrowPos, "arrowPos");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f76142n = arrowPos;
        this.rl = context;
        this.f76143t = i2;
        this.nr = new Path();
        this.f76141O = new Paint();
        this.J2 = context.getResources().getDimensionPixelOffset(2131165295);
        this.Uo = context.getResources().getDimensionPixelOffset(2131165294);
        this.KN = context.getResources().getDimensionPixelOffset(2131165308);
        this.xMQ = context.getResources().getColor(2131099960, context.getTheme());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        RectF rectF = new RectF(bounds);
        rectF.inset(0.0f, this.Uo);
        this.nr.rewind();
        Path path = this.nr;
        int i2 = this.KN;
        path.addRoundRect(rectF, i2, i2, Path.Direction.CW);
        int i3 = n.$EnumSwitchMapping$0[this.f76142n.ordinal()];
        if (i3 == 1) {
            this.nr.moveTo(this.J2 + rectF.left, rectF.bottom);
            this.nr.lineTo((this.J2 * 2) + rectF.left, rectF.bottom);
            Path path2 = this.nr;
            int i5 = this.J2;
            path2.lineTo(((i5 * 2) + rectF.left) - (i5 / 2), rectF.bottom + this.Uo);
            this.nr.lineTo(this.J2 + rectF.left, rectF.bottom);
        } else if (i3 == 2) {
            this.nr.moveTo(rectF.right - this.J2, rectF.bottom);
            this.nr.lineTo(rectF.right - (this.J2 * 2), rectF.bottom);
            Path path3 = this.nr;
            float f3 = rectF.right;
            int i7 = this.J2;
            path3.lineTo((f3 - (i7 * 2)) + (i7 / 2), rectF.bottom + this.Uo);
            this.nr.lineTo(rectF.right - this.J2, rectF.bottom);
        } else if (i3 == 3) {
            this.nr.moveTo(this.J2, this.Uo);
            this.nr.lineTo(this.J2 * 2, this.Uo);
            Path path4 = this.nr;
            int i8 = this.J2;
            path4.lineTo(i8 + (i8 / 2.0f), 0.0f);
            this.nr.lineTo(this.J2, this.Uo);
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.nr.moveTo((rectF.right - this.J2) - this.f76143t, this.Uo);
            this.nr.lineTo((rectF.right - (this.J2 * 2)) - this.f76143t, this.Uo);
            Path path5 = this.nr;
            float f4 = rectF.right;
            int i9 = this.J2;
            path5.lineTo((f4 - (i9 + (i9 / 2.0f))) - this.f76143t, 0.0f);
            this.nr.lineTo((rectF.right - this.J2) - this.f76143t, this.Uo);
        }
        this.nr.close();
        this.f76141O.setColor(this.xMQ);
        canvas.drawPath(this.nr, this.f76141O);
    }
}
