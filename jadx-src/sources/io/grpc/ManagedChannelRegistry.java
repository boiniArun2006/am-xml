package io.grpc;

import io.grpc.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class ManagedChannelRegistry {
    private static ManagedChannelRegistry nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Logger f68158t = Logger.getLogger(ManagedChannelRegistry.class.getName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinkedHashSet f68159n = new LinkedHashSet();
    private List rl = Collections.EMPTY_LIST;

    public static final class ProviderNotFoundException extends RuntimeException {
    }

    class j implements Comparator {
        j() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(ManagedChannelProvider managedChannelProvider, ManagedChannelProvider managedChannelProvider2) {
            return managedChannelProvider.t() - managedChannelProvider2.t();
        }
    }

    private static final class n implements r.n {
        private n() {
        }

        /* synthetic */ n(j jVar) {
            this();
        }

        @Override // io.grpc.r.n
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public boolean n(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.rl();
        }

        @Override // io.grpc.r.n
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int rl(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.t();
        }
    }

    private synchronized void J2() {
        ArrayList arrayList = new ArrayList(this.f68159n);
        Collections.sort(arrayList, Collections.reverseOrder(new j()));
        this.rl = Collections.unmodifiableList(arrayList);
    }

    private synchronized void n(ManagedChannelProvider managedChannelProvider) {
        t1.Xo.O(managedChannelProvider.rl(), "isAvailable() returned false");
        this.f68159n.add(managedChannelProvider);
    }

    synchronized List O() {
        return this.rl;
    }

    public static synchronized ManagedChannelRegistry rl() {
        try {
            if (nr == null) {
                List<ManagedChannelProvider> listO = r.O(ManagedChannelProvider.class, t(), ManagedChannelProvider.class.getClassLoader(), new n(null));
                nr = new ManagedChannelRegistry();
                for (ManagedChannelProvider managedChannelProvider : listO) {
                    f68158t.fine("Service loader found " + managedChannelProvider);
                    nr.n(managedChannelProvider);
                }
                nr.J2();
            }
        } catch (Throwable th) {
            throw th;
        }
        return nr;
    }

    static List t() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(KaW.CN3.class);
        } catch (ClassNotFoundException e2) {
            f68158t.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e3) {
            f68158t.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e3);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e4) {
            f68158t.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e4);
        }
        return Collections.unmodifiableList(arrayList);
    }

    ManagedChannelProvider nr() {
        List listO = O();
        if (listO.isEmpty()) {
            return null;
        }
        return (ManagedChannelProvider) listO.get(0);
    }
}
