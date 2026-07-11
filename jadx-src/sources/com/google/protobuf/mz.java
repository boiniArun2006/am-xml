package com.google.protobuf;

import com.google.protobuf.CM;
import com.google.protobuf.CN3;
import com.google.protobuf.Q;
import com.google.protobuf.g9s;
import com.google.protobuf.lej;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class mz implements R6 {
    private final yg defaultInstance;
    private final l3D extensionSchema;
    private final boolean hasExtensions;
    private final xuv unknownFieldSchema;

    @Override // com.google.protobuf.R6
    public void mergeFrom(Object obj, Object obj2) {
        pq.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            pq.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    static <T> mz newSchema(xuv xuvVar, l3D l3d, yg ygVar) {
        return new mz(xuvVar, l3d, ygVar);
    }

    @Override // com.google.protobuf.R6
    public boolean equals(Object obj, Object obj2) {
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.R6
    public int getSerializedSize(Object obj) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.R6
    public int hashCode(Object obj) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(obj).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(obj).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.R6
    public final boolean isInitialized(Object obj) {
        return this.extensionSchema.getExtensions(obj).isInitialized();
    }

    @Override // com.google.protobuf.R6
    public void makeImmutable(Object obj) {
        this.unknownFieldSchema.makeImmutable(obj);
        this.extensionSchema.makeImmutable(obj);
    }

    @Override // com.google.protobuf.R6
    public Object newInstance() {
        yg ygVar = this.defaultInstance;
        return ygVar instanceof g9s ? ((g9s) ygVar).newMutableInstance() : ygVar.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.R6
    public void writeTo(Object obj, crp crpVar) throws IOException {
        for (Map.Entry<Q.w6, Object> entry : this.extensionSchema.getExtensions(obj)) {
            Q.w6 key = entry.getKey();
            if (key.getLiteJavaType() != CM.w6.MESSAGE || key.isRepeated() || key.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof lej.n) {
                crpVar.writeMessageSetItem(key.getNumber(), ((lej.n) entry).getField().toByteString());
            } else {
                crpVar.writeMessageSetItem(key.getNumber(), entry.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, obj, crpVar);
    }

    private mz(xuv xuvVar, l3D l3d, yg ygVar) {
        this.unknownFieldSchema = xuvVar;
        this.hasExtensions = l3d.hasExtensions(ygVar);
        this.extensionSchema = l3d;
        this.defaultInstance = ygVar;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(xuv xuvVar, Object obj) {
        return xuvVar.getSerializedSizeAsMessageSet(xuvVar.getFromMessage(obj));
    }

    private <UT, UB, ET extends Q.w6> void mergeFromHelper(xuv xuvVar, l3D l3d, Object obj, FKk fKk, QJ qj) throws Throwable {
        xuv xuvVar2;
        Object builderFromMessage = xuvVar.getBuilderFromMessage(obj);
        Q mutableExtensions = l3d.getMutableExtensions(obj);
        while (fKk.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                xuvVar2 = xuvVar;
                l3D l3d2 = l3d;
                FKk fKk2 = fKk;
                QJ qj2 = qj;
                try {
                    if (parseMessageSetItemOrUnknownField(fKk2, qj2, l3d2, mutableExtensions, xuvVar2, builderFromMessage)) {
                        fKk = fKk2;
                        qj = qj2;
                        l3d = l3d2;
                        xuvVar = xuvVar2;
                    } else {
                        xuvVar2.setBuilderToMessage(obj, builderFromMessage);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    xuvVar2.setBuilderToMessage(obj, builderFromMessage);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                xuvVar2 = xuvVar;
            }
        }
        xuvVar.setBuilderToMessage(obj, builderFromMessage);
    }

    private <UT, UB, ET extends Q.w6> boolean parseMessageSetItemOrUnknownField(FKk fKk, QJ qj, l3D l3d, Q q2, xuv xuvVar, UB ub) throws IOException {
        int tag = fKk.getTag();
        int uInt32 = 0;
        if (tag != CM.MESSAGE_SET_ITEM_TAG) {
            if (CM.getTagWireType(tag) == 2) {
                Object objFindExtensionByNumber = l3d.findExtensionByNumber(qj, this.defaultInstance, CM.getTagFieldNumber(tag));
                if (objFindExtensionByNumber != null) {
                    l3d.parseLengthPrefixedMessageSetItem(fKk, objFindExtensionByNumber, qj, q2);
                    return true;
                }
                return xuvVar.mergeOneFieldFrom(ub, fKk, 0);
            }
            return fKk.skipField();
        }
        Object objFindExtensionByNumber2 = null;
        C bytes = null;
        while (fKk.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = fKk.getTag();
            if (tag2 == CM.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = fKk.readUInt32();
                objFindExtensionByNumber2 = l3d.findExtensionByNumber(qj, this.defaultInstance, uInt32);
            } else if (tag2 == CM.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    l3d.parseLengthPrefixedMessageSetItem(fKk, objFindExtensionByNumber2, qj, q2);
                } else {
                    bytes = fKk.readBytes();
                }
            } else if (!fKk.skipField()) {
                break;
            }
        }
        if (fKk.getTag() == CM.MESSAGE_SET_ITEM_END_TAG) {
            if (bytes != null) {
                if (objFindExtensionByNumber2 != null) {
                    l3d.parseMessageSetItem(bytes, objFindExtensionByNumber2, qj, q2);
                } else {
                    xuvVar.addLengthDelimited(ub, uInt32, bytes);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    private <UT, UB> void writeUnknownFieldsHelper(xuv xuvVar, Object obj, crp crpVar) throws IOException {
        xuvVar.writeAsMessageSetTo(xuvVar.getFromMessage(obj), crpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    @Override // com.google.protobuf.R6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mergeFrom(Object obj, byte[] bArr, int i2, int i3, CN3.n nVar) throws IOException {
        int iDecodeVarint32;
        g9s g9sVar = (g9s) obj;
        c7r c7rVarNewInstance = g9sVar.unknownFields;
        if (c7rVarNewInstance == c7r.getDefaultInstance()) {
            c7rVarNewInstance = c7r.newInstance();
            g9sVar.unknownFields = c7rVarNewInstance;
        }
        c7r c7rVar = c7rVarNewInstance;
        Q qEnsureExtensionsAreMutable = ((g9s.Ml) obj).ensureExtensionsAreMutable();
        g9s.CN3 cn3 = null;
        while (i2 < i3) {
            int iDecodeVarint322 = CN3.decodeVarint32(bArr, i2, nVar);
            int i5 = nVar.int1;
            if (i5 == CM.MESSAGE_SET_ITEM_TAG) {
                int i7 = i3;
                CN3.n nVar2 = nVar;
                int i8 = 0;
                C c2 = null;
                while (true) {
                    if (iDecodeVarint322 >= i7) {
                        iDecodeVarint32 = iDecodeVarint322;
                        break;
                    }
                    iDecodeVarint32 = CN3.decodeVarint32(bArr, iDecodeVarint322, nVar2);
                    int i9 = nVar2.int1;
                    int tagFieldNumber = CM.getTagFieldNumber(i9);
                    int tagWireType = CM.getTagWireType(i9);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (cn3 != null) {
                                iDecodeVarint322 = CN3.decodeMessageField(xZD.getInstance().schemaFor((Class) cn3.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i7, nVar2);
                                qEnsureExtensionsAreMutable.setField(cn3.descriptor, nVar2.object1);
                            } else if (tagWireType == 2) {
                                iDecodeVarint322 = CN3.decodeBytes(bArr, iDecodeVarint32, nVar2);
                                c2 = (C) nVar2.object1;
                            }
                        }
                        if (i9 != CM.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        } else {
                            iDecodeVarint322 = CN3.skipField(i9, bArr, iDecodeVarint32, i7, nVar2);
                        }
                    } else if (tagWireType == 0) {
                        iDecodeVarint322 = CN3.decodeVarint32(bArr, iDecodeVarint32, nVar2);
                        i8 = nVar2.int1;
                        cn3 = (g9s.CN3) this.extensionSchema.findExtensionByNumber(nVar2.extensionRegistry, this.defaultInstance, i8);
                    } else if (i9 != CM.MESSAGE_SET_ITEM_END_TAG) {
                    }
                }
                if (c2 != null) {
                    c7rVar.storeField(CM.makeTag(i8, 2), c2);
                }
                i2 = iDecodeVarint32;
                i3 = i7;
                nVar = nVar2;
            } else if (CM.getTagWireType(i5) == 2) {
                cn3 = (g9s.CN3) this.extensionSchema.findExtensionByNumber(nVar.extensionRegistry, this.defaultInstance, CM.getTagFieldNumber(i5));
                if (cn3 != null) {
                    i2 = CN3.decodeMessageField(xZD.getInstance().schemaFor((Class) cn3.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint322, i3, nVar);
                    qEnsureExtensionsAreMutable.setField(cn3.descriptor, nVar.object1);
                } else {
                    i2 = CN3.decodeUnknownField(i5, bArr, iDecodeVarint322, i3, c7rVar, nVar);
                }
            } else {
                i2 = CN3.skipField(i5, bArr, iDecodeVarint322, i3, nVar);
            }
        }
        if (i2 != i3) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.R6
    public void mergeFrom(Object obj, FKk fKk, QJ qj) throws Throwable {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, fKk, qj);
    }
}
