package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.ArrayDecoders;
import androidx.content.preferences.protobuf.FieldSet;
import androidx.content.preferences.protobuf.GeneratedMessageLite;
import androidx.content.preferences.protobuf.LazyField;
import androidx.content.preferences.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@CheckReturnValue
final class MessageSetSchema<T> implements Schema<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MessageLite f38096n;
    private final ExtensionSchema nr;
    private final UnknownFieldSchema rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f38097t;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    @Override // androidx.content.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(Object obj, byte[] bArr, int i2, int i3, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        int iNHg;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLiteGh = generatedMessageLite.unknownFields;
        if (unknownFieldSetLiteGh == UnknownFieldSetLite.t()) {
            unknownFieldSetLiteGh = UnknownFieldSetLite.gh();
            generatedMessageLite.unknownFields = unknownFieldSetLiteGh;
        }
        UnknownFieldSetLite unknownFieldSetLite = unknownFieldSetLiteGh;
        FieldSet fieldSetBzg = ((GeneratedMessageLite.ExtendableMessage) obj).bzg();
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (i2 < i3) {
            int iNHg2 = ArrayDecoders.nHg(bArr, i2, registers);
            int i5 = registers.f37720n;
            if (i5 == WireFormat.f38206n) {
                int i7 = i3;
                ArrayDecoders.Registers registers2 = registers;
                int i8 = 0;
                ByteString byteString = null;
                while (true) {
                    if (iNHg2 >= i7) {
                        iNHg = iNHg2;
                        break;
                    }
                    iNHg = ArrayDecoders.nHg(bArr, iNHg2, registers2);
                    int i9 = registers2.f37720n;
                    int iN = WireFormat.n(i9);
                    int iRl = WireFormat.rl(i9);
                    if (iN != 2) {
                        if (iN == 3) {
                            if (generatedExtension != null) {
                                iNHg2 = ArrayDecoders.Ik(Protobuf.n().t(generatedExtension.rl().getClass()), bArr, iNHg, i7, registers2);
                                fieldSetBzg.ViF(generatedExtension.nr, registers2.f37721t);
                            } else if (iRl == 2) {
                                iNHg2 = ArrayDecoders.t(bArr, iNHg, registers2);
                                byteString = (ByteString) registers2.f37721t;
                            }
                        }
                        if (i9 != WireFormat.rl) {
                            break;
                        } else {
                            iNHg2 = ArrayDecoders.jB(i9, bArr, iNHg, i7, registers2);
                        }
                    } else if (iRl == 0) {
                        iNHg2 = ArrayDecoders.nHg(bArr, iNHg, registers2);
                        i8 = registers2.f37720n;
                        generatedExtension = (GeneratedMessageLite.GeneratedExtension) this.nr.rl(registers2.nr, this.f38096n, i8);
                    } else if (i9 != WireFormat.rl) {
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLite.ty(WireFormat.t(i8, 2), byteString);
                }
                i2 = iNHg;
                i3 = i7;
                registers = registers2;
            } else if (WireFormat.rl(i5) == 2) {
                generatedExtension = (GeneratedMessageLite.GeneratedExtension) this.nr.rl(registers.nr, this.f38096n, WireFormat.n(i5));
                if (generatedExtension != null) {
                    i2 = ArrayDecoders.Ik(Protobuf.n().t(generatedExtension.rl().getClass()), bArr, iNHg2, i3, registers);
                    fieldSetBzg.ViF(generatedExtension.nr, registers.f37721t);
                } else {
                    i2 = ArrayDecoders.T(i5, bArr, iNHg2, i3, unknownFieldSetLite, registers);
                }
            } else {
                i2 = ArrayDecoders.jB(i5, bArr, iNHg2, i3, registers);
            }
        }
        if (i2 != i3) {
            throw InvalidProtocolBufferException.KN();
        }
    }

    static MessageSetSchema J2(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        return new MessageSetSchema(unknownFieldSchema, extensionSchema, messageLite);
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public boolean equals(Object obj, Object obj2) {
        if (!this.rl.Uo(obj).equals(this.rl.Uo(obj2))) {
            return false;
        }
        if (this.f38097t) {
            return this.nr.t(obj).equals(this.nr.t(obj2));
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public int getSerializedSize(Object obj) {
        int iNr = nr(this.rl, obj);
        return this.f38097t ? iNr + this.nr.t(obj).mUb() : iNr;
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public int hashCode(Object obj) {
        int iHashCode = this.rl.Uo(obj).hashCode();
        return this.f38097t ? (iHashCode * 53) + this.nr.t(obj).hashCode() : iHashCode;
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final boolean isInitialized(Object obj) {
        return this.nr.t(obj).ck();
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public void makeImmutable(Object obj) {
        this.rl.mUb(obj);
        this.nr.J2(obj);
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public void mergeFrom(Object obj, Object obj2) {
        SchemaUtil.X(this.rl, obj, obj2);
        if (this.f38097t) {
            SchemaUtil.E2(this.nr, obj, obj2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public void n(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        O(this.rl, this.nr, obj, reader, extensionRegistryLite);
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public Object newInstance() {
        MessageLite messageLite = this.f38096n;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).T() : messageLite.newBuilderForType().buildPartial();
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public void rl(Object obj, Writer writer) {
        Iterator itZ = this.nr.t(obj).Z();
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof LazyField.LazyEntry) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((LazyField.LazyEntry) entry).n().O());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), entry.getValue());
            }
        }
        KN(this.rl, obj, writer);
    }

    private MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        this.rl = unknownFieldSchema;
        this.f38097t = extensionSchema.O(messageLite);
        this.nr = extensionSchema;
        this.f38096n = messageLite;
    }

    private void KN(UnknownFieldSchema unknownFieldSchema, Object obj, Writer writer) {
        unknownFieldSchema.o(unknownFieldSchema.Uo(obj), writer);
    }

    private void O(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        UnknownFieldSchema unknownFieldSchema2;
        Object objJ2 = unknownFieldSchema.J2(obj);
        FieldSet fieldSetNr = extensionSchema.nr(obj);
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                unknownFieldSchema2 = unknownFieldSchema;
                ExtensionSchema extensionSchema2 = extensionSchema;
                Reader reader2 = reader;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                try {
                    if (Uo(reader2, extensionRegistryLite2, extensionSchema2, fieldSetNr, unknownFieldSchema2, objJ2)) {
                        reader = reader2;
                        extensionRegistryLite = extensionRegistryLite2;
                        extensionSchema = extensionSchema2;
                        unknownFieldSchema = unknownFieldSchema2;
                    } else {
                        unknownFieldSchema2.HI(obj, objJ2);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    unknownFieldSchema2.HI(obj, objJ2);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                unknownFieldSchema2 = unknownFieldSchema;
            }
        }
        unknownFieldSchema.HI(obj, objJ2);
    }

    private boolean Uo(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema extensionSchema, FieldSet fieldSet, UnknownFieldSchema unknownFieldSchema, Object obj) throws InvalidProtocolBufferException {
        int tag = reader.getTag();
        int uInt32 = 0;
        if (tag != WireFormat.f38206n) {
            if (WireFormat.rl(tag) == 2) {
                Object objRl = extensionSchema.rl(extensionRegistryLite, this.f38096n, WireFormat.n(tag));
                if (objRl != null) {
                    extensionSchema.KN(reader, objRl, extensionRegistryLite, fieldSet);
                    return true;
                }
                return unknownFieldSchema.az(obj, reader, 0);
            }
            return reader.skipField();
        }
        Object objRl2 = null;
        ByteString bytes = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == WireFormat.f38207t) {
                uInt32 = reader.readUInt32();
                objRl2 = extensionSchema.rl(extensionRegistryLite, this.f38096n, uInt32);
            } else if (tag2 == WireFormat.nr) {
                if (objRl2 != null) {
                    extensionSchema.KN(reader, objRl2, extensionRegistryLite, fieldSet);
                } else {
                    bytes = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() == WireFormat.rl) {
            if (bytes != null) {
                if (objRl2 != null) {
                    extensionSchema.xMQ(bytes, objRl2, extensionRegistryLite, fieldSet);
                } else {
                    unknownFieldSchema.nr(obj, uInt32, bytes);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.rl();
    }

    private int nr(UnknownFieldSchema unknownFieldSchema, Object obj) {
        return unknownFieldSchema.xMQ(unknownFieldSchema.Uo(obj));
    }
}
