package com.airbnb.lottie;

import FQq.AbstractC1347z;
import FQq.DAz;
import FQq.Ew;
import FQq.Q;
import FQq.SPz;
import FQq.Z;
import FQq.afx;
import FQq.ci;
import FQq.nKK;
import FQq.s4;
import FQq.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final Q M7 = new Q() { // from class: FQq.CN3
        @Override // FQq.Q
        public final void onResult(Object obj) {
            LottieAnimationView.nr((Throwable) obj);
        }
    };
    private static final String P5 = "LottieAnimationView";
    private String E2;
    private final Q J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f43900N;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f43901S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f43902T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private z f43903U;
    private final Set Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43904e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Xo f43905g;
    private final Set jB;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Q f43906o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Q f43907r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f43908v;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new j();
        boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        float f43909O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f43910Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f43911n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f43912o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        String f43913r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f43914t;

        class j implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            j() {
            }
        }

        /* synthetic */ SavedState(Parcel parcel, com.airbnb.lottie.j jVar) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f43911n = parcel.readString();
            this.f43909O = parcel.readFloat();
            this.J2 = parcel.readInt() == 1;
            this.f43913r = parcel.readString();
            this.f43912o = parcel.readInt();
            this.f43910Z = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f43911n);
            parcel.writeFloat(this.f43909O);
            parcel.writeInt(this.J2 ? 1 : 0);
            parcel.writeString(this.f43913r);
            parcel.writeInt(this.f43912o);
            parcel.writeInt(this.f43910Z);
        }
    }

    private enum j {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    private static class n implements Q {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WeakReference f43921n;

        @Override // FQq.Q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f43921n.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f43901S != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f43901S);
            }
            (lottieAnimationView.f43906o == null ? LottieAnimationView.M7 : lottieAnimationView.f43906o).onResult(th);
        }

        public n(LottieAnimationView lottieAnimationView) {
            this.f43921n = new WeakReference(lottieAnimationView);
        }
    }

    private static class w6 implements Q {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WeakReference f43922n;

        @Override // FQq.Q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void onResult(FQq.Dsr dsr) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f43922n.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(dsr);
        }

        public w6(LottieAnimationView lottieAnimationView) {
            this.f43922n = new WeakReference(lottieAnimationView);
        }
    }

    public void Ik() {
        this.f43900N = false;
        this.f43905g.dR0();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.airbnb.lottie", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setAnimation(@RawRes int i2) {
        this.f43904e = i2;
        this.E2 = null;
        setCompositionTask(ty(i2));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        Z(str, null);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f43904e = 0;
        this.E2 = null;
        mUb();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f43904e = 0;
        this.E2 = null;
        mUb();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        this.f43904e = 0;
        this.E2 = null;
        mUb();
        super.setImageResource(i2);
    }

    public void setMaxFrame(int i2) {
        this.f43905g.Org(i2);
    }

    public void setMinFrame(int i2) {
        this.f43905g.hRu(i2);
    }

    public void setProgress(@FloatRange float f3) {
        S(f3, true);
    }

    public static /* synthetic */ ci O(LottieAnimationView lottieAnimationView, int i2) {
        return lottieAnimationView.f43908v ? AbstractC1347z.aYN(lottieAnimationView.getContext(), i2) : AbstractC1347z.ViF(lottieAnimationView.getContext(), i2, null);
    }

    private void S(float f3, boolean z2) {
        if (z2) {
            this.Xw.add(j.SET_PROGRESS);
        }
        this.f43905g.tUK(f3);
    }

    private void gh() {
        this.f43905g.Z();
    }

    private void mUb() {
        z zVar = this.f43903U;
        if (zVar != null) {
            zVar.gh(this.J2);
            this.f43903U.mUb(this.f43907r);
        }
    }

    public static /* synthetic */ ci t(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.f43908v ? AbstractC1347z.qie(lottieAnimationView.getContext(), str) : AbstractC1347z.az(lottieAnimationView.getContext(), str, null);
    }

    public void Z(String str, String str2) {
        o(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public boolean ck() {
        return this.f43905g.I();
    }

    public FQq.j getAsyncUpdates() {
        return this.f43905g.E2();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f43905g.e();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f43905g.T();
    }

    public boolean getClipToCompositionBounds() {
        return this.f43905g.N();
    }

    public int getFrame() {
        return this.f43905g.v();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f43905g.bzg();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f43905g.jB();
    }

    public float getMaxFrame() {
        return this.f43905g.P5();
    }

    public float getMinFrame() {
        return this.f43905g.M7();
    }

    @Nullable
    public afx getPerformanceTracker() {
        return this.f43905g.p5();
    }

    @FloatRange
    public float getProgress() {
        return this.f43905g.eF();
    }

    public nKK getRenderMode() {
        return this.f43905g.E();
    }

    public int getRepeatCount() {
        return this.f43905g.M();
    }

    public int getRepeatMode() {
        return this.f43905g.FX();
    }

    public float getSpeed() {
        return this.f43905g.B();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.E2 = savedState.f43911n;
        Set set = this.Xw;
        j jVar = j.SET_ANIMATION;
        if (!set.contains(jVar) && !TextUtils.isEmpty(this.E2)) {
            setAnimation(this.E2);
        }
        this.f43904e = savedState.f43914t;
        if (!this.Xw.contains(jVar) && (i2 = this.f43904e) != 0) {
            setAnimation(i2);
        }
        if (!this.Xw.contains(j.SET_PROGRESS)) {
            S(savedState.f43909O, false);
        }
        if (!this.Xw.contains(j.PLAY_OPTION) && savedState.J2) {
            r();
        }
        if (!this.Xw.contains(j.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f43913r);
        }
        if (!this.Xw.contains(j.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f43912o);
        }
        if (this.Xw.contains(j.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f43910Z);
    }

    public void qie(boolean z2) {
        this.f43905g.g(s4.MergePathsApi19, z2);
    }

    public void r() {
        this.Xw.add(j.PLAY_OPTION);
        this.f43905g.z();
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f43908v ? AbstractC1347z.nY(getContext(), str) : AbstractC1347z.g(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z2) {
        this.f43905g.xg(z2);
    }

    public void setApplyingShadowToLayersEnabled(boolean z2) {
        this.f43905g.pJg(z2);
    }

    public void setAsyncUpdates(FQq.j jVar) {
        this.f43905g.ofS(jVar);
    }

    public void setCacheComposition(boolean z2) {
        this.f43908v = z2;
    }

    public void setClipTextToBoundingBox(boolean z2) {
        this.f43905g.C(z2);
    }

    public void setClipToCompositionBounds(boolean z2) {
        this.f43905g.Mx(z2);
    }

    public void setComposition(@NonNull FQq.Dsr dsr) {
        if (FQq.I28.f2538n) {
            Log.v(P5, "Set Composition \n" + dsr);
        }
        this.f43905g.setCallback(this);
        this.f43902T = true;
        boolean zG7 = this.f43905g.G7(dsr);
        if (this.f43900N) {
            this.f43905g.z();
        }
        this.f43902T = false;
        if (getDrawable() != this.f43905g || zG7) {
            if (!zG7) {
                XQ();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.jB.iterator();
            if (it.hasNext()) {
                android.support.v4.media.j.n(it.next());
                throw null;
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f43905g.fcU(str);
    }

    public void setFailureListener(@Nullable Q q2) {
        this.f43906o = q2;
    }

    public void setFallbackResource(@DrawableRes int i2) {
        this.f43901S = i2;
    }

    public void setFontAssetDelegate(FQq.n nVar) {
        this.f43905g.eWT(nVar);
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        this.f43905g.ul(map);
    }

    public void setFrame(int i2) {
        this.f43905g.n1(i2);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z2) {
        this.f43905g.Jk(z2);
    }

    public void setImageAssetDelegate(FQq.w6 w6Var) {
        this.f43905g.Rl(w6Var);
    }

    public void setImageAssetsFolder(String str) {
        this.f43905g.qm(str);
    }

    public void setMaintainOriginalImageBounds(boolean z2) {
        this.f43905g.mYa(z2);
    }

    public void setMaxFrame(String str) {
        this.f43905g.HV(str);
    }

    public void setMaxProgress(@FloatRange float f3) {
        this.f43905g.GD(f3);
    }

    public void setMinAndMaxFrame(String str) {
        this.f43905g.EWS(str);
    }

    public void setMinFrame(String str) {
        this.f43905g.UhV(str);
    }

    public void setMinProgress(float f3) {
        this.f43905g.i(f3);
    }

    public void setOutlineMasksAndMattes(boolean z2) {
        this.f43905g.K(z2);
    }

    public void setPerformanceTrackingEnabled(boolean z2) {
        this.f43905g.How(z2);
    }

    public void setRenderMode(nKK nkk) {
        this.f43905g.ER(nkk);
    }

    public void setRepeatCount(int i2) {
        this.Xw.add(j.SET_REPEAT_COUNT);
        this.f43905g.lLA(i2);
    }

    public void setRepeatMode(int i2) {
        this.Xw.add(j.SET_REPEAT_MODE);
        this.f43905g.kSg(i2);
    }

    public void setSafeMode(boolean z2) {
        this.f43905g.W(z2);
    }

    public void setSpeed(float f3) {
        this.f43905g.RQ(f3);
    }

    public void setTextDelegate(u uVar) {
        this.f43905g.a63(uVar);
    }

    public void setUseCompositionFrameRate(boolean z2) {
        this.f43905g.F(z2);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        Xo xo;
        if (!this.f43902T && drawable == (xo = this.f43905g) && xo.I()) {
            Ik();
        } else if (!this.f43902T && (drawable instanceof Xo)) {
            Xo xo2 = (Xo) drawable;
            if (xo2.I()) {
                xo2.dR0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void xMQ(ES.I28 i28, Object obj, Ect.w6 w6Var) {
        this.f43905g.Ik(i28, obj, w6Var);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J2 = new w6(this);
        this.f43907r = new n(this);
        this.f43901S = 0;
        this.f43905g = new Xo();
        this.f43902T = false;
        this.f43900N = false;
        this.f43908v = true;
        this.Xw = new HashSet();
        this.jB = new HashSet();
        HI(attributeSet, Z.f2561n);
    }

    private void HI(AttributeSet attributeSet, int i2) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Ew.f2533n, i2, 0);
        this.f43908v = typedArrayObtainStyledAttributes.getBoolean(Ew.J2, true);
        int i3 = Ew.f2535r;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i3);
        int i5 = Ew.az;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i5);
        int i7 = Ew.WPU;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i7);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i5);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i7)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(Ew.qie, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(Ew.f2530O, false)) {
            this.f43900N = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(Ew.ck, false)) {
            this.f43905g.lLA(-1);
        }
        int i8 = Ew.XQ;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i8, 1));
        }
        int i9 = Ew.f2532Z;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i9, -1));
        }
        int i10 = Ew.f2531S;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i10, 1.0f));
        }
        int i11 = Ew.KN;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(i11, true));
        }
        int i12 = Ew.Uo;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(i12, false));
        }
        int i13 = Ew.mUb;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(i13));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(Ew.HI));
        int i14 = Ew.Ik;
        S(typedArrayObtainStyledAttributes.getFloat(i14, 0.0f), typedArrayObtainStyledAttributes.hasValue(i14));
        qie(typedArrayObtainStyledAttributes.getBoolean(Ew.gh, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(Ew.rl, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(Ew.f2536t, true));
        int i15 = Ew.xMQ;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            xMQ(new ES.I28("**"), SPz.s7N, new Ect.w6(new DAz(AppCompatResources.n(getContext(), typedArrayObtainStyledAttributes.getResourceId(i15, -1)).getDefaultColor())));
        }
        int i16 = Ew.f2534o;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            nKK nkk = nKK.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i16, nkk.ordinal());
            if (iOrdinal >= nKK.values().length) {
                iOrdinal = nkk.ordinal();
            }
            setRenderMode(nKK.values()[iOrdinal]);
        }
        int i17 = Ew.nr;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            FQq.j jVar = FQq.j.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i17, jVar.ordinal());
            if (iOrdinal2 >= nKK.values().length) {
                iOrdinal2 = jVar.ordinal();
            }
            setAsyncUpdates(FQq.j.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(Ew.ty, false));
        int i18 = Ew.aYN;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(i18, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void XQ() {
        boolean zCk = ck();
        setImageDrawable(null);
        setImageDrawable(this.f43905g);
        if (zCk) {
            this.f43905g.m();
        }
    }

    private z az(final String str) {
        if (isInEditMode()) {
            return new z(new Callable() { // from class: FQq.Wre
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.t(this.f2559n, str);
                }
            }, true);
        }
        if (this.f43908v) {
            return AbstractC1347z.mUb(getContext(), str);
        }
        return AbstractC1347z.gh(getContext(), str, null);
    }

    public static /* synthetic */ void nr(Throwable th) {
        if (x0.eO.gh(th)) {
            x0.CN3.nr("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    private void setCompositionTask(z zVar) {
        ci ciVarO = zVar.O();
        Xo xo = this.f43905g;
        if (ciVarO != null && xo == getDrawable() && xo.nHg() == ciVarO.rl()) {
            return;
        }
        this.Xw.add(j.SET_ANIMATION);
        gh();
        mUb();
        this.f43903U = zVar.nr(this.J2).t(this.f43907r);
    }

    private z ty(final int i2) {
        if (isInEditMode()) {
            return new z(new Callable() { // from class: FQq.fuX
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.O(this.f2571n, i2);
                }
            }, true);
        }
        if (this.f43908v) {
            return AbstractC1347z.S(getContext(), i2);
        }
        return AbstractC1347z.WPU(getContext(), i2, null);
    }

    @Nullable
    public FQq.Dsr getComposition() {
        Drawable drawable = getDrawable();
        Xo xo = this.f43905g;
        if (drawable == xo) {
            return xo.nHg();
        }
        return null;
    }

    public long getDuration() {
        FQq.Dsr composition = getComposition();
        if (composition != null) {
            return (long) composition.nr();
        }
        return 0L;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof Xo) && ((Xo) drawable).E() == nKK.SOFTWARE) {
            this.f43905g.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        Xo xo = this.f43905g;
        if (drawable2 == xo) {
            super.invalidateDrawable(xo);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void o(InputStream inputStream, String str) {
        setCompositionTask(AbstractC1347z.HI(inputStream, str));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f43900N) {
            this.f43905g.z();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f43911n = this.E2;
        savedState.f43914t = this.f43904e;
        savedState.f43909O = this.f43905g.eF();
        savedState.J2 = this.f43905g.GR();
        savedState.f43913r = this.f43905g.bzg();
        savedState.f43912o = this.f43905g.FX();
        savedState.f43910Z = this.f43905g.M();
        return savedState;
    }

    public void setAnimation(String str) {
        this.E2 = str;
        this.f43904e = 0;
        setCompositionTask(az(str));
    }
}
