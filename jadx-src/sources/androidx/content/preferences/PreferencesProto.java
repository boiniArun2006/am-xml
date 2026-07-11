package androidx.content.preferences;

import androidx.content.preferences.protobuf.AbstractMessageLite;
import androidx.content.preferences.protobuf.ByteString;
import androidx.content.preferences.protobuf.GeneratedMessageLite;
import androidx.content.preferences.protobuf.Internal;
import androidx.content.preferences.protobuf.MapEntryLite;
import androidx.content.preferences.protobuf.MapFieldLite;
import androidx.content.preferences.protobuf.MessageLiteOrBuilder;
import androidx.content.preferences.protobuf.Parser;
import androidx.content.preferences.protobuf.WireFormat;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class PreferencesProto {

    public static final class PreferenceMap extends GeneratedMessageLite<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
        private static final PreferenceMap DEFAULT_INSTANCE;
        private static volatile Parser<PreferenceMap> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite<String, Value> preferences_ = MapFieldLite.KN();

        public static final class Builder extends GeneratedMessageLite.Builder<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(PreferenceMap.DEFAULT_INSTANCE);
            }

            public Builder g(String str, Value value) {
                str.getClass();
                value.getClass();
                Ik();
                ((PreferenceMap) this.f37998t).U().put(str, value);
                return this;
            }
        }

        private static final class PreferencesDefaultEntryHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            static final MapEntryLite f37673n = MapEntryLite.nr(WireFormat.FieldType.f38216e, "", WireFormat.FieldType.f38212T, Value.J());
        }

        static {
            PreferenceMap preferenceMap = new PreferenceMap();
            DEFAULT_INSTANCE = preferenceMap;
            GeneratedMessageLite.wTp(PreferenceMap.class, preferenceMap);
        }

        public static PreferenceMap E(InputStream inputStream) {
            return (PreferenceMap) GeneratedMessageLite.nHg(DEFAULT_INSTANCE, inputStream);
        }

        private MapFieldLite M7() {
            if (!this.preferences_.qie()) {
                this.preferences_ = this.preferences_.HI();
            }
            return this.preferences_;
        }

        public static Builder eF() {
            return (Builder) DEFAULT_INSTANCE.ck();
        }

        private MapFieldLite p5() {
            return this.preferences_;
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
        protected final Object o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.f37672n[methodToInvoke.ordinal()]) {
                case 1:
                    return new PreferenceMap();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.X(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", PreferencesDefaultEntryHolder.f37673n});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PreferenceMap> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PreferenceMap.class) {
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

        private PreferenceMap() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map U() {
            return M7();
        }

        public Map P5() {
            return Collections.unmodifiableMap(p5());
        }
    }

    public interface PreferenceMapOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringSet extends GeneratedMessageLite<StringSet, Builder> implements StringSetOrBuilder {
        private static final StringSet DEFAULT_INSTANCE;
        private static volatile Parser<StringSet> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> strings_ = GeneratedMessageLite.XQ();

        public static final class Builder extends GeneratedMessageLite.Builder<StringSet, Builder> implements StringSetOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(StringSet.DEFAULT_INSTANCE);
            }

            public Builder g(Iterable iterable) {
                Ik();
                ((StringSet) this.f37998t).U(iterable);
                return this;
            }
        }

        static {
            StringSet stringSet = new StringSet();
            DEFAULT_INSTANCE = stringSet;
            GeneratedMessageLite.wTp(StringSet.class, stringSet);
        }

        public static StringSet M7() {
            return DEFAULT_INSTANCE;
        }

        private void P5() {
            Internal.ProtobufList<String> protobufList = this.strings_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.strings_ = GeneratedMessageLite.E2(protobufList);
        }

        public static Builder eF() {
            return (Builder) DEFAULT_INSTANCE.ck();
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
        protected final Object o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.f37672n[methodToInvoke.ordinal()]) {
                case 1:
                    return new StringSet();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.X(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StringSet> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (StringSet.class) {
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

        public List p5() {
            return this.strings_;
        }

        private StringSet() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void U(Iterable iterable) {
            P5();
            AbstractMessageLite.rl(iterable, this.strings_);
        }
    }

    public interface StringSetOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        public static final int BYTES_FIELD_NUMBER = 8;
        private static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile Parser<Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int valueCase_ = 0;
        private Object value_;

        public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Value.DEFAULT_INSTANCE);
            }

            public Builder E2(int i2) {
                Ik();
                ((Value) this.f37998t).eTf(i2);
                return this;
            }

            public Builder T(StringSet.Builder builder) {
                Ik();
                ((Value) this.f37998t).ofS((StringSet) builder.build());
                return this;
            }

            public Builder X(String str) {
                Ik();
                ((Value) this.f37998t).pJg(str);
                return this;
            }

            public Builder e(long j2) {
                Ik();
                ((Value) this.f37998t).xg(j2);
                return this;
            }

            public Builder fD(float f3) {
                Ik();
                ((Value) this.f37998t).m(f3);
                return this;
            }

            public Builder g(boolean z2) {
                Ik();
                ((Value) this.f37998t).z(z2);
                return this;
            }

            public Builder iF(double d2) {
                Ik();
                ((Value) this.f37998t).ijL(d2);
                return this;
            }

            public Builder te(ByteString byteString) {
                Ik();
                ((Value) this.f37998t).piY(byteString);
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void eTf(int i2) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ijL(double d2) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(float f3) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xg(long j2) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z(boolean z2) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z2);
        }

        public enum ValueCase {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            BYTES(8),
            VALUE_NOT_SET(0);


            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f37682n;

            ValueCase(int i2) {
                this.f37682n = i2;
            }

            public static ValueCase rl(int i2) {
                switch (i2) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    case 8:
                        return BYTES;
                    default:
                        return null;
                }
            }
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            GeneratedMessageLite.wTp(Value.class, value);
        }

        public static Value J() {
            return DEFAULT_INSTANCE;
        }

        public static Builder dR0() {
            return (Builder) DEFAULT_INSTANCE.ck();
        }

        public ByteString B() {
            return this.valueCase_ == 8 ? (ByteString) this.value_ : ByteString.f37740t;
        }

        public double D() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        public boolean FX() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        public long GR() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        public int I() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        public String Nxk() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        public StringSet Y() {
            return this.valueCase_ == 6 ? (StringSet) this.value_ : StringSet.M7();
        }

        public float a() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        public ValueCase k() {
            return ValueCase.rl(this.valueCase_);
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
        protected final Object o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.f37672n[methodToInvoke.ordinal()]) {
                case 1:
                    return new Value();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.X(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", StringSet.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Value> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Value.class) {
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

        private Value() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ofS(StringSet stringSet) {
            stringSet.getClass();
            this.value_ = stringSet;
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pJg(String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void piY(ByteString byteString) {
            byteString.getClass();
            this.valueCase_ = 8;
            this.value_ = byteString;
        }
    }

    public interface ValueOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.PreferencesProto$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f37672n;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f37672n = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37672n[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37672n[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37672n[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37672n[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37672n[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37672n[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
