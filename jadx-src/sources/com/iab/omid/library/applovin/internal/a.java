package com.iab.omid.library.applovin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f61093f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f61094a = new com.iab.omid.library.applovin.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f61095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f61097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f61098e;

    private a(d dVar) {
        this.f61097d = dVar;
    }

    public static a a() {
        return f61093f;
    }

    private void c() {
        if (!this.f61096c || this.f61095b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f61095b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f61094a.a();
        Date date = this.f61095b;
        if (date == null || dateA.after(date)) {
            this.f61095b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f61096c) {
            return;
        }
        this.f61097d.a(context);
        this.f61097d.a(this);
        this.f61097d.e();
        this.f61098e = this.f61097d.c();
        this.f61096c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z2) {
        if (!this.f61098e && z2) {
            d();
        }
        this.f61098e = z2;
    }
}
