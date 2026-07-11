package com.google.protobuf;

import com.google.protobuf.CM;
import com.google.protobuf.yg;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class K {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final Object key;
    private final n metadata;
    private final Object value;

    private K(CM.n nVar, Object obj, CM.n nVar2, Object obj2) {
        this.metadata = new n(nVar, obj, nVar2, obj2);
        this.key = obj;
        this.value = obj2;
    }

    public Map.Entry<Object, Object> parseEntry(C c2, QJ qj) throws IOException {
        return parseEntry(c2.newCodedInput(), this.metadata, qj);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i2, Object obj, Object obj2) throws IOException {
        codedOutputStream.writeTag(i2, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, obj, obj2));
        writeTo(codedOutputStream, this.metadata, obj, obj2);
    }

    static /* synthetic */ class j {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[CM.n.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[CM.n.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class n {
        public final Object defaultKey;
        public final Object defaultValue;
        public final CM.n keyType;
        public final CM.n valueType;

        public n(CM.n nVar, Object obj, CM.n nVar2, Object obj2) {
            this.keyType = nVar;
            this.defaultKey = obj;
            this.valueType = nVar2;
            this.defaultValue = obj2;
        }
    }

    static <K, V> int computeSerializedSize(n nVar, K k2, V v2) {
        return Q.computeElementSize(nVar.keyType, 1, k2) + Q.computeElementSize(nVar.valueType, 2, v2);
    }

    public static <K, V> K newDefaultInstance(CM.n nVar, K k2, CM.n nVar2, V v2) {
        return new K(nVar, k2, nVar2, v2);
    }

    static <K, V> Map.Entry<K, V> parseEntry(AbstractC1923o abstractC1923o, n nVar, QJ qj) throws IOException {
        Object field = nVar.defaultKey;
        Object field2 = nVar.defaultValue;
        while (true) {
            int tag = abstractC1923o.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == CM.makeTag(1, nVar.keyType.getWireType())) {
                field = parseField(abstractC1923o, qj, nVar.keyType, field);
            } else if (tag == CM.makeTag(2, nVar.valueType.getWireType())) {
                field2 = parseField(abstractC1923o, qj, nVar.valueType, field2);
            } else if (!abstractC1923o.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(field, field2);
    }

    static <T> T parseField(AbstractC1923o abstractC1923o, QJ qj, CM.n nVar, T t3) throws IOException {
        int i2 = j.$SwitchMap$com$google$protobuf$WireFormat$FieldType[nVar.ordinal()];
        if (i2 == 1) {
            yg.j builder = ((yg) t3).toBuilder();
            abstractC1923o.readMessage(builder, qj);
            return (T) builder.buildPartial();
        }
        if (i2 == 2) {
            return (T) Integer.valueOf(abstractC1923o.readEnum());
        }
        if (i2 != 3) {
            return (T) Q.readPrimitiveField(abstractC1923o, nVar, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    static <K, V> void writeTo(CodedOutputStream codedOutputStream, n nVar, K k2, V v2) throws IOException {
        Q.writeElement(codedOutputStream, nVar.keyType, 1, k2);
        Q.writeElement(codedOutputStream, nVar.valueType, 2, v2);
    }

    public Object getKey() {
        return this.key;
    }

    n getMetadata() {
        return this.metadata;
    }

    public Object getValue() {
        return this.value;
    }

    public int computeMessageSize(int i2, Object obj, Object obj2) {
        return CodedOutputStream.computeTagSize(i2) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, obj, obj2));
    }

    public void parseInto(psW psw, AbstractC1923o abstractC1923o, QJ qj) throws IOException {
        int iPushLimit = abstractC1923o.pushLimit(abstractC1923o.readRawVarint32());
        n nVar = this.metadata;
        Object field = nVar.defaultKey;
        Object field2 = nVar.defaultValue;
        while (true) {
            int tag = abstractC1923o.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == CM.makeTag(1, this.metadata.keyType.getWireType())) {
                field = parseField(abstractC1923o, qj, this.metadata.keyType, field);
            } else if (tag == CM.makeTag(2, this.metadata.valueType.getWireType())) {
                field2 = parseField(abstractC1923o, qj, this.metadata.valueType, field2);
            } else if (!abstractC1923o.skipField(tag)) {
                break;
            }
        }
        abstractC1923o.checkLastTagWas(0);
        abstractC1923o.popLimit(iPushLimit);
        psw.put(field, field2);
    }

    private K(n nVar, Object obj, Object obj2) {
        this.metadata = nVar;
        this.key = obj;
        this.value = obj2;
    }
}
