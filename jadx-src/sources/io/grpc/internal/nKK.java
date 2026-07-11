package io.grpc.internal;

import io.grpc.AbstractC2170c;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import t1.C2369c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class nKK extends io.grpc.s4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f68640n = io.grpc.o.n(nKK.class.getClassLoader());
    public static final /* synthetic */ int rl = 0;

    @Override // io.grpc.s4
    public int J2() {
        return 5;
    }

    @Override // io.grpc.s4
    protected boolean O() {
        return true;
    }

    @Override // io.grpc.AbstractC2170c.w6
    public String n() {
        return "dns";
    }

    @Override // io.grpc.s4
    public Collection t() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // io.grpc.AbstractC2170c.w6
    public AbstractC2170c rl(URI uri, AbstractC2170c.j jVar) {
        if ("dns".equals(uri.getScheme())) {
            String str = (String) t1.Xo.ck(uri.getPath(), "targetPath");
            t1.Xo.qie(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
            return new Ew(uri.getAuthority(), str.substring(1), jVar, psW.XQ, C2369c.t(), f68640n);
        }
        return null;
    }
}
