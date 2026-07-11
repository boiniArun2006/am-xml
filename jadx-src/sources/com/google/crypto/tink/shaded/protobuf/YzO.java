package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.DAz;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
interface YzO {

    public enum j {
        ASCENDING,
        DESCENDING
    }

    void J2(int i2, List list, mz mzVar);

    void O(int i2, Object obj, mz mzVar);

    j fieldOrder();

    void n(int i2, DAz.j jVar, Map map);

    void nr(int i2, fuX fux);

    void rl(int i2, Object obj, mz mzVar);

    void t(int i2, List list, mz mzVar);

    void writeBool(int i2, boolean z2);

    void writeBoolList(int i2, List list, boolean z2);

    void writeBytesList(int i2, List list);

    void writeDouble(int i2, double d2);

    void writeDoubleList(int i2, List list, boolean z2);

    void writeEndGroup(int i2);

    void writeEnum(int i2, int i3);

    void writeEnumList(int i2, List list, boolean z2);

    void writeFixed32(int i2, int i3);

    void writeFixed32List(int i2, List list, boolean z2);

    void writeFixed64(int i2, long j2);

    void writeFixed64List(int i2, List list, boolean z2);

    void writeFloat(int i2, float f3);

    void writeFloatList(int i2, List list, boolean z2);

    void writeInt32(int i2, int i3);

    void writeInt32List(int i2, List list, boolean z2);

    void writeInt64(int i2, long j2);

    void writeInt64List(int i2, List list, boolean z2);

    void writeMessageSetItem(int i2, Object obj);

    void writeSFixed32(int i2, int i3);

    void writeSFixed32List(int i2, List list, boolean z2);

    void writeSFixed64(int i2, long j2);

    void writeSFixed64List(int i2, List list, boolean z2);

    void writeSInt32(int i2, int i3);

    void writeSInt32List(int i2, List list, boolean z2);

    void writeSInt64(int i2, long j2);

    void writeSInt64List(int i2, List list, boolean z2);

    void writeStartGroup(int i2);

    void writeString(int i2, String str);

    void writeStringList(int i2, List list);

    void writeUInt32(int i2, int i3);

    void writeUInt32List(int i2, List list, boolean z2);

    void writeUInt64(int i2, long j2);

    void writeUInt64List(int i2, List list, boolean z2);
}
