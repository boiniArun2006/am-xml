package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f58797n;

    class j extends w6 {
        final /* synthetic */ CarouselLayoutManager rl;

        @Override // com.google.android.material.carousel.w6
        int mUb() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i2, CarouselLayoutManager carouselLayoutManager) {
            super(i2, null);
            this.rl = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.w6
        int KN() {
            return this.rl.mYa() - this.rl.Mx();
        }

        @Override // com.google.android.material.carousel.w6
        int O() {
            return this.rl.piY();
        }

        @Override // com.google.android.material.carousel.w6
        int Uo() {
            return this.rl.C();
        }

        @Override // com.google.android.material.carousel.w6
        public float nr(RecyclerView.LayoutParams layoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // com.google.android.material.carousel.w6
        public void qie(View view, Rect rect, float f3, float f4) {
            view.offsetTopAndBottom((int) (f4 - (rect.top + f3)));
        }

        @Override // com.google.android.material.carousel.w6
        int J2() {
            return O();
        }

        int az(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.rl.Y(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // com.google.android.material.carousel.w6
        public void gh(View view, int i2, int i3) {
            int iUo = Uo();
            this.rl.lLA(view, iUo, i2, iUo + az(view), i3);
        }

        @Override // com.google.android.material.carousel.w6
        int xMQ() {
            return mUb();
        }
    }

    class n extends w6 {
        final /* synthetic */ CarouselLayoutManager rl;

        @Override // com.google.android.material.carousel.w6
        int Uo() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i2, CarouselLayoutManager carouselLayoutManager) {
            super(i2, null);
            this.rl = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.w6
        int J2() {
            return this.rl.sFO() ? Uo() : KN();
        }

        @Override // com.google.android.material.carousel.w6
        int KN() {
            return this.rl.mYa();
        }

        @Override // com.google.android.material.carousel.w6
        int O() {
            return this.rl.piY() - this.rl.ofS();
        }

        @Override // com.google.android.material.carousel.w6
        int mUb() {
            return this.rl.G7();
        }

        @Override // com.google.android.material.carousel.w6
        public float nr(RecyclerView.LayoutParams layoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }

        @Override // com.google.android.material.carousel.w6
        public void qie(View view, Rect rect, float f3, float f4) {
            view.offsetLeftAndRight((int) (f4 - (rect.left + f3)));
        }

        @Override // com.google.android.material.carousel.w6
        int xMQ() {
            return this.rl.sFO() ? KN() : Uo();
        }

        int az(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.rl.Nxk(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // com.google.android.material.carousel.w6
        public void gh(View view, int i2, int i3) {
            int iMUb = mUb();
            this.rl.lLA(view, i2, iMUb, i3, iMUb + az(view));
        }
    }

    /* synthetic */ w6(int i2, j jVar) {
        this(i2);
    }

    abstract int J2();

    abstract int KN();

    abstract int O();

    abstract int Uo();

    abstract void gh(View view, int i2, int i3);

    abstract int mUb();

    abstract float nr(RecyclerView.LayoutParams layoutParams);

    abstract void qie(View view, Rect rect, float f3, float f4);

    abstract int xMQ();

    private w6(int i2) {
        this.f58797n = i2;
    }

    private static w6 n(CarouselLayoutManager carouselLayoutManager) {
        return new n(0, carouselLayoutManager);
    }

    static w6 rl(CarouselLayoutManager carouselLayoutManager, int i2) {
        if (i2 == 0) {
            return n(carouselLayoutManager);
        }
        if (i2 == 1) {
            return t(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static w6 t(CarouselLayoutManager carouselLayoutManager) {
        return new j(1, carouselLayoutManager);
    }
}
