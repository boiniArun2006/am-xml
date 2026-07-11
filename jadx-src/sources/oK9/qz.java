package oK9;

import com.google.protobuf.CM;
import com.google.protobuf.K;
import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;
import com.google.protobuf.psW;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class qz extends g9s implements pO {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final qz DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile KH PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private psW counters_ = psW.emptyMapField();
    private psW customAttributes_ = psW.emptyMapField();
    private String name_ = "";
    private nKK.Dsr subtraces_ = g9s.emptyProtobufList();
    private nKK.Dsr perfSessions_ = g9s.emptyProtobufList();

    private static final class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final K f71416n;

        static {
            CM.n nVar = CM.n.STRING;
            f71416n = K.newDefaultInstance(nVar, "", nVar, "");
        }
    }

    public static final class n extends g9s.n implements pO {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(qz.DEFAULT_INSTANCE);
        }

        public n HI(String str, long j2) {
            str.getClass();
            copyOnWrite();
            ((qz) this.instance).fD().put(str, Long.valueOf(j2));
            return this;
        }

        public n Ik(long j2) {
            copyOnWrite();
            ((qz) this.instance).bzg(j2);
            return this;
        }

        public n az(Map map) {
            copyOnWrite();
            ((qz) this.instance).fD().putAll(map);
            return this;
        }

        public n ck(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((qz) this.instance).E2().put(str, str2);
            return this;
        }

        public n gh(C c2) {
            copyOnWrite();
            ((qz) this.instance).Z(c2);
            return this;
        }

        public n mUb(Iterable iterable) {
            copyOnWrite();
            ((qz) this.instance).o(iterable);
            return this;
        }

        public n o(String str) {
            copyOnWrite();
            ((qz) this.instance).jB(str);
            return this;
        }

        public n qie(qz qzVar) {
            copyOnWrite();
            ((qz) this.instance).XQ(qzVar);
            return this;
        }

        public n r(long j2) {
            copyOnWrite();
            ((qz) this.instance).Xw(j2);
            return this;
        }

        public n ty(Map map) {
            copyOnWrite();
            ((qz) this.instance).E2().putAll(map);
            return this;
        }

        public n xMQ(Iterable iterable) {
            copyOnWrite();
            ((qz) this.instance).r(iterable);
            return this;
        }
    }

    private static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final K f71418n = K.newDefaultInstance(CM.n.STRING, "", CM.n.INT64, 0L);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f71417n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f71417n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71417n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71417n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71417n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71417n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71417n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71417n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        qz qzVar = new qz();
        DEFAULT_INSTANCE = qzVar;
        g9s.registerDefaultInstance(qz.class, qzVar);
    }

    private void WPU() {
        nKK.Dsr dsr = this.perfSessions_;
        if (dsr.isModifiable()) {
            return;
        }
        this.perfSessions_ = g9s.mutableCopy(dsr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xw(long j2) {
        this.bitField0_ |= 8;
        this.durationUs_ = j2;
    }

    private void aYN() {
        nKK.Dsr dsr = this.subtraces_;
        if (dsr.isModifiable()) {
            return;
        }
        this.subtraces_ = g9s.mutableCopy(dsr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bzg(long j2) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j2;
    }

    private psW nHg() {
        return this.counters_;
    }

    public static n rV9() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    private psW s7N() {
        return this.customAttributes_;
    }

    public static qz te() {
        return DEFAULT_INSTANCE;
    }

    private psW v() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    private psW wTp() {
        if (!this.counters_.isMutable()) {
            this.counters_ = this.counters_.mutableCopy();
        }
        return this.counters_;
    }

    public boolean N() {
        return (this.bitField0_ & 4) != 0;
    }

    public List T() {
        return this.subtraces_;
    }

    public List X() {
        return this.perfSessions_;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.f71417n[fux.ordinal()]) {
            case 1:
                return new qz();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", w6.f71418n, "subtraces_", qz.class, "customAttributes_", Ml.f71416n, "perfSessions_", C.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (qz.class) {
                    try {
                        w6Var = PARSER;
                        if (w6Var == null) {
                            w6Var = new g9s.w6(DEFAULT_INSTANCE);
                            PARSER = w6Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return w6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String e() {
        return this.name_;
    }

    public long iF() {
        return this.durationUs_;
    }

    private qz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map E2() {
        return v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void XQ(qz qzVar) {
        qzVar.getClass();
        aYN();
        this.subtraces_.add(qzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(C c2) {
        c2.getClass();
        WPU();
        this.perfSessions_.add(c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map fD() {
        return wTp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jB(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Iterable iterable) {
        aYN();
        com.google.protobuf.j.addAll(iterable, (List) this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(Iterable iterable) {
        WPU();
        com.google.protobuf.j.addAll(iterable, (List) this.perfSessions_);
    }

    public boolean S(String str) {
        str.getClass();
        return s7N().containsKey(str);
    }

    public int ViF() {
        return nHg().size();
    }

    public Map g() {
        return Collections.unmodifiableMap(s7N());
    }

    public Map nY() {
        return Collections.unmodifiableMap(nHg());
    }
}
