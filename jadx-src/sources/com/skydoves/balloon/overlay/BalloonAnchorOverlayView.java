package com.skydoves.balloon.overlay;

import YQ.j;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import hoF.n;
import hoF.w6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R(\u0010<\u001a\u0004\u0018\u00010\u00012\b\u00107\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R&\u0010@\u001a\u00020\u00062\b\b\u0001\u00107\u001a\u00020\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u000e\"\u0004\b>\u0010?R&\u0010E\u001a\u00020 2\b\b\u0001\u00107\u001a\u00020 8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010J\u001a\u0004\u0018\u00010$2\b\u00107\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010O\u001a\u00020(2\u0006\u00107\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", c.f62177j, "()V", "getStatusBarHeight", "()I", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "onLayout", "(ZIIII)V", "Landroid/view/View;", "_anchorView", "t", "I", "_overlayColor", "", "O", "F", "_overlayPadding", "Landroid/graphics/Point;", "J2", "Landroid/graphics/Point;", "_overlayPosition", "LhoF/w6;", "r", "LhoF/w6;", "_balloonOverlayShape", "Landroid/graphics/Bitmap;", "o", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Paint;", "S", "Landroid/graphics/Paint;", "paint", "g", "Z", "invalidated", "value", "getAnchorView", "()Landroid/view/View;", "setAnchorView", "(Landroid/view/View;)V", "anchorView", "getOverlayColor", "setOverlayColor", "(I)V", "overlayColor", "getOverlayPadding", "()F", "setOverlayPadding", "(F)V", "overlayPadding", "getOverlayPosition", "()Landroid/graphics/Point;", "setOverlayPosition", "(Landroid/graphics/Point;)V", "overlayPosition", "getBalloonOverlayShape", "()LhoF/w6;", "setBalloonOverlayShape", "(LhoF/w6;)V", "balloonOverlayShape", "balloon_release"}, k = 1, mv = {1, 4, 1})
public final class BalloonAnchorOverlayView extends View {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Point _overlayPosition;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private float _overlayPadding;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean invalidated;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private View _anchorView;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Bitmap bitmap;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private w6 _balloonOverlayShape;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int _overlayColor;

    @JvmOverloads
    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    private final int getStatusBarHeight() {
        Rect rect = new Rect();
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return 0;
        }
        Window window = ((Activity) context).getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "context.window");
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Bitmap bitmap;
        if (this.invalidated || (bitmap = this.bitmap) == null || (bitmap != null && bitmap.isRecycled())) {
            n();
        }
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 == null || bitmap2.isRecycled() || canvas == null) {
            return;
        }
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
    }

    /* JADX INFO: renamed from: getAnchorView, reason: from getter */
    public final View get_anchorView() {
        return this._anchorView;
    }

    /* JADX INFO: renamed from: getBalloonOverlayShape, reason: from getter */
    public final w6 get_balloonOverlayShape() {
        return this._balloonOverlayShape;
    }

    @ColorInt
    /* JADX INFO: renamed from: getOverlayColor, reason: from getter */
    public final int get_overlayColor() {
        return this._overlayColor;
    }

    @Px
    /* JADX INFO: renamed from: getOverlayPadding, reason: from getter */
    public final float get_overlayPadding() {
        return this._overlayPadding;
    }

    /* JADX INFO: renamed from: getOverlayPosition, reason: from getter */
    public final Point get_overlayPosition() {
        return this._overlayPosition;
    }

    public final void setAnchorView(View view) {
        this._anchorView = view;
        invalidate();
    }

    public final void setBalloonOverlayShape(w6 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._balloonOverlayShape = value;
        invalidate();
    }

    public final void setOverlayColor(@ColorInt int i2) {
        this._overlayColor = i2;
        invalidate();
    }

    public final void setOverlayPosition(Point point) {
        this._overlayPosition = point;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this._balloonOverlayShape = n.f67983n;
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
    }

    private final void n() {
        RectF rectF;
        if (getWidth() != 0 && getHeight() != 0) {
            View view = get_anchorView();
            if (view == null || view.getWidth() != 0) {
                View view2 = get_anchorView();
                if (view2 == null || view2.getHeight() != 0) {
                    Bitmap bitmap = this.bitmap;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    this.bitmap = bitmapCreateBitmap;
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = this.paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                    paint.setColor(get_overlayColor());
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.paint);
                    Paint paint2 = this.paint;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    paint2.setColor(0);
                    View view3 = get_anchorView();
                    if (view3 != null) {
                        view3.getGlobalVisibleRect(new Rect());
                        if (get_overlayPosition() != null) {
                            rectF = new RectF(r4.x - get_overlayPadding(), (r4.y - get_overlayPadding()) + getStatusBarHeight(), r4.x + view3.getWidth() + get_overlayPadding(), r4.y + view3.getHeight() + get_overlayPadding() + getStatusBarHeight());
                        } else {
                            rectF = new RectF(r3.left - get_overlayPadding(), r3.top - get_overlayPadding(), r3.right + get_overlayPadding(), r3.bottom + get_overlayPadding());
                        }
                        if (get_balloonOverlayShape() instanceof n) {
                            canvas.drawOval(rectF, this.paint);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    this.invalidated = false;
                }
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.invalidated = true;
    }

    public final void setOverlayPadding(float f3) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this._overlayPadding = j.t(context, f3);
        invalidate();
    }
}
