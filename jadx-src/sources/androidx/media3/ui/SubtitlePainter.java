package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final String TAG = "SubtitlePainter";
    private int backgroundColor;
    private final Paint bitmapPaint;
    private Rect bitmapRect;
    private float bottomPaddingFraction;

    @Nullable
    private Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;

    @Nullable
    private CharSequence cueText;

    @Nullable
    private Layout.Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private StaticLayout edgeLayout;
    private int edgeType;
    private int foregroundColor;
    private final float outlineWidth;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final TextPaint textPaint;
    private int textTop;
    private int windowColor;
    private final Paint windowPaint;

    private static boolean areCharSequencesEqual(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    private void drawLayout(Canvas canvas, boolean z2) {
        if (z2) {
            drawTextLayout(canvas);
            return;
        }
        Assertions.checkNotNull(this.bitmapRect);
        Assertions.checkNotNull(this.cueBitmap);
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.textLayout;
        StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (Color.alpha(this.windowColor) > 0) {
            this.windowPaint.setColor(this.windowColor);
            canvas2 = canvas;
            canvas2.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.windowPaint);
        } else {
            canvas2 = canvas;
        }
        int i2 = this.edgeType;
        if (i2 == 1) {
            this.textPaint.setStrokeJoin(Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i2 == 2) {
            TextPaint textPaint = this.textPaint;
            float f3 = this.shadowRadius;
            float f4 = this.shadowOffset;
            textPaint.setShadowLayer(f3, f4, f4, this.edgeColor);
        } else if (i2 == 3 || i2 == 4) {
            boolean z2 = i2 == 3;
            int i3 = z2 ? -1 : this.edgeColor;
            int i5 = z2 ? this.edgeColor : -1;
            float f5 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(Paint.Style.FILL);
            float f6 = -f5;
            this.textPaint.setShadowLayer(this.shadowRadius, f6, f6, i3);
            staticLayout2.draw(canvas2);
            this.textPaint.setShadowLayer(this.shadowRadius, f5, f5, i5);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setupBitmapLayout() {
        float f3;
        int i2;
        float f4;
        Bitmap bitmap = this.cueBitmap;
        int i3 = this.parentRight;
        int i5 = this.parentLeft;
        int i7 = this.parentBottom;
        int i8 = this.parentTop;
        float f5 = i3 - i5;
        float f6 = i5 + (this.cuePosition * f5);
        float f7 = i7 - i8;
        float f8 = i8 + (this.cueLine * f7);
        int iRound = Math.round(f5 * this.cueSize);
        float f9 = this.cueBitmapHeight;
        int iRound2 = f9 != -3.4028235E38f ? Math.round(f7 * f9) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i9 = this.cuePositionAnchor;
        if (i9 != 2) {
            if (i9 == 1) {
                f3 = iRound / 2;
            }
            int iRound3 = Math.round(f6);
            i2 = this.cueLineAnchor;
            if (i2 == 2) {
                if (i2 == 1) {
                    f4 = iRound2 / 2;
                }
                int iRound4 = Math.round(f8);
                this.bitmapRect = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f4 = iRound2;
            f8 -= f4;
            int iRound42 = Math.round(f8);
            this.bitmapRect = new Rect(iRound3, iRound42, iRound + iRound3, iRound2 + iRound42);
        }
        f3 = iRound;
        f6 -= f3;
        int iRound32 = Math.round(f6);
        i2 = this.cueLineAnchor;
        if (i2 == 2) {
        }
        f8 -= f4;
        int iRound422 = Math.round(f8);
        this.bitmapRect = new Rect(iRound32, iRound422, iRound + iRound32, iRound2 + iRound422);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setupTextLayout() {
        int iMax;
        int iMin;
        int iRound;
        int i2;
        int i3;
        CharSequence charSequence = this.cueText;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.cueText);
        int i5 = this.parentRight - this.parentLeft;
        int i7 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.defaultTextSizePx);
        int i8 = (int) ((this.defaultTextSizePx * INNER_PADDING_RATIO) + 0.5f);
        int i9 = i8 * 2;
        int i10 = i5 - i9;
        float f3 = this.cueSize;
        float f4 = -3.4028235E38f;
        if (f3 != -3.4028235E38f) {
            i10 = (int) (i10 * f3);
        }
        int i11 = i10;
        String str = TAG;
        if (i11 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.cueTextSizePx > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.cueTextSizePx), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.edgeType == 1) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class);
            int length = foregroundColorSpanArr.length;
            int i12 = 0;
            while (i12 < length) {
                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i12]);
                i12++;
                f4 = f4;
            }
        }
        float f5 = f4;
        if (Color.alpha(this.backgroundColor) > 0) {
            int i13 = this.edgeType;
            if (i13 == 0 || i13 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i11, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int iMax2 = 0;
        int i14 = 0;
        while (i14 < lineCount) {
            iMax2 = Math.max((int) Math.ceil(this.textLayout.getLineWidth(i14)), iMax2);
            i14++;
            str = str;
        }
        String str2 = str;
        if (this.cueSize == f5 || iMax2 >= i11) {
            i11 = iMax2;
        }
        int i15 = i11 + i9;
        float f6 = this.cuePosition;
        if (f6 != f5) {
            int iRound2 = Math.round(i5 * f6);
            int i16 = this.parentLeft;
            int i17 = iRound2 + i16;
            int i18 = this.cuePositionAnchor;
            if (i18 == 1) {
                i17 = ((i17 * 2) - i15) / 2;
            } else if (i18 == 2) {
                i17 -= i15;
            }
            iMax = Math.max(i17, i16);
            iMin = Math.min(i15 + iMax, this.parentRight);
        } else {
            iMax = ((i5 - i15) / 2) + this.parentLeft;
            iMin = iMax + i15;
        }
        int i19 = iMin - iMax;
        if (i19 <= 0) {
            Log.w(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f7 = this.cueLine;
        if (f7 == f5) {
            iRound = (this.parentBottom - height) - ((int) (i7 * this.bottomPaddingFraction));
        } else if (this.cueLineType == 0) {
            iRound = Math.round(i7 * f7) + this.parentTop;
            int i20 = this.cueLineAnchor;
            if (i20 == 2) {
                iRound -= height;
            } else if (i20 == 1) {
                iRound = ((iRound * 2) - height) / 2;
            }
            i2 = iRound + height;
            i3 = this.parentBottom;
            if (i2 > i3) {
                iRound = i3 - height;
            } else {
                int i21 = this.parentTop;
                if (iRound < i21) {
                    iRound = i21;
                }
            }
        } else {
            int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
            float f8 = this.cueLine;
            if (f8 >= 0.0f) {
                iRound = Math.round(f8 * lineBottom) + this.parentTop;
                i2 = iRound + height;
                i3 = this.parentBottom;
                if (i2 > i3) {
                }
            } else {
                iRound = Math.round((f8 + 1.0f) * lineBottom) + this.parentBottom;
                iRound -= height;
                i2 = iRound + height;
                i3 = this.parentBottom;
                if (i2 > i3) {
                }
            }
        }
        this.textLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i19, alignment2, this.spacingMult, this.spacingAdd, true);
        this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i19, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = iMax;
        this.textTop = iRound;
        this.textPaddingX = i8;
    }

    public void draw(Cue cue, CaptionStyleCompat captionStyleCompat, float f3, float f4, float f5, Canvas canvas, int i2, int i3, int i5, int i7) {
        int i8;
        boolean z2 = cue.bitmap == null;
        if (!z2) {
            i8 = -16777216;
        } else if (TextUtils.isEmpty(cue.text)) {
            return;
        } else {
            i8 = cue.windowColorSet ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && Objects.equals(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && Integer.valueOf(this.cueLineAnchor).equals(Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && Integer.valueOf(this.cuePositionAnchor).equals(Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i8 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && Objects.equals(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.defaultTextSizePx == f3 && this.cueTextSizePx == f4 && this.bottomPaddingFraction == f5 && this.parentLeft == i2 && this.parentTop == i3 && this.parentRight == i5 && this.parentBottom == i7) {
            drawLayout(canvas, z2);
            return;
        }
        this.cueText = cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i8;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.defaultTextSizePx = f3;
        this.cueTextSizePx = f4;
        this.bottomPaddingFraction = f5;
        this.parentLeft = i2;
        this.parentTop = i3;
        this.parentRight = i5;
        this.parentBottom = i7;
        if (z2) {
            Assertions.checkNotNull(this.cueText);
            setupTextLayout();
        } else {
            Assertions.checkNotNull(this.cueBitmap);
            setupBitmapLayout();
        }
        drawLayout(canvas, z2);
    }

    public SubtitlePainter(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{android.R.attr.lineSpacingExtra, android.R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = fRound;
        this.shadowRadius = fRound;
        this.shadowOffset = fRound;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }
}
