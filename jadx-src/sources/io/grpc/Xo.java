package io.grpc;

import io.grpc.AbstractC2170c;
import io.grpc.Pl;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Xo extends Pl.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AbstractC2170c.n f68216n = AbstractC2170c.n.n(new j());

    private static final class j {
        public String toString() {
            return "service config is unused";
        }

        j() {
        }
    }

    public abstract AbstractC2170c.n O(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract boolean nr();

    public abstract String rl();

    public abstract int t();

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return t1.Dsr.t(this).nr("policy", rl()).rl("priority", t()).O("available", nr()).toString();
    }
}
