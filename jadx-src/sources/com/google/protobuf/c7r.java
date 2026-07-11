package com.google.protobuf;

import com.google.protobuf.crp;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c7r {
    private static final c7r DEFAULT_INSTANCE = new c7r(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private c7r() {
        this(0, new int[8], new Object[8], true);
    }

    private static int hashCode(int[] iArr, int i2) {
        int i3 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i3 = (i3 * 31) + iArr[i5];
        }
        return i3;
    }

    private c7r mergeFrom(AbstractC1923o abstractC1923o) throws IOException {
        int tag;
        do {
            tag = abstractC1923o.readTag();
            if (tag == 0) {
                break;
            }
        } while (mergeFieldFrom(tag, abstractC1923o));
        return this;
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (!objArr[i3].equals(objArr2[i3])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c7r)) {
            return false;
        }
        c7r c7rVar = (c7r) obj;
        int i2 = this.count;
        return i2 == c7rVar.count && tagsEquals(this.tags, c7rVar.tags, i2) && objectsEquals(this.objects, c7rVar.objects, this.count);
    }

    final void printWithIndent(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.count; i3++) {
            Sis.printField(sb, i2, String.valueOf(CM.getTagFieldNumber(this.tags[i3])), this.objects[i3]);
        }
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i2 = 0; i2 < this.count; i2++) {
            codedOutputStream.writeRawMessageSetExtension(CM.getTagFieldNumber(this.tags[i2]), (C) this.objects[i2]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i2 = 0; i2 < this.count; i2++) {
            int i3 = this.tags[i2];
            int tagFieldNumber = CM.getTagFieldNumber(i3);
            int tagWireType = CM.getTagWireType(i3);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.objects[i2]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.objects[i2]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (C) this.objects[i2]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((c7r) this.objects[i2]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.objects[i2]).intValue());
            }
        }
    }

    private c7r(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.memoizedSerializedSize = -1;
        this.count = i2;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z2;
    }

    private void ensureCapacity(int i2) {
        int[] iArr = this.tags;
        if (i2 > iArr.length) {
            int i3 = this.count;
            int i5 = i3 + (i3 / 2);
            if (i5 >= i2) {
                i2 = i5;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.tags = Arrays.copyOf(iArr, i2);
            this.objects = Arrays.copyOf(this.objects, i2);
        }
    }

    public static c7r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(Object[] objArr, int i2) {
        int iHashCode = 17;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode = (iHashCode * 31) + objArr[i3].hashCode();
        }
        return iHashCode;
    }

    static c7r mutableCopyOf(c7r c7rVar, c7r c7rVar2) {
        int i2 = c7rVar.count + c7rVar2.count;
        int[] iArrCopyOf = Arrays.copyOf(c7rVar.tags, i2);
        System.arraycopy(c7rVar2.tags, 0, iArrCopyOf, c7rVar.count, c7rVar2.count);
        Object[] objArrCopyOf = Arrays.copyOf(c7rVar.objects, i2);
        System.arraycopy(c7rVar2.objects, 0, objArrCopyOf, c7rVar.count, c7rVar2.count);
        return new c7r(i2, iArrCopyOf, objArrCopyOf, true);
    }

    static c7r newInstance() {
        return new c7r();
    }

    void checkMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i5 = 0; i5 < this.count; i5++) {
            int i7 = this.tags[i5];
            int tagFieldNumber = CM.getTagFieldNumber(i7);
            int tagWireType = CM.getTagWireType(i7);
            if (tagWireType == 0) {
                iComputeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i5]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i5]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (C) this.objects[i5]);
            } else if (tagWireType == 3) {
                iComputeUInt64Size = (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((c7r) this.objects[i5]).getSerializedSize();
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iComputeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i5]).intValue());
            }
            i3 += iComputeUInt64Size;
        }
        this.memoizedSerializedSize = i3;
        return i3;
    }

    public int getSerializedSizeAsMessageSet() {
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            iComputeRawMessageSetExtensionSize += CodedOutputStream.computeRawMessageSetExtensionSize(CM.getTagFieldNumber(this.tags[i3]), (C) this.objects[i3]);
        }
        this.memoizedSerializedSize = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    private static void writeField(int i2, Object obj, crp crpVar) throws IOException {
        int tagFieldNumber = CM.getTagFieldNumber(i2);
        int tagWireType = CM.getTagWireType(i2);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType == 5) {
                            crpVar.writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
                    }
                    if (crpVar.fieldOrder() == crp.j.ASCENDING) {
                        crpVar.writeStartGroup(tagFieldNumber);
                        ((c7r) obj).writeTo(crpVar);
                        crpVar.writeEndGroup(tagFieldNumber);
                        return;
                    } else {
                        crpVar.writeEndGroup(tagFieldNumber);
                        ((c7r) obj).writeTo(crpVar);
                        crpVar.writeStartGroup(tagFieldNumber);
                        return;
                    }
                }
                crpVar.writeBytes(tagFieldNumber, (C) obj);
                return;
            }
            crpVar.writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        crpVar.writeInt64(tagFieldNumber, ((Long) obj).longValue());
    }

    public int hashCode() {
        int i2 = this.count;
        return ((((527 + i2) * 31) + hashCode(this.tags, i2)) * 31) + hashCode(this.objects, this.count);
    }

    boolean mergeFieldFrom(int i2, AbstractC1923o abstractC1923o) throws IOException {
        checkMutable();
        int tagFieldNumber = CM.getTagFieldNumber(i2);
        int tagWireType = CM.getTagWireType(i2);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                storeField(i2, Integer.valueOf(abstractC1923o.readFixed32()));
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    c7r c7rVar = new c7r();
                    c7rVar.mergeFrom(abstractC1923o);
                    abstractC1923o.checkLastTagWas(CM.makeTag(tagFieldNumber, 4));
                    storeField(i2, c7rVar);
                    return true;
                }
                storeField(i2, abstractC1923o.readBytes());
                return true;
            }
            storeField(i2, Long.valueOf(abstractC1923o.readFixed64()));
            return true;
        }
        storeField(i2, Long.valueOf(abstractC1923o.readInt64()));
        return true;
    }

    c7r mergeFrom(c7r c7rVar) {
        if (c7rVar.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i2 = this.count + c7rVar.count;
        ensureCapacity(i2);
        System.arraycopy(c7rVar.tags, 0, this.tags, this.count, c7rVar.count);
        System.arraycopy(c7rVar.objects, 0, this.objects, this.count, c7rVar.count);
        this.count = i2;
        return this;
    }

    c7r mergeLengthDelimitedField(int i2, C c2) {
        checkMutable();
        if (i2 != 0) {
            storeField(CM.makeTag(i2, 2), c2);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    c7r mergeVarintField(int i2, int i3) {
        checkMutable();
        if (i2 != 0) {
            storeField(CM.makeTag(i2, 0), Long.valueOf(i3));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    void storeField(int i2, Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i3 = this.count;
        iArr[i3] = i2;
        this.objects[i3] = obj;
        this.count = i3 + 1;
    }

    void writeAsMessageSetTo(crp crpVar) throws IOException {
        if (crpVar.fieldOrder() == crp.j.DESCENDING) {
            for (int i2 = this.count - 1; i2 >= 0; i2--) {
                crpVar.writeMessageSetItem(CM.getTagFieldNumber(this.tags[i2]), this.objects[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.count; i3++) {
            crpVar.writeMessageSetItem(CM.getTagFieldNumber(this.tags[i3]), this.objects[i3]);
        }
    }

    public void writeTo(crp crpVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (crpVar.fieldOrder() == crp.j.ASCENDING) {
            for (int i2 = 0; i2 < this.count; i2++) {
                writeField(this.tags[i2], this.objects[i2], crpVar);
            }
            return;
        }
        for (int i3 = this.count - 1; i3 >= 0; i3--) {
            writeField(this.tags[i3], this.objects[i3], crpVar);
        }
    }
}
