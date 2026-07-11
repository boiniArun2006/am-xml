package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
@RestrictTo
public final class TypefaceEmojiSpan extends EmojiSpan {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static Paint f38363Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextPaint f38364o;

    private static Paint O() {
        if (f38363Z == null) {
            TextPaint textPaint = new TextPaint();
            f38363Z = textPaint;
            textPaint.setColor(EmojiCompat.t().O());
            f38363Z.setStyle(Paint.Style.FILL);
        }
        return f38363Z;
    }

    private TextPaint t(CharSequence charSequence, int i2, int i3, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i2, i3, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f38364o;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f38364o = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    if (!(characterStyle instanceof MetricAffectingSpan)) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f3, int i5, int i7, int i8, Paint paint) {
        TextPaint textPaintT = t(charSequence, i2, i3, paint);
        if (textPaintT != null && textPaintT.bgColor != 0) {
            nr(canvas, textPaintT, f3, f3 + rl(), i5, i8);
        }
        Paint paint2 = textPaintT;
        if (EmojiCompat.t().qie()) {
            canvas.drawRect(f3, i5, f3 + rl(), i8, O());
        }
        TypefaceEmojiRasterizer typefaceEmojiRasterizerN = n();
        float f4 = i7;
        if (paint2 == null) {
            paint2 = paint;
        }
        typefaceEmojiRasterizerN.n(canvas, f3, f4, paint2);
    }

    public TypefaceEmojiSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        super(typefaceEmojiRasterizer);
    }

    void nr(Canvas canvas, TextPaint textPaint, float f3, float f4, float f5, float f6) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f3, f5, f4, f6, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}
