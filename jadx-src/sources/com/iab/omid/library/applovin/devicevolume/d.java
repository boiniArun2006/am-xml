package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f61088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f61089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f61090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f61091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f61092e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f61088a = context;
        this.f61089b = (AudioManager) context.getSystemService("audio");
        this.f61090c = aVar;
        this.f61091d = cVar;
    }

    private float a() {
        return this.f61090c.a(this.f61089b.getStreamVolume(3), this.f61089b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f61091d.a(this.f61092e);
    }

    public void c() {
        this.f61092e = a();
        b();
        this.f61088a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f61088a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        super.onChange(z2);
        float fA2 = a();
        if (a(fA2)) {
            this.f61092e = fA2;
            b();
        }
    }

    private boolean a(float f3) {
        return f3 != this.f61092e;
    }
}
