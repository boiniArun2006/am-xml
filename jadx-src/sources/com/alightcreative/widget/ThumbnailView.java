package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.ImageCacheKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.internal.SafeDKWebAppInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J7\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR+\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010)\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R/\u00100\u001a\u0004\u0018\u00010*2\b\u0010\u001f\u001a\u0004\u0018\u00010*8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010 \u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R/\u00104\u001a\u0004\u0018\u00010*2\b\u0010\u001f\u001a\u0004\u0018\u00010*8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010 \u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R+\u00109\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010 \u001a\u0004\b6\u00107\"\u0004\b8\u0010\u001dR\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\u0016\u0010R\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010MR\u0016\u0010U\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010M¨\u0006W"}, d2 = {"Lcom/alightcreative/widget/ThumbnailView;", "LyU/vd;", "LyU/u;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "WPU", "(Landroid/graphics/Canvas;)V", "onDraw", "currentTime", "startTime", "endTime", "framesPerHundredSeconds", "pixelsPerSecond", "rl", "(IIIII)V", "", SafeDKWebAppInterface.f62917c, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Z)V", "", "<set-?>", "Lkotlin/properties/ReadWriteProperty;", "getInTime", "()J", "setInTime", "(J)V", "inTime", "t", "getOutTime", "setOutTime", "outTime", "Landroid/net/Uri;", "O", "getVideoUri", "()Landroid/net/Uri;", "setVideoUri", "(Landroid/net/Uri;)V", "videoUri", "J2", "getImageUri", "setImageUri", "imageUri", "r", "getAllowLoadThumbs", "()Z", "setAllowLoadThumbs", "allowLoadThumbs", "Landroid/graphics/Bitmap;", "o", "Landroid/graphics/Bitmap;", "imgThumb", "S", "firstThumb", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/RectF;", "E2", "Landroid/graphics/RectF;", "dstRect", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "visibleRect", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "I", "firstThumbVisible", "N", "lastThumbVisible", "v", "thumbWidth", "Xw", "Z", "pendingInvalidate", "jB", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThumbnailView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbnailView.kt\ncom/alightcreative/widget/ThumbnailView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,195:1\n33#2,3:196\n33#2,3:199\n33#2,3:202\n33#2,3:205\n33#2,3:208\n*S KotlinDebug\n*F\n+ 1 ThumbnailView.kt\ncom/alightcreative/widget/ThumbnailView\n*L\n30#1:196,3\n31#1:199,3\n32#1:202,3\n36#1:205,3\n37#1:208,3\n*E\n"})
public final class ThumbnailView extends View implements yU.vd, yU.u {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final RectF dstRect;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final ReadWriteProperty imageUri;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private int lastThumbVisible;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty videoUri;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Bitmap firstThumb;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private int firstThumbVisible;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean pendingInvalidate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Rect visibleRect;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private int pixelsPerSecond;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty inTime;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Bitmap imgThumb;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty allowLoadThumbs;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty outTime;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int thumbWidth;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f47255U = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ThumbnailView.class, "inTime", "getInTime()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ThumbnailView.class, "outTime", "getOutTime()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ThumbnailView.class, "videoUri", "getVideoUri()Landroid/net/Uri;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ThumbnailView.class, "imageUri", "getImageUri()Landroid/net/Uri;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ThumbnailView.class, "allowLoadThumbs", "getAllowLoadThumbs()Z", 0))};
    public static final int P5 = 8;

    public static final class I28 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ThumbnailView f47267n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Object obj, ThumbnailView thumbnailView) {
            super(obj);
            this.f47267n = thumbnailView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            if (zBooleanValue && !zBooleanValue2 && this.f47267n.pendingInvalidate) {
                this.f47267n.pendingInvalidate = false;
                this.f47267n.invalidate();
            }
        }
    }

    public static final class Ml extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ThumbnailView f47268n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Object obj, ThumbnailView thumbnailView) {
            super(obj);
            this.f47268n = thumbnailView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f47268n.imgThumb = null;
            this.f47268n.invalidate();
        }
    }

    public static final class j extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ThumbnailView f47269n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, ThumbnailView thumbnailView) {
            super(obj);
            this.f47269n = thumbnailView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).longValue();
            ((Number) obj).longValue();
            this.f47269n.invalidate();
        }
    }

    public static final class n extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ThumbnailView f47270n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, ThumbnailView thumbnailView) {
            super(obj);
            this.f47270n = thumbnailView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).longValue();
            ((Number) obj).longValue();
            this.f47270n.invalidate();
        }
    }

    public static final class w6 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ThumbnailView f47271n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Object obj, ThumbnailView thumbnailView) {
            super(obj);
            this.f47271n = thumbnailView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f47271n.firstThumb = null;
            this.f47271n.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbnailView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Delegates delegates = Delegates.INSTANCE;
        this.inTime = new j(0L, this);
        this.outTime = new n(0L, this);
        this.videoUri = new w6(null, this);
        this.imageUri = new Ml(null, this);
        this.allowLoadThumbs = new I28(Boolean.TRUE, this);
        this.paint = new Paint(2);
        this.dstRect = new RectF();
        this.visibleRect = new Rect();
        this.firstThumbVisible = -1;
        this.lastThumbVisible = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HI() {
        return "onDraw: getFirstThumbnail";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Ik() {
        return "onDraw: getFirstThumbnail RESULT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String S() {
        return "onDraw: getThumbnail RESULT -> DISPATCH";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XQ() {
        return "onDraw: getThumbnail RESULT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(ThumbnailView thumbnailView, Uri uri, Bitmap bitmap) {
        XoT.C.Uo(thumbnailView, new Function0() { // from class: com.alightcreative.widget.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThumbnailView.XQ();
            }
        });
        if (Intrinsics.areEqual(uri, thumbnailView.getVideoUri()) && bitmap != null) {
            XoT.C.Uo(thumbnailView, new Function0() { // from class: com.alightcreative.widget.IG
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThumbnailView.S();
                }
            });
            thumbnailView.postInvalidateOnAnimation();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(ThumbnailView thumbnailView, Uri uri, Bitmap bitmap) {
        XoT.C.Uo(thumbnailView, new Function0() { // from class: com.alightcreative.widget.FPL
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThumbnailView.Ik();
            }
        });
        if (Intrinsics.areEqual(uri, thumbnailView.getVideoUri()) && thumbnailView.firstThumb == null && bitmap != null) {
            XoT.C.Uo(thumbnailView, new Function0() { // from class: com.alightcreative.widget.Y5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThumbnailView.r();
                }
            });
            thumbnailView.firstThumb = bitmap;
            thumbnailView.invalidate();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o() {
        return "onDraw: OUT (GFS)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r() {
        return "onDraw: getFirstThumbnail RESULT -> DISPATCH";
    }

    public final boolean getAllowLoadThumbs() {
        return ((Boolean) this.allowLoadThumbs.getValue(this, f47255U[4])).booleanValue();
    }

    public final Uri getImageUri() {
        return (Uri) this.imageUri.getValue(this, f47255U[3]);
    }

    public final long getInTime() {
        return ((Number) this.inTime.getValue(this, f47255U[0])).longValue();
    }

    public final long getOutTime() {
        return ((Number) this.outTime.getValue(this, f47255U[1])).longValue();
    }

    public final Uri getVideoUri() {
        return (Uri) this.videoUri.getValue(this, f47255U[2]);
    }

    @Override // yU.u
    public void n(boolean playing) {
        setAllowLoadThumbs(!playing);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        int i3;
        Rect rect;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i5 = 0;
        this.pendingInvalidate = false;
        if (getImageUri() != null) {
            WPU(canvas);
            return;
        }
        getLocalVisibleRect(this.visibleRect);
        final Uri videoUri = getVideoUri();
        if (videoUri == null) {
            return;
        }
        if (this.firstThumb == null) {
            this.firstThumb = aO.Pl.r(nSC.f47454n, videoUri, 0, false, false, 12, null);
        }
        Bitmap bitmap = this.firstThumb;
        if (bitmap == null) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.Pmq
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThumbnailView.HI();
                }
            });
            aO.Pl.ty(nSC.f47454n, videoUri, 0, false, false, false, new Function1() { // from class: com.alightcreative.widget.mrQ
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ThumbnailView.ck(this.f47432n, videoUri, (Bitmap) obj);
                }
            }, 28, null);
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThumbnailView.o();
                }
            });
            return;
        }
        int iMax = Math.max(1, (bitmap.getWidth() * getHeight()) / bitmap.getHeight());
        this.thumbWidth = iMax;
        if (iMax < 5) {
            return;
        }
        long j2 = 1000;
        int inTime = (int) ((getInTime() * ((long) this.pixelsPerSecond)) / j2);
        int outTime = (int) ((getOutTime() * ((long) this.pixelsPerSecond)) / j2);
        int i7 = this.thumbWidth;
        int i8 = inTime - (inTime % i7);
        if (i7 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i7 + ".");
        }
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(i8, outTime, i7);
        if (i8 <= progressionLastElement) {
            int i9 = i8;
            while (true) {
                int i10 = i9 - inTime;
                int i11 = this.thumbWidth + i10;
                this.dstRect.set(i10, 0.0f, i11, getHeight());
                int iCoerceAtLeast = RangesKt.coerceAtLeast((int) ((((long) i9) * 1000) / ((long) this.pixelsPerSecond)), i5);
                Bitmap bitmapR = aO.Pl.r(nSC.f47454n, videoUri, iCoerceAtLeast, false, false, 12, null);
                if (bitmapR == null) {
                    Rect rect2 = this.visibleRect;
                    if (i11 < rect2.left || i10 > rect2.right) {
                        i2 = i9;
                        i3 = inTime;
                        rect = null;
                    } else {
                        i2 = i9;
                        i3 = inTime;
                        rect = null;
                        aO.Pl.ty(nSC.f47454n, videoUri, iCoerceAtLeast, false, false, false, new Function1() { // from class: com.alightcreative.widget.Pp
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ThumbnailView.Z(this.f47199n, videoUri, (Bitmap) obj);
                            }
                        }, 28, null);
                    }
                    if (iCoerceAtLeast >= 0) {
                        canvas.drawBitmap(bitmap, rect, this.dstRect, this.paint);
                    }
                } else {
                    i2 = i9;
                    i3 = inTime;
                    canvas.drawBitmap(bitmapR, (Rect) null, this.dstRect, this.paint);
                }
                if (i2 == progressionLastElement) {
                    break;
                }
                i9 = i2 + i7;
                inTime = i3;
                i5 = 0;
            }
        }
        Rect rect3 = this.visibleRect;
        int i12 = rect3.left;
        int i13 = this.thumbWidth;
        this.firstThumbVisible = i12 / i13;
        this.lastThumbVisible = rect3.right / i13;
    }

    @Override // yU.vd
    public void rl(int currentTime, int startTime, int endTime, int framesPerHundredSeconds, int pixelsPerSecond) {
        this.pixelsPerSecond = pixelsPerSecond;
        if (this.thumbWidth < 1) {
            if (getAllowLoadThumbs()) {
                invalidate();
                return;
            } else {
                this.pendingInvalidate = true;
                return;
            }
        }
        getLocalVisibleRect(this.visibleRect);
        Rect rect = this.visibleRect;
        int i2 = rect.left;
        int i3 = this.thumbWidth;
        int i5 = i2 / i3;
        int i7 = rect.right / i3;
        if (i5 == this.firstThumbVisible && i7 == this.lastThumbVisible) {
            return;
        }
        if (getAllowLoadThumbs()) {
            invalidate();
        } else {
            this.pendingInvalidate = true;
        }
    }

    public final void setAllowLoadThumbs(boolean z2) {
        this.allowLoadThumbs.setValue(this, f47255U[4], Boolean.valueOf(z2));
    }

    public final void setImageUri(Uri uri) {
        this.imageUri.setValue(this, f47255U[3], uri);
    }

    public final void setInTime(long j2) {
        this.inTime.setValue(this, f47255U[0], Long.valueOf(j2));
    }

    public final void setOutTime(long j2) {
        this.outTime.setValue(this, f47255U[1], Long.valueOf(j2));
    }

    public final void setVideoUri(Uri uri) {
        this.videoUri.setValue(this, f47255U[2], uri);
    }

    private final void WPU(Canvas canvas) {
        Uri imageUri = getImageUri();
        if (imageUri != null) {
            if (this.imgThumb == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.imgThumb = ImageCacheKt.loadImageThumbFromUri(new HI0.Q(context), imageUri);
            }
            Bitmap bitmap = this.imgThumb;
            if (bitmap != null) {
                int iMax = Math.max(1, (bitmap.getWidth() * getHeight()) / bitmap.getHeight());
                this.thumbWidth = iMax;
                if (iMax < 5) {
                    return;
                }
                long j2 = 1000;
                int inTime = (int) ((getInTime() * ((long) this.pixelsPerSecond)) / j2);
                int outTime = (int) ((getOutTime() * ((long) this.pixelsPerSecond)) / j2);
                int i2 = this.thumbWidth;
                int i3 = inTime - (inTime % i2);
                if (i2 > 0) {
                    int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(i3, outTime, i2);
                    if (i3 <= progressionLastElement) {
                        while (true) {
                            this.dstRect.set(i3 - inTime, 0.0f, this.thumbWidth + r5, getHeight());
                            if (((int) ((((long) i3) * 1000) / ((long) this.pixelsPerSecond))) >= 0) {
                                canvas.drawBitmap(bitmap, (Rect) null, this.dstRect, this.paint);
                            }
                            if (i3 == progressionLastElement) {
                                break;
                            } else {
                                i3 += i2;
                            }
                        }
                    }
                    Rect rect = this.visibleRect;
                    int i5 = rect.left;
                    int i7 = this.thumbWidth;
                    this.firstThumbVisible = i5 / i7;
                    this.lastThumbVisible = rect.right / i7;
                    canvas.drawColor(1442840575);
                    return;
                }
                throw new IllegalArgumentException("Step must be positive, was: " + i2 + ".");
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
