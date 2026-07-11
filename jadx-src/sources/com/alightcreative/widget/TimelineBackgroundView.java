package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.caoccao.javet.exceptions.JavetError;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR+\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010*\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00100R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/alightcreative/widget/TimelineBackgroundView;", "LyU/vd;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "w", CmcdData.STREAMING_FORMAT_HLS, "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "currentTime", "startTime", "endTime", "framesPerHundredSeconds", "pixelsPerSecond", "rl", "(IIIII)V", "Lyc/M;", "<set-?>", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Lkotlin/properties/ReadWriteProperty;", "getColors", "()Lyc/M;", "setColors", "(Lyc/M;)V", "colors", "t", "getTagColors", "setTagColors", "tagColors", "Landroid/graphics/Paint;", "O", "Landroid/graphics/Paint;", "paint", "J2", "I", "r", "o", "fphs", "S", "Landroid/graphics/Path;", "g", "Landroid/graphics/Path;", JavetError.PARAMETER_PATH, "Landroid/graphics/Shader;", "E2", "Landroid/graphics/Shader;", "shaderCache", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimelineBackgroundView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineBackgroundView.kt\ncom/alightcreative/widget/TimelineBackgroundView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,96:1\n33#2,3:97\n33#2,3:100\n*S KotlinDebug\n*F\n+ 1 TimelineBackgroundView.kt\ncom/alightcreative/widget/TimelineBackgroundView\n*L\n24#1:97,3\n25#1:100,3\n*E\n"})
public final class TimelineBackgroundView extends View implements yU.vd {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private Shader shaderCache;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int startTime;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int pixelsPerSecond;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Path path;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty colors;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int fphs;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int endTime;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty tagColors;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f47273e = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(TimelineBackgroundView.class, "colors", "getColors()Lcom/alightcreative/app/motion/activities/edit/ColorRange;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TimelineBackgroundView.class, "tagColors", "getTagColors()Lcom/alightcreative/app/motion/activities/edit/ColorRange;", 0))};

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f47272T = 8;

    public static final class j extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TimelineBackgroundView f47281n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, TimelineBackgroundView timelineBackgroundView) {
            super(obj);
            this.f47281n = timelineBackgroundView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f47281n.shaderCache = null;
            this.f47281n.invalidate();
        }
    }

    public static final class n extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TimelineBackgroundView f47282n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, TimelineBackgroundView timelineBackgroundView) {
            super(obj);
            this.f47282n = timelineBackgroundView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f47282n.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineBackgroundView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Delegates delegates = Delegates.INSTANCE;
        SolidColor.Companion companion = SolidColor.INSTANCE;
        this.colors = new j(new yc.M(companion.getBLUE(), companion.getLIGHT_GRAY()), this);
        this.tagColors = new n(new yc.M(companion.getTRANSPARENT(), companion.getTRANSPARENT()), this);
        this.paint = new Paint(1);
        this.path = new Path();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        this.shaderCache = null;
        super.onSizeChanged(w2, h2, oldw, oldh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nr(TimelineBackgroundView timelineBackgroundView) {
        return "TBVIEW: " + timelineBackgroundView.startTime + " " + timelineBackgroundView.endTime + " " + timelineBackgroundView.pixelsPerSecond + " " + timelineBackgroundView.fphs;
    }

    public final yc.M getColors() {
        return (yc.M) this.colors.getValue(this, f47273e[0]);
    }

    public final yc.M getTagColors() {
        return (yc.M) this.tagColors.getValue(this, f47273e[1]);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Shader linearGradient = this.shaderCache;
        if (linearGradient == null) {
            linearGradient = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, ColorKt.toInt(getColors().rl()), ColorKt.toInt(getColors().n()), Shader.TileMode.CLAMP);
        }
        this.shaderCache = linearGradient;
        this.paint.setColor(-1);
        this.paint.setShader(linearGradient);
        canvas.drawPaint(this.paint);
        this.paint.setShader(null);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(-1);
        this.paint.setAlpha(16);
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.ozJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineBackgroundView.nr(this.f47463n);
            }
        });
        int i3 = this.endTime;
        int i5 = this.startTime;
        if (i3 > i5 && this.pixelsPerSecond > 0 && (i2 = this.fphs) > 0) {
            double d2 = 100000.0d / ((double) i2);
            double width = ((d2 / ((double) 2)) / ((double) (i3 - i5))) * ((double) getWidth());
            double d4 = d2;
            while (width > 0.0d && width < 10.0d) {
                d4 *= 2.0d;
                width *= 2.0d;
            }
            double d5 = this.startTime;
            while (true) {
                int i7 = this.endTime;
                if (d5 >= i7) {
                    break;
                }
                int i8 = this.startTime;
                double width2 = ((d5 - ((double) i8)) / ((double) (i7 - i8))) * ((double) getWidth());
                canvas.drawRect((float) width2, 0.0f, (float) (width2 + width), getHeight(), this.paint);
                d5 += d4;
            }
        }
        if (getTagColors().rl().getA() > 0.0f || getTagColors().n().getA() > 0.0f) {
            float height = getHeight() / 2.0f;
            this.paint.setColor(ColorKt.toInt(getTagColors().rl()));
            this.path.rewind();
            this.path.moveTo(0.0f, height);
            this.path.lineTo(0.0f, 0.0f);
            this.path.lineTo(height, 0.0f);
            this.path.close();
            canvas.drawPath(this.path, this.paint);
        }
    }

    @Override // yU.vd
    public void rl(int currentTime, int startTime, int endTime, int framesPerHundredSeconds, int pixelsPerSecond) {
        if (this.startTime == startTime && this.endTime == endTime && this.fphs == framesPerHundredSeconds && this.pixelsPerSecond == pixelsPerSecond) {
            return;
        }
        this.startTime = startTime;
        this.endTime = endTime;
        this.fphs = framesPerHundredSeconds;
        this.pixelsPerSecond = pixelsPerSecond;
        invalidate();
    }

    public final void setColors(yc.M m2) {
        Intrinsics.checkNotNullParameter(m2, "<set-?>");
        this.colors.setValue(this, f47273e[0], m2);
    }

    public final void setTagColors(yc.M m2) {
        Intrinsics.checkNotNullParameter(m2, "<set-?>");
        this.tagColors.setValue(this, f47273e[1], m2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimelineBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
