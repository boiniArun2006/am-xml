package com.fyber.inneractive.sdk.flow.endcard;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f53664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f53665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f53666e;

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        return this.f53666e;
    }

    public w(v vVar) {
        super(vVar);
        ImageView imageView = new ImageView(IAConfigManager.f53260M.f53295u.a());
        imageView.setId(R.id.ia_inneractive_vast_endcard_static);
        this.f53665d = imageView;
        this.f53666e = a.a(imageView);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void destroy() {
        com.fyber.inneractive.sdk.util.v.a(b());
        Bitmap bitmap = this.f53664c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f53664c = null;
        this.f53665d.setImageBitmap(null);
    }
}
