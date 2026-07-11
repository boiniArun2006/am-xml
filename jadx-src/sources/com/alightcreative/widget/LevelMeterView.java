package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ+\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR+\u0010&\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010,\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u00100\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010!\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R+\u00104\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010!\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/alightcreative/widget/LevelMeterView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "initialValue", "Lkotlin/properties/ReadWriteProperty;", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "w", CmcdData.STREAMING_FORMAT_HLS, "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "isOpaque", "()Z", "", "<set-?>", "Lkotlin/properties/ReadWriteProperty;", "getLevel", "()F", "setLevel", "(F)V", AppLovinEventTypes.USER_COMPLETED_LEVEL, "t", "getColor", "()I", "setColor", "(I)V", TtmlNode.ATTR_TTS_COLOR, "O", "getPeakLevel", "setPeakLevel", "peakLevel", "J2", "getPeakColor", "setPeakColor", "peakColor", "Landroid/graphics/Paint;", "r", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Shader;", "o", "Landroid/graphics/Shader;", "shader", "S", "I", "inset", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLevelMeterView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelMeterView.kt\ncom/alightcreative/widget/LevelMeterView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,86:1\n33#2,3:87\n*S KotlinDebug\n*F\n+ 1 LevelMeterView.kt\ncom/alightcreative/widget/LevelMeterView\n*L\n22#1:87,3\n*E\n"})
public final class LevelMeterView extends View {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final ReadWriteProperty peakColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty peakLevel;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final int inset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty level;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Shader shader;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty color;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f47149g = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(LevelMeterView.class, AppLovinEventTypes.USER_COMPLETED_LEVEL, "getLevel()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(LevelMeterView.class, TtmlNode.ATTR_TTS_COLOR, "getColor()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(LevelMeterView.class, "peakLevel", "getPeakLevel()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(LevelMeterView.class, "peakColor", "getPeakColor()I", 0))};
    public static final int E2 = 8;

    public static final class j extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ LevelMeterView f47156n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, LevelMeterView levelMeterView) {
            super(obj);
            this.f47156n = levelMeterView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            if (Intrinsics.areEqual(obj2, obj)) {
                return;
            }
            this.f47156n.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelMeterView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Float fValueOf = Float.valueOf(0.0f);
        this.level = n(fValueOf);
        this.color = n(-1);
        this.peakLevel = n(fValueOf);
        this.peakColor = n(-1);
        this.paint = new Paint();
        this.inset = getResources().getDimensionPixelOffset(2131165283);
    }

    @Override // android.view.View
    public boolean isOpaque() {
        return false;
    }

    private final ReadWriteProperty n(Object initialValue) {
        Delegates delegates = Delegates.INSTANCE;
        return new j(initialValue, this);
    }

    public final int getColor() {
        return ((Number) this.color.getValue(this, f47149g[1])).intValue();
    }

    public final float getLevel() {
        return ((Number) this.level.getValue(this, f47149g[0])).floatValue();
    }

    public final int getPeakColor() {
        return ((Number) this.peakColor.getValue(this, f47149g[3])).intValue();
    }

    public final float getPeakLevel() {
        return ((Number) this.peakLevel.getValue(this, f47149g[2])).floatValue();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.paint.setStyle(Paint.Style.FILL);
        int width = getWidth() / 2;
        this.paint.setShader(this.shader);
        this.paint.setAlpha(77);
        float width2 = (getWidth() / 2) * getPeakLevel();
        float f3 = width;
        int i2 = this.inset;
        canvas.drawRect(f3 - width2, i2 / 2.0f, f3 + width2, (i2 / 2.0f) + i2, this.paint);
        this.paint.setAlpha(255);
        float width3 = (getWidth() / 2) * getLevel();
        if (getLevel() < 1.0d) {
            int i3 = this.inset;
            canvas.drawRect(new RectF(f3 - width3, i3 / 2.0f, f3 + width3, (i3 / 2.0f) + i3), this.paint);
        } else {
            this.paint.setShader(null);
            this.paint.setColor(Color.parseColor("#FF0000"));
            canvas.drawRect(new RectF(f3 - width3, 0.0f, f3 + width3, getHeight()), this.paint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        this.shader = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), new int[]{Color.parseColor("#FF0000"), Color.parseColor("#F3C507"), Color.parseColor("#00FF36"), Color.parseColor("#00FF36"), Color.parseColor("#F3C507"), Color.parseColor("#FF0000")}, new float[]{0.0f, 0.2f, 0.4f, 0.6f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        super.onSizeChanged(w2, h2, oldw, oldh);
    }

    public final void setColor(int i2) {
        this.color.setValue(this, f47149g[1], Integer.valueOf(i2));
    }

    public final void setLevel(float f3) {
        this.level.setValue(this, f47149g[0], Float.valueOf(f3));
    }

    public final void setPeakColor(int i2) {
        this.peakColor.setValue(this, f47149g[3], Integer.valueOf(i2));
    }

    public final void setPeakLevel(float f3) {
        this.peakLevel.setValue(this, f47149g[2], Float.valueOf(f3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelMeterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
