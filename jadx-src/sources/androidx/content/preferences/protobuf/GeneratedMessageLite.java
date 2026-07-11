package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.AbstractMessageLite;
import androidx.content.preferences.protobuf.ArrayDecoders;
import androidx.content.preferences.protobuf.FieldSet;
import androidx.content.preferences.protobuf.GeneratedMessageLite;
import androidx.content.preferences.protobuf.Internal;
import androidx.content.preferences.protobuf.MessageLite;
import androidx.content.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.t();

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final GeneratedMessageLite f37997n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        protected GeneratedMessageLite f37998t;

        private GeneratedMessageLite nY() {
            return this.f37997n.T();
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite buildPartial() {
            if (!this.f37998t.te()) {
                return this.f37998t;
            }
            this.f37998t.iF();
            return this.f37998t;
        }

        protected final void Ik() {
            if (this.f37998t.te()) {
                return;
            }
            r();
        }

        @Override // androidx.content.preferences.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.g(this.f37998t, false);
        }

        @Override // androidx.content.preferences.protobuf.MessageLiteOrBuilder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite getDefaultInstanceForType() {
            return this.f37997n;
        }

        protected Builder(GeneratedMessageLite generatedMessageLite) {
            this.f37997n = generatedMessageLite;
            if (!generatedMessageLite.te()) {
                this.f37998t = nY();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static void ViF(Object obj, Object obj2) {
            Protobuf.n().nr(obj).mergeFrom(obj, obj2);
        }

        public Builder S(GeneratedMessageLite generatedMessageLite) {
            if (getDefaultInstanceForType().equals(generatedMessageLite)) {
                return this;
            }
            Ik();
            ViF(this.f37998t, generatedMessageLite);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
        public Builder qie(byte[] bArr, int i2, int i3) {
            return aYN(bArr, i2, i3, ExtensionRegistryLite.rl());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Builder xMQ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            Ik();
            try {
                Protobuf.n().nr(this.f37998t).n(this.f37998t, CodedInputStreamReader.KN(codedInputStream), extensionRegistryLite);
                return this;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw ((IOException) e2.getCause());
                }
                throw e2;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public Builder J2(GeneratedMessageLite generatedMessageLite) {
            return S(generatedMessageLite);
        }

        public Builder aYN(byte[] bArr, int i2, int i3, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Ik();
            try {
                Protobuf.n().nr(this.f37998t).t(this.f37998t, bArr, i2, i2 + i3, new ArrayDecoders.Registers(extensionRegistryLite));
                return this;
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.az();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Builder nr() {
            Builder builderNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            builderNewBuilderForType.f37998t = buildPartial();
            return builderNewBuilderForType;
        }

        protected void r() {
            GeneratedMessageLite generatedMessageLiteNY = nY();
            ViF(generatedMessageLiteNY, this.f37998t);
            this.f37998t = generatedMessageLiteNY;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public final GeneratedMessageLite build() {
            GeneratedMessageLite generatedMessageLiteBuildPartial = buildPartial();
            if (generatedMessageLiteBuildPartial.isInitialized()) {
                return generatedMessageLiteBuildPartial;
            }
            throw AbstractMessageLite.Builder.az(generatedMessageLiteBuildPartial);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
        private final GeneratedMessageLite rl;

        @Override // androidx.content.preferences.protobuf.Parser
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite rl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return GeneratedMessageLite.s7N(this.rl, codedInputStream, extensionRegistryLite);
        }

        public DefaultInstanceBasedParser(GeneratedMessageLite generatedMessageLite) {
            this.rl = generatedMessageLite;
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final ExtendableMessage buildPartial() {
            if (!((ExtendableMessage) this.f37998t).te()) {
                return (ExtendableMessage) this.f37998t;
            }
            ((ExtendableMessage) this.f37998t).extensions.XQ();
            return (ExtendableMessage) super.buildPartial();
        }

        protected ExtendableBuilder(ExtendableMessage extendableMessage) {
            super(extendableMessage);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        protected void r() {
            super.r();
            if (((ExtendableMessage) this.f37998t).extensions != FieldSet.KN()) {
                GeneratedMessageLite generatedMessageLite = this.f37998t;
                ((ExtendableMessage) generatedMessageLite).extensions = ((ExtendableMessage) generatedMessageLite).extensions.clone();
            }
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.KN();

        protected class ExtensionWriter {
        }

        FieldSet bzg() {
            if (this.extensions.HI()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite, androidx.content.preferences.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite, androidx.content.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite, androidx.content.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
    }

    static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {
        final boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final WireFormat.FieldType f37999O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Internal.EnumLiteMap f38000n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final boolean f38001r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f38002t;

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public MessageLite.Builder O(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).S((GeneratedMessageLite) messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.JavaType getLiteJavaType() {
            return this.f37999O.n();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.FieldType getLiteType() {
            return this.f37999O;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.f38002t;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.f38001r;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.J2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(ExtensionDescriptor extensionDescriptor) {
            return this.f38002t - extensionDescriptor.f38002t;
        }

        public Internal.EnumLiteMap rl() {
            return this.f38000n;
        }

        ExtensionDescriptor(Internal.EnumLiteMap enumLiteMap, int i2, WireFormat.FieldType fieldType, boolean z2, boolean z3) {
            this.f38000n = enumLiteMap;
            this.f38002t = i2;
            this.f37999O = fieldType;
            this.J2 = z2;
            this.f38001r = z3;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final MessageLite f38003n;
        final ExtensionDescriptor nr;
        final Object rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final MessageLite f38004t;

        public WireFormat.FieldType n() {
            return this.nr.getLiteType();
        }

        public boolean nr() {
            return this.nr.J2;
        }

        public MessageLite rl() {
            return this.f38004t;
        }

        public int t() {
            return this.nr.getNumber();
        }

        GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (messageLite != null) {
                if (extensionDescriptor.getLiteType() == WireFormat.FieldType.f38212T && messageLite2 == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.f38003n = messageLite;
                this.rl = obj;
                this.f38004t = messageLite2;
                this.nr = extensionDescriptor;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final class SerializedForm implements Serializable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final byte[] f38012O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Class f38013n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f38014t;

        private Class n() {
            Class cls = this.f38013n;
            return cls != null ? cls : Class.forName(this.f38014t);
        }

        protected Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = n().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.f38012O).buildPartial();
            } catch (InvalidProtocolBufferException e2) {
                throw new RuntimeException("Unable to understand proto buffer", e2);
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f38014t, e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Unable to call parsePartialFrom", e4);
            } catch (NoSuchFieldException e5) {
                throw new RuntimeException("Unable to find DEFAULT_INSTANCE in " + this.f38014t, e5);
            } catch (SecurityException e6) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.f38014t, e6);
            }
        }
    }

    public static GeneratedExtension N(MessageLite messageLite, Object obj, MessageLite messageLite2, Internal.EnumLiteMap enumLiteMap, int i2, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension(messageLite, obj, messageLite2, new ExtensionDescriptor(enumLiteMap, i2, fieldType, false, false), cls);
    }

    protected Object Ik(MethodToInvoke methodToInvoke) {
        return o(methodToInvoke, null, null);
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public int getSerializedSize() {
        return nr(null);
    }

    @Override // androidx.content.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return g(this, true);
    }

    protected abstract Object o(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    void qie() {
        this.memoizedHashCode = 0;
    }

    protected Object r(MethodToInvoke methodToInvoke, Object obj) {
        return o(methodToInvoke, obj, null);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f37996n;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f37996n = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37996n[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private int HI(Schema schema) {
        return schema == null ? Protobuf.n().nr(this).getSerializedSize(this) : schema.getSerializedSize(this);
    }

    static GeneratedMessageLite S(Class cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (generatedMessageLite != null) {
            return generatedMessageLite;
        }
        GeneratedMessageLite<?, ?> defaultInstanceForType = ((GeneratedMessageLite) UnsafeUtil.qie(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    protected static Object X(MessageLite messageLite, String str, Object[] objArr) {
        return new RawMessageInfo(messageLite, str, objArr);
    }

    protected static final boolean g(GeneratedMessageLite generatedMessageLite, boolean z2) {
        byte bByteValue = ((Byte) generatedMessageLite.Ik(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = Protobuf.n().nr(generatedMessageLite).isInitialized(generatedMessageLite);
        if (z2) {
            generatedMessageLite.r(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? generatedMessageLite : null);
        }
        return zIsInitialized;
    }

    private static GeneratedMessageLite gh(GeneratedMessageLite generatedMessageLite) throws InvalidProtocolBufferException {
        if (generatedMessageLite == null || generatedMessageLite.isInitialized()) {
            return generatedMessageLite;
        }
        throw generatedMessageLite.J2().n().gh(generatedMessageLite);
    }

    @Override // androidx.content.preferences.protobuf.AbstractMessageLite
    void KN(int i2) {
        if (i2 >= 0) {
            this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i2);
        }
    }

    GeneratedMessageLite T() {
        return (GeneratedMessageLite) Ik(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    @Override // androidx.content.preferences.protobuf.MessageLiteOrBuilder
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) Ik(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    int aYN() {
        return this.memoizedHashCode;
    }

    protected final Builder ck() {
        return (Builder) Ik(MethodToInvoke.NEW_BUILDER);
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Builder newBuilderForType() {
        return (Builder) Ik(MethodToInvoke.NEW_BUILDER);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Protobuf.n().nr(this).equals(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    void fD() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public final Parser getParserForType() {
        return (Parser) Ik(MethodToInvoke.GET_PARSER);
    }

    Object mUb() {
        return Ik(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    /* JADX INFO: renamed from: rV9, reason: merged with bridge method [inline-methods] */
    public final Builder toBuilder() {
        return ((Builder) Ik(MethodToInvoke.NEW_BUILDER)).S(this);
    }

    @Override // androidx.content.preferences.protobuf.AbstractMessageLite
    int t() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    boolean te() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    void v(int i2) {
        this.memoizedHashCode = i2;
    }

    protected static Internal.ProtobufList E2(Internal.ProtobufList protobufList) {
        int i2;
        int size = protobufList.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size * 2;
        }
        return protobufList.mutableCopyWithCapacity(i2);
    }

    protected static Internal.ProtobufList XQ() {
        return ProtobufArrayList.nr();
    }

    protected static Internal.IntList Z() {
        return IntArrayList.J2();
    }

    protected static GeneratedMessageLite nHg(GeneratedMessageLite generatedMessageLite, InputStream inputStream) {
        return gh(s7N(generatedMessageLite, CodedInputStream.Uo(inputStream), ExtensionRegistryLite.rl()));
    }

    static Object nY(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    static GeneratedMessageLite s7N(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLiteT = generatedMessageLite.T();
        try {
            Schema schemaNr = Protobuf.n().nr(generatedMessageLiteT);
            schemaNr.n(generatedMessageLiteT, CodedInputStreamReader.KN(codedInputStream), extensionRegistryLite);
            schemaNr.makeImmutable(generatedMessageLiteT);
            return generatedMessageLiteT;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.n()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.gh(generatedMessageLiteT);
        } catch (UninitializedMessageException e3) {
            throw e3.n().gh(generatedMessageLiteT);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).gh(generatedMessageLiteT);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    protected static void wTp(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.fD();
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    boolean ViF() {
        if (aYN() == 0) {
            return true;
        }
        return false;
    }

    void az() {
        KN(Integer.MAX_VALUE);
    }

    public int hashCode() {
        if (te()) {
            return ty();
        }
        if (ViF()) {
            v(ty());
        }
        return aYN();
    }

    protected void iF() {
        Protobuf.n().nr(this).makeImmutable(this);
        fD();
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public void n(CodedOutputStream codedOutputStream) {
        Protobuf.n().nr(this).rl(this, CodedOutputStreamWriter.Uo(codedOutputStream));
    }

    @Override // androidx.content.preferences.protobuf.AbstractMessageLite
    int nr(Schema schema) {
        if (te()) {
            int iHI = HI(schema);
            if (iHI >= 0) {
                return iHI;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iHI);
        }
        if (t() != Integer.MAX_VALUE) {
            return t();
        }
        int iHI2 = HI(schema);
        KN(iHI2);
        return iHI2;
    }

    public String toString() {
        return MessageLiteToString.J2(this, super.toString());
    }

    int ty() {
        return Protobuf.n().nr(this).hashCode(this);
    }
}
