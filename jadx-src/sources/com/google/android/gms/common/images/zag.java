package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i2) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i2;
    }

    protected abstract void zaa(@Nullable Drawable drawable, boolean z2, boolean z3, boolean z4);

    final void zab(Context context, zam zamVar, boolean z2) {
        int i2 = this.zab;
        zaa(i2 != 0 ? context.getResources().getDrawable(i2) : null, z2, false, false);
    }

    final void zac(Context context, Bitmap bitmap, boolean z2) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
