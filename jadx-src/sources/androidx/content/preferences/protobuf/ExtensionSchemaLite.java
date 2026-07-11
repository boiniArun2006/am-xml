package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.GeneratedMessageLite;
import androidx.content.preferences.protobuf.MessageLite;
import androidx.content.preferences.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@CheckReturnValue
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ExtensionSchemaLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f37914n;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f37914n = iArr;
            try {
                iArr[WireFormat.FieldType.f38210O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37914n[WireFormat.FieldType.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37914n[WireFormat.FieldType.f38219r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37914n[WireFormat.FieldType.f38218o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37914n[WireFormat.FieldType.f38215Z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37914n[WireFormat.FieldType.f38211S.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37914n[WireFormat.FieldType.f38217g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37914n[WireFormat.FieldType.E2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37914n[WireFormat.FieldType.f38220v.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37914n[WireFormat.FieldType.jB.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37914n[WireFormat.FieldType.f38213U.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37914n[WireFormat.FieldType.P5.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37914n[WireFormat.FieldType.M7.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37914n[WireFormat.FieldType.Xw.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37914n[WireFormat.FieldType.f38209N.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37914n[WireFormat.FieldType.f38216e.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37914n[WireFormat.FieldType.f38214X.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f37914n[WireFormat.FieldType.f38212T.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    void KN(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.ViF(generatedExtension.nr, reader.t(generatedExtension.rl().getClass(), extensionRegistryLite));
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    boolean O(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    Object Uo(Object obj, Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, UnknownFieldSchema unknownFieldSchema) {
        Object objValueOf;
        Object objXMQ;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int iT = generatedExtension.t();
        if (generatedExtension.nr.isRepeated() && generatedExtension.nr.isPacked()) {
            switch (AnonymousClass1.f37914n[generatedExtension.n().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    reader.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    reader.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    reader.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    reader.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    reader.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    reader.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    reader.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    reader.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    reader.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    reader.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    reader.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    reader.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    reader.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    reader.readEnumList(arrayList);
                    obj3 = SchemaUtil.nY(obj, iT, arrayList, generatedExtension.nr.rl(), obj3, unknownFieldSchema);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.nr.getLiteType());
            }
            fieldSet.ViF(generatedExtension.nr, arrayList);
            return obj3;
        }
        if (generatedExtension.n() != WireFormat.FieldType.Xw) {
            switch (AnonymousClass1.f37914n[generatedExtension.n().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(reader.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(reader.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(reader.readInt64());
                    break;
                case 4:
                    objValueOf = Long.valueOf(reader.readUInt64());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(reader.readInt32());
                    break;
                case 6:
                    objValueOf = Long.valueOf(reader.readFixed64());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(reader.readFixed32());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(reader.readBool());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(reader.readUInt32());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(reader.readSFixed32());
                    break;
                case 11:
                    objValueOf = Long.valueOf(reader.readSFixed64());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(reader.readSInt32());
                    break;
                case 13:
                    objValueOf = Long.valueOf(reader.readSInt64());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = reader.readBytes();
                    break;
                case 16:
                    objValueOf = reader.readString();
                    break;
                case 17:
                    if (!generatedExtension.nr()) {
                        Object objXMQ2 = fieldSet.xMQ(generatedExtension.nr);
                        if (objXMQ2 instanceof GeneratedMessageLite) {
                            Schema schemaNr = Protobuf.n().nr(objXMQ2);
                            if (!((GeneratedMessageLite) objXMQ2).te()) {
                                Object objNewInstance = schemaNr.newInstance();
                                schemaNr.mergeFrom(objNewInstance, objXMQ2);
                                fieldSet.ViF(generatedExtension.nr, objNewInstance);
                                objXMQ2 = objNewInstance;
                            }
                            reader.J2(objXMQ2, schemaNr, extensionRegistryLite);
                            return obj3;
                        }
                    }
                    objValueOf = reader.nr(generatedExtension.rl().getClass(), extensionRegistryLite);
                    break;
                case 18:
                    if (!generatedExtension.nr()) {
                        Object objXMQ3 = fieldSet.xMQ(generatedExtension.nr);
                        if (objXMQ3 instanceof GeneratedMessageLite) {
                            Schema schemaNr2 = Protobuf.n().nr(objXMQ3);
                            if (!((GeneratedMessageLite) objXMQ3).te()) {
                                Object objNewInstance2 = schemaNr2.newInstance();
                                schemaNr2.mergeFrom(objNewInstance2, objXMQ3);
                                fieldSet.ViF(generatedExtension.nr, objNewInstance2);
                                objXMQ3 = objNewInstance2;
                            }
                            reader.n(objXMQ3, schemaNr2, extensionRegistryLite);
                            return obj3;
                        }
                    }
                    objValueOf = reader.t(generatedExtension.rl().getClass(), extensionRegistryLite);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int int32 = reader.readInt32();
            if (generatedExtension.nr.rl().findValueByNumber(int32) == null) {
                return SchemaUtil.nHg(obj, iT, int32, obj3, unknownFieldSchema);
            }
            objValueOf = Integer.valueOf(int32);
        }
        if (generatedExtension.nr()) {
            fieldSet.n(generatedExtension.nr, objValueOf);
            return obj3;
        }
        int i2 = AnonymousClass1.f37914n[generatedExtension.n().ordinal()];
        if ((i2 == 17 || i2 == 18) && (objXMQ = fieldSet.xMQ(generatedExtension.nr)) != null) {
            objValueOf = Internal.KN(objXMQ, objValueOf);
        }
        fieldSet.ViF(generatedExtension.nr, objValueOf);
        return obj3;
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    FieldSet nr(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).bzg();
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    FieldSet t(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    void xMQ(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder builderNewBuilderForType = generatedExtension.rl().newBuilderForType();
        CodedInputStream codedInputStreamAYN = byteString.aYN();
        builderNewBuilderForType.xMQ(codedInputStreamAYN, extensionRegistryLite);
        fieldSet.ViF(generatedExtension.nr, builderNewBuilderForType.buildPartial());
        codedInputStreamAYN.n(0);
    }

    ExtensionSchemaLite() {
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    void J2(Object obj) {
        t(obj).XQ();
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    void mUb(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        if (extensionDescriptor.isRepeated()) {
            switch (AnonymousClass1.f37914n[extensionDescriptor.getLiteType().ordinal()]) {
                case 1:
                    SchemaUtil.bzg(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 2:
                    SchemaUtil.P5(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 3:
                    SchemaUtil.eF(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 4:
                    SchemaUtil.I(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 5:
                    SchemaUtil.p5(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 6:
                    SchemaUtil.U(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 7:
                    SchemaUtil.jB(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 8:
                    SchemaUtil.v(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 9:
                    SchemaUtil.a(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 10:
                    SchemaUtil.M(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 11:
                    SchemaUtil.FX(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 12:
                    SchemaUtil.B(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 13:
                    SchemaUtil.J(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 14:
                    SchemaUtil.p5(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 15:
                    SchemaUtil.rV9(extensionDescriptor.getNumber(), (List) entry.getValue(), writer);
                    break;
                case 16:
                    SchemaUtil.D(extensionDescriptor.getNumber(), (List) entry.getValue(), writer);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        SchemaUtil.M7(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, Protobuf.n().t(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        SchemaUtil.E(extensionDescriptor.getNumber(), (List) entry.getValue(), writer, Protobuf.n().t(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (AnonymousClass1.f37914n[extensionDescriptor.getLiteType().ordinal()]) {
            case 1:
                writer.writeDouble(extensionDescriptor.getNumber(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                writer.writeFloat(extensionDescriptor.getNumber(), ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                writer.writeInt64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                writer.writeUInt64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                writer.writeInt32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                writer.writeFixed64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                writer.writeFixed32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                writer.writeBool(extensionDescriptor.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                writer.writeUInt32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                writer.writeSFixed32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                writer.writeSFixed64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                writer.writeSInt32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                writer.writeSInt64(extensionDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                writer.writeInt32(extensionDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                writer.rl(extensionDescriptor.getNumber(), (ByteString) entry.getValue());
                break;
            case 16:
                writer.writeString(extensionDescriptor.getNumber(), (String) entry.getValue());
                break;
            case 17:
                writer.O(extensionDescriptor.getNumber(), entry.getValue(), Protobuf.n().t(entry.getValue().getClass()));
                break;
            case 18:
                writer.t(extensionDescriptor.getNumber(), entry.getValue(), Protobuf.n().t(entry.getValue().getClass()));
                break;
        }
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    int n(Map.Entry entry) {
        return ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getNumber();
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    Object rl(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i2) {
        return extensionRegistryLite.n(messageLite, i2);
    }
}
