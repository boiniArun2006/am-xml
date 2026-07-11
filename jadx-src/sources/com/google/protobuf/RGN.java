package com.google.protobuf;

import com.google.protobuf.g9s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class RGN extends g9s implements B {
    private static final RGN DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile KH PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    public static final class n extends g9s.n implements B {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(RGN.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.B
        public int getNanos() {
            return ((RGN) this.instance).getNanos();
        }

        @Override // com.google.protobuf.B
        public long getSeconds() {
            return ((RGN) this.instance).getSeconds();
        }

        public n clearNanos() {
            copyOnWrite();
            ((RGN) this.instance).clearNanos();
            return this;
        }

        public n clearSeconds() {
            copyOnWrite();
            ((RGN) this.instance).clearSeconds();
            return this;
        }

        public n setNanos(int i2) {
            copyOnWrite();
            ((RGN) this.instance).setNanos(i2);
            return this;
        }

        public n setSeconds(long j2) {
            copyOnWrite();
            ((RGN) this.instance).setSeconds(j2);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static RGN parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RGN) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RGN parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RGN) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    static /* synthetic */ class j {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        RGN rgn = new RGN();
        DEFAULT_INSTANCE = rgn;
        g9s.registerDefaultInstance(RGN.class, rgn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static RGN getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n newBuilder(RGN rgn) {
        return (n) DEFAULT_INSTANCE.createBuilder(rgn);
    }

    public static RGN parseDelimitedFrom(InputStream inputStream, QJ qj) throws IOException {
        return (RGN) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qj);
    }

    public static RGN parseFrom(ByteBuffer byteBuffer, QJ qj) throws InvalidProtocolBufferException {
        return (RGN) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer, qj);
    }

    public static KH parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i2) {
        this.nanos_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(long j2) {
        this.seconds_ = j2;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fux.ordinal()]) {
            case 1:
                return new RGN();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (RGN.class) {
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

    @Override // com.google.protobuf.B
    public int getNanos() {
        return this.nanos_;
    }

    @Override // com.google.protobuf.B
    public long getSeconds() {
        return this.seconds_;
    }

    private RGN() {
    }

    public static RGN parseFrom(C c2) throws InvalidProtocolBufferException {
        return (RGN) g9s.parseFrom(DEFAULT_INSTANCE, c2);
    }

    public static RGN parseFrom(C c2, QJ qj) throws InvalidProtocolBufferException {
        return (RGN) g9s.parseFrom(DEFAULT_INSTANCE, c2, qj);
    }

    public static RGN parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RGN) g9s.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RGN parseFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException {
        return (RGN) g9s.parseFrom(DEFAULT_INSTANCE, bArr, qj);
    }

    public static RGN parseFrom(InputStream inputStream) throws IOException {
        return (RGN) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RGN parseFrom(InputStream inputStream, QJ qj) throws IOException {
        return (RGN) g9s.parseFrom(DEFAULT_INSTANCE, inputStream, qj);
    }

    public static RGN parseFrom(AbstractC1923o abstractC1923o) throws IOException {
        return (RGN) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o);
    }

    public static RGN parseFrom(AbstractC1923o abstractC1923o, QJ qj) throws IOException {
        return (RGN) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o, qj);
    }
}
