package com.google.protobuf;

import com.google.protobuf.g9s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 extends g9s implements Wre {
    private static final I28 DEFAULT_INSTANCE;
    private static volatile KH PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private C value_ = C.EMPTY;

    public static final class n extends g9s.n implements Wre {
        /* synthetic */ n(j jVar) {
            this();
        }

        private n() {
            super(I28.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.Wre
        public String getTypeUrl() {
            return ((I28) this.instance).getTypeUrl();
        }

        @Override // com.google.protobuf.Wre
        public C getTypeUrlBytes() {
            return ((I28) this.instance).getTypeUrlBytes();
        }

        @Override // com.google.protobuf.Wre
        public C getValue() {
            return ((I28) this.instance).getValue();
        }

        public n clearTypeUrl() {
            copyOnWrite();
            ((I28) this.instance).clearTypeUrl();
            return this;
        }

        public n clearValue() {
            copyOnWrite();
            ((I28) this.instance).clearValue();
            return this;
        }

        public n setTypeUrl(String str) {
            copyOnWrite();
            ((I28) this.instance).setTypeUrl(str);
            return this;
        }

        public n setTypeUrlBytes(C c2) {
            copyOnWrite();
            ((I28) this.instance).setTypeUrlBytes(c2);
            return this;
        }

        public n setValue(C c2) {
            copyOnWrite();
            ((I28) this.instance).setValue(c2);
            return this;
        }
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static I28 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (I28) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static I28 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        I28 i28 = new I28();
        DEFAULT_INSTANCE = i28;
        g9s.registerDefaultInstance(I28.class, i28);
    }

    public static I28 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n newBuilder(I28 i28) {
        return (n) DEFAULT_INSTANCE.createBuilder(i28);
    }

    public static I28 parseDelimitedFrom(InputStream inputStream, QJ qj) throws IOException {
        return (I28) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qj);
    }

    public static I28 parseFrom(ByteBuffer byteBuffer, QJ qj) throws InvalidProtocolBufferException {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer, qj);
    }

    public static KH parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.g9s
    protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
        KH w6Var;
        j jVar = null;
        switch (j.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fux.ordinal()]) {
            case 1:
                return new I28();
            case 2:
                return new n(jVar);
            case 3:
                return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                KH kh = PARSER;
                if (kh != null) {
                    return kh;
                }
                synchronized (I28.class) {
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

    @Override // com.google.protobuf.Wre
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // com.google.protobuf.Wre
    public C getTypeUrlBytes() {
        return C.copyFromUtf8(this.typeUrl_);
    }

    @Override // com.google.protobuf.Wre
    public C getValue() {
        return this.value_;
    }

    private I28() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static I28 parseFrom(C c2) throws InvalidProtocolBufferException {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(C c2) {
        com.google.protobuf.j.checkByteStringIsUtf8(c2);
        this.typeUrl_ = c2.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(C c2) {
        c2.getClass();
        this.value_ = c2;
    }

    public static I28 parseFrom(C c2, QJ qj) throws InvalidProtocolBufferException {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, c2, qj);
    }

    public static I28 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static I28 parseFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, bArr, qj);
    }

    public static I28 parseFrom(InputStream inputStream) throws IOException {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static I28 parseFrom(InputStream inputStream, QJ qj) throws IOException {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, inputStream, qj);
    }

    public static I28 parseFrom(AbstractC1923o abstractC1923o) throws IOException {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o);
    }

    public static I28 parseFrom(AbstractC1923o abstractC1923o, QJ qj) throws IOException {
        return (I28) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o, qj);
    }
}
