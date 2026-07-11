package r1;

import GJW.C;
import GJW.Lu;
import GJW.N;
import GJW.lej;
import GJW.vd;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.ForwardingFileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w6 implements Closeable, Flushable {
    private long E2;
    private final int J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f72743N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f72744O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final LinkedHashMap f72745S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f72746T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final I28 f72747U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private BufferedSink f72748X;
    private boolean Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Path f72749Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f72750e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final vd f72751g;
    private boolean jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f72752n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Path f72753o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Path f72754r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f72755t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f72756v;
    public static final j P5 = new j(null);
    private static final Regex M7 = new Regex("[a-z0-9_-]{1,120}");

    public final class Ml implements Closeable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final C1146w6 f72758n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f72759t;

        public Ml(C1146w6 c1146w6) {
            this.f72758n = c1146w6;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f72759t) {
                return;
            }
            this.f72759t = true;
            w6 w6Var = w6.this;
            synchronized (w6Var) {
                try {
                    this.f72758n.gh(r1.J2() - 1);
                    if (this.f72758n.J2() == 0 && this.f72758n.KN()) {
                        w6Var.ub(this.f72758n);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final n n() {
            n nVarQm;
            w6 w6Var = w6.this;
            synchronized (w6Var) {
                close();
                nVarQm = w6Var.qm(this.f72758n.nr());
            }
            return nVarQm;
        }

        public final Path rl(int i2) {
            if (this.f72759t) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Path) this.f72758n.n().get(i2);
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72760n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Wre(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new Wre(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72760n == 0) {
                ResultKt.throwOnFailure(obj);
                w6 w6Var = w6.this;
                synchronized (w6Var) {
                    if (w6Var.f72743N && !w6Var.f72756v) {
                        try {
                            w6Var.HBN();
                        } catch (IOException unused) {
                            w6Var.Xw = true;
                        }
                        try {
                            if (w6Var.K()) {
                                w6Var.X4T();
                            }
                        } catch (IOException unused2) {
                            w6Var.jB = true;
                            w6Var.f72748X = Okio.buffer(Okio.blackhole());
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final C1146w6 f72762n;
        private boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean[] f72763t;

        public final void n() {
            nr(false);
        }

        public final void rl() {
            nr(true);
        }

        public n(C1146w6 c1146w6) {
            this.f72762n = c1146w6;
            this.f72763t = new boolean[w6.this.J2];
        }

        private final void nr(boolean z2) {
            w6 w6Var = w6.this;
            synchronized (w6Var) {
                try {
                    if (this.rl) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.areEqual(this.f72762n.rl(), this)) {
                        w6Var.fcU(this, z2);
                    }
                    this.rl = true;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final Path J2(int i2) {
            Path path;
            w6 w6Var = w6.this;
            synchronized (w6Var) {
                if (this.rl) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f72763t[i2] = true;
                Object obj = this.f72762n.t().get(i2);
                kYF.I28.n(w6Var.f72747U, (Path) obj);
                path = (Path) obj;
            }
            return path;
        }

        public final boolean[] KN() {
            return this.f72763t;
        }

        public final void O() {
            if (Intrinsics.areEqual(this.f72762n.rl(), this)) {
                this.f72762n.az(true);
            }
        }

        public final C1146w6 Uo() {
            return this.f72762n;
        }

        public final Ml t() {
            Ml mlOrg;
            w6 w6Var = w6.this;
            synchronized (w6Var) {
                rl();
                mlOrg = w6Var.Org(this.f72762n.nr());
            }
            return mlOrg;
        }
    }

    /* JADX INFO: renamed from: r1.w6$w6, reason: collision with other inner class name */
    public final class C1146w6 {
        private boolean J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f72764O;
        private n Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f72765n;
        private final ArrayList nr;
        private final long[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ArrayList f72766t;

        public C1146w6(String str) {
            this.f72765n = str;
            this.rl = new long[w6.this.J2];
            this.f72766t = new ArrayList(w6.this.J2);
            this.nr = new ArrayList(w6.this.J2);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i2 = w6.this.J2;
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(i3);
                this.f72766t.add(w6.this.f72752n.resolve(sb.toString()));
                sb.append(".tmp");
                this.nr.add(w6.this.f72752n.resolve(sb.toString()));
                sb.setLength(length);
            }
        }

        public final void HI(BufferedSink bufferedSink) throws IOException {
            for (long j2 : this.rl) {
                bufferedSink.writeByte(32).writeDecimalLong(j2);
            }
        }

        public final int J2() {
            return this.KN;
        }

        public final boolean KN() {
            return this.J2;
        }

        public final long[] O() {
            return this.rl;
        }

        public final boolean Uo() {
            return this.f72764O;
        }

        public final void az(boolean z2) {
            this.J2 = z2;
        }

        public final void gh(int i2) {
            this.KN = i2;
        }

        public final ArrayList n() {
            return this.f72766t;
        }

        public final String nr() {
            return this.f72765n;
        }

        public final void qie(boolean z2) {
            this.f72764O = z2;
        }

        public final n rl() {
            return this.Uo;
        }

        public final ArrayList t() {
            return this.nr;
        }

        public final Ml ty() {
            if (!this.f72764O || this.Uo != null || this.J2) {
                return null;
            }
            ArrayList arrayList = this.f72766t;
            w6 w6Var = w6.this;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!w6Var.f72747U.exists((Path) arrayList.get(i2))) {
                    try {
                        w6Var.ub(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.KN++;
            return w6.this.new Ml(this);
        }

        public final void xMQ(n nVar) {
            this.Uo = nVar;
        }

        public final void mUb(List list) throws IOException {
            if (list.size() == w6.this.J2) {
                try {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        this.rl[i2] = Long.parseLong((String) list.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + list);
                }
            }
            throw new IOException("unexpected journal line: " + list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Bu(w6 w6Var, IOException iOException) {
        w6Var.f72746T = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void X4T() {
        Throwable th;
        try {
            BufferedSink bufferedSink = this.f72748X;
            if (bufferedSink != null) {
                bufferedSink.close();
            }
            BufferedSink bufferedSinkBuffer = Okio.buffer(this.f72747U.sink(this.f72753o, false));
            try {
                bufferedSinkBuffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                bufferedSinkBuffer.writeUtf8("1").writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.f72744O).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.J2).writeByte(10);
                bufferedSinkBuffer.writeByte(10);
                for (C1146w6 c1146w6 : this.f72745S.values()) {
                    if (c1146w6.rl() != null) {
                        bufferedSinkBuffer.writeUtf8("DIRTY");
                        bufferedSinkBuffer.writeByte(32);
                        bufferedSinkBuffer.writeUtf8(c1146w6.nr());
                        bufferedSinkBuffer.writeByte(10);
                    } else {
                        bufferedSinkBuffer.writeUtf8("CLEAN");
                        bufferedSinkBuffer.writeByte(32);
                        bufferedSinkBuffer.writeUtf8(c1146w6.nr());
                        c1146w6.HI(bufferedSinkBuffer);
                        bufferedSinkBuffer.writeByte(10);
                    }
                }
                Unit unit = Unit.INSTANCE;
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            if (this.f72747U.exists(this.f72754r)) {
                this.f72747U.atomicMove(this.f72754r, this.f72749Z);
                this.f72747U.atomicMove(this.f72753o, this.f72754r);
                this.f72747U.delete(this.f72749Z);
            } else {
                this.f72747U.atomicMove(this.f72753o, this.f72754r);
            }
            this.f72748X = T3L();
            this.f72750e = 0;
            this.f72746T = false;
            this.jB = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void fcU(n nVar, boolean z2) {
        C1146w6 c1146w6Uo = nVar.Uo();
        if (!Intrinsics.areEqual(c1146w6Uo.rl(), nVar)) {
            throw new IllegalStateException("Check failed.");
        }
        int i2 = 0;
        if (!z2 || c1146w6Uo.KN()) {
            int i3 = this.J2;
            while (i2 < i3) {
                this.f72747U.delete((Path) c1146w6Uo.t().get(i2));
                i2++;
            }
        } else {
            int i5 = this.J2;
            for (int i7 = 0; i7 < i5; i7++) {
                if (nVar.KN()[i7] && !this.f72747U.exists((Path) c1146w6Uo.t().get(i7))) {
                    nVar.n();
                    return;
                }
            }
            int i8 = this.J2;
            while (i2 < i8) {
                Path path = (Path) c1146w6Uo.t().get(i2);
                Path path2 = (Path) c1146w6Uo.n().get(i2);
                if (this.f72747U.exists(path)) {
                    this.f72747U.atomicMove(path, path2);
                } else {
                    kYF.I28.n(this.f72747U, (Path) c1146w6Uo.n().get(i2));
                }
                long j2 = c1146w6Uo.O()[i2];
                Long size = this.f72747U.metadata(path2).getSize();
                long jLongValue = size != null ? size.longValue() : 0L;
                c1146w6Uo.O()[i2] = jLongValue;
                this.E2 = (this.E2 - j2) + jLongValue;
                i2++;
            }
        }
        c1146w6Uo.xMQ(null);
        if (c1146w6Uo.KN()) {
            ub(c1146w6Uo);
            return;
        }
        this.f72750e++;
        BufferedSink bufferedSink = this.f72748X;
        Intrinsics.checkNotNull(bufferedSink);
        if (z2 || c1146w6Uo.Uo()) {
            c1146w6Uo.qie(true);
            bufferedSink.writeUtf8("CLEAN");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(c1146w6Uo.nr());
            c1146w6Uo.HI(bufferedSink);
            bufferedSink.writeByte(10);
        } else {
            this.f72745S.remove(c1146w6Uo.nr());
            bufferedSink.writeUtf8("REMOVE");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(c1146w6Uo.nr());
            bufferedSink.writeByte(10);
        }
        bufferedSink.flush();
        if (this.E2 > this.f72755t || K()) {
            How();
        }
    }

    public final synchronized void GD() {
        try {
            if (this.f72743N) {
                return;
            }
            this.f72747U.delete(this.f72753o);
            if (this.f72747U.exists(this.f72749Z)) {
                if (this.f72747U.exists(this.f72754r)) {
                    this.f72747U.delete(this.f72749Z);
                } else {
                    this.f72747U.atomicMove(this.f72749Z, this.f72754r);
                }
            }
            if (this.f72747U.exists(this.f72754r)) {
                try {
                    Uf();
                    p0N();
                    this.f72743N = true;
                    return;
                } catch (IOException unused) {
                    try {
                        n1();
                        this.f72756v = false;
                        X4T();
                        this.f72743N = true;
                    } catch (Throwable th) {
                        this.f72756v = false;
                        throw th;
                    }
                }
            }
            X4T();
            this.f72743N = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Ml Org(String str) {
        Ml mlTy;
        Mx();
        UF(str);
        GD();
        C1146w6 c1146w6 = (C1146w6) this.f72745S.get(str);
        if (c1146w6 != null && (mlTy = c1146w6.ty()) != null) {
            this.f72750e++;
            BufferedSink bufferedSink = this.f72748X;
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.writeUtf8("READ");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(str);
            bufferedSink.writeByte(10);
            if (K()) {
                How();
            }
            return mlTy;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f72743N && !this.f72756v) {
                for (C1146w6 c1146w6 : (C1146w6[]) this.f72745S.values().toArray(new C1146w6[0])) {
                    n nVarRl = c1146w6.rl();
                    if (nVarRl != null) {
                        nVarRl.O();
                    }
                }
                HBN();
                Lu.O(this.f72751g, null, 1, null);
                BufferedSink bufferedSink = this.f72748X;
                Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.close();
                this.f72748X = null;
                this.f72756v = true;
                return;
            }
            this.f72756v = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f72743N) {
            Mx();
            HBN();
            BufferedSink bufferedSink = this.f72748X;
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.flush();
        }
    }

    public final synchronized n qm(String str) {
        Mx();
        UF(str);
        GD();
        C1146w6 c1146w6 = (C1146w6) this.f72745S.get(str);
        if ((c1146w6 != null ? c1146w6.rl() : null) != null) {
            return null;
        }
        if (c1146w6 != null && c1146w6.J2() != 0) {
            return null;
        }
        if (!this.Xw && !this.jB) {
            BufferedSink bufferedSink = this.f72748X;
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(str);
            bufferedSink.writeByte(10);
            bufferedSink.flush();
            if (this.f72746T) {
                return null;
            }
            if (c1146w6 == null) {
                c1146w6 = new C1146w6(str);
                this.f72745S.put(str, c1146w6);
            }
            n nVar = new n(c1146w6);
            c1146w6.xMQ(nVar);
            return nVar;
        }
        How();
        return null;
    }

    public static final class I28 extends ForwardingFileSystem {
        I28(FileSystem fileSystem) {
            super(fileSystem);
        }

        @Override // okio.ForwardingFileSystem, okio.FileSystem
        public Sink sink(Path path, boolean z2) throws IOException {
            Path pathParent = path.parent();
            if (pathParent != null) {
                createDirectories(pathParent);
            }
            return super.sink(path, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void HBN() {
        while (this.E2 > this.f72755t) {
            if (!Qu()) {
                return;
            }
        }
        this.Xw = false;
    }

    private final void How() {
        C.nr(this.f72751g, null, null, new Wre(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K() {
        return this.f72750e >= 2000;
    }

    private final void Mx() {
        if (this.f72756v) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final boolean Qu() throws IOException {
        for (C1146w6 c1146w6 : this.f72745S.values()) {
            if (!c1146w6.KN()) {
                ub(c1146w6);
                return true;
            }
        }
        return false;
    }

    private final BufferedSink T3L() {
        return Okio.buffer(new r1.Ml(this.f72747U.appendingSink(this.f72754r), new Function1() { // from class: r1.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w6.Bu(this.f72742n, (IOException) obj);
            }
        }));
    }

    private final void UF(String str) {
        if (M7.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + Typography.quote).toString());
    }

    private final void Uf() throws Throwable {
        BufferedSource bufferedSourceBuffer = Okio.buffer(this.f72747U.source(this.f72754r));
        try {
            String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict3 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict4 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict5 = bufferedSourceBuffer.readUtf8LineStrict();
            if (!Intrinsics.areEqual("libcore.io.DiskLruCache", utf8LineStrict) || !Intrinsics.areEqual("1", utf8LineStrict2) || !Intrinsics.areEqual(String.valueOf(this.f72744O), utf8LineStrict3) || !Intrinsics.areEqual(String.valueOf(this.J2), utf8LineStrict4) || utf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict3 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + ']');
            }
            int i2 = 0;
            while (true) {
                try {
                    f(bufferedSourceBuffer.readUtf8LineStrict());
                    i2++;
                } catch (EOFException unused) {
                    this.f72750e = i2 - this.f72745S.size();
                    if (bufferedSourceBuffer.exhausted()) {
                        this.f72748X = T3L();
                    } else {
                        X4T();
                    }
                    Unit unit = Unit.INSTANCE;
                    if (bufferedSourceBuffer != null) {
                        try {
                            bufferedSourceBuffer.close();
                            th = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } else {
                        th = null;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th3) {
                    ExceptionsKt.addSuppressed(th, th3);
                }
            }
        }
        if (th != null) {
            throw th;
        }
    }

    private final void f(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i2 = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ' ', i2, false, 4, (Object) null);
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (iIndexOf$default == 6 && StringsKt.startsWith$default(str, "REMOVE", false, 2, (Object) null)) {
                this.f72745S.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        LinkedHashMap linkedHashMap = this.f72745S;
        Object c1146w6 = linkedHashMap.get(strSubstring);
        if (c1146w6 == null) {
            c1146w6 = new C1146w6(strSubstring);
            linkedHashMap.put(strSubstring, c1146w6);
        }
        C1146w6 c1146w62 = (C1146w6) c1146w6;
        if (iIndexOf$default2 != -1 && iIndexOf$default == 5 && StringsKt.startsWith$default(str, "CLEAN", false, 2, (Object) null)) {
            String strSubstring2 = str.substring(iIndexOf$default2 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            List listSplit$default = StringsKt.split$default((CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
            c1146w62.qie(true);
            c1146w62.xMQ(null);
            c1146w62.mUb(listSplit$default);
            return;
        }
        if (iIndexOf$default2 == -1 && iIndexOf$default == 5 && StringsKt.startsWith$default(str, "DIRTY", false, 2, (Object) null)) {
            c1146w62.xMQ(new n(c1146w62));
            return;
        }
        if (iIndexOf$default2 == -1 && iIndexOf$default == 4 && StringsKt.startsWith$default(str, "READ", false, 2, (Object) null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final void p0N() throws IOException {
        Iterator it = this.f72745S.values().iterator();
        long j2 = 0;
        while (it.hasNext()) {
            C1146w6 c1146w6 = (C1146w6) it.next();
            int i2 = 0;
            if (c1146w6.rl() == null) {
                int i3 = this.J2;
                while (i2 < i3) {
                    j2 += c1146w6.O()[i2];
                    i2++;
                }
            } else {
                c1146w6.xMQ(null);
                int i5 = this.J2;
                while (i2 < i5) {
                    this.f72747U.delete((Path) c1146w6.n().get(i2));
                    this.f72747U.delete((Path) c1146w6.t().get(i2));
                    i2++;
                }
                it.remove();
            }
        }
        this.E2 = j2;
    }

    public w6(FileSystem fileSystem, Path path, lej lejVar, long j2, int i2, int i3) {
        this.f72752n = path;
        this.f72755t = j2;
        this.f72744O = i2;
        this.J2 = i3;
        if (j2 > 0) {
            if (i3 > 0) {
                this.f72754r = path.resolve("journal");
                this.f72753o = path.resolve("journal.tmp");
                this.f72749Z = path.resolve("journal.bkp");
                this.f72745S = new LinkedHashMap(0, 0.75f, true);
                this.f72751g = Lu.n(N.rl(null, 1, null).plus(lejVar.GD(1)));
                this.f72747U = new I28(fileSystem);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private final void n1() throws IOException {
        close();
        kYF.I28.rl(this.f72747U, this.f72752n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ub(C1146w6 c1146w6) throws IOException {
        BufferedSink bufferedSink;
        if (c1146w6.J2() > 0 && (bufferedSink = this.f72748X) != null) {
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(c1146w6.nr());
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (c1146w6.J2() <= 0 && c1146w6.rl() == null) {
            int i2 = this.J2;
            for (int i3 = 0; i3 < i2; i3++) {
                this.f72747U.delete((Path) c1146w6.n().get(i3));
                this.E2 -= c1146w6.O()[i3];
                c1146w6.O()[i3] = 0;
            }
            this.f72750e++;
            BufferedSink bufferedSink2 = this.f72748X;
            if (bufferedSink2 != null) {
                bufferedSink2.writeUtf8("REMOVE");
                bufferedSink2.writeByte(32);
                bufferedSink2.writeUtf8(c1146w6.nr());
                bufferedSink2.writeByte(10);
            }
            this.f72745S.remove(c1146w6.nr());
            if (K()) {
                How();
            }
            return true;
        }
        c1146w6.az(true);
        return true;
    }
}
