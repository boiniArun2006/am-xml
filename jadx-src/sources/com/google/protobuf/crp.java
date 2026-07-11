package com.google.protobuf;

import com.google.protobuf.K;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
interface crp {

    public enum j {
        ASCENDING,
        DESCENDING
    }

    j fieldOrder();

    void writeBool(int i2, boolean z2) throws IOException;

    void writeBoolList(int i2, List<Boolean> list, boolean z2) throws IOException;

    void writeBytes(int i2, C c2) throws IOException;

    void writeBytesList(int i2, List<C> list) throws IOException;

    void writeDouble(int i2, double d2) throws IOException;

    void writeDoubleList(int i2, List<Double> list, boolean z2) throws IOException;

    @Deprecated
    void writeEndGroup(int i2) throws IOException;

    void writeEnum(int i2, int i3) throws IOException;

    void writeEnumList(int i2, List<Integer> list, boolean z2) throws IOException;

    void writeFixed32(int i2, int i3) throws IOException;

    void writeFixed32List(int i2, List<Integer> list, boolean z2) throws IOException;

    void writeFixed64(int i2, long j2) throws IOException;

    void writeFixed64List(int i2, List<Long> list, boolean z2) throws IOException;

    void writeFloat(int i2, float f3) throws IOException;

    void writeFloatList(int i2, List<Float> list, boolean z2) throws IOException;

    @Deprecated
    void writeGroup(int i2, Object obj) throws IOException;

    @Deprecated
    void writeGroup(int i2, Object obj, R6 r6) throws IOException;

    @Deprecated
    void writeGroupList(int i2, List<?> list) throws IOException;

    @Deprecated
    void writeGroupList(int i2, List<?> list, R6 r6) throws IOException;

    void writeInt32(int i2, int i3) throws IOException;

    void writeInt32List(int i2, List<Integer> list, boolean z2) throws IOException;

    void writeInt64(int i2, long j2) throws IOException;

    void writeInt64List(int i2, List<Long> list, boolean z2) throws IOException;

    <K, V> void writeMap(int i2, K.n nVar, Map<K, V> map) throws IOException;

    void writeMessage(int i2, Object obj) throws IOException;

    void writeMessage(int i2, Object obj, R6 r6) throws IOException;

    void writeMessageList(int i2, List<?> list) throws IOException;

    void writeMessageList(int i2, List<?> list, R6 r6) throws IOException;

    void writeMessageSetItem(int i2, Object obj) throws IOException;

    void writeSFixed32(int i2, int i3) throws IOException;

    void writeSFixed32List(int i2, List<Integer> list, boolean z2) throws IOException;

    void writeSFixed64(int i2, long j2) throws IOException;

    void writeSFixed64List(int i2, List<Long> list, boolean z2) throws IOException;

    void writeSInt32(int i2, int i3) throws IOException;

    void writeSInt32List(int i2, List<Integer> list, boolean z2) throws IOException;

    void writeSInt64(int i2, long j2) throws IOException;

    void writeSInt64List(int i2, List<Long> list, boolean z2) throws IOException;

    @Deprecated
    void writeStartGroup(int i2) throws IOException;

    void writeString(int i2, String str) throws IOException;

    void writeStringList(int i2, List<String> list) throws IOException;

    void writeUInt32(int i2, int i3) throws IOException;

    void writeUInt32List(int i2, List<Integer> list, boolean z2) throws IOException;

    void writeUInt64(int i2, long j2) throws IOException;

    void writeUInt64List(int i2, List<Long> list, boolean z2) throws IOException;
}
