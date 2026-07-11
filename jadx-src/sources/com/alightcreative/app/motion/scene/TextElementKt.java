package com.alightcreative.app.motion.scene;

import WzY.C1487z;
import WzY.yg;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import d.AbstractC1951j;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u009b\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u001a\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u00020\u001c*\u00020\u001f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#\u001a!\u0010'\u001a\u00020&*\u00020\u00052\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001f¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010*\u001a\u00020)*\u00020\u00052\u0006\u0010%\u001a\u00020\u001f¢\u0006\u0004\b*\u0010+\u001a\u0019\u0010-\u001a\u00020,*\u00020\u00052\u0006\u0010%\u001a\u00020\u001f¢\u0006\u0004\b-\u0010.\u001a\u0019\u00100\u001a\u00020/*\u00020\u00052\u0006\u0010%\u001a\u00020\u001f¢\u0006\u0004\b0\u00101\"\u0014\u0010!\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00103\"\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00107\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\" \u0010>\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020,0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\"\u0014\u0010@\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00106\"\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C\"\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010C\"\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020/0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J\"\u0014\u0010K\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00103\"\u0014\u0010L\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u00103¨\u0006M"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableTransform;", "transform", "", "startTime", "endTime", "Lcom/alightcreative/app/motion/scene/StyledText;", "text", "Lcom/alightcreative/app/motion/scene/Keyable;", "Lcom/alightcreative/app/motion/scene/SolidColor;", "fillColor", "Landroid/net/Uri;", "fillImage", "fillVideo", "", "id", "", "label", "inTime", "outTime", "Lcom/alightcreative/app/motion/scene/FillType;", "fillType", "", "loop", "Lcom/alightcreative/app/motion/scene/BlendingMode;", "blendingMode", "Lcom/alightcreative/app/motion/scene/SceneElement;", "TextElement", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;IILcom/alightcreative/app/motion/scene/StyledText;Lcom/alightcreative/app/motion/scene/Keyable;Landroid/net/Uri;Landroid/net/Uri;JLjava/lang/String;IILcom/alightcreative/app/motion/scene/FillType;ZLcom/alightcreative/app/motion/scene/BlendingMode;)Lcom/alightcreative/app/motion/scene/SceneElement;", "", "initGlobalFontHandler", "()V", "Lcom/alightcreative/app/motion/scene/StyleParams;", "Landroid/graphics/Paint;", "paint", "applyTo", "(Lcom/alightcreative/app/motion/scene/StyleParams;Landroid/graphics/Paint;)V", "maxSize", "params", "Landroid/graphics/Bitmap;", "getTextBitmap", "(Lcom/alightcreative/app/motion/scene/StyledText;ILcom/alightcreative/app/motion/scene/StyleParams;)Landroid/graphics/Bitmap;", "", "getSpaceWidth", "(Lcom/alightcreative/app/motion/scene/StyledText;Lcom/alightcreative/app/motion/scene/StyleParams;)F", "LWzY/z;", "getTextPath", "(Lcom/alightcreative/app/motion/scene/StyledText;Lcom/alightcreative/app/motion/scene/StyleParams;)LWzY/z;", "Lcom/alightcreative/app/motion/scene/Vector2D;", "getTextDimensions", "(Lcom/alightcreative/app/motion/scene/StyledText;Lcom/alightcreative/app/motion/scene/StyleParams;)Lcom/alightcreative/app/motion/scene/Vector2D;", "LWzY/yg;", "LWzY/yg;", "Landroid/graphics/RectF;", "scratchRectF", "Landroid/graphics/RectF;", "scratchPath", "LWzY/z;", "Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "Lcom/alightcreative/app/motion/scene/StyledTextWithParams;", "textBitmapCache", "Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "Landroid/util/LruCache;", "textPathCache", "Landroid/util/LruCache;", "scratchBounds", "Landroid/os/Handler;", "globalFontHandler", "Landroid/os/Handler;", "globalFontCallerHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "fontHandlerInitLock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/WeakHashMap;", "textSizeCache", "Ljava/util/WeakHashMap;", "selectionPaintBase", "selectionPaintTop", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextElement.kt\ncom/alightcreative/app/motion/scene/TextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,787:1\n1#2:788\n381#3,7:789\n975#4:796\n1046#4,3:797\n*S KotlinDebug\n*F\n+ 1 TextElement.kt\ncom/alightcreative/app/motion/scene/TextElementKt\n*L\n748#1:789,7\n732#1:796\n732#1:797,3\n*E\n"})
public final class TextElementKt {
    private static Handler globalFontCallerHandler;
    private static Handler globalFontHandler;
    private static final WzY.yg selectionPaintBase;
    private static final WzY.yg selectionPaintTop;
    private static final WzY.yg paint = new WzY.yg();
    private static final RectF scratchRectF = new RectF();
    private static final C1487z scratchPath = new C1487z();
    private static final BitmapLruCache<StyledTextWithParams> textBitmapCache = new BitmapLruCache<>(0, "styledTextCache", 1, null);
    private static final LruCache<StyledTextWithParams, C1487z> textPathCache = new LruCache<>(30);
    private static final RectF scratchBounds = new RectF();
    private static final AtomicBoolean fontHandlerInitLock = new AtomicBoolean(false);
    private static final WeakHashMap<StyledText, Vector2D> textSizeCache = new WeakHashMap<>();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyledTextAlign.values().length];
            try {
                iArr[StyledTextAlign.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyledTextAlign.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyledTextAlign.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StyledTextAlign.JUSTIFY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        WzY.yg ygVar = new WzY.yg();
        yg.w6 w6Var = yg.w6.f11694O;
        ygVar.ty(w6Var);
        ygVar.az(5.0f);
        ygVar.gh(new SolidColor(0.0f, 0.0f, 0.0f, 0.5f));
        selectionPaintBase = ygVar;
        WzY.yg ygVar2 = new WzY.yg();
        ygVar2.ty(w6Var);
        ygVar2.az(3.0f);
        ygVar2.gh(SolidColor.INSTANCE.getWHITE());
        selectionPaintTop = ygVar2;
    }

    public static final SceneElement TextElement(KeyableTransform transform, int i2, int i3, StyledText text, Keyable<SolidColor> fillColor, Uri uri, Uri uri2, long j2, String label, int i5, int i7, FillType fillType, boolean z2, BlendingMode blendingMode) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fillColor, "fillColor");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(fillType, "fillType");
        Intrinsics.checkNotNullParameter(blendingMode, "blendingMode");
        return new SceneElement(SceneElementType.Text, i2, i3, j2, new EngineState(nCS.j.f71005n.n()), label, transform, fillColor, uri, uri2, null, fillType, null, null, null, null, null, i5, i7, z2, null, text, blendingMode, SceneKt.getEMPTY_SCENE(), null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32377856, 127, null);
    }

    public static final void applyTo(StyleParams styleParams, Paint paint2) {
        Intrinsics.checkNotNullParameter(styleParams, "<this>");
        Intrinsics.checkNotNullParameter(paint2, "paint");
        paint2.setLetterSpacing(styleParams.getLetterSpacing());
    }

    public static final float getSpaceWidth(StyledText styledText, StyleParams params) {
        Intrinsics.checkNotNullParameter(styledText, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(styledText.getFontSize() * 3.0f);
        initGlobalFontHandler();
        textPaint.setTypeface(com.alightcreative.app.motion.fonts.CN3.S(com.alightcreative.app.motion.fonts.w6.f45792t.rl(styledText.getFont()), 15000L));
        applyTo(params, textPaint);
        return textPaint.measureText(" ");
    }

    public static final Bitmap getTextBitmap(final StyledText styledText, final int i2, final StyleParams params) {
        Bitmap orPut;
        Intrinsics.checkNotNullParameter(styledText, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        BitmapLruCache<StyledTextWithParams> bitmapLruCache = textBitmapCache;
        synchronized (bitmapLruCache) {
            orPut = ImageCacheKt.getOrPut(bitmapLruCache, new StyledTextWithParams(styledText, params), (Function0<Bitmap>) new Function0() { // from class: com.alightcreative.app.motion.scene.dT
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextElementKt.getTextBitmap$lambda$1$lambda$0(styledText, params, i2);
                }
            });
        }
        return orPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Bitmap getTextBitmap$lambda$1$lambda$0(StyledText styledText, StyleParams styleParams, int i2) {
        Layout.Alignment alignment;
        int i3 = 1;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(styledText.getFontSize() * 3.0f);
        initGlobalFontHandler();
        textPaint.setTypeface(com.alightcreative.app.motion.fonts.CN3.S(com.alightcreative.app.motion.fonts.w6.f45792t.rl(styledText.getFont()), 15000L));
        applyTo(styleParams, textPaint);
        String text = styledText.getText();
        int wrapWidth = styledText.getWrapWidth();
        int i5 = WhenMappings.$EnumSwitchMapping$0[styledText.getAlign().ordinal()];
        if (i5 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i5 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            if (i5 != 3) {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new NotImplementedError(null, i3, 0 == true ? 1 : 0);
            }
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout staticLayout = new StaticLayout(text, textPaint, wrapWidth, alignment, styleParams.getLineSpacing(), 0.0f, true);
        Pair pairKN = AbstractC1951j.KN(styledText.getWrapWidth(), staticLayout.getHeight(), i2, i2);
        int iIntValue = ((Number) pairKN.component1()).intValue();
        int iIntValue2 = ((Number) pairKN.component2()).intValue();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(iIntValue / styledText.getWrapWidth(), iIntValue2 / staticLayout.getHeight());
        staticLayout.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final Vector2D getTextDimensions(StyledText styledText, StyleParams params) {
        Vector2D vector2D;
        Layout.Alignment alignment;
        Intrinsics.checkNotNullParameter(styledText, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        WeakHashMap<StyledText, Vector2D> weakHashMap = textSizeCache;
        synchronized (weakHashMap) {
            try {
                Vector2D vector2D2 = weakHashMap.get(styledText);
                if (vector2D2 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    textPaint.setTextSize(styledText.getFontSize() * 3.0f);
                    textPaint.setTypeface(com.alightcreative.app.motion.fonts.CN3.S(com.alightcreative.app.motion.fonts.w6.f45792t.rl(styledText.getFont()), 100L));
                    applyTo(params, textPaint);
                    StaticLayout.Builder includePad = StaticLayout.Builder.obtain(styledText.getText(), 0, styledText.getText().length(), textPaint, styledText.getWrapWidth()).setLineSpacing(0.0f, params.getLineSpacing()).setIncludePad(true);
                    int i2 = WhenMappings.$EnumSwitchMapping$0[styledText.getAlign().ordinal()];
                    if (i2 == 1) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else if (i2 == 2) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        if (i2 != 3 && i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                    Intrinsics.checkNotNullExpressionValue(includePad.setAlignment(alignment).build(), "build(...)");
                    vector2D2 = new Vector2D(styledText.getWrapWidth(), r8.getHeight());
                    weakHashMap.put(styledText, vector2D2);
                }
                vector2D = vector2D2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vector2D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1487z getTextPath(final StyledText styledText, StyleParams params) {
        Layout.Alignment alignment;
        Paint.Align align;
        int wrapWidth;
        float f3;
        int lineCount;
        int i2;
        int i3;
        final StaticLayout staticLayout;
        int i5;
        int i7;
        Path path;
        Intrinsics.checkNotNullParameter(styledText, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        StyledTextWithParams styledTextWithParams = new StyledTextWithParams(styledText, params);
        C1487z c1487z = textPathCache.get(styledTextWithParams);
        if (c1487z != null) {
            return new C1487z(c1487z);
        }
        int i8 = 1;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(styledText.getFontSize() * 3.0f);
        initGlobalFontHandler();
        textPaint.setTypeface(com.alightcreative.app.motion.fonts.CN3.S(com.alightcreative.app.motion.fonts.w6.f45792t.rl(styledText.getFont()), 15000L));
        applyTo(params, textPaint);
        String text = styledText.getText();
        int wrapWidth2 = styledText.getWrapWidth();
        StyledTextAlign align2 = styledText.getAlign();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i9 = iArr[align2.ordinal()];
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (i9 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i9 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            if (i9 != 3) {
                if (i9 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new NotImplementedError(str, i8, objArr5 == true ? 1 : 0);
            }
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout staticLayout2 = new StaticLayout(text, textPaint, wrapWidth2, alignment, params.getLineSpacing(), 0.0f, true);
        int i10 = iArr[styledText.getAlign().ordinal()];
        if (i10 == 1) {
            align = Paint.Align.LEFT;
        } else if (i10 == 2) {
            align = Paint.Align.CENTER;
        } else {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new NotImplementedError(objArr4 == true ? 1 : 0, i8, objArr3 == true ? 1 : 0);
            }
            align = Paint.Align.RIGHT;
        }
        textPaint.setTextAlign(align);
        int i11 = iArr[styledText.getAlign().ordinal()];
        if (i11 == 1) {
            wrapWidth = -styledText.getWrapWidth();
        } else {
            if (i11 == 2) {
                f3 = 0.0f;
                final float f4 = f3;
                Path path2 = new Path();
                Path path3 = new Path();
                lineCount = staticLayout2.getLineCount();
                i2 = 0;
                while (i2 < lineCount) {
                    final float lineBaseline = staticLayout2.getLineBaseline(i2);
                    int i12 = i8;
                    final int lineStart = staticLayout2.getLineStart(i2);
                    final Ref.IntRef intRef = new Ref.IntRef();
                    intRef.element = staticLayout2.getLineEnd(i2);
                    if (CharsKt.isWhitespace(styledText.getText().charAt(intRef.element - i12))) {
                        intRef.element--;
                    }
                    path3.rewind();
                    if (intRef.element > lineStart) {
                        i3 = i12;
                        staticLayout = staticLayout2;
                        XoT.C.Uo(styledText, new Function0() { // from class: com.alightcreative.app.motion.scene.AZy
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TextElementKt.getTextPath$lambda$4(lineStart, intRef, f4, lineBaseline, staticLayout, styledText);
                            }
                        });
                        i5 = lineCount;
                        i7 = i2;
                        path = path2;
                        textPaint.getTextPath(styledText.getText(), lineStart, intRef.element, f4, lineBaseline - (staticLayout.getHeight() / 2.0f), path3);
                        path.addPath(path3);
                    } else {
                        i3 = i12;
                        staticLayout = staticLayout2;
                        i5 = lineCount;
                        i7 = i2;
                        path = path2;
                    }
                    i2 = i7 + 1;
                    path2 = path;
                    lineCount = i5;
                    staticLayout2 = staticLayout;
                    i8 = i3;
                }
                C1487z c1487zNr = WzY.l4Z.nr(path2, 0.1f, 0.0f, 0.0f, 6, null);
                textPathCache.put(styledTextWithParams, new C1487z(c1487zNr));
                return c1487zNr;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new NotImplementedError(objArr2 == true ? 1 : 0, i8, objArr == true ? 1 : 0);
            }
            wrapWidth = styledText.getWrapWidth();
        }
        f3 = wrapWidth / 2.0f;
        final float f42 = f3;
        Path path22 = new Path();
        Path path32 = new Path();
        lineCount = staticLayout2.getLineCount();
        i2 = 0;
        while (i2 < lineCount) {
        }
        C1487z c1487zNr2 = WzY.l4Z.nr(path22, 0.1f, 0.0f, 0.0f, 6, null);
        textPathCache.put(styledTextWithParams, new C1487z(c1487zNr2));
        return c1487zNr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getTextPath$lambda$4(int i2, Ref.IntRef intRef, float f3, float f4, StaticLayout staticLayout, StyledText styledText) {
        int i3 = intRef.element;
        float height = f4 - (staticLayout.getHeight() / 2.0f);
        int length = styledText.getText().length();
        String text = styledText.getText();
        ArrayList arrayList = new ArrayList(text.length());
        for (int i5 = 0; i5 < text.length(); i5++) {
            String string = Integer.toString(text.charAt(i5), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(StringsKt.padStart(string, 2, '0'));
        }
        return "About to call getTextPath: start=" + i2 + " end=" + i3 + " x=" + f3 + " y=" + height + " textLen=" + length + " textDump=" + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) + " text='" + styledText.getText() + "'";
    }

    public static final void initGlobalFontHandler() {
        if (globalFontHandler == null && globalFontCallerHandler == null && fontHandlerInitLock.compareAndSet(false, true)) {
            globalFontCallerHandler = new Handler(Looper.getMainLooper());
            HandlerThread handlerThread = new HandlerThread("textElementActivityFonts");
            handlerThread.start();
            globalFontHandler = new Handler(handlerThread.getLooper());
        }
    }
}
