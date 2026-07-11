package Dk;

import com.google.protobuf.KH;
import com.google.protobuf.g9s;
import com.google.protobuf.pO;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 extends g9s implements pO {
    public static final int BACKUPPERSISTENTID_FIELD_NUMBER = 2;
    private static final CN3 DEFAULT_INSTANCE;
    public static final int MIGRATIONVERSION_FIELD_NUMBER = 1;
    private static volatile KH PARSER;
    private String backupPersistentId_ = "";
    private int bitField0_;
    private int migrationVersion_;

    public static final class n extends g9s.n implements pO {
        private n() {
            super(CN3.DEFAULT_INSTANCE);
        }

        public n mUb(int i2) {
            copyOnWrite();
            ((CN3) this.instance).r(i2);
            return this;
        }

        public n xMQ(String str) {
            copyOnWrite();
            ((CN3) this.instance).Ik(str);
            return this;
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f1914n;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            f1914n = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1914n[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1914n[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1914n[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1914n[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1914n[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1914n[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CN3 cn3 = new CN3();
        DEFAULT_INSTANCE = cn3;
        g9s.registerDefaultInstance(CN3.class, cn3);
    }

    public static CN3 ck(InputStream inputStream) {
        return (CN3) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CN3 qie() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(int i2) {
        this.bitField0_ |= 1;
        this.migrationVersion_ = i2;
    }

    public boolean HI() {
        return (this.bitField0_ & 1) != 0;
    }

    public int az() {
        return this.migrationVersion_;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        switch (j.f1914n[fux.ordinal()]) {
            case 1:
                return new CN3();
            case 2:
                return new n();
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "migrationVersion_", "backupPersistentId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (CN3.class) {
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

    public String gh() {
        return this.backupPersistentId_;
    }

    public boolean ty() {
        return (this.bitField0_ & 2) != 0;
    }

    private CN3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ik(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.backupPersistentId_ = str;
    }
}
