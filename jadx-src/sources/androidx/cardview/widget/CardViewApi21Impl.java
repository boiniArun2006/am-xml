package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
class CardViewApi21Impl implements CardViewImpl {
    @Override // androidx.cardview.widget.CardViewImpl
    public void gh() {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void KN(CardViewDelegate cardViewDelegate, Context context, ColorStateList colorStateList, float f3, float f4, float f5) {
        cardViewDelegate.n(new RoundRectDrawable(colorStateList, f3));
        View viewUo = cardViewDelegate.Uo();
        viewUo.setClipToOutline(true);
        viewUo.setElevation(f4);
        ty(cardViewDelegate, f5);
    }

    CardViewApi21Impl() {
    }

    private RoundRectDrawable HI(CardViewDelegate cardViewDelegate) {
        return (RoundRectDrawable) cardViewDelegate.t();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float J2(CardViewDelegate cardViewDelegate) {
        return rl(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public ColorStateList O(CardViewDelegate cardViewDelegate) {
        return HI(cardViewDelegate).rl();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void Uo(CardViewDelegate cardViewDelegate) {
        ty(cardViewDelegate, nr(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void az(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        HI(cardViewDelegate).J2(colorStateList);
    }

    public void ck(CardViewDelegate cardViewDelegate) {
        if (!cardViewDelegate.rl()) {
            cardViewDelegate.nr(0, 0, 0, 0);
            return;
        }
        float fNr = nr(cardViewDelegate);
        float fRl = rl(cardViewDelegate);
        int iCeil = (int) Math.ceil(RoundRectDrawableWithShadow.t(fNr, fRl, cardViewDelegate.J2()));
        int iCeil2 = (int) Math.ceil(RoundRectDrawableWithShadow.nr(fNr, fRl, cardViewDelegate.J2()));
        cardViewDelegate.nr(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void mUb(CardViewDelegate cardViewDelegate) {
        ty(cardViewDelegate, nr(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void n(CardViewDelegate cardViewDelegate, float f3) {
        HI(cardViewDelegate).KN(f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float nr(CardViewDelegate cardViewDelegate) {
        return HI(cardViewDelegate).t();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float qie(CardViewDelegate cardViewDelegate) {
        return rl(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float rl(CardViewDelegate cardViewDelegate) {
        return HI(cardViewDelegate).nr();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void t(CardViewDelegate cardViewDelegate, float f3) {
        cardViewDelegate.Uo().setElevation(f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void ty(CardViewDelegate cardViewDelegate, float f3) {
        HI(cardViewDelegate).Uo(f3, cardViewDelegate.rl(), cardViewDelegate.J2());
        ck(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float xMQ(CardViewDelegate cardViewDelegate) {
        return cardViewDelegate.Uo().getElevation();
    }
}
