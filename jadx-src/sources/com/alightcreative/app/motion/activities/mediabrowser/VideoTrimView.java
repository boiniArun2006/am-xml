package com.alightcreative.app.motion.activities.mediabrowser;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0017¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0017\u0010.\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010-R\u0017\u00103\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0017\u00106\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010-R\u0014\u00108\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010)R\u0014\u0010:\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010)R\u001c\u0010?\u001a\n <*\u0004\u0018\u00010;0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010A\u001a\n <*\u0004\u0018\u00010;0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010C\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010)R\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010)R\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010)R\u0016\u0010I\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010)R\u0016\u0010K\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010)R\u0016\u0010M\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010)R\u0016\u0010O\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010)R\u0016\u0010Q\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010)R\u0016\u0010\u0017\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010SR\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010SR\u0016\u0010W\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010SR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010ZR\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010`R(\u0010j\u001a\b\u0012\u0004\u0012\u00020\b0d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR.\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR4\u0010z\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0s8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR(\u0010}\u001a\b\u0012\u0004\u0012\u00020\b0d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010e\u001a\u0004\b{\u0010g\"\u0004\b|\u0010iR\u0016\u0010\u0081\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008d\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008d\u0001¨\u0006\u0093\u0001"}, d2 = {"Lcom/alightcreative/app/motion/activities/mediabrowser/VideoTrimView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "O", "(Landroid/content/Context;)V", "", "time", "", "gh", "(J)I", "x", "ty", "(I)J", "thumbW", "thumbH", "az", "(II)V", "duration", "startTrim", "endTrim", "mUb", "(JJJ)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", a.f62811a, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "currentTime", "qie", "(J)V", c.f62177j, "I", "touchSlop", "t", "getRadius", "()I", "radius", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint", "J2", "getBorderWidth", "borderWidth", "r", "borderColor", "o", "thumbDimColor", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "S", "Landroid/graphics/drawable/Drawable;", "leftGrip", "g", "rightGrip", "E2", "seekWidth", "e", "mediaStartX", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "mediaMinStartX", "N", "mediaEndX", "v", "mediaMaxEndX", "Xw", "gripWidth", "jB", "seekTimeX", "U", "minDurationWidth", "P5", "J", "M7", "p5", "eF", "currentSeekTime", "Landroid/graphics/RectF;", "E", "Landroid/graphics/RectF;", "leftGripRect", "M", "rightGripRect", "", "FX", "[F", "leftCorners", "B", "rightCorners", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getOnBeginTouch", "()Lkotlin/jvm/functions/Function0;", "setOnBeginTouch", "(Lkotlin/jvm/functions/Function0;)V", "onBeginTouch", "Lkotlin/Function1;", "D", "Lkotlin/jvm/functions/Function1;", "getOnTrimming", "()Lkotlin/jvm/functions/Function1;", "setOnTrimming", "(Lkotlin/jvm/functions/Function1;)V", "onTrimming", "Lkotlin/Function2;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/jvm/functions/Function2;", "getOnStopTouch", "()Lkotlin/jvm/functions/Function2;", "setOnStopTouch", "(Lkotlin/jvm/functions/Function2;)V", "onStopTouch", "getOnDonePlay", "setOnDonePlay", "onDonePlay", "Landroid/graphics/Path;", "GR", "Landroid/graphics/Path;", JavetError.PARAMETER_PATH, "Landroid/graphics/Rect;", "Nxk", "Landroid/graphics/Rect;", "thumbnailViewRect", "", "k", "F", "downX", "dR0", "oldX", "z", "Z", "canTrimStart", "piY", "canTrimEnd", "ijL", "isTrimming", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoTrimView extends View {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final float[] rightCorners;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Function1 onTrimming;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private RectF leftGripRect;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final int seekWidth;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private final float[] leftCorners;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private final Path path;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private Function0 onDonePlay;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Function0 onBeginTouch;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int borderWidth;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private RectF rightGripRect;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private long startTrim;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private int mediaEndX;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private Rect thumbnailViewRect;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private long duration;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Drawable leftGrip;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private int mediaMinStartX;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private int minDurationWidth;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private int gripWidth;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Function2 onStopTouch;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private float oldX;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int mediaStartX;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private long currentSeekTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Drawable rightGrip;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private boolean isTrimming;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private int seekTimeX;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float downX;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int touchSlop;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int thumbDimColor;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private long endTrim;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private boolean canTrimEnd;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int borderColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int radius;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int mediaMaxEndX;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean canTrimStart;

    private final int gh(long time) {
        return (int) (((time / this.duration) * ((double) this.thumbnailViewRect.width())) + ((double) this.mediaMinStartX));
    }

    private final long ty(int x2) {
        return (long) ((x2 / this.thumbnailViewRect.width()) * this.duration);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (event == null) {
            return true;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.downX = event.getX();
            this.oldX = event.getX();
            this.isTrimming = false;
            RectF rectF = this.leftGripRect;
            float f3 = rectF.left;
            RectF rectF2 = new RectF(f3, rectF.top, (rectF.width() * 2) + f3, this.leftGripRect.bottom);
            RectF rectF3 = this.rightGripRect;
            float fWidth = rectF3.left - rectF3.width();
            RectF rectF4 = this.rightGripRect;
            RectF rectF5 = new RectF(fWidth, rectF4.top, rectF4.right, rectF4.bottom);
            this.canTrimStart = rectF2.contains(event.getX(), event.getY());
            this.canTrimEnd = rectF5.contains(event.getX(), event.getY());
            this.onBeginTouch.invoke();
        } else if (actionMasked == 1) {
            if (this.canTrimStart || this.canTrimEnd) {
                this.onStopTouch.invoke(Long.valueOf(this.startTrim), Long.valueOf(this.endTrim));
            }
            this.canTrimStart = false;
            this.canTrimEnd = false;
            this.isTrimming = false;
            invalidate();
        } else if (actionMasked == 2) {
            float x2 = event.getX() - this.downX;
            float x3 = event.getX() - this.oldX;
            if (Math.abs(x2) > this.touchSlop) {
                if (this.canTrimStart) {
                    this.isTrimming = true;
                    int i2 = this.mediaStartX;
                    int i3 = (int) x3;
                    if (this.mediaEndX - (i2 + i3) > this.minDurationWidth) {
                        i2 += i3;
                    }
                    this.mediaStartX = i2;
                    int i5 = this.mediaMinStartX;
                    if (i2 < i5) {
                        this.mediaStartX = i5;
                    }
                    int i7 = this.mediaStartX;
                    float f4 = i7 - this.gripWidth;
                    int i8 = this.thumbnailViewRect.top;
                    int i9 = this.borderWidth;
                    this.leftGripRect = new RectF(f4, i8 - i9, i7, r4.bottom + i9);
                    long jWidth = (long) (((this.mediaStartX - this.mediaMinStartX) / this.thumbnailViewRect.width()) * this.duration);
                    this.startTrim = jWidth;
                    qie(jWidth);
                    this.onTrimming.invoke(Long.valueOf(this.startTrim));
                    invalidate();
                } else if (this.canTrimEnd) {
                    this.isTrimming = true;
                    int i10 = this.mediaEndX;
                    int i11 = (int) x3;
                    if ((i10 + i11) - this.mediaStartX > this.minDurationWidth) {
                        i10 += i11;
                    }
                    this.mediaEndX = i10;
                    int i12 = this.mediaMaxEndX;
                    if (i10 > i12) {
                        this.mediaEndX = i12;
                    }
                    int i13 = this.mediaEndX;
                    int i14 = this.thumbnailViewRect.top;
                    int i15 = this.borderWidth;
                    this.rightGripRect = new RectF(i13, i14 - i15, i13 + this.gripWidth, r4.bottom + i15);
                    long j2 = this.duration;
                    long jWidth2 = (long) (((this.thumbnailViewRect.width() - (this.mediaEndX - this.mediaMinStartX)) / this.thumbnailViewRect.width()) * j2);
                    this.endTrim = jWidth2;
                    qie(j2 - jWidth2);
                    this.onTrimming.invoke(Long.valueOf(this.duration - this.endTrim));
                    invalidate();
                } else if (this.mediaStartX < event.getX() && event.getX() < this.mediaEndX) {
                    float x4 = event.getX();
                    int x5 = this.mediaStartX;
                    if (x4 >= x5) {
                        float x6 = event.getX();
                        x5 = this.mediaEndX;
                        if (x6 <= x5) {
                            x5 = (int) event.getX();
                        }
                    }
                    qie(ty(x5 - this.mediaMinStartX));
                    this.onTrimming.invoke(Long.valueOf(this.currentSeekTime));
                    invalidate();
                }
            } else if (this.mediaStartX < event.getX() && event.getX() < this.mediaEndX) {
                float x7 = event.getX();
                int x8 = this.mediaStartX;
                if (x7 >= x8) {
                    float x9 = event.getX();
                    x8 = this.mediaEndX;
                    if (x9 <= x8) {
                        x8 = (int) event.getX();
                    }
                }
                qie(ty(x8 - this.mediaMinStartX));
                this.onTrimming.invoke(Long.valueOf(this.currentSeekTime));
                invalidate();
            }
            this.oldX = event.getX();
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTrimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131166320);
        this.radius = dimensionPixelOffset;
        this.paint = new Paint(1);
        this.borderWidth = getResources().getDimensionPixelOffset(2131165298);
        this.borderColor = getResources().getColor(2131099755, null);
        this.thumbDimColor = getResources().getColor(2131099671, null);
        this.leftGrip = getResources().getDrawable(2131232044, null);
        this.rightGrip = getResources().getDrawable(2131232045, null);
        this.seekWidth = getResources().getDimensionPixelOffset(2131166344);
        this.mediaEndX = getWidth();
        this.mediaMaxEndX = getWidth();
        this.leftGripRect = new RectF();
        this.rightGripRect = new RectF();
        this.leftCorners = new float[]{dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f, 0.0f, 0.0f, dimensionPixelOffset, dimensionPixelOffset};
        this.rightCorners = new float[]{0.0f, 0.0f, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f};
        this.onBeginTouch = new Function0() { // from class: D5a.KH
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoTrimView.J2();
            }
        };
        this.onTrimming = new Function1() { // from class: D5a.Mf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoTrimView.xMQ(((Long) obj).longValue());
            }
        };
        this.onStopTouch = new Function2() { // from class: D5a.o7q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VideoTrimView.KN(((Long) obj).longValue(), ((Long) obj2).longValue());
            }
        };
        this.onDonePlay = new Function0() { // from class: D5a.xZD
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoTrimView.Uo();
            }
        };
        this.path = new Path();
        this.thumbnailViewRect = new Rect();
        O(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(long j2, long j3) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(long j2) {
        return Unit.INSTANCE;
    }

    public final int getBorderWidth() {
        return this.borderWidth;
    }

    public final Function0<Unit> getOnBeginTouch() {
        return this.onBeginTouch;
    }

    public final Function0<Unit> getOnDonePlay() {
        return this.onDonePlay;
    }

    public final Function2<Long, Long, Unit> getOnStopTouch() {
        return this.onStopTouch;
    }

    public final Function1<Long, Unit> getOnTrimming() {
        return this.onTrimming;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    public final int getRadius() {
        return this.radius;
    }

    public final void mUb(long duration, long startTrim, long endTrim) {
        this.duration = duration;
        this.mediaStartX = gh(startTrim);
        this.mediaEndX = gh(duration - endTrim);
        qie(ty(this.mediaStartX - this.mediaMinStartX));
        this.startTrim = startTrim;
        this.endTrim = endTrim;
        int i2 = this.mediaStartX;
        float f3 = i2 - this.gripWidth;
        int i3 = this.thumbnailViewRect.top;
        int i5 = this.borderWidth;
        this.leftGripRect = new RectF(f3, i3 - i5, i2, r9.bottom + i5);
        int i7 = this.mediaEndX;
        int i8 = this.thumbnailViewRect.top;
        int i9 = this.borderWidth;
        this.rightGripRect = new RectF(i7, i8 - i9, i7 + this.gripWidth, r9.bottom + i9);
        this.minDurationWidth = (int) (((duration < 500 ? duration : 500L) / duration) * ((double) this.thumbnailViewRect.width()));
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.paint.reset();
        this.paint.setColor(this.thumbDimColor);
        Rect rect = this.thumbnailViewRect;
        canvas.drawRect(rect.left, rect.top, this.mediaStartX, rect.bottom, this.paint);
        float f3 = this.mediaEndX;
        Rect rect2 = this.thumbnailViewRect;
        canvas.drawRect(f3, rect2.top, rect2.right, rect2.bottom, this.paint);
        this.paint.setColor(this.borderColor);
        canvas.drawRect(this.mediaStartX, r0 - this.borderWidth, this.mediaEndX, this.thumbnailViewRect.top, this.paint);
        canvas.drawRect(this.mediaStartX, this.thumbnailViewRect.bottom, this.mediaEndX, r0 + this.borderWidth, this.paint);
        this.path.reset();
        Path path = this.path;
        RectF rectF = this.leftGripRect;
        float[] fArr = this.leftCorners;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        this.path.close();
        canvas.drawPath(this.path, this.paint);
        Drawable drawable = this.leftGrip;
        RectF rectF2 = this.leftGripRect;
        drawable.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        this.leftGrip.draw(canvas);
        this.path.reset();
        this.path.addRoundRect(this.rightGripRect, this.rightCorners, direction);
        this.path.close();
        canvas.drawPath(this.path, this.paint);
        Drawable drawable2 = this.rightGrip;
        RectF rectF3 = this.rightGripRect;
        drawable2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
        this.rightGrip.draw(canvas);
        if (this.isTrimming) {
            return;
        }
        canvas.save();
        this.paint.setShadowLayer(this.radius / 2.0f, 0.0f, 0.0f, -7829368);
        int i2 = this.seekTimeX;
        int i3 = this.seekWidth;
        float f4 = i2 - (i3 / 2.0f);
        float f5 = i2 + (i3 / 2.0f);
        float height = getHeight();
        int i5 = this.radius;
        canvas.drawRoundRect(f4, 0.0f, f5, height, i5, i5, this.paint);
        canvas.restore();
    }

    public final void qie(long currentTime) {
        this.currentSeekTime = currentTime;
        int iGh = gh(currentTime);
        this.seekTimeX = iGh;
        int i2 = this.mediaEndX;
        if (iGh >= i2) {
            this.seekTimeX = i2;
            this.onDonePlay.invoke();
        }
    }

    public final void setOnBeginTouch(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onBeginTouch = function0;
    }

    public final void setOnDonePlay(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onDonePlay = function0;
    }

    public final void setOnStopTouch(Function2<? super Long, ? super Long, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onStopTouch = function2;
    }

    public final void setOnTrimming(Function1<? super Long, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onTrimming = function1;
    }

    private final void O(Context context) {
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void az(int thumbW, int thumbH) {
        int width = (getWidth() - thumbW) / 2;
        int i2 = thumbW + width;
        int height = (getHeight() - thumbH) / 2;
        this.thumbnailViewRect = new Rect(width, height, i2, thumbH + height);
        this.mediaStartX = width;
        this.mediaMinStartX = width;
        this.mediaEndX = i2;
        this.mediaMaxEndX = i2;
        qie(ty(0));
        this.gripWidth = (getWidth() - this.thumbnailViewRect.width()) / 2;
        int i3 = this.mediaStartX;
        float f3 = i3 - this.gripWidth;
        int i5 = this.thumbnailViewRect.top;
        int i7 = this.borderWidth;
        this.leftGripRect = new RectF(f3, i5 - i7, i3, r1.bottom + i7);
        int i8 = this.mediaEndX;
        int i9 = this.thumbnailViewRect.top;
        int i10 = this.borderWidth;
        this.rightGripRect = new RectF(i8, i9 - i10, i8 + this.gripWidth, r1.bottom + i10);
    }
}
