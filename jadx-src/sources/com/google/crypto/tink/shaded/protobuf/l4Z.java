package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.DAz;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
interface l4Z {
    void O(List list, mz mzVar, Xo xo);

    int getFieldNumber();

    int getTag();

    void n(Object obj, mz mzVar, Xo xo);

    void nr(List list, mz mzVar, Xo xo);

    boolean readBool();

    void readBoolList(List list);

    fuX readBytes();

    void readBytesList(List list);

    double readDouble();

    void readDoubleList(List list);

    int readEnum();

    void readEnumList(List list);

    int readFixed32();

    void readFixed32List(List list);

    long readFixed64();

    void readFixed64List(List list);

    float readFloat();

    void readFloatList(List list);

    int readInt32();

    void readInt32List(List list);

    long readInt64();

    void readInt64List(List list);

    int readSFixed32();

    void readSFixed32List(List list);

    long readSFixed64();

    void readSFixed64List(List list);

    int readSInt32();

    void readSInt32List(List list);

    long readSInt64();

    void readSInt64List(List list);

    String readString();

    void readStringList(List list);

    void readStringListRequireUtf8(List list);

    String readStringRequireUtf8();

    int readUInt32();

    void readUInt32List(List list);

    long readUInt64();

    void readUInt64List(List list);

    void rl(Map map, DAz.j jVar, Xo xo);

    boolean skipField();

    void t(Object obj, mz mzVar, Xo xo);
}
