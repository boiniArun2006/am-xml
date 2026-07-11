package com.facebook;

import com.facebook.ci;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class qf extends FilterOutputStream implements Ln {
    public final long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final long f52993O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public lej f52994Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ci f52995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f52996o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f52997r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f52998t;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        rl(buffer.length);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(OutputStream out, ci requests, Map progressMap, long j2) {
        super(out);
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(progressMap, "progressMap");
        this.f52995n = requests;
        this.f52998t = progressMap;
        this.f52993O = j2;
        this.J2 = s4.g();
    }

    private final void Uo() {
        if (this.f52997r > this.f52996o) {
            for (ci.j jVar : this.f52995n.az()) {
            }
            this.f52996o = this.f52997r;
        }
    }

    private final void rl(long j2) {
        lej lejVar = this.f52994Z;
        if (lejVar != null) {
            lejVar.n(j2);
        }
        long j3 = this.f52997r + j2;
        this.f52997r = j3;
        if (j3 >= this.f52996o + this.J2 || j3 >= this.f52993O) {
            Uo();
        }
    }

    @Override // com.facebook.Ln
    public void n(GraphRequest graphRequest) {
        this.f52994Z = graphRequest != null ? (lej) this.f52998t.get(graphRequest) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator it = this.f52998t.values().iterator();
        while (it.hasNext()) {
            ((lej) it.next()).t();
        }
        Uo();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer, int i2, int i3) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i2, i3);
        rl(i3);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i2) throws IOException {
        ((FilterOutputStream) this).out.write(i2);
        rl(1L);
    }
}
