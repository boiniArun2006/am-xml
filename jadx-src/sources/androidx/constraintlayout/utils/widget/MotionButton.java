package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class MotionButton extends AppCompatButton {
    private float J2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    ViewOutlineProvider f35843S;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    RectF f35844g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Path f35845o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35846r;

    public float getRound() {
        return this.f35846r;
    }

    public float getRoundPercent() {
        return this.J2;
    }

    @RequiresApi
    public void setRoundPercent(float f3) {
        boolean z2 = this.J2 != f3;
        this.J2 = f3;
        if (f3 != 0.0f) {
            if (this.f35845o == null) {
                this.f35845o = new Path();
            }
            if (this.f35844g == null) {
                this.f35844g = new RectF();
            }
            if (this.f35843S == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionButton.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), (Math.min(r3, r4) * MotionButton.this.J2) / 2.0f);
                    }
                };
                this.f35843S = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.J2) / 2.0f;
            this.f35844g.set(0.0f, 0.0f, width, height);
            this.f35845o.reset();
            this.f35845o.addRoundRect(this.f35844g, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @RequiresApi
    public void setRound(float f3) {
        boolean z2;
        if (Float.isNaN(f3)) {
            this.f35846r = f3;
            float f4 = this.J2;
            this.J2 = -1.0f;
            setRoundPercent(f4);
            return;
        }
        if (this.f35846r != f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f35846r = f3;
        if (f3 != 0.0f) {
            if (this.f35845o == null) {
                this.f35845o = new Path();
            }
            if (this.f35844g == null) {
                this.f35844g = new RectF();
            }
            if (this.f35843S == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionButton.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f35846r);
                    }
                };
                this.f35843S = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.f35844g.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f35845o.reset();
            Path path = this.f35845o;
            RectF rectF = this.f35844g;
            float f5 = this.f35846r;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }
}
