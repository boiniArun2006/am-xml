package com.google.protobuf;

import com.google.protobuf.CM;
import com.google.protobuf.CN3;
import com.google.protobuf.Q;
import com.google.protobuf.j;
import com.google.protobuf.nKK;
import com.google.protobuf.yg;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class g9s extends com.google.protobuf.j {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, g9s> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected c7r unknownFields = c7r.getDefaultInstance();

    public static class CN3 extends eO {
        final yg containingTypeDefaultInstance;
        final Object defaultValue;
        final Wre descriptor;
        final yg messageDefaultInstance;

        Object fromFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularFromFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != CM.w6.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularFromFieldSetType(it.next()));
            }
            return arrayList;
        }

        public yg getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        @Override // com.google.protobuf.eO
        public Object getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.google.protobuf.eO
        public CM.n getLiteType() {
            return this.descriptor.getLiteType();
        }

        @Override // com.google.protobuf.eO
        public yg getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        @Override // com.google.protobuf.eO
        public int getNumber() {
            return this.descriptor.getNumber();
        }

        @Override // com.google.protobuf.eO
        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        Object singularFromFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == CM.w6.ENUM ? this.descriptor.enumTypeMap.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        Object singularToFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == CM.w6.ENUM ? Integer.valueOf(((nKK.w6) obj).getNumber()) : obj;
        }

        Object toFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularToFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != CM.w6.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularToFieldSetType(it.next()));
            }
            return arrayList;
        }

        CN3(yg ygVar, Object obj, yg ygVar2, Wre wre, Class cls) {
            if (ygVar != null) {
                if (wre.getLiteType() == CM.n.MESSAGE && ygVar2 == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.containingTypeDefaultInstance = ygVar;
                this.defaultValue = obj;
                this.messageDefaultInstance = ygVar2;
                this.descriptor = wre;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    public interface I28 extends pO {
        @Override // com.google.protobuf.pO
        /* synthetic */ yg getDefaultInstanceForType();

        <Type> Type getExtension(eO eOVar);

        <Type> Type getExtension(eO eOVar, int i2);

        <Type> int getExtensionCount(eO eOVar);

        <Type> boolean hasExtension(eO eOVar);

        @Override // com.google.protobuf.pO
        /* synthetic */ boolean isInitialized();
    }

    public static abstract class Ml extends g9s implements I28 {
        protected Q extensions = Q.emptySet();

        protected class j {
            private final Iterator<Map.Entry<Wre, Object>> iter;
            private final boolean messageSetWireFormat;
            private Map.Entry<Wre, Object> next;

            /* synthetic */ j(Ml ml, boolean z2, j jVar) {
                this(z2);
            }

            private j(boolean z2) {
                Iterator it = Ml.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = (Map.Entry) it.next();
                }
                this.messageSetWireFormat = z2;
            }

            public void writeUntil(int i2, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<Wre, Object> entry = this.next;
                    if (entry == null || entry.getKey().getNumber() >= i2) {
                        return;
                    }
                    Wre key = this.next.getKey();
                    if (this.messageSetWireFormat && key.getLiteJavaType() == CM.w6.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(key.getNumber(), (yg) this.next.getValue());
                    } else {
                        Q.writeField(key, this.next.getValue(), codedOutputStream);
                    }
                    if (this.iter.hasNext()) {
                        this.next = this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(AbstractC1923o abstractC1923o, CN3 cn3, QJ qj, int i2) throws IOException {
            parseExtension(abstractC1923o, qj, cn3, CM.makeTag(i2, 2), i2);
        }

        private <MessageType extends yg> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, AbstractC1923o abstractC1923o, QJ qj) throws IOException {
            int uInt32 = 0;
            C bytes = null;
            CN3 cn3FindLiteExtensionByNumber = null;
            while (true) {
                int tag = abstractC1923o.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == CM.MESSAGE_SET_TYPE_ID_TAG) {
                    uInt32 = abstractC1923o.readUInt32();
                    if (uInt32 != 0) {
                        cn3FindLiteExtensionByNumber = qj.findLiteExtensionByNumber(messagetype, uInt32);
                    }
                } else if (tag == CM.MESSAGE_SET_MESSAGE_TAG) {
                    if (uInt32 == 0 || cn3FindLiteExtensionByNumber == null) {
                        bytes = abstractC1923o.readBytes();
                    } else {
                        eagerlyMergeMessageSetExtension(abstractC1923o, cn3FindLiteExtensionByNumber, qj, uInt32);
                        bytes = null;
                    }
                } else if (!abstractC1923o.skipField(tag)) {
                    break;
                }
            }
            abstractC1923o.checkLastTagWas(CM.MESSAGE_SET_ITEM_END_TAG);
            if (bytes == null || uInt32 == 0) {
                return;
            }
            if (cn3FindLiteExtensionByNumber != null) {
                mergeMessageSetExtensionFromBytes(bytes, qj, cn3FindLiteExtensionByNumber);
            } else {
                mergeLengthDelimitedField(uInt32, bytes);
            }
        }

        @Override // com.google.protobuf.g9s.I28
        public final <Type> Type getExtension(eO eOVar) {
            CN3 cn3CheckIsLite = g9s.checkIsLite(eOVar);
            verifyExtensionContainingType(cn3CheckIsLite);
            Object field = this.extensions.getField(cn3CheckIsLite.descriptor);
            return field == null ? (Type) cn3CheckIsLite.defaultValue : (Type) cn3CheckIsLite.fromFieldSetType(field);
        }

        private void mergeMessageSetExtensionFromBytes(C c2, QJ qj, CN3 cn3) throws IOException {
            yg ygVar = (yg) this.extensions.getField(cn3.descriptor);
            yg.j builder = ygVar != null ? ygVar.toBuilder() : null;
            if (builder == null) {
                builder = cn3.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(c2, qj);
            ensureExtensionsAreMutable().setField(cn3.descriptor, cn3.singularToFieldSetType(builder.build()));
        }

        Q ensureExtensionsAreMutable() {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m186clone();
            }
            return this.extensions;
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }

        protected final void mergeExtensionFields(Ml ml) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m186clone();
            }
            this.extensions.mergeFrom(ml.extensions);
        }

        protected com.google.protobuf.g9s$Ml.j newExtensionWriter() {
            return new j(this, false, null);
        }

        protected com.google.protobuf.g9s$Ml.j newMessageSetExtensionWriter() {
            return new j(this, true, null);
        }

        protected <MessageType extends yg> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, AbstractC1923o abstractC1923o, QJ qj, int i2) throws IOException {
            if (i2 != CM.MESSAGE_SET_ITEM_TAG) {
                return CM.getTagWireType(i2) == 2 ? parseUnknownField(messagetype, abstractC1923o, qj, i2) : abstractC1923o.skipField(i2);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype, abstractC1923o, qj);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean parseExtension(AbstractC1923o abstractC1923o, QJ qj, CN3 cn3, int i2, int i3) throws IOException {
            boolean z2;
            boolean z3;
            yg.j jVarNewBuilderForType;
            Object objBuild;
            yg ygVar;
            int tagWireType = CM.getTagWireType(i2);
            if (cn3 != null) {
                if (tagWireType == Q.getWireFormatForFieldType(cn3.descriptor.getLiteType(), false)) {
                    z3 = false;
                    z2 = false;
                } else {
                    Wre wre = cn3.descriptor;
                    if (!wre.isRepeated || !wre.type.isPackable() || tagWireType != Q.getWireFormatForFieldType(cn3.descriptor.getLiteType(), true)) {
                        z3 = true;
                        z2 = false;
                    } else {
                        z2 = true;
                        z3 = false;
                    }
                }
            }
            if (z3) {
                return parseUnknownField(i2, abstractC1923o);
            }
            ensureExtensionsAreMutable();
            if (z2) {
                int iPushLimit = abstractC1923o.pushLimit(abstractC1923o.readRawVarint32());
                if (cn3.descriptor.getLiteType() == CM.n.ENUM) {
                    while (abstractC1923o.getBytesUntilLimit() > 0) {
                        nKK.w6 w6VarFindValueByNumber = cn3.descriptor.getEnumType().findValueByNumber(abstractC1923o.readEnum());
                        if (w6VarFindValueByNumber == null) {
                            return true;
                        }
                        this.extensions.addRepeatedField(cn3.descriptor, cn3.singularToFieldSetType(w6VarFindValueByNumber));
                    }
                } else {
                    while (abstractC1923o.getBytesUntilLimit() > 0) {
                        this.extensions.addRepeatedField(cn3.descriptor, Q.readPrimitiveField(abstractC1923o, cn3.descriptor.getLiteType(), false));
                    }
                }
                abstractC1923o.popLimit(iPushLimit);
            } else {
                int i5 = j.$SwitchMap$com$google$protobuf$WireFormat$JavaType[cn3.descriptor.getLiteJavaType().ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        objBuild = Q.readPrimitiveField(abstractC1923o, cn3.descriptor.getLiteType(), false);
                    } else {
                        int i7 = abstractC1923o.readEnum();
                        nKK.w6 w6VarFindValueByNumber2 = cn3.descriptor.getEnumType().findValueByNumber(i7);
                        if (w6VarFindValueByNumber2 == null) {
                            mergeVarintField(i3, i7);
                            return true;
                        }
                        objBuild = w6VarFindValueByNumber2;
                    }
                } else {
                    if (!cn3.descriptor.isRepeated() && (ygVar = (yg) this.extensions.getField(cn3.descriptor)) != null) {
                        jVarNewBuilderForType = ygVar.toBuilder();
                    } else {
                        jVarNewBuilderForType = null;
                    }
                    if (jVarNewBuilderForType == null) {
                        jVarNewBuilderForType = cn3.getMessageDefaultInstance().newBuilderForType();
                    }
                    if (cn3.descriptor.getLiteType() == CM.n.GROUP) {
                        abstractC1923o.readGroup(cn3.getNumber(), jVarNewBuilderForType, qj);
                    } else {
                        abstractC1923o.readMessage(jVarNewBuilderForType, qj);
                    }
                    objBuild = jVarNewBuilderForType.build();
                }
                if (cn3.descriptor.isRepeated()) {
                    this.extensions.addRepeatedField(cn3.descriptor, cn3.singularToFieldSetType(objBuild));
                } else {
                    this.extensions.setField(cn3.descriptor, cn3.singularToFieldSetType(objBuild));
                }
            }
            return true;
        }

        private void verifyExtensionContainingType(CN3 cn3) {
            if (cn3.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
            } else {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.google.protobuf.g9s, com.google.protobuf.j, com.google.protobuf.yg, com.google.protobuf.pO
        public /* bridge */ /* synthetic */ yg getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.g9s.I28
        public final <Type> int getExtensionCount(eO eOVar) {
            CN3 cn3CheckIsLite = g9s.checkIsLite(eOVar);
            verifyExtensionContainingType(cn3CheckIsLite);
            return this.extensions.getRepeatedFieldCount(cn3CheckIsLite.descriptor);
        }

        @Override // com.google.protobuf.g9s.I28
        public final <Type> boolean hasExtension(eO eOVar) {
            CN3 cn3CheckIsLite = g9s.checkIsLite(eOVar);
            verifyExtensionContainingType(cn3CheckIsLite);
            return this.extensions.hasField(cn3CheckIsLite.descriptor);
        }

        @Override // com.google.protobuf.g9s, com.google.protobuf.j, com.google.protobuf.yg
        public /* bridge */ /* synthetic */ yg.j newBuilderForType() {
            return super.newBuilderForType();
        }

        protected <MessageType extends yg> boolean parseUnknownField(MessageType messagetype, AbstractC1923o abstractC1923o, QJ qj, int i2) throws IOException {
            int tagFieldNumber = CM.getTagFieldNumber(i2);
            return parseExtension(abstractC1923o, qj, qj.findLiteExtensionByNumber(messagetype, tagFieldNumber), i2, tagFieldNumber);
        }

        @Override // com.google.protobuf.g9s, com.google.protobuf.j, com.google.protobuf.yg
        public /* bridge */ /* synthetic */ yg.j toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.protobuf.g9s.I28
        public final <Type> Type getExtension(eO eOVar, int i2) {
            CN3 cn3CheckIsLite = g9s.checkIsLite(eOVar);
            verifyExtensionContainingType(cn3CheckIsLite);
            return (Type) cn3CheckIsLite.singularFromFieldSetType(this.extensions.getRepeatedField(cn3CheckIsLite.descriptor, i2));
        }
    }

    static final class Wre implements Q.w6 {
        final nKK.Ml enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final CM.n type;

        @Override // java.lang.Comparable
        public int compareTo(Wre wre) {
            return this.number - wre.number;
        }

        @Override // com.google.protobuf.Q.w6
        public nKK.Ml getEnumType() {
            return this.enumTypeMap;
        }

        @Override // com.google.protobuf.Q.w6
        public CM.w6 getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override // com.google.protobuf.Q.w6
        public CM.n getLiteType() {
            return this.type;
        }

        @Override // com.google.protobuf.Q.w6
        public int getNumber() {
            return this.number;
        }

        @Override // com.google.protobuf.Q.w6
        public yg.j internalMergeFrom(yg.j jVar, yg ygVar) {
            return ((n) jVar).mergeFrom((g9s) ygVar);
        }

        @Override // com.google.protobuf.Q.w6
        public boolean isPacked() {
            return this.isPacked;
        }

        @Override // com.google.protobuf.Q.w6
        public boolean isRepeated() {
            return this.isRepeated;
        }

        Wre(nKK.Ml ml, int i2, CM.n nVar, boolean z2, boolean z3) {
            this.enumTypeMap = ml;
            this.number = i2;
            this.type = nVar;
            this.isRepeated = z2;
            this.isPacked = z3;
        }
    }

    public enum fuX {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static abstract class n extends j.AbstractC0822j {
        private final g9s defaultInstance;
        protected g9s instance;

        private g9s newMutableInstance() {
            return this.defaultInstance.newMutableInstance();
        }

        @Override // com.google.protobuf.j.AbstractC0822j, com.google.protobuf.yg.j
        public final g9s build() {
            g9s g9sVarBuildPartial = buildPartial();
            if (g9sVarBuildPartial.isInitialized()) {
                return g9sVarBuildPartial;
            }
            throw j.AbstractC0822j.newUninitializedMessageException(g9sVarBuildPartial);
        }

        @Override // com.google.protobuf.j.AbstractC0822j, com.google.protobuf.yg.j
        public g9s buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // com.google.protobuf.j.AbstractC0822j, com.google.protobuf.yg.j
        public final n clear() {
            if (this.defaultInstance.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = newMutableInstance();
            return this;
        }

        protected final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            copyOnWriteInternal();
        }

        @Override // com.google.protobuf.j.AbstractC0822j, com.google.protobuf.yg.j, com.google.protobuf.pO
        public g9s getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.j.AbstractC0822j
        public n internalMergeFrom(g9s g9sVar) {
            return mergeFrom(g9sVar);
        }

        @Override // com.google.protobuf.j.AbstractC0822j, com.google.protobuf.yg.j, com.google.protobuf.pO
        public final boolean isInitialized() {
            return g9s.isInitialized(this.instance, false);
        }

        protected n(g9s g9sVar) {
            this.defaultInstance = g9sVar;
            if (!g9sVar.isMutable()) {
                this.instance = newMutableInstance();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            xZD.getInstance().schemaFor(messagetype).mergeFrom(messagetype, messagetype2);
        }

        protected void copyOnWriteInternal() {
            g9s g9sVarNewMutableInstance = newMutableInstance();
            mergeFromInstance(g9sVarNewMutableInstance, this.instance);
            this.instance = g9sVarNewMutableInstance;
        }

        @Override // com.google.protobuf.j.AbstractC0822j
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public n mo187clone() {
            n nVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            nVarNewBuilderForType.instance = buildPartial();
            return nVarNewBuilderForType;
        }

        public n mergeFrom(g9s g9sVar) {
            if (getDefaultInstanceForType().equals(g9sVar)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, g9sVar);
            return this;
        }

        @Override // com.google.protobuf.j.AbstractC0822j, com.google.protobuf.yg.j
        public n mergeFrom(byte[] bArr, int i2, int i3, QJ qj) throws InvalidProtocolBufferException {
            copyOnWrite();
            try {
                xZD.getInstance().schemaFor(this.instance).mergeFrom(this.instance, bArr, i2, i2 + i3, new CN3.n(qj));
                return this;
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.j.AbstractC0822j, com.google.protobuf.yg.j
        public n mergeFrom(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, i2, i3, QJ.getEmptyRegistry());
        }

        @Override // com.google.protobuf.j.AbstractC0822j, com.google.protobuf.yg.j
        public n mergeFrom(AbstractC1923o abstractC1923o, QJ qj) throws IOException {
            copyOnWrite();
            try {
                xZD.getInstance().schemaFor(this.instance).mergeFrom(this.instance, qz.forCodedInput(abstractC1923o), qj);
                return this;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw ((IOException) e2.getCause());
                }
                throw e2;
            }
        }
    }

    protected static nKK.CN3 mutableCopy(nKK.CN3 cn3) {
        int size = cn3.size();
        return cn3.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <ContainingType extends yg, Type> CN3 newRepeatedGeneratedExtension(ContainingType containingtype, yg ygVar, nKK.Ml ml, int i2, CM.n nVar, boolean z2, Class cls) {
        return new CN3(containingtype, Collections.EMPTY_LIST, ygVar, new Wre(ml, i2, nVar, true, z2), cls);
    }

    public static <ContainingType extends yg, Type> CN3 newSingularGeneratedExtension(ContainingType containingtype, Type type, yg ygVar, nKK.Ml ml, int i2, CM.n nVar, Class cls) {
        return new CN3(containingtype, type, ygVar, new Wre(ml, i2, nVar, false, false), cls);
    }

    protected static <T extends g9s> T parseDelimitedFrom(T t3, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t3, inputStream, QJ.getEmptyRegistry()));
    }

    protected static <T extends g9s> T parseFrom(T t3, ByteBuffer byteBuffer, QJ qj) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t3, AbstractC1923o.newInstance(byteBuffer), qj));
    }

    static <T extends g9s> T parsePartialFrom(T t3, AbstractC1923o abstractC1923o, QJ qj) throws InvalidProtocolBufferException {
        T t4 = (T) t3.newMutableInstance();
        try {
            R6 r6SchemaFor = xZD.getInstance().schemaFor(t4);
            r6SchemaFor.mergeFrom(t4, qz.forCodedInput(abstractC1923o), qj);
            r6SchemaFor.makeImmutable(t4);
            return t4;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t4);
        } catch (UninitializedMessageException e3) {
            throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(t4);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(t4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    protected final <MessageType extends g9s, BuilderType extends n> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(fuX.NEW_BUILDER);
    }

    protected Object dynamicMethod(fuX fux, Object obj) {
        return dynamicMethod(fux, obj, null);
    }

    protected abstract Object dynamicMethod(fuX fux, Object obj, Object obj2);

    @Override // com.google.protobuf.j
    int getSerializedSize(R6 r6) {
        if (!isMutable()) {
            if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
                return getMemoizedSerializedSize();
            }
            int iComputeSerializedSize = computeSerializedSize(r6);
            setMemoizedSerializedSize(iComputeSerializedSize);
            return iComputeSerializedSize;
        }
        int iComputeSerializedSize2 = computeSerializedSize(r6);
        if (iComputeSerializedSize2 >= 0) {
            return iComputeSerializedSize2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iComputeSerializedSize2);
    }

    @Override // com.google.protobuf.j, com.google.protobuf.yg, com.google.protobuf.pO
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    static /* synthetic */ class j {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[CM.w6.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr;
            try {
                iArr[CM.w6.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[CM.w6.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class w6 extends com.google.protobuf.n {
        private final g9s defaultInstance;

        public w6(g9s g9sVar) {
            this.defaultInstance = g9sVar;
        }

        @Override // com.google.protobuf.n, com.google.protobuf.KH
        public g9s parsePartialFrom(AbstractC1923o abstractC1923o, QJ qj) throws InvalidProtocolBufferException {
            return g9s.parsePartialFrom(this.defaultInstance, abstractC1923o, qj);
        }

        @Override // com.google.protobuf.n, com.google.protobuf.KH
        public g9s parsePartialFrom(byte[] bArr, int i2, int i3, QJ qj) throws InvalidProtocolBufferException {
            return g9s.parsePartialFrom(this.defaultInstance, bArr, i2, i3, qj);
        }
    }

    private static <T extends g9s> T checkMessageInitialized(T t3) throws InvalidProtocolBufferException {
        if (t3 == null || t3.isInitialized()) {
            return t3;
        }
        throw t3.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t3);
    }

    private int computeSerializedSize(R6 r6) {
        return r6 == null ? xZD.getInstance().schemaFor(this).getSerializedSize(this) : r6.getSerializedSize(this);
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == c7r.getDefaultInstance()) {
            this.unknownFields = c7r.newInstance();
        }
    }

    static <T extends g9s> T getDefaultInstance(Class<T> cls) {
        T t3 = (T) defaultInstanceMap.get(cls);
        if (t3 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t3 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t3 != null) {
            return t3;
        }
        T t4 = (T) ((g9s) g9.allocateInstance(cls)).getDefaultInstanceForType();
        if (t4 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t4);
        return t4;
    }

    protected static final <T extends g9s> boolean isInitialized(T t3, boolean z2) {
        byte bByteValue = ((Byte) t3.dynamicMethod(fuX.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = xZD.getInstance().schemaFor(t3).isInitialized(t3);
        if (z2) {
            t3.dynamicMethod(fuX.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? t3 : null);
        }
        return zIsInitialized;
    }

    protected static Object newMessageInfo(yg ygVar, String str, Object[] objArr) {
        return new QaP(ygVar, str, objArr);
    }

    Object buildMessageInfo() throws Exception {
        return dynamicMethod(fuX.BUILD_MESSAGE_INFO);
    }

    protected final <MessageType extends g9s, BuilderType extends n> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((g9s) messagetype);
    }

    protected Object dynamicMethod(fuX fux) {
        return dynamicMethod(fux, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return xZD.getInstance().schemaFor(this).equals(this, (g9s) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.j, com.google.protobuf.yg, com.google.protobuf.pO
    public final g9s getDefaultInstanceForType() {
        return (g9s) dynamicMethod(fuX.GET_DEFAULT_INSTANCE);
    }

    int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.j
    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.j, com.google.protobuf.yg
    public final KH getParserForType() {
        return (KH) dynamicMethod(fuX.GET_PARSER);
    }

    boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    protected final void mergeUnknownFields(c7r c7rVar) {
        this.unknownFields = c7r.mutableCopyOf(this.unknownFields, c7rVar);
    }

    @Override // com.google.protobuf.j, com.google.protobuf.yg
    public final n newBuilderForType() {
        return (n) dynamicMethod(fuX.NEW_BUILDER);
    }

    g9s newMutableInstance() {
        return (g9s) dynamicMethod(fuX.NEW_MUTABLE_INSTANCE);
    }

    void setMemoizedHashCode(int i2) {
        this.memoizedHashCode = i2;
    }

    @Override // com.google.protobuf.j
    void setMemoizedSerializedSize(int i2) {
        if (i2 >= 0) {
            this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i2);
        }
    }

    @Override // com.google.protobuf.j, com.google.protobuf.yg
    public final n toBuilder() {
        return ((n) dynamicMethod(fuX.NEW_BUILDER)).mergeFrom(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends Ml, BuilderType, T> CN3 checkIsLite(eO eOVar) {
        if (eOVar.isLite()) {
            return (CN3) eOVar;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    protected static nKK.j emptyBooleanList() {
        return com.google.protobuf.fuX.emptyList();
    }

    protected static nKK.n emptyDoubleList() {
        return Xo.emptyList();
    }

    protected static nKK.Wre emptyFloatList() {
        return SPz.emptyList();
    }

    protected static nKK.CN3 emptyIntList() {
        return Ew.emptyList();
    }

    protected static nKK.fuX emptyLongList() {
        return Lu.emptyList();
    }

    protected static <E> nKK.Dsr emptyProtobufList() {
        return M5.emptyList();
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e2);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
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

    protected static nKK.fuX mutableCopy(nKK.fuX fux) {
        int size = fux.size();
        return fux.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends g9s> T parseFrom(T t3, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t3, byteBuffer, QJ.getEmptyRegistry());
    }

    private static <T extends g9s> T parsePartialDelimitedFrom(T t3, InputStream inputStream, QJ qj) throws InvalidProtocolBufferException {
        try {
            int i2 = inputStream.read();
            if (i2 == -1) {
                return null;
            }
            AbstractC1923o abstractC1923oNewInstance = AbstractC1923o.newInstance(new j.AbstractC0822j.C0823j(inputStream, AbstractC1923o.readRawVarint32(i2, inputStream)));
            T t4 = (T) parsePartialFrom(t3, abstractC1923oNewInstance, qj);
            try {
                abstractC1923oNewInstance.checkLastTagWas(0);
                return t4;
            } catch (InvalidProtocolBufferException e2) {
                throw e2.setUnfinishedMessage(t4);
            }
        } catch (InvalidProtocolBufferException e3) {
            if (e3.getThrownFromInputStream()) {
                throw new InvalidProtocolBufferException((IOException) e3);
            }
            throw e3;
        } catch (IOException e4) {
            throw new InvalidProtocolBufferException(e4);
        }
    }

    protected static <T extends g9s> void registerDefaultInstance(Class<T> cls, T t3) {
        t3.markImmutable();
        defaultInstanceMap.put(cls, t3);
    }

    void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    int computeHashCode() {
        return xZD.getInstance().schemaFor(this).hashCode(this);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    boolean hashCodeIsNotMemoized() {
        if (getMemoizedHashCode() == 0) {
            return true;
        }
        return false;
    }

    protected void makeImmutable() {
        xZD.getInstance().schemaFor(this).makeImmutable(this);
        markImmutable();
    }

    protected void mergeLengthDelimitedField(int i2, C c2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i2, c2);
    }

    protected void mergeVarintField(int i2, int i3) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i2, i3);
    }

    protected boolean parseUnknownField(int i2, AbstractC1923o abstractC1923o) throws IOException {
        if (CM.getTagWireType(i2) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i2, abstractC1923o);
    }

    public String toString() {
        return Sis.toString(this, super.toString());
    }

    @Override // com.google.protobuf.j, com.google.protobuf.yg
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        xZD.getInstance().schemaFor(this).writeTo(this, Pl.forCodedOutput(codedOutputStream));
    }

    protected static <T extends g9s> T parseDelimitedFrom(T t3, InputStream inputStream, QJ qj) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t3, inputStream, qj));
    }

    protected static <T extends g9s> T parseFrom(T t3, C c2) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t3, c2, QJ.getEmptyRegistry()));
    }

    protected static nKK.Wre mutableCopy(nKK.Wre wre) {
        int size = wre.size();
        return wre.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends g9s> T parseFrom(T t3, C c2, QJ qj) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t3, c2, qj));
    }

    protected static nKK.n mutableCopy(nKK.n nVar) {
        int size = nVar.size();
        return nVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends g9s> T parseFrom(T t3, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t3, bArr, 0, bArr.length, QJ.getEmptyRegistry()));
    }

    @Override // com.google.protobuf.j, com.google.protobuf.yg
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    protected static nKK.j mutableCopy(nKK.j jVar) {
        int size = jVar.size();
        return jVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends g9s> T parseFrom(T t3, byte[] bArr, QJ qj) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t3, bArr, 0, bArr.length, qj));
    }

    protected static <E> nKK.Dsr mutableCopy(nKK.Dsr dsr) {
        int size = dsr.size();
        return dsr.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static <T extends g9s> T parseFrom(T t3, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t3, AbstractC1923o.newInstance(inputStream), QJ.getEmptyRegistry()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends g9s> T parsePartialFrom(T t3, byte[] bArr, int i2, int i3, QJ qj) throws InvalidProtocolBufferException {
        T t4 = (T) t3.newMutableInstance();
        try {
            R6 r6SchemaFor = xZD.getInstance().schemaFor(t4);
            r6SchemaFor.mergeFrom(t4, bArr, i2, i2 + i3, new CN3.n(qj));
            r6SchemaFor.makeImmutable(t4);
            return t4;
        } catch (InvalidProtocolBufferException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException = e2;
            if (invalidProtocolBufferException.getThrownFromInputStream()) {
                invalidProtocolBufferException = new InvalidProtocolBufferException((IOException) invalidProtocolBufferException);
            }
            throw invalidProtocolBufferException.setUnfinishedMessage(t4);
        } catch (UninitializedMessageException e3) {
            throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(t4);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(t4);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t4);
        }
    }

    protected static <T extends g9s> T parseFrom(T t3, InputStream inputStream, QJ qj) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t3, AbstractC1923o.newInstance(inputStream), qj));
    }

    protected static <T extends g9s> T parseFrom(T t3, AbstractC1923o abstractC1923o) throws InvalidProtocolBufferException {
        return (T) parseFrom(t3, abstractC1923o, QJ.getEmptyRegistry());
    }

    protected static <T extends g9s> T parseFrom(T t3, AbstractC1923o abstractC1923o, QJ qj) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t3, abstractC1923o, qj));
    }

    protected static <T extends g9s> T parsePartialFrom(T t3, AbstractC1923o abstractC1923o) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t3, abstractC1923o, QJ.getEmptyRegistry());
    }

    private static <T extends g9s> T parsePartialFrom(T t3, C c2, QJ qj) throws InvalidProtocolBufferException {
        AbstractC1923o abstractC1923oNewCodedInput = c2.newCodedInput();
        T t4 = (T) parsePartialFrom(t3, abstractC1923oNewCodedInput, qj);
        try {
            abstractC1923oNewCodedInput.checkLastTagWas(0);
            return t4;
        } catch (InvalidProtocolBufferException e2) {
            throw e2.setUnfinishedMessage(t4);
        }
    }
}
