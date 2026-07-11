package FbN;

import FbN.j;
import Hh.Dsr;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 extends ImageView {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static boolean f2770S;
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private n f2771O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j.C0096j f2772n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Object f2773o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2774r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f2775t;

    private void nr() {
        Drawable drawable;
        if (!this.f2774r || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z2) {
        f2770S = z2;
    }

    public float getAspectRatio() {
        return this.f2775t;
    }

    public htt.j getController() {
        return this.f2771O.O();
    }

    public Object getExtraData() {
        return this.f2773o;
    }

    public htt.n getHierarchy() {
        return this.f2771O.J2();
    }

    public Drawable getTopLevelDrawable() {
        return this.f2771O.Uo();
    }

    protected void n() {
        this.f2771O.xMQ();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        j.C0096j c0096j = this.f2772n;
        c0096j.f2764n = i2;
        c0096j.rl = i3;
        j.rl(c0096j, this.f2775t, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        j.C0096j c0096j2 = this.f2772n;
        super.onMeasure(c0096j2.f2764n, c0096j2.rl);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2771O.gh(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    protected void rl() {
        this.f2771O.mUb();
    }

    public void setAspectRatio(float f3) {
        if (f3 == this.f2775t) {
            return;
        }
        this.f2775t = f3;
        requestLayout();
    }

    public void setController(htt.j jVar) {
        this.f2771O.ty(jVar);
        super.setImageDrawable(this.f2771O.Uo());
    }

    public void setExtraData(Object obj) {
        this.f2773o = obj;
    }

    public void setHierarchy(htt.n nVar) {
        this.f2771O.HI(nVar);
        super.setImageDrawable(this.f2771O.Uo());
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z2) {
        this.f2774r = z2;
    }

    public w6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2772n = new j.C0096j();
        this.f2775t = 0.0f;
        this.J2 = false;
        this.f2774r = false;
        this.f2773o = null;
        t(context);
    }

    private void t(Context context) {
        try {
            if (T5.n.nr()) {
                T5.n.n("DraweeView#init");
            }
            if (this.J2) {
                if (T5.n.nr()) {
                    T5.n.rl();
                    return;
                }
                return;
            }
            boolean z2 = true;
            this.J2 = true;
            this.f2771O = n.t(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (T5.n.nr()) {
                    T5.n.rl();
                    return;
                }
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f2770S || context.getApplicationInfo().targetSdkVersion < 24) {
                z2 = false;
            }
            this.f2774r = z2;
            if (T5.n.nr()) {
                T5.n.rl();
            }
        } catch (Throwable th) {
            if (T5.n.nr()) {
                T5.n.rl();
            }
            throw th;
        }
    }

    protected void J2() {
        rl();
    }

    protected void O() {
        n();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        nr();
        O();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nr();
        J2();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        nr();
        O();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        nr();
        J2();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        nr();
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        t(getContext());
        this.f2771O.az();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        t(getContext());
        this.f2771O.az();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i2) {
        t(getContext());
        this.f2771O.az();
        super.setImageResource(i2);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        t(getContext());
        this.f2771O.az();
        super.setImageURI(uri);
    }

    @Override // android.view.View
    public String toString() {
        String string;
        Dsr.j jVarRl = Dsr.rl(this);
        n nVar = this.f2771O;
        if (nVar != null) {
            string = nVar.toString();
        } else {
            string = "<no holder set>";
        }
        return jVarRl.rl("holder", string).toString();
    }
}
