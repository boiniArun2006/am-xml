package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f36011O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36012n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f36013t;

    public View getContent() {
        return this.f36013t;
    }

    public int getEmptyVisibility() {
        return this.f36011O;
    }

    public void n(ConstraintLayout constraintLayout) {
        if (this.f36013t == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f36013t.getLayoutParams();
        layoutParams2.eWT.nO(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourIF = layoutParams.eWT.iF();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviourIF != dimensionBehaviour) {
            layoutParams.eWT.vl(layoutParams2.eWT.J());
        }
        if (layoutParams.eWT.M() != dimensionBehaviour) {
            layoutParams.eWT.a63(layoutParams2.eWT.nY());
        }
        layoutParams2.eWT.nO(8);
    }

    public void rl(ConstraintLayout constraintLayout) {
        if (this.f36012n == -1 && !isInEditMode()) {
            setVisibility(this.f36011O);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f36012n);
        this.f36013t = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.LayoutParams) viewFindViewById.getLayoutParams()).f35948z = true;
            this.f36013t.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int i2) {
        View viewFindViewById;
        if (this.f36012n == i2) {
            return;
        }
        View view = this.f36013t;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f36013t.getLayoutParams()).f35948z = false;
            this.f36013t = null;
        }
        this.f36012n = i2;
        if (i2 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.f36011O = i2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            Paint paint = new Paint();
            paint.setARGB(255, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }
}
