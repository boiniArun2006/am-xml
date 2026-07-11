package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class u extends OutputStream implements Ln {
    public lej J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public GraphRequest f53053O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f53054n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f53055r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f53056t = new HashMap();

    @Override // java.io.OutputStream
    public void write(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        rl(buffer.length);
    }

    public final int Uo() {
        return this.f53055r;
    }

    public final Map Z() {
        return this.f53056t;
    }

    @Override // com.facebook.Ln
    public void n(GraphRequest graphRequest) {
        this.f53053O = graphRequest;
        this.J2 = graphRequest != null ? (lej) this.f53056t.get(graphRequest) : null;
    }

    public final void rl(long j2) {
        GraphRequest graphRequest = this.f53053O;
        if (graphRequest == null) {
            return;
        }
        if (this.J2 == null) {
            lej lejVar = new lej(this.f53054n, graphRequest);
            this.J2 = lejVar;
            this.f53056t.put(graphRequest, lejVar);
        }
        lej lejVar2 = this.J2;
        if (lejVar2 != null) {
            lejVar2.rl(j2);
        }
        this.f53055r += (int) j2;
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        rl(i3);
    }

    public u(Handler handler) {
        this.f53054n = handler;
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        rl(1L);
    }
}
