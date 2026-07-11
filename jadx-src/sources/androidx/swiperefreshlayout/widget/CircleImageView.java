package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Animation.AnimationListener f42072n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f42073t;

    private class OvalShadow extends OvalShape {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private RadialGradient f42075n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Paint f42076t = new Paint();

        OvalShadow(int i2) {
            CircleImageView.this.f42073t = i2;
            n((int) rect().width());
        }

        private void n(int i2) {
            float f3 = i2 / 2;
            RadialGradient radialGradient = new RadialGradient(f3, f3, CircleImageView.this.f42073t, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f42075n = radialGradient;
            this.f42076t.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = CircleImageView.this.getWidth() / 2;
            float height = CircleImageView.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f42076t);
            canvas.drawCircle(width, height, r0 - CircleImageView.this.f42073t, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f3, float f4) {
            super.onResize(f3, f4);
            n((int) f3);
        }
    }

    private boolean n() {
        return true;
    }

    public void rl(Animation.AnimationListener animationListener) {
        this.f42072n = animationListener;
    }

    CircleImageView(Context context, int i2) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f3 = getContext().getResources().getDisplayMetrics().density;
        int i3 = (int) (1.75f * f3);
        int i5 = (int) (0.0f * f3);
        this.f42073t = (int) (3.5f * f3);
        if (n()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.fcU(this, f3 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShadow(this.f42073t));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f42073t, i5, i3, 503316480);
            int i7 = this.f42073t;
            setPadding(i7, i7, i7, i7);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i2);
        ViewCompat.C(this, shapeDrawable);
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f42072n;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f42072n;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!n()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f42073t * 2), getMeasuredHeight() + (this.f42073t * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i2);
        }
    }
}
