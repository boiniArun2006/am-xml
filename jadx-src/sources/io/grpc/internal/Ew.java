package io.grpc.internal;

import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.base.VerifyException;
import io.grpc.AbstractC2170c;
import io.grpc.internal.V1;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import t1.C2369c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Ew extends AbstractC2170c {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final String f68255S;
    static boolean ViF;
    private static final String WPU;
    private static final String XQ;
    static boolean aYN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f68257g;
    protected static boolean nY;
    private final boolean HI;
    private boolean Ik;
    private final String J2;
    private final V1.Ml KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f68259O;
    private final int Uo;
    private boolean az;
    private final AbstractC2170c.Wre ck;
    private final C2369c gh;
    private final JP.M mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final JP.Ln f68260n;
    protected boolean qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AbstractC2170c.Ml f68261r;
    private Executor ty;
    private final long xMQ;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Logger f68258o = Logger.getLogger(Ew.class.getName());

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Set f68256Z = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
    private final Random rl = new Random();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected volatile n f68262t = Ml.INSTANCE;
    private final AtomicReference nr = new AtomicReference();

    interface CN3 {
    }

    private final class I28 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AbstractC2170c.Ml f68263n;

        class j implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f68265n;

            j(boolean z2) {
                this.f68265n = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f68265n) {
                    Ew ew = Ew.this;
                    ew.qie = true;
                    if (ew.xMQ > 0) {
                        Ew.this.gh.J2().Uo();
                    }
                }
                Ew.this.Ik = false;
            }
        }

        I28(AbstractC2170c.Ml ml) {
            this.f68263n = (AbstractC2170c.Ml) t1.Xo.ck(ml, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            JP.M m2;
            j jVar;
            Logger logger = Ew.f68258o;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                Ew.f68258o.finer("Attempting DNS resolution of " + Ew.this.J2);
            }
            boolean z2 = true;
            w6 w6VarTy = null;
            try {
                try {
                    io.grpc.I28 i28Az = Ew.this.az();
                    AbstractC2170c.I28.j jVarNr = AbstractC2170c.I28.nr();
                    if (i28Az != null) {
                        if (Ew.f68258o.isLoggable(level)) {
                            Ew.f68258o.finer("Using proxy address " + i28Az);
                        }
                        jVarNr.rl(Collections.singletonList(i28Az));
                    } else {
                        w6VarTy = Ew.this.ty(false);
                        if (w6VarTy.f68269n != null) {
                            this.f68263n.n(w6VarTy.f68269n);
                            if (w6VarTy == null || w6VarTy.f68269n != null) {
                                z2 = false;
                            }
                            m2 = Ew.this.mUb;
                            jVar = new j(z2);
                            m2.execute(jVar);
                        }
                        if (w6VarTy.rl != null) {
                            jVarNr.rl(w6VarTy.rl);
                        }
                        if (w6VarTy.f68270t != null) {
                            jVarNr.nr(w6VarTy.f68270t);
                        }
                        io.grpc.j jVar2 = w6VarTy.nr;
                        if (jVar2 != null) {
                            jVarNr.t(jVar2);
                        }
                    }
                    this.f68263n.rl(jVarNr.n());
                    if (w6VarTy == null || w6VarTy.f68269n != null) {
                        z2 = false;
                    }
                    m2 = Ew.this.mUb;
                    jVar = new j(z2);
                    m2.execute(jVar);
                } catch (IOException e2) {
                    this.f68263n.n(io.grpc.SPz.f68186Z.Ik("Unable to resolve host " + Ew.this.J2).ck(e2));
                    if (0 == 0 || null.f68269n != null) {
                        z2 = false;
                    }
                    Ew.this.mUb.execute(new j(z2));
                }
            } catch (Throwable th) {
                if (0 == 0 || null.f68269n != null) {
                    z2 = false;
                }
                Ew.this.mUb.execute(new j(z2));
                throw th;
            }
        }
    }

    public interface Wre {
    }

    public interface n {
        List n(String str);
    }

    protected static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private io.grpc.SPz f68269n;
        public io.grpc.j nr;
        private List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private AbstractC2170c.n f68270t;

        private w6() {
        }
    }

    static CN3 XQ(ClassLoader classLoader) {
        try {
            try {
                try {
                    android.support.v4.media.j.n(Class.forName("io.grpc.internal.Sis", true, classLoader).asSubclass(CN3.class).getConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e2) {
                    f68258o.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                    return null;
                }
            } catch (Exception e3) {
                f68258o.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
                return null;
            }
        } catch (ClassCastException e4) {
            f68258o.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
            return null;
        } catch (ClassNotFoundException e5) {
            f68258o.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
            return null;
        }
    }

    private List nY() {
        Exception e2 = null;
        try {
            try {
                List listN = this.f68262t.n(this.J2);
                ArrayList arrayList = new ArrayList(listN.size());
                Iterator it = listN.iterator();
                while (it.hasNext()) {
                    arrayList.add(new io.grpc.I28(new InetSocketAddress((InetAddress) it.next(), this.Uo)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e3) {
                e2 = e3;
                t1.SPz.J2(e2);
                throw new RuntimeException(e2);
            }
        } catch (Throwable th) {
            if (e2 != null) {
                f68258o.log(Level.FINE, "Address resolution failure", (Throwable) e2);
            }
            throw th;
        }
    }

    protected static boolean te(boolean z2, boolean z3, String str) {
        if (!z2) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z3;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z4 = true;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '.') {
                z4 &= cCharAt >= '0' && cCharAt <= '9';
            }
        }
        return true ^ z4;
    }

    private enum Ml implements n {
        INSTANCE;

        @Override // io.grpc.internal.Ew.n
        public List n(String str) {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        XQ = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", V8ValueBoolean.FALSE);
        f68255S = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", V8ValueBoolean.FALSE);
        WPU = property3;
        aYN = Boolean.parseBoolean(property);
        ViF = Boolean.parseBoolean(property2);
        nY = Boolean.parseBoolean(property3);
        XQ(Ew.class.getClassLoader());
    }

    private static final List HI(Map map) {
        return mz.Uo(map, "clientLanguage");
    }

    private static String Ik() {
        if (f68257g == null) {
            try {
                f68257g = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return f68257g;
    }

    private void ViF() {
        if (this.Ik || this.az || !qie()) {
            return;
        }
        this.Ik = true;
        this.ty.execute(new I28(this.f68261r));
    }

    static List aYN(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                Object objN = l4Z.n(str.substring(12));
                if (!(objN instanceof List)) {
                    throw new ClassCastException("wrong type " + objN);
                }
                arrayList.addAll(mz.n((List) objN));
            } else {
                f68258o.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.grpc.I28 az() {
        JP.qf qfVarN = this.f68260n.n(InetSocketAddress.createUnresolved(this.J2, this.Uo));
        if (qfVarN != null) {
            return new io.grpc.I28(qfVarN);
        }
        return null;
    }

    private static final List ck(Map map) {
        return mz.Uo(map, "clientHostname");
    }

    private AbstractC2170c.n g() {
        List list = Collections.EMPTY_LIST;
        Z();
        if (list.isEmpty()) {
            f68258o.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.J2});
            return null;
        }
        AbstractC2170c.n nVarWPU = WPU(list, this.rl, Ik());
        if (nVarWPU == null) {
            return null;
        }
        if (nVarWPU.nr() != null) {
            return AbstractC2170c.n.rl(nVarWPU.nr());
        }
        return this.ck.n((Map) nVarWPU.t());
    }

    private static final Double o(Map map) {
        return mz.KN(map, "percentage");
    }

    private boolean qie() {
        if (!this.qie) {
            return true;
        }
        long j2 = this.xMQ;
        if (j2 != 0) {
            return j2 > 0 && this.gh.nr(TimeUnit.NANOSECONDS) > this.xMQ;
        }
        return true;
    }

    private static long r(boolean z2) {
        if (z2) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j2 = 30;
        if (property != null) {
            try {
                j2 = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f68258o.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j2 > 0 ? TimeUnit.SECONDS.toNanos(j2) : j2;
    }

    protected Wre Z() {
        if (!te(aYN, ViF, this.J2)) {
            return null;
        }
        android.support.v4.media.j.n(this.nr.get());
        return null;
    }

    @Override // io.grpc.AbstractC2170c
    public String n() {
        return this.f68259O;
    }

    @Override // io.grpc.AbstractC2170c
    public void nr(AbstractC2170c.Ml ml) {
        t1.Xo.S(this.f68261r == null, "already started");
        if (this.HI) {
            this.ty = (Executor) V1.nr(this.KN);
        }
        this.f68261r = (AbstractC2170c.Ml) t1.Xo.ck(ml, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ViF();
    }

    @Override // io.grpc.AbstractC2170c
    public void rl() {
        t1.Xo.S(this.f68261r != null, "not started");
        ViF();
    }

    @Override // io.grpc.AbstractC2170c
    public void t() {
        if (this.az) {
            return;
        }
        this.az = true;
        Executor executor = this.ty;
        if (executor == null || !this.HI) {
            return;
        }
        this.ty = (Executor) V1.J2(this.KN, executor);
    }

    protected w6 ty(boolean z2) {
        w6 w6Var = new w6();
        try {
            w6Var.rl = nY();
        } catch (Exception e2) {
            if (!z2) {
                w6Var.f68269n = io.grpc.SPz.f68186Z.Ik("Unable to resolve host " + this.J2).ck(e2);
                return w6Var;
            }
        }
        if (nY) {
            w6Var.f68270t = g();
        }
        return w6Var;
    }

    protected Ew(String str, String str2, AbstractC2170c.j jVar, V1.Ml ml, C2369c c2369c, boolean z2) {
        boolean z3;
        t1.Xo.ck(jVar, "args");
        this.KN = ml;
        URI uriCreate = URI.create("//" + ((String) t1.Xo.ck(str2, AppMeasurementSdk.ConditionalUserProperty.NAME)));
        if (uriCreate.getHost() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        t1.Xo.gh(z3, "Invalid DNS name: %s", str2);
        this.f68259O = (String) t1.Xo.Ik(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.J2 = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.Uo = jVar.n();
        } else {
            this.Uo = uriCreate.getPort();
        }
        this.f68260n = (JP.Ln) t1.Xo.ck(jVar.t(), "proxyDetector");
        this.xMQ = r(z2);
        this.gh = (C2369c) t1.Xo.ck(c2369c, "stopwatch");
        this.mUb = (JP.M) t1.Xo.ck(jVar.J2(), "syncContext");
        Executor executorRl = jVar.rl();
        this.ty = executorRl;
        this.HI = executorRl == null;
        this.ck = (AbstractC2170c.Wre) t1.Xo.ck(jVar.O(), "serviceConfigParser");
    }

    static Map S(Map map, Random random, String str) {
        boolean z2;
        for (Map.Entry entry : map.entrySet()) {
            t1.g9s.n(f68256Z.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List listHI = HI(map);
        if (listHI != null && !listHI.isEmpty()) {
            Iterator it = listHI.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dO = o(map);
        if (dO != null) {
            int iIntValue = dO.intValue();
            if (iIntValue >= 0 && iIntValue <= 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            t1.g9s.n(z2, "Bad percentage: %s", dO);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listCk = ck(map);
        if (listCk != null && !listCk.isEmpty()) {
            Iterator it2 = listCk.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapMUb = mz.mUb(map, "serviceConfig");
        if (mapMUb != null) {
            return mapMUb;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    static AbstractC2170c.n WPU(List list, Random random, String str) {
        try {
            Iterator it = aYN(list).iterator();
            Map mapS = null;
            while (it.hasNext()) {
                try {
                    mapS = S((Map) it.next(), random, str);
                    if (mapS != null) {
                        break;
                    }
                } catch (RuntimeException e2) {
                    return AbstractC2170c.n.rl(io.grpc.SPz.Uo.Ik("failed to pick service config choice").ck(e2));
                }
            }
            if (mapS == null) {
                return null;
            }
            return AbstractC2170c.n.n(mapS);
        } catch (IOException | RuntimeException e3) {
            return AbstractC2170c.n.rl(io.grpc.SPz.Uo.Ik("failed to parse TXT records").ck(e3));
        }
    }
}
