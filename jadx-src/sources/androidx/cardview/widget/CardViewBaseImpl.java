package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.RoundRectDrawableWithShadow;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class CardViewBaseImpl implements CardViewImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final RectF f14647n;

    @Override // androidx.cardview.widget.CardViewImpl
    public void KN(CardViewDelegate cardViewDelegate, Context context, ColorStateList colorStateList, float f3, float f4, float f5) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadowHI = HI(context, colorStateList, f3, f4, f5);
        roundRectDrawableWithShadowHI.az(cardViewDelegate.J2());
        cardViewDelegate.n(roundRectDrawableWithShadowHI);
        Ik(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void mUb(CardViewDelegate cardViewDelegate) {
    }

    private RoundRectDrawableWithShadow HI(Context context, ColorStateList colorStateList, float f3, float f4, float f5) {
        return new RoundRectDrawableWithShadow(context.getResources(), colorStateList, f3, f4, f5);
    }

    public void Ik(CardViewDelegate cardViewDelegate) {
        Rect rect = new Rect();
        ck(cardViewDelegate).KN(rect);
        cardViewDelegate.O((int) Math.ceil(qie(cardViewDelegate)), (int) Math.ceil(J2(cardViewDelegate)));
        cardViewDelegate.nr(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void gh() {
        RoundRectDrawableWithShadow.f14652r = new RoundRectDrawableWithShadow.RoundRectHelper() { // from class: androidx.cardview.widget.CardViewBaseImpl.1
            @Override // androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper
            public void n(Canvas canvas, RectF rectF, float f3, Paint paint) {
                float f4 = 2.0f * f3;
                float fWidth = (rectF.width() - f4) - 1.0f;
                float fHeight = (rectF.height() - f4) - 1.0f;
                if (f3 >= 1.0f) {
                    float f5 = f3 + 0.5f;
                    float f6 = -f5;
                    CardViewBaseImpl.this.f14647n.set(f6, f6, f5, f5);
                    int iSave = canvas.save();
                    canvas.translate(rectF.left + f5, rectF.top + f5);
                    canvas.drawArc(CardViewBaseImpl.this.f14647n, 180.0f, 90.0f, true, paint);
                    canvas.translate(fWidth, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(CardViewBaseImpl.this.f14647n, 180.0f, 90.0f, true, paint);
                    canvas.translate(fHeight, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(CardViewBaseImpl.this.f14647n, 180.0f, 90.0f, true, paint);
                    canvas.translate(fWidth, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(CardViewBaseImpl.this.f14647n, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(iSave);
                    float f7 = (rectF.left + f5) - 1.0f;
                    float f8 = rectF.top;
                    canvas.drawRect(f7, f8, (rectF.right - f5) + 1.0f, f8 + f5, paint);
                    float f9 = (rectF.left + f5) - 1.0f;
                    float f10 = rectF.bottom;
                    canvas.drawRect(f9, f10 - f5, (rectF.right - f5) + 1.0f, f10, paint);
                }
                canvas.drawRect(rectF.left, rectF.top + f3, rectF.right, rectF.bottom - f3, paint);
            }
        };
    }

    private RoundRectDrawableWithShadow ck(CardViewDelegate cardViewDelegate) {
        return (RoundRectDrawableWithShadow) cardViewDelegate.t();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float J2(CardViewDelegate cardViewDelegate) {
        return ck(cardViewDelegate).mUb();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public ColorStateList O(CardViewDelegate cardViewDelegate) {
        return ck(cardViewDelegate).J2();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void Uo(CardViewDelegate cardViewDelegate) {
        ck(cardViewDelegate).az(cardViewDelegate.J2());
        Ik(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void az(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        ck(cardViewDelegate).HI(colorStateList);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void n(CardViewDelegate cardViewDelegate, float f3) {
        ck(cardViewDelegate).ck(f3);
        Ik(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float nr(CardViewDelegate cardViewDelegate) {
        return ck(cardViewDelegate).xMQ();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float qie(CardViewDelegate cardViewDelegate) {
        return ck(cardViewDelegate).gh();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float rl(CardViewDelegate cardViewDelegate) {
        return ck(cardViewDelegate).Uo();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void t(CardViewDelegate cardViewDelegate, float f3) {
        ck(cardViewDelegate).r(f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void ty(CardViewDelegate cardViewDelegate, float f3) {
        ck(cardViewDelegate).Ik(f3);
        Ik(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float xMQ(CardViewDelegate cardViewDelegate) {
        return ck(cardViewDelegate).qie();
    }
}
