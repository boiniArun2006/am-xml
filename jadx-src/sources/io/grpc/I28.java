package io.grpc;

import io.grpc.j;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 {
    public static final j.w6 nr = j.w6.n("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f68156n;
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f68157t;

    public I28(List list, j jVar) {
        t1.Xo.O(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f68156n = listUnmodifiableList;
        this.rl = (j) t1.Xo.ck(jVar, "attrs");
        this.f68157t = listUnmodifiableList.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        if (this.f68156n.size() != i28.f68156n.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f68156n.size(); i2++) {
            if (!((SocketAddress) this.f68156n.get(i2)).equals(i28.f68156n.get(i2))) {
                return false;
            }
        }
        return this.rl.equals(i28.rl);
    }

    public int hashCode() {
        return this.f68157t;
    }

    public List n() {
        return this.f68156n;
    }

    public j rl() {
        return this.rl;
    }

    public String toString() {
        return "[" + this.f68156n + "/" + this.rl + "]";
    }

    public I28(SocketAddress socketAddress) {
        this(socketAddress, j.f68849t);
    }

    public I28(SocketAddress socketAddress, j jVar) {
        this(Collections.singletonList(socketAddress), jVar);
    }
}
