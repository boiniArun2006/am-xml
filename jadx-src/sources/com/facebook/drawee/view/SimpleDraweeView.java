package com.facebook.drawee.view;

import FbN.Ml;
import Hh.C;
import Hh.qz;
import SY6.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.DrawableRes;
import com.facebook.imagepipeline.request.j;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import vn.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Deprecated
public class SimpleDraweeView extends Ml {
    private static qz E2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private n f52393g;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.facebook.drawee", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // FbN.w6, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setActualImageResource(@DrawableRes int i2) {
        mUb(i2, null);
    }

    @Override // FbN.w6, android.widget.ImageView
    public void setImageURI(Uri uri) {
        gh(uri, null);
    }

    public static void xMQ(qz qzVar) {
        E2 = qzVar;
    }

    public n getControllerBuilder() {
        return this.f52393g;
    }

    public void gh(Uri uri, Object obj) {
        setController(this.f52393g.g(obj).rl(uri).n(getController()).build());
    }

    public void qie(String str, Object obj) {
        gh(str != null ? Uri.parse(str) : null, obj);
    }

    public void setImageRequest(j jVar) {
        setController(this.f52393g.te(jVar).n(getController()).build());
    }

    public void setImageURI(String str) {
        qie(str, null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        KN(context, attributeSet);
    }

    private void KN(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            if (T5.n.nr()) {
                T5.n.n("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                C.KN(E2, "SimpleDraweeView was not initialized!");
                this.f52393g = (n) E2.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.facebook.drawee.j.E2);
                try {
                    int i2 = com.facebook.drawee.j.f52385X;
                    if (typedArrayObtainStyledAttributes.hasValue(i2)) {
                        gh(Uri.parse(typedArrayObtainStyledAttributes.getString(i2)), null);
                    } else {
                        int i3 = com.facebook.drawee.j.f52387e;
                        if (typedArrayObtainStyledAttributes.hasValue(i3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i3, -1)) != -1) {
                            if (isInEditMode()) {
                                setImageResource(resourceId);
                            } else {
                                setActualImageResource(resourceId);
                            }
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
            if (T5.n.nr()) {
                T5.n.rl();
            }
        } catch (Throwable th2) {
            if (T5.n.nr()) {
                T5.n.rl();
            }
            throw th2;
        }
    }

    public void mUb(int i2, Object obj) {
        gh(I28.Uo(i2), obj);
    }

    @Override // FbN.w6, android.widget.ImageView
    public void setImageResource(int i2) {
        super.setImageResource(i2);
    }
}
