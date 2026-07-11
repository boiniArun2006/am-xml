package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class dT extends View {
    private final Rect J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Paint f47391O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f47392n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f47393t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f47390r = new j(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f47389o = 8;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final int f47386S = Color.parseColor("#1F2238");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f47388g = Color.parseColor("#6F749E");
    private static final int E2 = Color.parseColor("#FFCD4B");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f47387e = Color.parseColor("#EF7937");

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final int n() {
            return dT.f47386S;
        }

        public final int nr() {
            return dT.f47387e;
        }

        public final int rl() {
            return dT.E2;
        }

        public final int t() {
            return dT.f47388g;
        }
    }

    public abstract void J2(Canvas canvas);

    public abstract void O(Canvas canvas);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dT(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        float f3 = getResources().getDisplayMetrics().density;
        this.f47393t = f3;
        Paint paint = new Paint(1);
        paint.setTextSize(f3 * 12.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setTypeface(ResourcesCompat.KN(context, 2131296270));
        this.f47391O = paint;
        this.J2 = new Rect();
    }

    protected final float getCornerRadius() {
        return this.f47393t * 4.0f;
    }

    protected final float getDensity() {
        return this.f47393t;
    }

    public final boolean getDragging() {
        return this.f47392n;
    }

    protected final Paint getPaint() {
        return this.f47391O;
    }

    protected final Rect getTextRect() {
        return this.J2;
    }

    protected final float getTimeTextHorizontalPadding() {
        return this.f47393t * 4.0f;
    }

    protected final float getTimeTextOffsetMax() {
        return this.f47393t * 36.0f;
    }

    protected final float getTimeTextOffsetMin() {
        return this.f47393t * 20.0f;
    }

    protected final float getTotalHeight() {
        return this.f47393t * 32.0f;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        O(canvas);
        J2(canvas);
    }

    public final void setDragging(boolean z2) {
        if (this.f47392n != z2) {
            this.f47392n = z2;
            invalidate();
        }
    }
}
