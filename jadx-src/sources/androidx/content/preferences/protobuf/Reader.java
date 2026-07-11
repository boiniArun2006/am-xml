package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@CheckReturnValue
interface Reader {
    void J2(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void O(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite);

    void Uo(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    int getFieldNumber();

    int getTag();

    void n(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    Object nr(Class cls, ExtensionRegistryLite extensionRegistryLite);

    boolean readBool();

    void readBoolList(List list);

    ByteString readBytes();

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

    void rl(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    boolean skipField();

    Object t(Class cls, ExtensionRegistryLite extensionRegistryLite);
}
