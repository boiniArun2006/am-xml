package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Xo extends n {
    public int KN;
    public int gh;
    boolean mUb;
    public int xMQ;

    public Xo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.XQ);
    }

    public Xo(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, LinearProgressIndicator.f59084U);
    }

    public Xo(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayXMQ = eO.xMQ(context, attributeSet, Rxk.o.Xli, Rxk.n.XQ, LinearProgressIndicator.f59084U, new int[0]);
        this.KN = typedArrayXMQ.getInt(Rxk.o.fq, 1);
        this.xMQ = typedArrayXMQ.getInt(Rxk.o.C7B, 0);
        this.gh = Math.min(typedArrayXMQ.getDimensionPixelSize(Rxk.o.wYi, 0), this.f59123n);
        typedArrayXMQ.recycle();
        O();
        this.mUb = this.xMQ == 1;
    }

    @Override // com.google.android.material.progressindicator.n
    void O() {
        super.O();
        if (this.gh >= 0) {
            if (this.KN == 0) {
                if (this.rl > 0 && this.Uo == 0) {
                    throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
                }
                if (this.f59124t.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Stop indicator size must be >= 0.");
    }
}
