package com.fyber.inneractive.sdk.player.cache;

import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f54380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f54381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f54383d;

    public final void a(byte[] bArr) {
        OutputStream cVar;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        g gVar = this.f54383d;
        if (gVar.f54397g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f54383d.f54397g);
        }
        synchronized (gVar) {
            try {
                e eVar = this.f54380a;
                if (eVar.f54387d != this) {
                    throw new IllegalStateException();
                }
                if (!eVar.f54386c) {
                    this.f54381b[0] = true;
                }
                File fileB = eVar.b(0);
                try {
                    fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(fileB);
                } catch (FileNotFoundException unused) {
                    this.f54383d.f54391a.mkdirs();
                    try {
                        fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(fileB);
                    } catch (FileNotFoundException unused2) {
                        cVar = g.f54390q;
                    }
                }
                cVar = new c(this, fileOutputStreamFileOutputStreamCtor);
            } finally {
            }
        }
        try {
            cVar.write(bArr);
            Charset charset = l.f54413a;
            try {
                cVar.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
        } catch (Throwable th) {
            Charset charset2 = l.f54413a;
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (RuntimeException e3) {
                    throw e3;
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
    }

    public d(g gVar, e eVar) {
        this.f54383d = gVar;
        this.f54380a = eVar;
        this.f54381b = eVar.f54386c ? null : new boolean[gVar.f54397g];
    }

    public final void a() {
        if (this.f54382c) {
            g.a(this.f54383d, this, false);
            this.f54383d.c(this.f54380a.f54384a);
        } else {
            g.a(this.f54383d, this, true);
        }
    }
}
