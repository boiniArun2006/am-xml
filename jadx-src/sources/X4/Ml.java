package X4;

import Rxk.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Ml {
    private final int HI;
    private Typeface Ik;
    public final int J2;
    public final float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f11742O;
    public final boolean Uo;
    private ColorStateList az;
    private boolean ck = false;
    public final boolean gh;
    public final float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ColorStateList f11743n;
    public final String nr;
    public final float qie;
    public final ColorStateList rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ColorStateList f11744t;
    private float ty;
    public final float xMQ;

    class j extends ResourcesCompat.FontCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f11745n;

        j(Wre wre) {
            this.f11745n = wre;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void J2(int i2) {
            Ml.this.ck = true;
            this.f11745n.n(i2);
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void Uo(Typeface typeface) {
            Ml ml = Ml.this;
            ml.Ik = Typeface.create(typeface, ml.f11742O);
            Ml.this.ck = true;
            this.f11745n.rl(Ml.this.Ik, false);
        }
    }

    class n extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f11746n;
        final /* synthetic */ TextPaint rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Wre f11747t;

        n(Context context, TextPaint textPaint, Wre wre) {
            this.f11746n = context;
            this.rl = textPaint;
            this.f11747t = wre;
        }

        @Override // X4.Wre
        public void n(int i2) {
            this.f11747t.n(i2);
        }

        @Override // X4.Wre
        public void rl(Typeface typeface, boolean z2) {
            Ml.this.ck(this.f11746n, this.rl, typeface);
            this.f11747t.rl(typeface, z2);
        }
    }

    private void nr() {
        String str;
        if (this.Ik == null && (str = this.nr) != null) {
            this.Ik = Typeface.create(str, this.f11742O);
        }
        if (this.Ik == null) {
            int i2 = this.J2;
            if (i2 == 1) {
                this.Ik = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.Ik = Typeface.SERIF;
            } else if (i2 != 3) {
                this.Ik = Typeface.DEFAULT;
            } else {
                this.Ik = Typeface.MONOSPACE;
            }
            this.Ik = Typeface.create(this.Ik, this.f11742O);
        }
    }

    public Typeface J2(Context context) {
        if (this.ck) {
            return this.Ik;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceKN = ResourcesCompat.KN(context, this.HI);
                this.Ik = typefaceKN;
                if (typefaceKN != null) {
                    this.Ik = Typeface.create(typefaceKN, this.f11742O);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.nr, e2);
            }
        }
        nr();
        this.ck = true;
        return this.Ik;
    }

    public void gh(ColorStateList colorStateList) {
        this.az = colorStateList;
    }

    public float mUb() {
        return this.ty;
    }

    public void qie(float f3) {
        this.ty = f3;
    }

    public ColorStateList xMQ() {
        return this.az;
    }

    public Ml(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, o.f8);
        qie(typedArrayObtainStyledAttributes.getDimension(o.KB, 0.0f));
        gh(w6.n(context, typedArrayObtainStyledAttributes, o.bIT));
        this.f11743n = w6.n(context, typedArrayObtainStyledAttributes, o.RkF);
        this.rl = w6.n(context, typedArrayObtainStyledAttributes, o.Ftj);
        this.f11742O = typedArrayObtainStyledAttributes.getInt(o.nln, 0);
        this.J2 = typedArrayObtainStyledAttributes.getInt(o.q5J, 1);
        int iJ2 = w6.J2(typedArrayObtainStyledAttributes, o.f8882sP, o.Fd);
        this.HI = typedArrayObtainStyledAttributes.getResourceId(iJ2, 0);
        this.nr = typedArrayObtainStyledAttributes.getString(iJ2);
        this.Uo = typedArrayObtainStyledAttributes.getBoolean(o.IO, false);
        this.f11744t = w6.n(context, typedArrayObtainStyledAttributes, o.gUZ);
        this.KN = typedArrayObtainStyledAttributes.getFloat(o.vqZ, 0.0f);
        this.xMQ = typedArrayObtainStyledAttributes.getFloat(o.vD, 0.0f);
        this.mUb = typedArrayObtainStyledAttributes.getFloat(o.s6, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i2, o.f8859cB);
        int i3 = o.ZZU;
        this.gh = typedArrayObtainStyledAttributes2.hasValue(i3);
        this.qie = typedArrayObtainStyledAttributes2.getFloat(i3, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private boolean az(Context context) {
        Typeface typefaceT;
        if (I28.n()) {
            return true;
        }
        int i2 = this.HI;
        if (i2 != 0) {
            typefaceT = ResourcesCompat.t(context, i2);
        } else {
            typefaceT = null;
        }
        if (typefaceT != null) {
            return true;
        }
        return false;
    }

    public void HI(Context context, TextPaint textPaint, Wre wre) {
        if (az(context)) {
            ck(context, textPaint, J2(context));
        } else {
            KN(context, textPaint, wre);
        }
    }

    public void KN(Context context, TextPaint textPaint, Wre wre) {
        ck(context, textPaint, O());
        Uo(context, new n(context, textPaint, wre));
    }

    public Typeface O() {
        nr();
        return this.Ik;
    }

    public void Uo(Context context, Wre wre) {
        if (az(context)) {
            J2(context);
        } else {
            nr();
        }
        int i2 = this.HI;
        if (i2 == 0) {
            this.ck = true;
        }
        if (this.ck) {
            wre.rl(this.Ik, true);
            return;
        }
        try {
            ResourcesCompat.mUb(context, i2, new j(wre), null);
        } catch (Resources.NotFoundException unused) {
            this.ck = true;
            wre.n(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.nr, e2);
            this.ck = true;
            wre.n(-3);
        }
    }

    public void ck(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z2;
        float f3;
        Typeface typefaceN = fuX.n(context, typeface);
        if (typefaceN != null) {
            typeface = typefaceN;
        }
        textPaint.setTypeface(typeface);
        int i2 = this.f11742O & (~typeface.getStyle());
        if ((i2 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        textPaint.setFakeBoldText(z2);
        if ((i2 & 2) != 0) {
            f3 = -0.25f;
        } else {
            f3 = 0.0f;
        }
        textPaint.setTextSkewX(f3);
        textPaint.setTextSize(this.ty);
        if (this.gh) {
            textPaint.setLetterSpacing(this.qie);
        }
    }

    public void ty(Context context, TextPaint textPaint, Wre wre) {
        int colorForState;
        int colorForState2;
        HI(context, textPaint, wre);
        ColorStateList colorStateList = this.az;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            colorForState = -16777216;
        }
        textPaint.setColor(colorForState);
        float f3 = this.mUb;
        float f4 = this.KN;
        float f5 = this.xMQ;
        ColorStateList colorStateList2 = this.f11744t;
        if (colorStateList2 != null) {
            colorForState2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            colorForState2 = 0;
        }
        textPaint.setShadowLayer(f3, f4, f5, colorForState2);
    }
}
