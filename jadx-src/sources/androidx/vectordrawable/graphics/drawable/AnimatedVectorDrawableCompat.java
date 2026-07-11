package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class AnimatedVectorDrawableCompat extends VectorDrawableCommon implements Animatable2Compat {
    private android.animation.ArgbEvaluator J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Context f42300O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final Drawable.Callback f42301S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    ArrayList f42302Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Animator.AnimatorListener f42303o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    AnimatedVectorDrawableDelegateState f42304r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AnimatedVectorDrawableCompatState f42305t;

    private static class AnimatedVectorDrawableCompatState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        ArrayMap f42308O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f42309n;
        ArrayList nr;
        VectorDrawableCompat rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        AnimatorSet f42310t;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f42309n;
        }

        public void n() {
            if (this.f42310t == null) {
                this.f42310t = new AnimatorSet();
            }
            this.f42310t.playTogether(this.nr);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public AnimatedVectorDrawableCompatState(Context context, AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState, Drawable.Callback callback, Resources resources) {
            if (animatedVectorDrawableCompatState != null) {
                this.f42309n = animatedVectorDrawableCompatState.f42309n;
                VectorDrawableCompat vectorDrawableCompat = animatedVectorDrawableCompatState.rl;
                if (vectorDrawableCompat != null) {
                    Drawable.ConstantState constantState = vectorDrawableCompat.getConstantState();
                    if (resources != null) {
                        this.rl = (VectorDrawableCompat) constantState.newDrawable(resources);
                    } else {
                        this.rl = (VectorDrawableCompat) constantState.newDrawable();
                    }
                    VectorDrawableCompat vectorDrawableCompat2 = (VectorDrawableCompat) this.rl.mutate();
                    this.rl = vectorDrawableCompat2;
                    vectorDrawableCompat2.setCallback(callback);
                    this.rl.setBounds(animatedVectorDrawableCompatState.rl.getBounds());
                    this.rl.KN(false);
                }
                ArrayList arrayList = animatedVectorDrawableCompatState.nr;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.nr = new ArrayList(size);
                    this.f42308O = new ArrayMap(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = (Animator) animatedVectorDrawableCompatState.nr.get(i2);
                        Animator animatorClone = animator.clone();
                        String str = (String) animatedVectorDrawableCompatState.f42308O.get(animator);
                        animatorClone.setTarget(this.rl.nr(str));
                        this.nr.add(animatorClone);
                        this.f42308O.put(animatorClone, str);
                    }
                    n();
                }
            }
        }
    }

    @RequiresApi
    private static class AnimatedVectorDrawableDelegateState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Drawable.ConstantState f42311n;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable drawableNewDrawable = this.f42311n.newDrawable();
            animatedVectorDrawableCompat.f42315n = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.f42301S);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f42311n.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f42311n.getChangingConfigurations();
        }

        public AnimatedVectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f42311n = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable drawableNewDrawable = this.f42311n.newDrawable(resources);
            animatedVectorDrawableCompat.f42315n = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.f42301S);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable drawableNewDrawable = this.f42311n.newDrawable(resources, theme);
            animatedVectorDrawableCompat.f42315n = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.f42301S);
            return animatedVectorDrawableCompat;
        }
    }

    AnimatedVectorDrawableCompat() {
        this(null, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            DrawableCompat.Uo(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayIk = TypedArrayUtils.Ik(resources, theme, attributeSet, AndroidResources.f42295O);
                    int resourceId = typedArrayIk.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat vectorDrawableCompatRl = VectorDrawableCompat.rl(resources, resourceId, theme);
                        vectorDrawableCompatRl.KN(false);
                        vectorDrawableCompatRl.setCallback(this.f42301S);
                        VectorDrawableCompat vectorDrawableCompat = this.f42305t.rl;
                        if (vectorDrawableCompat != null) {
                            vectorDrawableCompat.setCallback(null);
                        }
                        this.f42305t.rl = vectorDrawableCompatRl;
                    }
                    typedArrayIk.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AndroidResources.J2);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f42300O;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        J2(string, AnimatorInflaterCompat.n(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f42305t.n();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    private AnimatedVectorDrawableCompat(Context context) {
        this(context, null, null);
    }

    private void J2(String str, Animator animator) {
        animator.setTarget(this.f42305t.rl.nr(str));
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.f42305t;
        if (animatedVectorDrawableCompatState.nr == null) {
            animatedVectorDrawableCompatState.nr = new ArrayList();
            this.f42305t.f42308O = new ArrayMap();
        }
        this.f42305t.nr.add(animator);
        this.f42305t.f42308O.put(animator, str);
    }

    private void O() {
        Animator.AnimatorListener animatorListener = this.f42303o;
        if (animatorListener != null) {
            this.f42305t.f42310t.removeListener(animatorListener);
            this.f42303o = null;
        }
    }

    public static AnimatedVectorDrawableCompat n(Context context, int i2) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        Drawable drawableJ2 = ResourcesCompat.J2(context.getResources(), i2, context.getTheme());
        animatedVectorDrawableCompat.f42315n = drawableJ2;
        drawableJ2.setCallback(animatedVectorDrawableCompat.f42301S);
        animatedVectorDrawableCompat.f42304r = new AnimatedVectorDrawableDelegateState(animatedVectorDrawableCompat.f42315n.getConstantState());
        return animatedVectorDrawableCompat;
    }

    public static AnimatedVectorDrawableCompat rl(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    public boolean Uo(Animatable2Compat.AnimationCallback animationCallback) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            KN((AnimatedVectorDrawable) drawable, animationCallback);
        }
        ArrayList arrayList = this.f42302Z;
        if (arrayList == null || animationCallback == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(animationCallback);
        if (this.f42302Z.size() == 0) {
            O();
        }
        return zRemove;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            DrawableCompat.n(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            return DrawableCompat.rl(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f42305t.rl.draw(canvas);
        if (this.f42305t.f42310t.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f42315n;
        return drawable != null ? DrawableCompat.nr(drawable) : this.f42305t.rl.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f42315n;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f42305t.f42309n;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f42315n;
        return drawable != null ? DrawableCompat.O(drawable) : this.f42305t.rl.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f42315n != null) {
            return new AnimatedVectorDrawableDelegateState(this.f42315n.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f42315n;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f42305t.rl.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f42315n;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f42305t.rl.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f42315n;
        return drawable != null ? drawable.getOpacity() : this.f42305t.rl.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f42315n;
        return drawable != null ? DrawableCompat.KN(drawable) : this.f42305t.rl.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f42315n;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f42305t.f42310t.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f42315n;
        return drawable != null ? drawable.isStateful() : this.f42305t.rl.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f42305t.rl.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f42315n;
        return drawable != null ? drawable.setLevel(i2) : this.f42305t.rl.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f42315n;
        return drawable != null ? drawable.setState(iArr) : this.f42305t.rl.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f42305t.rl.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            DrawableCompat.mUb(drawable, z2);
        } else {
            this.f42305t.rl.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f42305t.rl.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            DrawableCompat.ty(drawable, i2);
        } else {
            this.f42305t.rl.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            DrawableCompat.HI(drawable, colorStateList);
        } else {
            this.f42305t.rl.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            DrawableCompat.ck(drawable, mode);
        } else {
            this.f42305t.rl.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f42305t.rl.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f42305t.f42310t.isStarted()) {
                return;
            }
            this.f42305t.f42310t.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f42305t.f42310t.end();
        }
    }

    public void t(Animatable2Compat.AnimationCallback animationCallback) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            nr((AnimatedVectorDrawable) drawable, animationCallback);
            return;
        }
        if (animationCallback == null) {
            return;
        }
        if (this.f42302Z == null) {
            this.f42302Z = new ArrayList();
        }
        if (this.f42302Z.contains(animationCallback)) {
            return;
        }
        this.f42302Z.add(animationCallback);
        if (this.f42303o == null) {
            this.f42303o = new AnimatorListenerAdapter() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ArrayList arrayList = new ArrayList(AnimatedVectorDrawableCompat.this.f42302Z);
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Animatable2Compat.AnimationCallback) arrayList.get(i2)).rl(AnimatedVectorDrawableCompat.this);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    ArrayList arrayList = new ArrayList(AnimatedVectorDrawableCompat.this.f42302Z);
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Animatable2Compat.AnimationCallback) arrayList.get(i2)).t(AnimatedVectorDrawableCompat.this);
                    }
                }
            };
        }
        this.f42305t.f42310t.addListener(this.f42303o);
    }

    private AnimatedVectorDrawableCompat(Context context, AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState, Resources resources) {
        this.J2 = null;
        this.f42303o = null;
        this.f42302Z = null;
        Drawable.Callback callback = new Drawable.Callback() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.1
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                AnimatedVectorDrawableCompat.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
                AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j2);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
            }
        };
        this.f42301S = callback;
        this.f42300O = context;
        if (animatedVectorDrawableCompatState != null) {
            this.f42305t = animatedVectorDrawableCompatState;
        } else {
            this.f42305t = new AnimatedVectorDrawableCompatState(context, animatedVectorDrawableCompatState, callback, resources);
        }
    }

    private static boolean KN(AnimatedVectorDrawable animatedVectorDrawable, Animatable2Compat.AnimationCallback animationCallback) {
        return animatedVectorDrawable.unregisterAnimationCallback(animationCallback.n());
    }

    private static void nr(AnimatedVectorDrawable animatedVectorDrawable, Animatable2Compat.AnimationCallback animationCallback) {
        animatedVectorDrawable.registerAnimationCallback(animationCallback.n());
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z2) {
        super.setFilterBitmap(z2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f3, float f4) {
        super.setHotspot(f3, f4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i5, int i7) {
        super.setHotspotBounds(i2, i3, i5, i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
