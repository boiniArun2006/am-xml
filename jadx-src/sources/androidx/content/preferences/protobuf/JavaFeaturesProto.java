package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.DescriptorProtos;
import androidx.content.preferences.protobuf.GeneratedMessageLite;
import androidx.content.preferences.protobuf.Internal;
import androidx.content.preferences.protobuf.WireFormat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class JavaFeaturesProto {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f38045n = GeneratedMessageLite.N(DescriptorProtos.FeatureSet.U(), JavaFeatures.Xw(), JavaFeatures.Xw(), null, 1001, WireFormat.FieldType.f38212T, JavaFeatures.class);

    public static final class JavaFeatures extends GeneratedMessageLite<JavaFeatures, Builder> implements JavaFeaturesOrBuilder {
        private static final JavaFeatures DEFAULT_INSTANCE;
        public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
        private static volatile Parser<JavaFeatures> PARSER = null;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean legacyClosedEnum_;
        private int utf8Validation_;

        public static final class Builder extends GeneratedMessageLite.Builder<JavaFeatures, Builder> implements JavaFeaturesOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(JavaFeatures.DEFAULT_INSTANCE);
            }
        }

        public enum Utf8Validation implements Internal.EnumLite {
            UTF8_VALIDATION_UNKNOWN(0),
            DEFAULT(1),
            VERIFY(2);


            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private static final Internal.EnumLiteMap f38049r = new Internal.EnumLiteMap<Utf8Validation>() { // from class: androidx.datastore.preferences.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.1
                @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public Utf8Validation findValueByNumber(int i2) {
                    return Utf8Validation.n(i2);
                }
            };

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f38051n;

            private static final class Utf8ValidationVerifier implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                static final Internal.EnumVerifier f38052n = new Utf8ValidationVerifier();

                private Utf8ValidationVerifier() {
                }

                @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i2) {
                    if (Utf8Validation.n(i2) != null) {
                        return true;
                    }
                    return false;
                }
            }

            public static Utf8Validation n(int i2) {
                if (i2 == 0) {
                    return UTF8_VALIDATION_UNKNOWN;
                }
                if (i2 == 1) {
                    return DEFAULT;
                }
                if (i2 != 2) {
                    return null;
                }
                return VERIFY;
            }

            public static Internal.EnumVerifier rl() {
                return Utf8ValidationVerifier.f38052n;
            }

            @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f38051n;
            }

            Utf8Validation(int i2) {
                this.f38051n = i2;
            }
        }

        static {
            JavaFeatures javaFeatures = new JavaFeatures();
            DEFAULT_INSTANCE = javaFeatures;
            GeneratedMessageLite.wTp(JavaFeatures.class, javaFeatures);
        }

        public static JavaFeatures Xw() {
            return DEFAULT_INSTANCE;
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
        protected final Object o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.f38046n[methodToInvoke.ordinal()]) {
                case 1:
                    return new JavaFeatures();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.X(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "legacyClosedEnum_", "utf8Validation_", Utf8Validation.rl()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<JavaFeatures> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (JavaFeatures.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        private JavaFeatures() {
        }
    }

    public interface JavaFeaturesOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.JavaFeaturesProto$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f38046n;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f38046n = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38046n[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38046n[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38046n[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38046n[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38046n[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38046n[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
