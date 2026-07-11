package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.CompoundButton;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class SwitchCompat extends CompoundButton implements EmojiCompatConfigurationView {
    private static final Property eWT = new Property<SwitchCompat, Float>(Float.class, "thumbPos") { // from class: androidx.appcompat.widget.SwitchCompat.1
        @Override // android.util.Property
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f14350D);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f3) {
            switchCompat.setThumbPosition(f3.floatValue());
        }
    };
    private static final int[] ul = {R.attr.state_checked};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private VelocityTracker f14348B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final AppCompatTextHelper f14349C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    float f14350D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f14351E;
    private boolean E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private float f14352FX;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private EmojiCompatInitCallback f14353G7;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private int f14354GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f14355I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f14356J;
    private boolean J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float f14357M;
    private CharSequence M7;
    private AppCompatEmojiTextHelper Mx;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f14358N;
    private int Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private PorterDuff.Mode f14359O;
    private CharSequence P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ColorStateList f14360S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f14361T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private CharSequence f14362U;
    private boolean Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14363a;
    private int dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14364e;
    private int eF;
    private Layout eTf;
    private final Rect fcU;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f14365g;
    private final TextPaint ijL;
    private CharSequence jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f14366k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f14367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f14368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f14369o;
    ObjectAnimator ofS;
    private boolean p5;
    private TransformationMethod pJg;
    private boolean piY;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f14370r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f14371t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f14372v;
    private Layout xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f14373z;

    static class EmojiCompatInitCallback extends EmojiCompat.InitCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Reference f14374n;

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void n(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f14374n.get();
            if (switchCompat != null) {
                switchCompat.mUb();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void rl() {
            SwitchCompat switchCompat = (SwitchCompat) this.f14374n.get();
            if (switchCompat != null) {
                switchCompat.mUb();
            }
        }

        EmojiCompatInitCallback(SwitchCompat switchCompat) {
            this.f14374n = new WeakReference(switchCompat);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f14375O;
        private int Uo;
        private int az;
        private int gh;
        private int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14376n;
        private int nr;
        private int qie;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14377t;
        private int ty;
        private int xMQ;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.rl = propertyMapper.mapObject("textOff", R.attr.textOff);
            this.f14377t = propertyMapper.mapObject("textOn", R.attr.textOn);
            this.nr = propertyMapper.mapObject("thumb", R.attr.thumb);
            this.f14375O = propertyMapper.mapBoolean("showText", androidx.appcompat.R.attr.f13415C);
            this.J2 = propertyMapper.mapBoolean("splitTrack", androidx.appcompat.R.attr.f13419G7);
            this.Uo = propertyMapper.mapInt("switchMinWidth", androidx.appcompat.R.attr.eWT);
            this.KN = propertyMapper.mapInt("switchPadding", androidx.appcompat.R.attr.ul);
            this.xMQ = propertyMapper.mapInt("thumbTextPadding", androidx.appcompat.R.attr.Rl);
            this.mUb = propertyMapper.mapObject("thumbTint", androidx.appcompat.R.attr.qm);
            this.gh = propertyMapper.mapObject("thumbTintMode", androidx.appcompat.R.attr.mYa);
            this.qie = propertyMapper.mapObject("track", androidx.appcompat.R.attr.How);
            this.az = propertyMapper.mapObject("trackTint", androidx.appcompat.R.attr.tUK);
            this.ty = propertyMapper.mapObject("trackTintMode", androidx.appcompat.R.attr.ER);
            this.f14376n = true;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void readProperties(SwitchCompat switchCompat, PropertyReader propertyReader) {
            if (!this.f14376n) {
                throw w6.n();
            }
            propertyReader.readObject(this.rl, switchCompat.getTextOff());
            propertyReader.readObject(this.f14377t, switchCompat.getTextOn());
            propertyReader.readObject(this.nr, switchCompat.getThumbDrawable());
            propertyReader.readBoolean(this.f14375O, switchCompat.getShowText());
            propertyReader.readBoolean(this.J2, switchCompat.getSplitTrack());
            propertyReader.readInt(this.Uo, switchCompat.getSwitchMinWidth());
            propertyReader.readInt(this.KN, switchCompat.getSwitchPadding());
            propertyReader.readInt(this.xMQ, switchCompat.getThumbTextPadding());
            propertyReader.readObject(this.mUb, switchCompat.getThumbTintList());
            propertyReader.readObject(this.gh, switchCompat.getThumbTintMode());
            propertyReader.readObject(this.qie, switchCompat.getTrackDrawable());
            propertyReader.readObject(this.az, switchCompat.getTrackTintList());
            propertyReader.readObject(this.ty, switchCompat.getTrackTintMode());
        }
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.n1);
    }

    private void HI(int i2, int i3) {
        ty(i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i3);
    }

    private void Ik(MotionEvent motionEvent) {
        this.eF = 0;
        boolean targetCheckedState = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z2) {
            this.f14348B.computeCurrentVelocity(1000);
            float xVelocity = this.f14348B.getXVelocity();
            if (Math.abs(xVelocity) <= this.f14356J) {
                targetCheckedState = getTargetCheckedState();
            } else if (!ViewUtils.rl(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        O(motionEvent);
    }

    private static float J2(float f3, float f4, float f5) {
        return f3 < f4 ? f4 : f3 > f5 ? f5 : f3;
    }

    private void n(boolean z2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) eWT, z2 ? 1.0f : 0.0f);
        this.ofS = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.ofS.setAutoCancel(true);
        this.ofS.start();
    }

    public void ty(Typeface typeface, int i2) {
        if (i2 <= 0) {
            this.ijL.setFakeBoldText(false);
            this.ijL.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
            this.ijL.setFakeBoldText((i3 & 1) != 0);
            this.ijL.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f14371t = null;
        this.f14359O = null;
        this.J2 = false;
        this.f14370r = false;
        this.f14360S = null;
        this.f14365g = null;
        this.E2 = false;
        this.f14364e = false;
        this.f14348B = VelocityTracker.obtain();
        this.piY = true;
        this.fcU = new Rect();
        ThemeUtils.n(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.ijL = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = androidx.appcompat.R.styleable.rT;
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context, attributeSet, iArr, i2, 0);
        ViewCompat.ijL(this, context, iArr, attributeSet, tintTypedArrayS.r(), i2, 0);
        Drawable drawableUo = tintTypedArrayS.Uo(androidx.appcompat.R.styleable.HE);
        this.f14368n = drawableUo;
        if (drawableUo != null) {
            drawableUo.setCallback(this);
        }
        Drawable drawableUo2 = tintTypedArrayS.Uo(androidx.appcompat.R.styleable.eb);
        this.f14369o = drawableUo2;
        if (drawableUo2 != null) {
            drawableUo2.setCallback(this);
        }
        setTextOnInternal(tintTypedArrayS.ck(androidx.appcompat.R.styleable.f13504L));
        setTextOffInternal(tintTypedArrayS.ck(androidx.appcompat.R.styleable.Lu));
        this.p5 = tintTypedArrayS.n(androidx.appcompat.R.styleable.fW, true);
        this.f14361T = tintTypedArrayS.J2(androidx.appcompat.R.styleable.GH3, 0);
        this.f14358N = tintTypedArrayS.J2(androidx.appcompat.R.styleable.l2, 0);
        this.f14372v = tintTypedArrayS.J2(androidx.appcompat.R.styleable.Om, 0);
        this.Xw = tintTypedArrayS.n(androidx.appcompat.R.styleable.c32, false);
        ColorStateList colorStateListT = tintTypedArrayS.t(androidx.appcompat.R.styleable.f13537w);
        if (colorStateListT != null) {
            this.f14371t = colorStateListT;
            this.J2 = true;
        }
        PorterDuff.Mode modeO = DrawableUtils.O(tintTypedArrayS.gh(androidx.appcompat.R.styleable.HFS, -1), null);
        if (this.f14359O != modeO) {
            this.f14359O = modeO;
            this.f14370r = true;
        }
        if (this.J2 || this.f14370r) {
            rl();
        }
        ColorStateList colorStateListT2 = tintTypedArrayS.t(androidx.appcompat.R.styleable.Xli);
        if (colorStateListT2 != null) {
            this.f14360S = colorStateListT2;
            this.E2 = true;
        }
        PorterDuff.Mode modeO2 = DrawableUtils.O(tintTypedArrayS.gh(androidx.appcompat.R.styleable.fq, -1), null);
        if (this.f14365g != modeO2) {
            this.f14365g = modeO2;
            this.f14364e = true;
        }
        if (this.E2 || this.f14364e) {
            t();
        }
        int iTy = tintTypedArrayS.ty(androidx.appcompat.R.styleable.t1J, 0);
        if (iTy != 0) {
            az(context, iTy);
        }
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f14349C = appCompatTextHelper;
        appCompatTextHelper.az(attributeSet, i2);
        tintTypedArrayS.aYN();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f14351E = viewConfiguration.getScaledTouchSlop();
        this.f14356J = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().t(attributeSet, i2);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean KN(float f3, float f4) {
        if (this.f14368n == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f14368n.getPadding(this.fcU);
        int i2 = this.f14366k;
        int i3 = this.f14351E;
        int i5 = i2 - i3;
        int i7 = (this.Nxk + thumbOffset) - i3;
        int i8 = this.f14354GR + i7;
        Rect rect = this.fcU;
        return f3 > ((float) i7) && f3 < ((float) (((i8 + rect.left) + rect.right) + i3)) && f4 > ((float) i5) && f4 < ((float) (this.f14373z + i3));
    }

    private void ck() {
        if (this.f14353G7 == null && this.Mx.rl() && EmojiCompat.gh()) {
            EmojiCompat emojiCompatT = EmojiCompat.t();
            int iUo = emojiCompatT.Uo();
            if (iUo == 3 || iUo == 0) {
                EmojiCompatInitCallback emojiCompatInitCallback = new EmojiCompatInitCallback(this);
                this.f14353G7 = emojiCompatInitCallback;
                emojiCompatT.S(emojiCompatInitCallback);
            }
        }
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.Mx == null) {
            this.Mx = new AppCompatEmojiTextHelper(this);
        }
        return this.Mx;
    }

    private boolean getTargetCheckedState() {
        return this.f14350D > 0.5f;
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f14369o;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.fcU;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f14368n;
        Rect rectNr = drawable2 != null ? DrawableUtils.nr(drawable2) : DrawableUtils.f14179t;
        return ((((this.f14363a - this.f14354GR) - rect.left) - rect.right) - rectNr.left) - rectNr.right;
    }

    private void gh() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.P5;
            if (string == null) {
                string = getResources().getString(androidx.appcompat.R.string.nr);
            }
            ViewCompat.hRu(this, string);
        }
    }

    private void nr() {
        ObjectAnimator objectAnimator = this.ofS;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void qie() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.jB;
            if (string == null) {
                string = getResources().getString(androidx.appcompat.R.string.f13485O);
            }
            ViewCompat.hRu(this, string);
        }
    }

    private void rl() {
        Drawable drawable = this.f14368n;
        if (drawable != null) {
            if (this.J2 || this.f14370r) {
                Drawable drawableMutate = DrawableCompat.r(drawable).mutate();
                this.f14368n = drawableMutate;
                if (this.J2) {
                    DrawableCompat.HI(drawableMutate, this.f14371t);
                }
                if (this.f14370r) {
                    DrawableCompat.ck(this.f14368n, this.f14359O);
                }
                if (this.f14368n.isStateful()) {
                    this.f14368n.setState(getDrawableState());
                }
            }
        }
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.P5 = charSequence;
        this.M7 = Uo(charSequence);
        this.xg = null;
        if (this.p5) {
            ck();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.jB = charSequence;
        this.f14362U = Uo(charSequence);
        this.eTf = null;
        if (this.p5) {
            ck();
        }
    }

    private void t() {
        Drawable drawable = this.f14369o;
        if (drawable != null) {
            if (this.E2 || this.f14364e) {
                Drawable drawableMutate = DrawableCompat.r(drawable).mutate();
                this.f14369o = drawableMutate;
                if (this.E2) {
                    DrawableCompat.HI(drawableMutate, this.f14360S);
                }
                if (this.f14364e) {
                    DrawableCompat.ck(this.f14369o, this.f14365g);
                }
                if (this.f14369o.isStateful()) {
                    this.f14369o.setState(getDrawableState());
                }
            }
        }
    }

    private Layout xMQ(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.ijL, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void az(Context context, int i2) {
        TintTypedArray tintTypedArrayZ = TintTypedArray.Z(context, i2, androidx.appcompat.R.styleable.C7B);
        ColorStateList colorStateListT = tintTypedArrayZ.t(androidx.appcompat.R.styleable.n7u);
        if (colorStateListT != null) {
            this.f14367m = colorStateListT;
        } else {
            this.f14367m = getTextColors();
        }
        int iJ2 = tintTypedArrayZ.J2(androidx.appcompat.R.styleable.wYi, 0);
        if (iJ2 != 0) {
            float f3 = iJ2;
            if (f3 != this.ijL.getTextSize()) {
                this.ijL.setTextSize(f3);
                requestLayout();
            }
        }
        HI(tintTypedArrayZ.gh(androidx.appcompat.R.styleable.TVk, -1), tintTypedArrayZ.gh(androidx.appcompat.R.styleable.lRt, -1));
        if (tintTypedArrayZ.n(androidx.appcompat.R.styleable.Sax, false)) {
            this.pJg = new AllCapsTransformationMethod(getContext());
        } else {
            this.pJg = null;
        }
        setTextOnInternal(this.jB);
        setTextOffInternal(this.P5);
        tintTypedArrayZ.aYN();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        int i3;
        Rect rect = this.fcU;
        int i5 = this.Nxk;
        int i7 = this.f14366k;
        int i8 = this.dR0;
        int i9 = this.f14373z;
        int thumbOffset = getThumbOffset() + i5;
        Drawable drawable = this.f14368n;
        Rect rectNr = drawable != null ? DrawableUtils.nr(drawable) : DrawableUtils.f14179t;
        Drawable drawable2 = this.f14369o;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i10 = rect.left;
            thumbOffset += i10;
            if (rectNr != null) {
                int i11 = rectNr.left;
                if (i11 > i10) {
                    i5 += i11 - i10;
                }
                int i12 = rectNr.top;
                int i13 = rect.top;
                i2 = i12 > i13 ? (i12 - i13) + i7 : i7;
                int i14 = rectNr.right;
                int i15 = rect.right;
                if (i14 > i15) {
                    i8 -= i14 - i15;
                }
                int i16 = rectNr.bottom;
                int i17 = rect.bottom;
                if (i16 > i17) {
                    i3 = i9 - (i16 - i17);
                }
                this.f14369o.setBounds(i5, i2, i8, i3);
            } else {
                i2 = i7;
            }
            i3 = i9;
            this.f14369o.setBounds(i5, i2, i8, i3);
        }
        Drawable drawable3 = this.f14368n;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i18 = thumbOffset - rect.left;
            int i19 = thumbOffset + this.f14354GR + rect.right;
            this.f14368n.setBounds(i18, i7, i19, i9);
            Drawable background = getBackground();
            if (background != null) {
                DrawableCompat.qie(background, i18, i7, i19, i9);
            }
        }
        super.draw(canvas);
    }

    public boolean getShowText() {
        return this.p5;
    }

    public boolean getSplitTrack() {
        return this.Xw;
    }

    public int getSwitchMinWidth() {
        return this.f14358N;
    }

    public int getSwitchPadding() {
        return this.f14372v;
    }

    public CharSequence getTextOff() {
        return this.P5;
    }

    public CharSequence getTextOn() {
        return this.jB;
    }

    public Drawable getThumbDrawable() {
        return this.f14368n;
    }

    @FloatRange
    protected final float getThumbPosition() {
        return this.f14350D;
    }

    public int getThumbTextPadding() {
        return this.f14361T;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f14371t;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f14359O;
    }

    public Drawable getTrackDrawable() {
        return this.f14369o;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f14360S;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.f14365g;
    }

    void mUb() {
        setTextOnInternal(this.jB);
        setTextOffInternal(this.P5);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, ul);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.p5) {
            if (this.eTf == null) {
                this.eTf = xMQ(this.f14362U);
            }
            if (this.xg == null) {
                this.xg = xMQ(this.M7);
            }
        }
        Rect rect = this.fcU;
        Drawable drawable = this.f14368n;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f14368n.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f14368n.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f14354GR = Math.max(this.p5 ? Math.max(this.eTf.getWidth(), this.xg.getWidth()) + (this.f14361T * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f14369o;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f14369o.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f14368n;
        if (drawable3 != null) {
            Rect rectNr = DrawableUtils.nr(drawable3);
            iMax = Math.max(iMax, rectNr.left);
            iMax2 = Math.max(iMax2, rectNr.right);
        }
        int iMax3 = this.piY ? Math.max(this.f14358N, (this.f14354GR * 2) + iMax + iMax2) : this.f14358N;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f14363a = iMax3;
        this.f14355I = iMax4;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f14348B.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && KN(x2, y2)) {
                this.eF = 1;
                this.f14357M = x2;
                this.f14352FX = y2;
            }
        } else if (actionMasked == 1) {
            if (this.eF == 2) {
                Ik(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.eF = 0;
            this.f14348B.clear();
        } else if (actionMasked == 2) {
            int i2 = this.eF;
            if (i2 == 1) {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (Math.abs(x3 - this.f14357M) > this.f14351E || Math.abs(y3 - this.f14352FX) > this.f14351E) {
                    this.eF = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f14357M = x3;
                    this.f14352FX = y3;
                    return true;
                }
            } else if (i2 == 2) {
                float x4 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f3 = x4 - this.f14357M;
                float f4 = thumbScrollRange != 0 ? f3 / thumbScrollRange : f3 > 0.0f ? 1.0f : -1.0f;
                if (ViewUtils.rl(this)) {
                    f4 = -f4;
                }
                float fJ2 = J2(this.f14350D + f4, 0.0f, 1.0f);
                if (fJ2 != this.f14350D) {
                    this.f14357M = x4;
                    setThumbPosition(fJ2);
                }
                return true;
            }
        } else if (actionMasked == 3) {
        }
        return super.onTouchEvent(motionEvent);
    }

    protected final void setEnforceSwitchWidth(boolean z2) {
        this.piY = z2;
        invalidate();
    }

    public void setShowText(boolean z2) {
        if (this.p5 != z2) {
            this.p5 = z2;
            requestLayout();
            if (z2) {
                ck();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.Xw = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f14358N = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f14372v = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.ijL.getTypeface() == null || this.ijL.getTypeface().equals(typeface)) && (this.ijL.getTypeface() != null || typeface == null)) {
            return;
        }
        this.ijL.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f14368n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14368n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f3) {
        this.f14350D = f3;
        invalidate();
    }

    public void setThumbTextPadding(int i2) {
        this.f14361T = i2;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f14371t = colorStateList;
        this.J2 = true;
        rl();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f14359O = mode;
        this.f14370r = true;
        rl();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f14369o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14369o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f14360S = colorStateList;
        this.E2 = true;
        t();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.f14365g = mode;
        this.f14364e = true;
        t();
    }

    private void O(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private CharSequence Uo(CharSequence charSequence) {
        TransformationMethod transformationMethodJ2 = getEmojiTextViewHelper().J2(this.pJg);
        if (transformationMethodJ2 != null) {
            return transformationMethodJ2.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    private int getThumbOffset() {
        float f3;
        if (ViewUtils.rl(this)) {
            f3 = 1.0f - this.f14350D;
        } else {
            f3 = this.f14350D;
        }
        return (int) ((f3 * getThumbScrollRange()) + 0.5f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f14368n;
        if (drawable != null) {
            DrawableCompat.gh(drawable, f3, f4);
        }
        Drawable drawable2 = this.f14369o;
        if (drawable2 != null) {
            DrawableCompat.gh(drawable2, f3, f4);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        boolean state;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f14368n;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        } else {
            state = false;
        }
        Drawable drawable2 = this.f14369o;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!ViewUtils.rl(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f14363a;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f14372v;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (ViewUtils.rl(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f14363a;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f14372v;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14368n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f14369o;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.ofS;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.ofS.end();
            this.ofS = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.fcU;
        Drawable drawable = this.f14369o;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f14366k;
        int i3 = this.f14373z;
        int i5 = i2 + rect.top;
        int i7 = i3 - rect.bottom;
        Drawable drawable2 = this.f14368n;
        if (drawable != null) {
            if (this.Xw && drawable2 != null) {
                Rect rectNr = DrawableUtils.nr(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectNr.left;
                rect.right -= rectNr.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            } else {
                drawable.draw(canvas);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.eTf;
        } else {
            layout = this.xg;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f14367m;
            if (colorStateList != null) {
                this.ijL.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.ijL.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i5 + i7) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.jB;
            } else {
                charSequence = this.P5;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        int iMax;
        int width;
        int paddingLeft;
        int i8;
        int paddingTop;
        int height;
        super.onLayout(z2, i2, i3, i5, i7);
        int iMax2 = 0;
        if (this.f14368n != null) {
            Rect rect = this.fcU;
            Drawable drawable = this.f14369o;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectNr = DrawableUtils.nr(this.f14368n);
            iMax = Math.max(0, rectNr.left - rect.left);
            iMax2 = Math.max(0, rectNr.right - rect.right);
        } else {
            iMax = 0;
        }
        if (ViewUtils.rl(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f14363a + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f14363a) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i8 = this.f14355I;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f14355I;
                this.Nxk = paddingLeft;
                this.f14366k = paddingTop;
                this.f14373z = height;
                this.dR0 = width;
            }
        } else {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i8 = this.f14355I;
            paddingTop = paddingTop2 - (i8 / 2);
        }
        height = i8 + paddingTop;
        this.Nxk = paddingLeft;
        this.f14366k = paddingTop;
        this.f14373z = height;
        this.dR0 = width;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.jB;
        } else {
            charSequence = this.P5;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().nr(z2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        float f3;
        super.setChecked(z2);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            qie();
        } else {
            gh();
        }
        if (getWindowToken() != null && isLaidOut()) {
            n(zIsChecked);
            return;
        }
        nr();
        if (zIsChecked) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        setThumbPosition(f3);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.Z(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().O(z2);
        setTextOnInternal(this.jB);
        setTextOffInternal(this.P5);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().n(inputFilterArr));
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            gh();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            qie();
        }
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(AppCompatResources.rl(getContext(), i2));
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(AppCompatResources.rl(getContext(), i2));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f14368n && drawable != this.f14369o) {
            return false;
        }
        return true;
    }
}
