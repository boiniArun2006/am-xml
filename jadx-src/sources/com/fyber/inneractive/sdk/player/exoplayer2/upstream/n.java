package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.FileUploadManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f56125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f56126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f56127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f56128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f56129e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) {
        if (this.f56129e != null) {
            throw new IllegalStateException();
        }
        String scheme = kVar.f56108a.getScheme();
        Uri uri = kVar.f56108a;
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f56234a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || scheme2.equals(FileUploadManager.f61570h)) {
            if (kVar.f56108a.getPath().startsWith("/android_asset/")) {
                this.f56129e = this.f56127c;
            } else {
                this.f56129e = this.f56126b;
            }
        } else if ("asset".equals(scheme)) {
            this.f56129e = this.f56127c;
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            this.f56129e = this.f56128d;
        } else {
            this.f56129e = this.f56125a;
        }
        return this.f56129e.a(kVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        h hVar = this.f56129e;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f56129e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i2, int i3) {
        return this.f56129e.read(bArr, i2, i3);
    }

    public n(Context context, m mVar, h hVar) {
        hVar.getClass();
        this.f56125a = hVar;
        this.f56126b = new s(mVar);
        this.f56127c = new d(context, mVar);
        this.f56128d = new f(context, mVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        h hVar = this.f56129e;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }
}
