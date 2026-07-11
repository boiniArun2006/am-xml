package com.google.protobuf;

import com.google.protobuf.CM;
import com.google.protobuf.g9s;
import com.google.protobuf.yg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class C1921c extends l3D {

    /* JADX INFO: renamed from: com.google.protobuf.c$j */
    static /* synthetic */ class j {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[CM.n.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[CM.n.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[CM.n.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.l3D
    Q getExtensions(Object obj) {
        return ((g9s.Ml) obj).extensions;
    }

    @Override // com.google.protobuf.l3D
    Q getMutableExtensions(Object obj) {
        return ((g9s.Ml) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.l3D
    boolean hasExtensions(yg ygVar) {
        return ygVar instanceof g9s.Ml;
    }

    @Override // com.google.protobuf.l3D
    <UT, UB> UB parseExtension(Object obj, FKk fKk, Object obj2, QJ qj, Q q2, UB ub, xuv xuvVar) throws IOException {
        Object objValueOf;
        Object field;
        ArrayList arrayList;
        g9s.CN3 cn3 = (g9s.CN3) obj2;
        int number = cn3.getNumber();
        if (cn3.descriptor.isRepeated() && cn3.descriptor.isPacked()) {
            switch (j.$SwitchMap$com$google$protobuf$WireFormat$FieldType[cn3.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    fKk.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    fKk.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    fKk.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    fKk.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    fKk.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    fKk.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    fKk.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    fKk.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    fKk.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    fKk.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    fKk.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    fKk.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    fKk.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    fKk.readEnumList(arrayList);
                    ub = (UB) pq.filterUnknownEnumList(obj, number, arrayList, cn3.descriptor.getEnumType(), ub, xuvVar);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + cn3.descriptor.getLiteType());
            }
            q2.setField(cn3.descriptor, arrayList);
            return ub;
        }
        if (cn3.getLiteType() != CM.n.ENUM) {
            switch (j.$SwitchMap$com$google$protobuf$WireFormat$FieldType[cn3.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(fKk.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(fKk.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(fKk.readInt64());
                    break;
                case 4:
                    objValueOf = Long.valueOf(fKk.readUInt64());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(fKk.readInt32());
                    break;
                case 6:
                    objValueOf = Long.valueOf(fKk.readFixed64());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(fKk.readFixed32());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(fKk.readBool());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(fKk.readUInt32());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(fKk.readSFixed32());
                    break;
                case 11:
                    objValueOf = Long.valueOf(fKk.readSFixed64());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(fKk.readSInt32());
                    break;
                case 13:
                    objValueOf = Long.valueOf(fKk.readSInt64());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = fKk.readBytes();
                    break;
                case 16:
                    objValueOf = fKk.readString();
                    break;
                case 17:
                    if (!cn3.isRepeated()) {
                        Object field2 = q2.getField(cn3.descriptor);
                        if (field2 instanceof g9s) {
                            R6 r6SchemaFor = xZD.getInstance().schemaFor(field2);
                            if (!((g9s) field2).isMutable()) {
                                Object objNewInstance = r6SchemaFor.newInstance();
                                r6SchemaFor.mergeFrom(objNewInstance, field2);
                                q2.setField(cn3.descriptor, objNewInstance);
                                field2 = objNewInstance;
                            }
                            fKk.mergeGroupField(field2, r6SchemaFor, qj);
                            return ub;
                        }
                    }
                    objValueOf = fKk.readGroup(cn3.getMessageDefaultInstance().getClass(), qj);
                    break;
                case 18:
                    if (!cn3.isRepeated()) {
                        Object field3 = q2.getField(cn3.descriptor);
                        if (field3 instanceof g9s) {
                            R6 r6SchemaFor2 = xZD.getInstance().schemaFor(field3);
                            if (!((g9s) field3).isMutable()) {
                                Object objNewInstance2 = r6SchemaFor2.newInstance();
                                r6SchemaFor2.mergeFrom(objNewInstance2, field3);
                                q2.setField(cn3.descriptor, objNewInstance2);
                                field3 = objNewInstance2;
                            }
                            fKk.mergeMessageField(field3, r6SchemaFor2, qj);
                            return ub;
                        }
                    }
                    objValueOf = fKk.readMessage(cn3.getMessageDefaultInstance().getClass(), qj);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int int32 = fKk.readInt32();
            if (cn3.descriptor.getEnumType().findValueByNumber(int32) == null) {
                return (UB) pq.storeUnknownEnum(obj, number, int32, ub, xuvVar);
            }
            objValueOf = Integer.valueOf(int32);
        }
        if (cn3.isRepeated()) {
            q2.addRepeatedField(cn3.descriptor, objValueOf);
            return ub;
        }
        int i2 = j.$SwitchMap$com$google$protobuf$WireFormat$FieldType[cn3.getLiteType().ordinal()];
        if ((i2 == 17 || i2 == 18) && (field = q2.getField(cn3.descriptor)) != null) {
            objValueOf = nKK.mergeMessage(field, objValueOf);
        }
        q2.setField(cn3.descriptor, objValueOf);
        return ub;
    }

    @Override // com.google.protobuf.l3D
    void parseLengthPrefixedMessageSetItem(FKk fKk, Object obj, QJ qj, Q q2) throws IOException {
        g9s.CN3 cn3 = (g9s.CN3) obj;
        q2.setField(cn3.descriptor, fKk.readMessage(cn3.getMessageDefaultInstance().getClass(), qj));
    }

    @Override // com.google.protobuf.l3D
    void parseMessageSetItem(C c2, Object obj, QJ qj, Q q2) throws IOException {
        g9s.CN3 cn3 = (g9s.CN3) obj;
        yg.j jVarNewBuilderForType = cn3.getMessageDefaultInstance().newBuilderForType();
        AbstractC1923o abstractC1923oNewCodedInput = c2.newCodedInput();
        jVarNewBuilderForType.mergeFrom(abstractC1923oNewCodedInput, qj);
        q2.setField(cn3.descriptor, jVarNewBuilderForType.buildPartial());
        abstractC1923oNewCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.l3D
    void setExtensions(Object obj, Q q2) {
        ((g9s.Ml) obj).extensions = q2;
    }

    C1921c() {
    }

    @Override // com.google.protobuf.l3D
    int extensionNumber(Map.Entry<?, ?> entry) {
        return ((g9s.Wre) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.l3D
    Object findExtensionByNumber(QJ qj, yg ygVar, int i2) {
        return qj.findLiteExtensionByNumber(ygVar, i2);
    }

    @Override // com.google.protobuf.l3D
    void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // com.google.protobuf.l3D
    void serializeExtension(crp crpVar, Map.Entry<?, ?> entry) throws IOException {
        g9s.Wre wre = (g9s.Wre) entry.getKey();
        if (wre.isRepeated()) {
            switch (j.$SwitchMap$com$google$protobuf$WireFormat$FieldType[wre.getLiteType().ordinal()]) {
                case 1:
                    pq.writeDoubleList(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 2:
                    pq.writeFloatList(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 3:
                    pq.writeInt64List(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 4:
                    pq.writeUInt64List(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 5:
                    pq.writeInt32List(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 6:
                    pq.writeFixed64List(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 7:
                    pq.writeFixed32List(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 8:
                    pq.writeBoolList(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 9:
                    pq.writeUInt32List(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 10:
                    pq.writeSFixed32List(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 11:
                    pq.writeSFixed64List(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 12:
                    pq.writeSInt32List(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 13:
                    pq.writeSInt64List(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 14:
                    pq.writeInt32List(wre.getNumber(), (List) entry.getValue(), crpVar, wre.isPacked());
                    break;
                case 15:
                    pq.writeBytesList(wre.getNumber(), (List) entry.getValue(), crpVar);
                    break;
                case 16:
                    pq.writeStringList(wre.getNumber(), (List) entry.getValue(), crpVar);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        pq.writeGroupList(wre.getNumber(), (List) entry.getValue(), crpVar, xZD.getInstance().schemaFor((Class) list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        pq.writeMessageList(wre.getNumber(), (List) entry.getValue(), crpVar, xZD.getInstance().schemaFor((Class) list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (j.$SwitchMap$com$google$protobuf$WireFormat$FieldType[wre.getLiteType().ordinal()]) {
            case 1:
                crpVar.writeDouble(wre.getNumber(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                crpVar.writeFloat(wre.getNumber(), ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                crpVar.writeInt64(wre.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                crpVar.writeUInt64(wre.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                crpVar.writeInt32(wre.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                crpVar.writeFixed64(wre.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                crpVar.writeFixed32(wre.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                crpVar.writeBool(wre.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                crpVar.writeUInt32(wre.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                crpVar.writeSFixed32(wre.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                crpVar.writeSFixed64(wre.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                crpVar.writeSInt32(wre.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                crpVar.writeSInt64(wre.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                crpVar.writeInt32(wre.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                crpVar.writeBytes(wre.getNumber(), (C) entry.getValue());
                break;
            case 16:
                crpVar.writeString(wre.getNumber(), (String) entry.getValue());
                break;
            case 17:
                crpVar.writeGroup(wre.getNumber(), entry.getValue(), xZD.getInstance().schemaFor((Class) entry.getValue().getClass()));
                break;
            case 18:
                crpVar.writeMessage(wre.getNumber(), entry.getValue(), xZD.getInstance().schemaFor((Class) entry.getValue().getClass()));
                break;
        }
    }
}
