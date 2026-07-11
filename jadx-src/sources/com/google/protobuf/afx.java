package com.google.protobuf;

import com.google.protobuf.g9s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class afx extends g9s implements Z {
    private static final afx DEFAULT_INSTANCE;
    private static volatile KH PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    public static final class n extends g9s.n implements Z {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(afx.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.Z
        public int getValue() {
            return ((afx) this.instance).getValue();
        }

        public n clearValue() {
            copyOnWrite();
            ((afx) this.instance).clearValue();
            return this;
        }

        public n setValue(int i2) {
            copyOnWrite();
            ((afx) this.instance).setValue(i2);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static afx parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (afx) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afx parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (afx) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        afx afxVar = new afx();
        DEFAULT_INSTANCE = afxVar;
        g9s.registerDefaultInstance(afx.class, afxVar);
    }

    public static afx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n newBuilder(afx afxVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(afxVar);
    }

    public static afx parseDelimitedFrom(InputStream inputStream, QJ qj) throws IOException {
        return (afx) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qj);
    }

    public static afx parseFrom(ByteBuffer byteBuffer, QJ qj) throws InvalidProtocolBufferException {
        return (afx) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer, qj);
    }

    public static KH parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i2) {
        this.value_ = i2;
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fux.ordinal()]) {
            case 1:
                return new afx();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (afx.class) {
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

    @Override // com.google.protobuf.Z
    public int getValue() {
        return this.value_;
    }

    private afx() {
    }

    public static afx of(int i2) {
        return (afx) newBuilder().setValue(i2).build();
    }

    public static afx parseFrom(C c2) throws InvalidProtocolBufferException {
        return (afx) g9s.parseFrom(DEFAULT_INSTANCE, c2);
    }

    public static afx parseFrom(C c2, QJ qj) throws InvalidProtocolBufferException {
        return (afx) g9s.parseFrom(DEFAULT_INSTANCE, c2, qj);
    }

    public static afx parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (afx) g9s.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static afx parseFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException {
        return (afx) g9s.parseFrom(DEFAULT_INSTANCE, bArr, qj);
    }

    public static afx parseFrom(InputStream inputStream) throws IOException {
        return (afx) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afx parseFrom(InputStream inputStream, QJ qj) throws IOException {
        return (afx) g9s.parseFrom(DEFAULT_INSTANCE, inputStream, qj);
    }

    public static afx parseFrom(AbstractC1923o abstractC1923o) throws IOException {
        return (afx) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o);
    }

    public static afx parseFrom(AbstractC1923o abstractC1923o, QJ qj) throws IOException {
        return (afx) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o, qj);
    }
}
