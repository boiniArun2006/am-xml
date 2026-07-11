package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.CubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.TimeKt;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010 \"\u0004\b-\u0010\"R$\u00105\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010<\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0017\u0010A\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010D\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010@R\"\u0010I\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010>\u001a\u0004\bF\u0010@\"\u0004\bG\u0010HR\"\u0010M\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010>\u001a\u0004\bK\u0010@\"\u0004\bL\u0010HR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010PR\u0014\u0010U\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010PR\u0017\u0010X\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bV\u0010%\u001a\u0004\bW\u0010'R\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lcom/alightcreative/widget/KeyframeView;", "LyU/vd;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "willNotDraw", "()Z", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "currentTime", "startTime", "endTime", "framesPerHundredSeconds", "pixelsPerSecond", "rl", "(IIIII)V", "", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/util/List;", "getAltKeyframeTimes", "()Ljava/util/List;", "setAltKeyframeTimes", "(Ljava/util/List;)V", "altKeyframeTimes", "t", "I", "getKeyablePropertiesSelected", "()I", "setKeyablePropertiesSelected", "(I)V", "keyablePropertiesSelected", "O", "getKeyframeTimes", "setKeyframeTimes", "keyframeTimes", "J2", "Ljava/lang/Float;", "getEditKeyframe", "()Ljava/lang/Float;", "setEditKeyframe", "(Ljava/lang/Float;)V", "editKeyframe", "r", "Ljava/lang/Integer;", "getHighlightIndex", "()Ljava/lang/Integer;", "setHighlightIndex", "(Ljava/lang/Integer;)V", "highlightIndex", "o", "F", "getKeyframeMarkerSize", "()F", "keyframeMarkerSize", "S", "getKeyframeStrokeWidth", "keyframeStrokeWidth", "g", "getTimeScaleFactor", "setTimeScaleFactor", "(F)V", "timeScaleFactor", "E2", "getTimeOffset", "setTimeOffset", "timeOffset", "Landroid/graphics/Paint;", "e", "Landroid/graphics/Paint;", "paint", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "keyframePaint", "N", "keyframeExtraPaint", "v", "getAccentColor", "accentColor", "Lcom/alightcreative/app/motion/scene/CubicBSpline;", "Xw", "Lcom/alightcreative/app/motion/scene/CubicBSpline;", "keyframeCBSpline", "Landroid/graphics/Path;", "jB", "Landroid/graphics/Path;", "keyframePath", "Landroid/graphics/RectF;", "U", "Landroid/graphics/RectF;", "keyframeBounds", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeyframeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyframeView.kt\ncom/alightcreative/widget/KeyframeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n1#2:198\n1863#3,2:199\n1863#3:201\n1782#3,4:202\n1864#3:206\n360#3,7:207\n*S KotlinDebug\n*F\n+ 1 KeyframeView.kt\ncom/alightcreative/widget/KeyframeView\n*L\n53#1:199,2\n73#1:201\n77#1:202,4\n73#1:206\n185#1:207,7\n*E\n"})
public final class KeyframeView extends View implements yU.vd {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private float timeOffset;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Float editKeyframe;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final Paint keyframeExtraPaint;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private List keyframeTimes;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final float keyframeStrokeWidth;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final Paint keyframePaint;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final RectF keyframeBounds;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final CubicBSpline keyframeCBSpline;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float timeScaleFactor;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final Path keyframePath;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private List altKeyframeTimes;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final float keyframeMarkerSize;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Integer highlightIndex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int keyablePropertiesSelected;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final int accentColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyframeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.keyframeTimes = CollectionsKt.emptyList();
        this.keyframeMarkerSize = context.getResources().getDimension(2131165562);
        this.keyframeStrokeWidth = context.getResources().getDimension(2131165563);
        this.timeScaleFactor = 1.0f;
        this.paint = new Paint(1);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(2013265919);
        paint.setAntiAlias(true);
        this.keyframePaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(5.0f);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        this.keyframeExtraPaint = paint2;
        this.accentColor = HI0.afx.J2(context, 2130968731);
        CubicBSpline cubicBSplineN = Y3a.j.n();
        this.keyframeCBSpline = cubicBSplineN;
        Path pathT = CubicBSplineKt.toPath(cubicBSplineN).t();
        this.keyframePath = pathT;
        RectF rectF = new RectF();
        pathT.computeBounds(rectF, true);
        this.keyframeBounds = rectF;
    }

    @Override // yU.vd
    public void rl(int currentTime, int startTime, int endTime, int framesPerHundredSeconds, int pixelsPerSecond) {
        double d2 = endTime - startTime;
        int iFrameNumberFromTime = TimeKt.frameNumberFromTime(currentTime, framesPerHundredSeconds);
        Iterator it = this.keyframeTimes.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (TimeKt.frameNumberFromTime((int) (((double) startTime) + (((double) ((Number) it.next()).floatValue()) * d2)), framesPerHundredSeconds) == iFrameNumberFromTime) {
                break;
            } else {
                i2++;
            }
        }
        Integer numValueOf = i2 < 0 ? null : Integer.valueOf(i2);
        if (Intrinsics.areEqual(this.highlightIndex, numValueOf)) {
            return;
        }
        this.highlightIndex = numValueOf;
        invalidate();
    }

    public final int getAccentColor() {
        return this.accentColor;
    }

    public final List<Float> getAltKeyframeTimes() {
        return this.altKeyframeTimes;
    }

    public final Float getEditKeyframe() {
        return this.editKeyframe;
    }

    public final Integer getHighlightIndex() {
        return this.highlightIndex;
    }

    public final int getKeyablePropertiesSelected() {
        return this.keyablePropertiesSelected;
    }

    public final float getKeyframeMarkerSize() {
        return this.keyframeMarkerSize;
    }

    public final float getKeyframeStrokeWidth() {
        return this.keyframeStrokeWidth;
    }

    public final List<Float> getKeyframeTimes() {
        return this.keyframeTimes;
    }

    public final float getTimeOffset() {
        return this.timeOffset;
    }

    public final float getTimeScaleFactor() {
        return this.timeScaleFactor;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ed  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        boolean z2;
        int i2;
        Set set;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        List list = this.altKeyframeTimes;
        if (list != null && (set = CollectionsKt.toSet(list)) != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                float fFloatValue = ((Number) it.next()).floatValue();
                if (!this.keyframeTimes.contains(Float.valueOf(fFloatValue))) {
                    float width = getWidth() * ((fFloatValue * this.timeScaleFactor) + this.timeOffset);
                    canvas.save();
                    float height = (getHeight() / this.keyframeBounds.height()) * 0.4f;
                    canvas.scale(height, height, width, getHeight() / 2.0f);
                    RectF rectF = this.keyframeBounds;
                    RectF rectF2 = this.keyframeBounds;
                    canvas.translate((width - rectF.left) - (rectF.width() / 2.0f), ((getHeight() / 2.0f) - rectF2.top) - (rectF2.height() / 2.0f));
                    this.paint.setStyle(Paint.Style.FILL);
                    this.paint.setColor(-1);
                    this.paint.setAlpha(160);
                    canvas.drawPath(this.keyframePath, this.paint);
                    this.paint.setStyle(Paint.Style.STROKE);
                    this.paint.setColor(-1);
                    this.paint.setStrokeWidth(this.keyframeStrokeWidth / 2.0f);
                    canvas.drawPath(this.keyframePath, this.paint);
                    canvas.restore();
                }
            }
        }
        Iterator it2 = CollectionsKt.toSet(this.keyframeTimes).iterator();
        while (it2.hasNext()) {
            float fFloatValue2 = ((Number) it2.next()).floatValue();
            Integer num = this.highlightIndex;
            if (num != null) {
                z2 = ((Number) this.keyframeTimes.get(num.intValue())).floatValue() == fFloatValue2;
            }
            float width2 = getWidth() * ((this.timeScaleFactor * fFloatValue2) + this.timeOffset);
            List list2 = this.keyframeTimes;
            if (list2 == null || !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                i2 = 0;
                while (it3.hasNext()) {
                    if (Math.abs(((Number) it3.next()).floatValue() - fFloatValue2) < 1.0E-6d && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            } else {
                i2 = 0;
            }
            int i3 = this.keyablePropertiesSelected;
            boolean z3 = i3 > 1 && i2 < i3;
            boolean z4 = i2 > 1;
            canvas.save();
            float height2 = (getHeight() / this.keyframeBounds.height()) * ((z2 && (z4 || z3)) ? 0.75f : z2 ? 0.85f : 0.65f);
            canvas.scale(height2, height2, width2, getHeight() / 2.0f);
            RectF rectF3 = this.keyframeBounds;
            RectF rectF4 = this.keyframeBounds;
            canvas.translate((width2 - rectF3.left) - (rectF3.width() / 2.0f), ((getHeight() / 2.0f) - rectF4.top) - (rectF4.height() / 2.0f));
            if (z2 && this.editKeyframe == null) {
                this.paint.setStyle(Paint.Style.STROKE);
                this.paint.setStrokeWidth(this.keyframeStrokeWidth * 4);
                this.paint.setColor(this.accentColor);
                if (z4 || z3) {
                    canvas.save();
                    canvas.translate(0.0f, getHeight() * 0.2f);
                    canvas.drawPath(this.keyframePath, this.paint);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(0.0f, (-getHeight()) * 0.2f);
                    canvas.drawPath(this.keyframePath, this.paint);
                    canvas.restore();
                } else {
                    canvas.drawPath(this.keyframePath, this.paint);
                }
            }
            if (Intrinsics.areEqual(this.editKeyframe, fFloatValue2)) {
                this.paint.setStyle(Paint.Style.STROKE);
                this.paint.setStrokeWidth(this.keyframeStrokeWidth / 2.0f);
                this.paint.setColor(-1);
                canvas.drawPath(this.keyframePath, this.paint);
            } else if (z3) {
                canvas.save();
                canvas.translate(0.0f, getHeight() * 0.2f);
                Paint paint = this.paint;
                Paint.Style style = Paint.Style.FILL;
                paint.setStyle(style);
                this.paint.setColor(ColorKt.toInt(SolidColor.INSTANCE.getP6()));
                canvas.drawPath(this.keyframePath, this.paint);
                Paint paint2 = this.paint;
                Paint.Style style2 = Paint.Style.STROKE;
                paint2.setStyle(style2);
                this.paint.setStrokeWidth(this.keyframeStrokeWidth);
                this.paint.setColor(-16777216);
                canvas.drawPath(this.keyframePath, this.paint);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, (-getHeight()) * 0.2f);
                this.paint.setStyle(style);
                this.paint.setColor(-1);
                canvas.drawPath(this.keyframePath, this.paint);
                this.paint.setStyle(style2);
                this.paint.setStrokeWidth(this.keyframeStrokeWidth);
                this.paint.setColor(-16777216);
                canvas.drawPath(this.keyframePath, this.paint);
                canvas.restore();
            } else if (z4) {
                canvas.save();
                canvas.translate(0.0f, getHeight() * 0.2f);
                Paint paint3 = this.paint;
                Paint.Style style3 = Paint.Style.FILL;
                paint3.setStyle(style3);
                this.paint.setColor(-1);
                canvas.drawPath(this.keyframePath, this.paint);
                Paint paint4 = this.paint;
                Paint.Style style4 = Paint.Style.STROKE;
                paint4.setStyle(style4);
                this.paint.setStrokeWidth(this.keyframeStrokeWidth);
                this.paint.setColor(-16777216);
                canvas.drawPath(this.keyframePath, this.paint);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, (-getHeight()) * 0.2f);
                this.paint.setStyle(style3);
                this.paint.setColor(-1);
                canvas.drawPath(this.keyframePath, this.paint);
                this.paint.setStyle(style4);
                this.paint.setStrokeWidth(this.keyframeStrokeWidth);
                this.paint.setColor(-16777216);
                canvas.drawPath(this.keyframePath, this.paint);
                canvas.restore();
            } else {
                this.paint.setStyle(Paint.Style.FILL);
                this.paint.setColor(-1);
                canvas.drawPath(this.keyframePath, this.paint);
                this.paint.setStyle(Paint.Style.STROKE);
                this.paint.setStrokeWidth(this.keyframeStrokeWidth);
                this.paint.setColor(-16777216);
                canvas.drawPath(this.keyframePath, this.paint);
            }
            canvas.restore();
        }
    }

    public final void setAltKeyframeTimes(List<Float> list) {
        this.altKeyframeTimes = list;
    }

    public final void setEditKeyframe(Float f3) {
        this.editKeyframe = f3;
    }

    public final void setHighlightIndex(Integer num) {
        this.highlightIndex = num;
    }

    public final void setKeyablePropertiesSelected(int i2) {
        this.keyablePropertiesSelected = i2;
    }

    public final void setKeyframeTimes(List<Float> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.keyframeTimes = list;
    }

    public final void setTimeOffset(float f3) {
        this.timeOffset = f3;
    }

    public final void setTimeScaleFactor(float f3) {
        this.timeScaleFactor = f3;
    }

    @Override // android.view.View
    public boolean willNotDraw() {
        return this.keyframeTimes.isEmpty();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyframeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
