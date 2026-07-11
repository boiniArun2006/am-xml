package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.MapEntryLite;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@CheckReturnValue
interface MapFieldSchema {
    Map forMapData(Object obj);

    MapEntryLite.Metadata forMapMetadata(Object obj);

    Map forMutableMapData(Object obj);

    int getSerializedSize(int i2, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
